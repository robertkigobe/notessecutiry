package net.kigobe.notes.repositories;

import net.kigobe.notes.model.AppRole;
import net.kigobe.notes.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);

}
