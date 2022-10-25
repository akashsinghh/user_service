package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements  UserService{
    //fake user list
    List<User> list=List.of
            (
                    new User(1311L,"Akash kumar","7017855964"),

                     new User(1313L," kumar","7017855964"),
                     new User(1312L,"rahul kumar","7017855964")

            );


    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
