package com.akhil.service;

import com.akhil.model.User;

public interface UserService {

	public User findUserByEmail(String email);

	public void saveUser(User user);
}