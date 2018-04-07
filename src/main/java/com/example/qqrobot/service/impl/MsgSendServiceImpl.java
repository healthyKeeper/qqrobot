package com.example.qqrobot.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.qqrobot.service.MsgSendService;

@Service
public class MsgSendServiceImpl implements MsgSendService {

	@Value("command")
	private String command;

	@Override
	public boolean sendMessge(String destination, String message) throws Exception {
		System.out.println(command);
		System.out.println(destination + "---" + message);
		boolean success = false;
		// if (!destination.isEmpty()) {
		// String[] qqs = destination.split(",");
		// Process process = null;
		// ProcessBuilder pb = null;
		// for (int i = 0; i < qqs.length; i++) {
		// pb = new ProcessBuilder(command, qqs[i], message);
		// try {
		// process = pb.start();
		// process.waitFor();
		// } catch (Exception e) {
		// // 打印日志
		// throw e;
		// }
		// }
		// success = true;
		// }

		return success;
	}
}
