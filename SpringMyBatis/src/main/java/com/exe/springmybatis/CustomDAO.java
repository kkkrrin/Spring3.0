package com.exe.springmybatis;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionTemplate;

public class CustomDAO {

	private SqlSessionTemplate sessionTemplate; //db 넘겨! 

	public void setSessionTemplate(SqlSessionTemplate sessionTemplate) {
		this.sessionTemplate = sessionTemplate;
	}
	
	
	public void insertData(CustomDTO dto) { 
		
		sessionTemplate.insert("com.mapper.custom.insertData",dto);
		
	}

	public List<CustomDTO> getLists(){ 
		
		List<CustomDTO> lists= sessionTemplate.selectList("com.mapper.custom.list");
		
		return lists;
	
	}

	public void updateData(CustomDTO dto) {
		
		sessionTemplate.update("com.mapper.custom.updateData",dto);
	
		
	}


	public CustomDTO getReadData(int id){ // 하나의 데이터 읽기 
		
		CustomDTO dto= sessionTemplate.selectOne("com.mapper.custom.listOne",id);
		
		return dto;
	}
	
	
	
	public void deleteData(int id) {
		
		sessionTemplate.delete("com.mapper.custom.deleteData",id);

		
	}

}
