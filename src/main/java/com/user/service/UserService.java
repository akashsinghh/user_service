package com.user.service;

import com.user.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public interface UserService {
    public User getUser(Long id);

}
