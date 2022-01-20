package com.exe.springmybatis;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

public class CustomMain {

	public static void main(String[] args) {
		
		
		GenericXmlApplicationContext context= new GenericXmlApplicationContext("app-context.xml");
		
		CustomDAO dao= (CustomDAO)context.getBean("customDAO");
		
		CustomDTO dto;
	
/*	//insert
		dto = new CustomDTO();
		dto.setId(777);
		dto.setName("김말이");
		dto.setAge(25);
		
		dao.insertData(dto);
		
		System.out.println("insert 성공 !");

*/
 			
	//select	
		List<CustomDTO> lists1= dao.getLists(); 
		
		for(CustomDTO dto1 : lists1) {
			System.out.printf("%d %s %d\n", dto1.getId(), dto1.getName(), dto1.getAge());
		}
		
		System.out.println("select 성공!");

/*	
	//update
		dto=new CustomDTO();
		dto.setId(222);
		dto.setName("yerinnn");
		dto.setAge(28);
		
		dao.updateData(dto);
		
		System.out.println("update 성공!");
	

*/
		
/*		
  	//delete 
  	 	dao.deleteData(777);
 		System.out.println("delete 성공!");

*/	
		
 
	//하나의 데이터 읽어오기
		dto = dao.getReadData(222);
		
		if(dto!=null) {
			System.out.printf("%d %s %d\n", dto.getId(), dto.getName(), dto.getAge());
			
			System.out.println("OneReadData 성공!");
		}

	
		
	}
}
