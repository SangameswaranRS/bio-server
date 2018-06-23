package com.example.sangameswaran.personalWebServer.Controllers;

import com.example.sangameswaran.personalWebServer.Models.GenericResponseEntity;
import com.example.sangameswaran.personalWebServer.Models.PostMessageEntity;
import com.example.sangameswaran.personalWebServer.Models.UserEntity;
import com.example.sangameswaran.personalWebServer.Repo.GeneralInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GeneralInfoController {

    @Autowired
    private GeneralInfoRepository gRepo = new GeneralInfoRepository();

    @ResponseBody
    @RequestMapping(value="/generalInfo/test",method=RequestMethod.GET)
    public UserEntity sampleTest(){
        return new UserEntity("Hello","world");
    }

    @ResponseBody
    @RequestMapping(value = "/api-g/postMessage",method = RequestMethod.POST)
    public ResponseEntity<GenericResponseEntity> insertMessage(@RequestBody PostMessageEntity entity){
        int insertionStatus = gRepo.addMessage(entity);
        if(insertionStatus ==0){
            return new ResponseEntity<>(new GenericResponseEntity(500,"Insertion failed"),HttpStatus.INTERNAL_SERVER_ERROR);
        }else{
            return new ResponseEntity<>(new GenericResponseEntity(200,"Message posted"),HttpStatus.OK);
        }
    }
}