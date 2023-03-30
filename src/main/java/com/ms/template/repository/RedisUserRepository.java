package com.ms.template.repository;

import com.ms.template.model.dao.RedisUserDao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedisUserRepository extends CrudRepository<RedisUserDao, String> {
}
