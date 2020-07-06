package com.example.xxx.service.IMPL;


import com.example.xxx.entity.User;
import com.example.xxx.mapper.Userdao;
import com.example.xxx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceIMPL implements UserService {

    @Autowired
  private Userdao userMapper;

    @Override
    public User Sel(int id){
        return userMapper.Sel(id);
    }

}
