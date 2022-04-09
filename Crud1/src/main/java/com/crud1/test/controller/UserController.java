package com.crud1.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud1.test.entity.User;
import com.crud1.test.services.UserServices;

@RestController
public class UserController {
	@Autowired
	private UserServices service;
	
	@PostMapping("/user")
	public User addProduct(@RequestBody User user)
	{
		return service.saveUser(user);
	}
	@PostMapping("/users")
	public List<User> addProducts(@RequestBody List<User> users)
	{
		return service.saveUsers(users);
	}
	@GetMapping("/users")
	public List<User> findAllUser()
	{
		return service.getUsers();
	}
	@GetMapping("/users/{id}")
	public User findAllUserById(@PathVariable int id)
	{
		return service.getUsersById(id);
	}
	@GetMapping("/username/{name}")
	public User findAllUserByName(@PathVariable String name)
	{
		return service.getUserByName(name);
	}
	@PutMapping("/update")
	public User updateUser(@RequestBody User user)
	{
		return service.updateUser(user);
	}
	@DeleteMapping("/delete")
	public String deleteUser(@PathVariable int id)
	{
		return service.delete(id);
	}
}
