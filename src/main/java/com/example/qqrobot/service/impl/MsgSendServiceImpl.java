package com.example.qqrobot.service.impl;

import org.springframework.stereotype.Service;

import com.example.qqrobot.service.MsgSendService;

@Service
public class MsgSendServiceImpl implements MsgSendService {

	@Override
	public boolean sendMessge(String qqNumber, String message) {
		return true;
	}
}
