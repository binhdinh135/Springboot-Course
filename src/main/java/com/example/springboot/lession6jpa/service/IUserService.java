package com.example.springboot.lession6jpa.service;

import com.example.springboot.lession6jpa.dto.PagingCustomDTO;
import com.example.springboot.lession6jpa.dto.UserDTO;
import com.example.springboot.lession6jpa.model.UserRequest;

import java.util.Collections;
import java.util.List;

public interface IUserService {

    default List<UserDTO> findAllUsers() {
        return  Collections.emptyList();
    }

    void addNewUser(UserRequest payload);

    default List<UserDTO> findAllUsersByFilter(Integer hp, Integer atk) {
        return  Collections.emptyList();
    }

    default PagingCustomDTO findAllUsersByFilterPaging(int page, int size, Integer hp, Integer atk) {
        return null;
    }

    void editUser(Long id, UserRequest payload);

    void deleteUser(Long id);
}
