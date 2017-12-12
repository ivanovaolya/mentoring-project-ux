package com.mentoring.controller.dto.user;

import lombok.Data;

/**
 * @author ivanovaolyaa
 * @version 12/12/2017
 */
@Data
public class UserDto implements GenericUserDto {

    private String email;

    private String firstName;

    private String lastName;

}
