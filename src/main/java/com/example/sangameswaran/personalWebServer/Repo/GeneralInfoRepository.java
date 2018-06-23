package com.example.sangameswaran.personalWebServer.Repo;

import com.example.sangameswaran.personalWebServer.Models.PostMessageEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class GeneralInfoRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @CacheEvict(value = "messages")
    public int addMessage(PostMessageEntity entity){
        return jdbcTemplate.update("insert into messages values(0,?,?);",entity.getEmailId(),entity.getMessage());
    }
}
