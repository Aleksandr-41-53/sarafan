package com.darthjaxx.sarafan.repo;

import com.darthjaxx.sarafan.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
