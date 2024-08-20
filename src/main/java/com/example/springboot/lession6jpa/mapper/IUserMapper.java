package com.example.springboot.lession6jpa.mapper;

import com.example.springboot.lession6jpa.dto.UserDTO;
import com.example.springboot.lession6jpa.entity.User;
import com.example.springboot.lession6jpa.model.UserRequest;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface IUserMapper {
    IUserMapper INSTANCE = Mappers.getMapper(IUserMapper.class);

    UserDTO toEntity(User entity);

    User toPayload(UserRequest payload);
}
