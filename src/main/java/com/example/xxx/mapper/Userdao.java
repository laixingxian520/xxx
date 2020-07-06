package com.example.xxx.mapper;

import com.example.xxx.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface Userdao {
    public User Sel(int id);
}
