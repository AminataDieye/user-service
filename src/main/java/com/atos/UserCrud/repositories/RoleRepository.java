package com.atos.UserCrud.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.atos.UserCrud.models.ERole;
import com.atos.UserCrud.models.Role;

@Repository
public interface RoleRepository extends MongoRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
