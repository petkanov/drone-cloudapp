package com.odafa.cloudapp.utils;

import java.io.InputStream;
import java.net.Socket;
import java.util.List;

import com.odafa.cloudapp.dto.DataPoint;
import com.odafa.cloudapp.dto.DroneInfo;

public class DataMapper {

    private static final int START_MISSION_CODE = 14;

    public static String extractDroneIdFromNetwork(Socket droneSocket) throws Exception {
		return new String( NetworkFormatter.readNetworkMessage( droneSocket.getInputStream()));
    }

    public static DroneInfo fromNetworkToDroneInfo(InputStream streamIn) throws Exception {
		byte[] result = NetworkFormatter.readNetworkMessage(streamIn);
		final ProtoData.DroneData droneData = ProtoData.DroneData.parseFrom(result);
		final float speedInKmH = droneData.getSpeed() * 3.6f;

		return new DroneInfo(droneData.getDroneId(), droneData.getLatitude(), droneData.getLongitude(), speedInKmH,
				                droneData.getAltitude(), droneData.getVoltage(), droneData.getState());
    }

    public static byte[] toNetworkMessage(List<DataPoint> dataPoints) {

		ProtoData.MissionData.Builder missionData = ProtoData.MissionData.newBuilder();

		for (DataPoint point : dataPoints) {
			missionData.addPoint( ProtoData.DataPoint.newBuilder()
					                                 .setLatitude(point.getLat())
					                                 .setLongitude(point.getLng())
					                                 .setSpeed(point.getSpeed())
					                                 .setAltitude(point.getHeight())
					                                 .setAction(point.getAction())
					                                 .build());
		}

		byte[] missionDataArr = ProtoData.Command.newBuilder().setCode(START_MISSION_CODE)
		                                         .setPayload( missionData.build().toByteString())
		                                         .build().toByteArray();

		return NetworkFormatter.createNetworkMessage(missionDataArr);
    }
    
    public static byte[] toNetworkMessage(int commandCode) {
		byte[] command = ProtoData.Command.newBuilder().setCode(commandCode).build().toByteArray();
		return NetworkFormatter.createNetworkMessage(command);
    }
    
}
