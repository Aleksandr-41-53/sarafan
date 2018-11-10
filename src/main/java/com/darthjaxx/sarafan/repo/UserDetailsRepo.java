package com.darthjaxx.sarafan.repo;

import com.darthjaxx.sarafan.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<User, String> {
}
