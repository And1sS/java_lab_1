package org.and1ss.java_lab_1.service;

import org.and1ss.java_lab_1.domain.User;

import java.util.Optional;

public interface UserService {

    Optional<User> findUserById(Long id);

    User save(User user);
}

