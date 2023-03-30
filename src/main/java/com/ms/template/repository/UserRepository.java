package com.ms.template.repository;

import com.ms.template.model.dao.UserDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDao, String> {
}
