package com.odafa.cloudapp.service;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.odafa.cloudapp.configuration.ConfigReader;
import com.odafa.cloudapp.dto.DataPoint;
import com.odafa.cloudapp.dto.DroneInfo;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ControlManager implements Runnable {
	private final ServerSocket serverSocket;
	private final ExecutorService serverRunner;
	
	private final Map<String, DroneHandler> droneIdToHandler;
	
	public ControlManager(ConfigReader configurations) {
		try {
			serverSocket = new ServerSocket( configurations.getControlServerPort());
		} catch (IOException e) {
			log.error(e.getMessage());
			throw new RuntimeException(e);
		}
		serverRunner = Executors.newSingleThreadExecutor();
		droneIdToHandler = new ConcurrentHashMap<>();

		serverRunner.execute(this);
	} 
	
	public void run() {
		while (!serverSocket.isClosed()) {
			try {
				Socket clientSocket = serverSocket.accept();

				final DroneHandler handler = new DroneHandler(this, clientSocket);
				handler.activate();

			} catch (Exception e) {
				log.error(e.getMessage());
			}
		}
	}

    public void sendMissionDataToDrone(String droneId, List<DataPoint> dataPoints) {
		final DroneHandler handler = droneIdToHandler.get(droneId);
		if(handler != null) {
			handler.sendMissionData(dataPoints);
		}
    }

    public void sendMessageFromUserIdToDrone(String droneId, int commandCode) {
		final DroneHandler handler = droneIdToHandler.get(droneId);
		if(handler != null) {
			handler.sendCommand(commandCode);
		}
    }

    public List<DroneInfo> getDroneStatusAll() {
		List<DroneInfo> drones = new ArrayList<>();

		droneIdToHandler.values().forEach( handler -> {
			drones.add(handler.getDroneLastStatus());
		});
		return drones;
    }
	
	public void setControlHadlerForDroneId(String droneId, DroneHandler handler) {
		droneIdToHandler.put(droneId, handler);
	}
	
	public void removeControlHadlerForDroneId(String droneId) {
		droneIdToHandler.remove(droneId);
	}
    
}
