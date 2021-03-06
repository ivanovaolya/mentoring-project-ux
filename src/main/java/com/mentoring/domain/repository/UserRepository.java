package com.mentoring.domain.repository;

import com.mentoring.domain.entity.User;

import org.springframework.data.repository.CrudRepository;

/**
 * @author ivanovaolyaa
 * @version 12/12/2017
 */
public interface UserRepository extends CrudRepository<User, Long> {

    User findByEmail(String email);

}
