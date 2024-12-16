package net.kigobe.notes.services;


import net.kigobe.notes.dtos.UserDTO;
import net.kigobe.notes.model.Role;
import net.kigobe.notes.model.User;

import java.util.List;

public interface UserService {
    void updateUserRole(Long userId, String roleName);

    List<User> getAllUsers();

    UserDTO getUserById(Long id);

    User findByUsername(String username);

    void updatePassword(Long userId, String password);

    void updateCredentialsExpiryStatus(Long userId, boolean expire);

    void updateAccountEnabledStatus(Long userId, boolean enabled);

    void updateAccountExpiryStatus(Long userId, boolean expire);

    void updateAccountLockStatus(Long userId, boolean lock);

    List<Role> getAllRoles();
}
