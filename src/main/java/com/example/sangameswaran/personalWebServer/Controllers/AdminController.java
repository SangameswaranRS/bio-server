package com.example.sangameswaran.personalWebServer.Controllers;

import com.example.sangameswaran.personalWebServer.Models.MessageEntity;
import com.example.sangameswaran.personalWebServer.Repo.AdminInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
public class AdminController {

    @Autowired
    private AdminInfoRepository adminRepo = new AdminInfoRepository();

    @ResponseBody
    @RequestMapping(value = "/admin/test",method = RequestMethod.GET)
    @RolesAllowed("ROLE_ADMIN")
    public String test(){
        return "Test:Server";
    }

    @ResponseBody
    @RolesAllowed("ROLE_ADMIN")
    @RequestMapping(value ="/admin/messages",method = RequestMethod.GET)
    public List<MessageEntity> getAllMessages(){
        return adminRepo.returnAllMessages();
    }
}
