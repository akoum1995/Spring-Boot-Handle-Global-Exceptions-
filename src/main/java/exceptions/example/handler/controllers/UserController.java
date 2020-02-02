package exceptions.example.handler.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import exceptions.example.handler.entities.User;
import exceptions.example.handler.services.IServiceUser;
import exceptions.example.handler.utils.CustomObjectResponse;


@CrossOrigin(origins = "*")
@RestController
public class UserController {

	@Autowired
    private IServiceUser userService;

    @PostMapping(value="/addUser")
    public @ResponseBody ResponseEntity<?> addUser(@RequestBody User user){
    	userService.addUser(user);
    	return new ResponseEntity<Object>(new CustomObjectResponse("Creation done"), HttpStatus.OK);
    }
    @GetMapping(value="/allUsers", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<List<User>> getAllUsers(){
    	return new ResponseEntity<List<User>>(userService.getAll(), HttpStatus.OK);
    }
    @GetMapping(value="/user/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<User> getOneUser(@PathVariable("id") int id){
    	return new ResponseEntity<User>(userService.getOne(id), HttpStatus.OK);
    }
}
