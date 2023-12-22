package com.kh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Ŭ������ ����� ��ü��(bean) ���� ~new �ѰͰ�����
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		return "hello";  // hello.jsp
	}
}
