class VideoStreamClient {

    constructor(droneId, hostname, port, endpoint) {
        this.droneId = droneId;
        this.webSocket = null;
        this.hostname = hostname;
        this.port = port;
        this.endpoint = endpoint;
    }

    activateStream() {
        this.webSocket = new WebSocket(this.getServerUrl());

        var activeDroneId = this.droneId;

        this.webSocket.onopen = function (event) {
            this.send(activeDroneId);
        }

        this.webSocket.onmessage = function (event) {
            $('#' + activeDroneId).attr("src", "data:image/jpg;base64," + event.data);
        }
    }

    send(message) {
        if (this.webSocket != null && this.webSocket.readyState == WebSocket.OPEN) {
            this.webSocket.send(message);
        }
    }

    getServerUrl() {
        return "ws://" + this.hostname + ":" + this.port + this.endpoint;
    }

    disconnect() {
        if (this.webSocket != null) {
            this.webSocket.close();
        }
    }
}