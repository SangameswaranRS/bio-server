package com.example.sangameswaran.personalWebServer.Repo;

import com.example.sangameswaran.personalWebServer.Models.MessageEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class AdminInfoRepository {
    @Autowired
    public JdbcTemplate jdbcTemplate;

    @Cacheable(value = "messages")
    public  List<MessageEntity> returnAllMessages(){
        List<Map<String,Object>> rows =jdbcTemplate.queryForList("select * from messages");
        List<MessageEntity> messages = new ArrayList<>();
        for(Map<String,Object> row:rows){
            messages.add(new MessageEntity((int)row.get("id"),(String)row.get("emailId"),(String)row.get("message")));
        }
        return messages;
    }
}
