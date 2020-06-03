package com.schoolmanage.schoolmanage.controller;

import com.schoolmanage.schoolmanage.entity.Bulletin;
import com.schoolmanage.schoolmanage.repository.BulletinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/Bulletin")
public class Bulletincontroller {
    @Autowired
    private BulletinRepository bulletinRepository;

    @GetMapping("/findAll")
    public List<Bulletin> findAll(){
        return bulletinRepository.findAll();
    }
}
