package com.mentoring.controller.converter;

import java.util.Objects;

import com.mentoring.controller.dto.user.GenericUserDto;
import com.mentoring.controller.dto.user.UserDto;
import com.mentoring.domain.entity.User;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author ivanovaolyaa
 * @version 12/12/2017
 */
public class UserConverter implements Converter<User, GenericUserDto> {

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public User convertToEntity(final GenericUserDto dto) {
        modelMapper.getConfiguration().setAmbiguityIgnored(true);
        return modelMapper.map(dto, User.class);
    }

    @Override
    public GenericUserDto convertToDto(final User entity) {
        return modelMapper.map(entity, UserDto.class);
    }

    @Override
    public User update(User currentEntity, GenericUserDto genericUserDto) {
        UserDto dto = (UserDto) genericUserDto;

        if (Objects.nonNull(dto.getFirstName())) {
            currentEntity.setFirstName(dto.getFirstName());
        }

        if (Objects.nonNull(dto.getLastName())) {
            currentEntity.setLastName(dto.getFirstName());
        }

        return currentEntity;
    }


}
