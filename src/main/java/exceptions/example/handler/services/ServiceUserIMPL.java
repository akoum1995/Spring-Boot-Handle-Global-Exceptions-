package exceptions.example.handler.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exceptions.example.handler.entities.User;
import exceptions.example.handler.repositories.UserRepository;

@Service(value = "userService")
public class ServiceUserIMPL implements IServiceUser{

	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void addUser(User u) {
		userRepository.save(u);
		
	}

	@Override
	public List<User> getAll() {
		return userRepository.findAll();
	}

	@Override
	public User getOne(int id) {
		return userRepository.findById(id).get();
	}

}
