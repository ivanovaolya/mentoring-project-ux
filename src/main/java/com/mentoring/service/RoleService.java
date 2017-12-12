package com.mentoring.service;

import com.mentoring.domain.entity.Role;

/**
 * @author ivanovaolyaa
 * @version 12/12/2017
 */
public interface RoleService {

    Role findByRoleName(final String roleName);

}
