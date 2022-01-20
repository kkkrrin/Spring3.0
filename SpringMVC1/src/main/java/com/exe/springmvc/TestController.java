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

		System.out.println("GET방식 Request");
		
		return "paramResult"; //jsp를 찾아가라. 
		
	}

	
	@RequestMapping(value = "/test/param.action",method = RequestMethod.POST)
	public String processPostRequest() {

		System.out.println("POST방식 Request");
		
		return "paramResult"; //jsp를 찾아가라. 
		
	}
*/
	//하나로 합친 것 
	@RequestMapping(value = "/test/param.action",method = {RequestMethod.GET,RequestMethod.POST})
	public String processGetRequest(PersonDTO dto, String name, HttpServletRequest req) throws Exception {
		
		
		System.out.println("GET/POST방식 Request");
		System.out.println(name);
		System.out.println(req.getParameter("phone"));
		
		System.out.println(dto); 
		System.out.println("dto.getName()" + dto.getName());
		System.out.println("dto.getPhone()" + dto.getPhone());
		System.out.println("dto.getEmail()"+ dto.getEmail());
		
		
		return "paramResult"; //jsp를 찾아가라. 
		
	}

	
	@RequestMapping(value = "/test/mav.action",method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView mavRequest(PersonDTO dto) {
		
		ModelAndView mav= new ModelAndView(); // 넘어오는 데이터 받기위해 객체생성
		mav.setViewName("paramResult"); // jsp로 넘어간다.dto로 넘어온 값을 mav에 넣은 후 보낸다.  jsp(view)
		mav.addObject("dto",dto); //data(model)

		return mav;
		
	}
		

	@RequestMapping(value = "/test/redirect.action",method = {RequestMethod.GET,RequestMethod.POST})
	public String mavRedirectRequest(PersonDTO dto) {
		
		
		//return "redirect:/"; // 자기자신 리다이렉트
		return "redirect:/hello.action";  //가고자하는 주소
	}
		
	
	
	
	
	
	
	
	
	
}
