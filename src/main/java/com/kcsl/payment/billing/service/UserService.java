package com.kcsl.payment.billing.service;

import com.kcsl.payment.billing.entity.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
