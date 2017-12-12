package com.mentoring.service;

import java.util.List;

import com.mentoring.domain.entity.User;

/**
 * @author ivanovaolyaa
 * @version 12/12/2017
 */
public interface UserService {

    void save(User user);

    void delete(User user);

    List<User> findAll();

    User findUserByPk(Long pk);

    User findUserByEmail(String email);

    boolean isEmailExist(String email);

}
