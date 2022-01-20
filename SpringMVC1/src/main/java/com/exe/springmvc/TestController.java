package com.exe.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller("test.controller")
public class TestController {
	
	/*
	@RequestMapping(value = "/test/param.action",method = RequestMethod.GET)
	public String processGetRequest() {

		System.out.println("GET��� Request");
		
		return "paramResult"; //jsp�� ã�ư���. 
		
	}

	
	@RequestMapping(value = "/test/param.action",method = RequestMethod.POST)
	public String processPostRequest() {

		System.out.println("POST��� Request");
		
		return "paramResult"; //jsp�� ã�ư���. 
		
	}
*/
	//�ϳ��� ��ģ �� 
	@RequestMapping(value = "/test/param.action",method = {RequestMethod.GET,RequestMethod.POST})
	public String processGetRequest(PersonDTO dto, String name, HttpServletRequest req) throws Exception {
		
		
		System.out.println("GET/POST��� Request");
		System.out.println(name);
		System.out.println(req.getParameter("phone"));
		
		System.out.println(dto); 
		System.out.println("dto.getName()" + dto.getName());
		System.out.println("dto.getPhone()" + dto.getPhone());
		System.out.println("dto.getEmail()"+ dto.getEmail());
		
		
		return "paramResult"; //jsp�� ã�ư���. 
		
	}

	
	@RequestMapping(value = "/test/mav.action",method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView mavRequest(PersonDTO dto) {
		
		ModelAndView mav= new ModelAndView(); // �Ѿ���� ������ �ޱ����� ��ü����
		mav.setViewName("paramResult"); // jsp�� �Ѿ��.dto�� �Ѿ�� ���� mav�� ���� �� ������.  jsp(view)
		mav.addObject("dto",dto); //data(model)

		return mav;
		
	}
		

	@RequestMapping(value = "/test/redirect.action",method = {RequestMethod.GET,RequestMethod.POST})
	public String mavRedirectRequest(PersonDTO dto) {
		
		
		//return "redirect:/"; // �ڱ��ڽ� �����̷�Ʈ
		return "redirect:/hello.action";  //�������ϴ� �ּ�
	}
		
	
	
	
	
	
	
	
	
	
}
