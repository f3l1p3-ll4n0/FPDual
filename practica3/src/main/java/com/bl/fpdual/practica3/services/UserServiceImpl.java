package com.bl.fpdual.practica3.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bl.fpdual.practica3.model.User;
import com.bl.fpdual.practica3.model.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User Post(User params) {
        userRepository.save(params);
        return params;
    }

    @Override
    public List<User> Get() {
        return userRepository.findAll();
    }

    @Override
    public User Get(int id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User Update(User params, int id) {

       User user =  userRepository.findById(id).get();
       user.setName(params.getName());
       user.setEmail(params.getEmail());

       return userRepository.save(user);

    }

    @Override
    public String Delete(int id) {
        userRepository.deleteById(id);
        return "User(" + id + ")" + " has been deleted!";
    }
}
