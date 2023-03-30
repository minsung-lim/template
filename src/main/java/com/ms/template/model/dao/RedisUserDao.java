package com.ms.template.model.dao;

import lombok.*;
import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("user")
public class RedisUserDao {

    @Id
    String userId;
    String userName;
    LocalDateTime createdDate;
    LocalDateTime modifiedDate;
}
