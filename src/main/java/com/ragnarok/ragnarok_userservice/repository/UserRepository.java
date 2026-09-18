package com.ragnarok.ragnarok_userservice.repository;



import com.ragnarok.ragnarok_userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}