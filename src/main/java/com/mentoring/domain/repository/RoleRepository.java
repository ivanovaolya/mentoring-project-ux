package com.mentoring.domain.repository;

import com.mentoring.domain.entity.Role;

import org.springframework.data.repository.CrudRepository;

/**
 * @author ivanovaolyaa
 * @version 12/12/2017
 */
public interface RoleRepository extends CrudRepository<Role, Long> {

    Role findByRoleName(String roleName);

}
