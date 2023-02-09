package com.spring.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.security.entity.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, String>{

	Optional<UserInfo> findByUsername(String username);

}
