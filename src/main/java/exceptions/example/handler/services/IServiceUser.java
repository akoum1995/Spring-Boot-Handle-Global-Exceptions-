package exceptions.example.handler.services;

import java.util.List;
import exceptions.example.handler.entities.User;

public interface IServiceUser {

	public void addUser(User u);
	public List<User> getAll();
	public User getOne(int id);
}
