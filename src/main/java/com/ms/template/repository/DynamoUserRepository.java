package com.ms.template.repository;

import com.ms.template.model.dao.DynamoUserDao;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface DynamoUserRepository extends CrudRepository<DynamoUserDao, String> {
}
