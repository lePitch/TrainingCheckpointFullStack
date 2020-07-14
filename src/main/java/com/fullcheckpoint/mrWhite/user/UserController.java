package com.fullcheckpoint.mrWhite.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {
    @Autowired UserService service;

    @PostMapping("")
    public void postUser(@RequestBody User user){
        service.newUser(user);
    }
    @PutMapping("/{id}")
    public void editUser(@RequestBody User user, @PathVariable Long id){
        service.editUser(user, id);
    }
    @DeleteMapping("")
    public void deleteUser(Long id){
        service.deleteUser(id);
    }
}
