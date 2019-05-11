package com.akhil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akhil.model.Blog;
import com.akhil.model.User;


@Repository("blogRepository")
public interface BlogRepository extends JpaRepository<Blog, Long> {
 
   
 
}
