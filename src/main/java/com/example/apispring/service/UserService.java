package com.example.apispring.service;

import com.example.apispring.dto.TaskDto;
import com.example.apispring.dto.UserDto;
import com.example.apispring.payloadreponse.LoginMesage;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    boolean createUserDto (UserDto userDto);
//
    LoginMesage LoginUser(UserDto userDto);
}
