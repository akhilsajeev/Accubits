package com.akhil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;

import com.akhil.model.Blog;
import com.akhil.model.Role;
import com.akhil.model.User;
import com.akhil.repository.BlogRepository;
import com.akhil.repository.RoleRespository;
import com.akhil.repository.UserRepository;

@Service("blogService")
public class BlogServiceImpl implements BlogService {
	
	@Autowired
	private BlogRepository blogRepository;

	@Override
	public void saveBlog(Blog blog) {
		blogRepository.save(blog);
	}
 
 

}
