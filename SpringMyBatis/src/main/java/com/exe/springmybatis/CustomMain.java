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
		dto.setName("�踻��");
		dto.setAge(25);
		
		dao.insertData(dto);
		
		System.out.println("insert ���� !");

*/
 			
	//select	
		List<CustomDTO> lists1= dao.getLists(); 
		
		for(CustomDTO dto1 : lists1) {
			System.out.printf("%d %s %d\n", dto1.getId(), dto1.getName(), dto1.getAge());
		}
		
		System.out.println("select ����!");

/*	
	//update
		dto=new CustomDTO();
		dto.setId(222);
		dto.setName("yerinnn");
		dto.setAge(28);
		
		dao.updateData(dto);
		
		System.out.println("update ����!");
	

*/
		
/*		
  	//delete 
  	 	dao.deleteData(777);
 		System.out.println("delete ����!");

*/	
		
 
	//�ϳ��� ������ �о����
		dto = dao.getReadData(222);
		
		if(dto!=null) {
			System.out.printf("%d %s %d\n", dto.getId(), dto.getName(), dto.getAge());
			
			System.out.println("OneReadData ����!");
		}

	
		
	}
}
