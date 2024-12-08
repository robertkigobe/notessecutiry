package net.kigobe.notes.services;


import net.kigobe.notes.dtos.UserDTO;
import net.kigobe.notes.model.User;

import java.util.List;

public interface UserService {
    void updateUserRole(Long userId, String roleName);

    List<User> getAllUsers();

    UserDTO getUserById(Long id);

    public User findByUsername(String username);
}
