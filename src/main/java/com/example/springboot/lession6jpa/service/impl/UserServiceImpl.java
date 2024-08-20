package com.example.springboot.lession6jpa.service.impl;

import com.example.springboot.lession6jpa.dto.PagingCustomDTO;
import com.example.springboot.lession6jpa.dto.UserDTO;
import com.example.springboot.lession6jpa.entity.User;
import com.example.springboot.lession6jpa.mapper.IUserMapper;
import com.example.springboot.lession6jpa.model.UserRequest;
import com.example.springboot.lession6jpa.repository.IUsersRepository;
import com.example.springboot.lession6jpa.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor()
public class UserServiceImpl implements IUserService {

    private final IUsersRepository userRepository;

    private final IUserMapper userMapper;

    @Override
    public List<UserDTO> findAllUsers() {
        List<UserDTO> result = new ArrayList<>();
        List<User> users = userRepository.findAll();
        if(!users.isEmpty()) {
            users.forEach(user -> {
                UserDTO userDTO = userMapper.toEntity(user);
                result.add(userDTO);
            });
        }

        return result;
    }

    @Override
    public void addNewUser(UserRequest payload) {
        User user = userMapper.toPayload(payload);
        userRepository.save(user);
    }

    @Override
    public List<UserDTO> findAllUsersByFilter(Integer hp, Integer atk) {
        List<UserDTO> result = new ArrayList<>();
        List<User> users = userRepository.findByHpAndAtk(hp, atk);
        if(!users.isEmpty()) {
            users.forEach(user -> {
                UserDTO userDTO = userMapper.toEntity(user);
                result.add(userDTO);
            });
        }
        return result;
    }

    @Override
    public PagingCustomDTO findAllUsersByFilterPaging(int page, int size, Integer hp, Integer atk) {
        PagingCustomDTO pagingCustomDTO = new PagingCustomDTO();
        Pageable pageable = PageRequest.of(page, size, Sort.by("id").ascending());
        Page<User> data = userRepository.findByHpAndAtkPaging(hp, atk, pageable);
        if (data.getContent().isEmpty()) {
            Page<UserDTO> pageDTO = new PageImpl<>(Collections.emptyList(), pageable, data.getTotalElements());
            pagingCustomDTO.setResults(pageDTO);
            return pagingCustomDTO;
        }
        List<User> users = data.getContent();
        List<UserDTO> userDTOS = new ArrayList<>();
        users.forEach(user -> {
            UserDTO userDTO = userMapper.toEntity(user);
            userDTOS.add(userDTO);
        });
        pagingCustomDTO.setResults(new PageImpl<>(userDTOS, pageable, data.getTotalElements()));
        return pagingCustomDTO;
    }

    @Override
    public void editUser(Long id, UserRequest payload) {
        Optional<User> userOp = userRepository.findById(id);
        if (userOp.isPresent()) {
            User user = userOp.get();
            BeanUtils.copyProperties(payload, user);
            userRepository.save(user);
        }
    }

    @Override
    public void deleteUser(Long id) {
        Optional<User> userOp = userRepository.findById(id);
        if (userOp.isPresent()) {
            User user = userOp.get();
            userRepository.delete(user);
        }
    }


}
