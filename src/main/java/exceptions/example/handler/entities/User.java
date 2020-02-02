package exceptions.example.handler.entities;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Email(message = "email is not valid")
	@NotBlank(message = "email is required")
	private String email;
	@NotBlank(message = "username is required")
	private String username;
	@Size(min = 8, message="password must have minimum 8 caracters")
	private String password;
	@Min(value = 18, message="You must have minimum 18 years old")
	private int age;
	
	public User() {
		
	}
	public User(int id, String username, String password, int age) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.age = age;
	}
	public User(String username, String password, int age) {
		this.username = username;
		this.password = password;
		this.age = age;
	}
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
