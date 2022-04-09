package com.crud1.test.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud1.test.entity.User;
import com.crud1.test.repository.UserRepository;

@Service
public class UserServices {
	@Autowired
	private UserRepository repository;
	
	public User saveUser(User user) 
	{
		return repository.save(user);
	}
	
	public List<User> saveUsers(List<User> users)
	{
		return repository.saveAll(users);
	}
	
	public List<User> getUsers()
	{
		return repository.findAll();
	}
	
	public User getUsersById(int id)
	{
		return repository.findById(id).orElse(null);
	}
	
	public User getUserByName(String name)
	{
		return repository.findByName(name);
	}
	
	public String delete(int id)
	{
		repository.deleteById(id);
		return "Data deleted successfully";
	}
	
	public User updateUser(User user)
	{
		User existUser = repository.findById(user.getId()).orElse(null);
		existUser.setId(user.getId());
		existUser.setName(user.getName());
		existUser.setNumber(user.getNumber());
		return repository.save(existUser);
	}
}
