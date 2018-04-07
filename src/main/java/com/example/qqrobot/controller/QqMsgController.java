package com.example.qqrobot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.qqrobot.service.MsgSendService;

@RestController
public class QqMsgController {
	@Autowired
	private MsgSendService msgSendService;

	@RequestMapping("/sendQqMsg")
	public String sendQqMessage(@RequestParam("destination") String destination, @RequestParam("message") String message) {
		// 这块 异常 以后可以处理成服务降级操作 熔断器
		String info = "成功";
		try {
			msgSendService.sendMessge(destination, message);
		} catch (Exception e) {
			info = "失败";
		}
		return info;
	}

	@RequestMapping("/index")
	public String index() {
		return "hello world";
	}
}
