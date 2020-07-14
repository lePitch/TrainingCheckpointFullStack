package com.fullcheckpoint.mrWhite.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired UserRepository repository;

    public void newUser(User user){
        repository.save(user);
    }
    public void editUser(User user, Long id){
        User newUser = user;
        user.setId(id);
        repository.save(newUser);
    }
    public void deleteUser(Long id){
        repository.deleteById(id);
    }
}
