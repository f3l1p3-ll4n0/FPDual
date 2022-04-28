package com.bl.fpdual.practica3.services;


import org.springframework.stereotype.Component;

import com.bl.fpdual.practica3.model.User;

import java.util.List;

@Component
public interface UserService {
    User Post(User params);

    List<User> Get();

    User Get(int id);

    User Update(User params, int id);

    String Delete(int id);
}