package com.example.qqrobot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.qqrobot.service.MsgSendService;

@RestController
public class QqMsgController {
	@Autowired
	private MsgSendService msgSendService;

	@RequestMapping("/sendQqMsg")
	public String sendQqMessage() {

		msgSendService.sendMessge("123", "测试");
		return "成功";
	}

	@RequestMapping("/index")
	public String index() {
		return "hello world";
	}
}
