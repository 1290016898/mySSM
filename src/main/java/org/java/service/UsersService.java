package org.java.service;

import org.java.dao.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UsersService {
	
	@Autowired
	private UsersMapper mapper;
	
	public List<Map<String, Object>> findAll(){
		return mapper.findAll();
	}
	
}
