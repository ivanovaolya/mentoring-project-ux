package com.mentoring.controller;

import javax.validation.Valid;

import com.mentoring.controller.converter.Converter;
import com.mentoring.controller.dto.Response;
import com.mentoring.controller.dto.user.GenericUserDto;
import com.mentoring.controller.dto.user.RegistrationDto;
import com.mentoring.controller.exception.DuplicateEmailException;
import com.mentoring.domain.entity.User;
import com.mentoring.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ivanovaolyaa
 * @version 12/12/2017
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private Converter<User, GenericUserDto> userConverter;

    @PostMapping(value = "/register", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Response register(@RequestBody @Valid RegistrationDto registrationDto) throws DuplicateEmailException {
        if (!isPasswordConfirmed(registrationDto)) {
            throw new IllegalArgumentException("Password is not confirmed");
        }
        if (userService.isEmailExist(registrationDto.getEmail())) {
            throw new DuplicateEmailException("Email is already exists");
        }
        final User user = userConverter.convertToEntity(registrationDto);
        userService.save(user);

        return new Response(HttpStatus.CREATED, "User is created");
    }

    private boolean isPasswordConfirmed(final RegistrationDto dto) {
        return dto.getPassword().equals(dto.getConfirmPassword());
    }

}
