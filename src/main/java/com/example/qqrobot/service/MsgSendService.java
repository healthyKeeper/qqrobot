package com.example.qqrobot.service;

public interface MsgSendService {
	/**
	 * 给指定的qq号发送信息（qq1,qq2,qq3）
	 */
	public boolean sendMessge(String destination, String message) throws Exception;
}
