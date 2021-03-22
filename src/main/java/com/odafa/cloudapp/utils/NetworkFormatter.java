package com.odafa.cloudapp.utils;

import java.io.EOFException;
import java.io.InputStream;

public class NetworkFormatter {

    public static byte[] createNetworkMessage(byte[] msgBody) {
		byte[] head = new byte[4];
		int size = msgBody.length;
        
        for (int i = head.length - 1; i >= 0; i--) {
			head[i] = (byte) (size & 0xff);
			size >>>= 8;
		}

		byte[] result = new byte[head.length + msgBody.length];

		for (int i = 0; i < head.length; i++) {
			result[i] = head[i];
		}
		for (int i = head.length, j = 0; j < msgBody.length; i++, j++) {
			result[i] = msgBody[j];
		}

        return result;
    }

    public static byte[] readNetworkMessage(InputStream in) throws Exception {
		int ch1 = in.read();
		int ch2 = in.read();
		int ch3 = in.read();
		int ch4 = in.read();
		if ((ch1 | ch2 | ch3 | ch4) < 0) {
			throw new EOFException();
		}

		int msgSize = ((ch1 << 24) + (ch2 << 16) + (ch3 << 8) + (ch4 << 0));

		final byte[] buffer = new byte[msgSize];
		int totalReadSize = 0;

        while (totalReadSize < msgSize) {
			int readSize = in.read(buffer, totalReadSize, msgSize - totalReadSize);
			if (readSize < 0) {
				throw new EOFException();
			}
			totalReadSize += readSize;
		}
		return buffer;
    }
}
