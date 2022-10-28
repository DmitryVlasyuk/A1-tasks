package com.example.A1.task3.controller;

import com.example.A1.task3.entity.PostingsEntity;
import com.example.A1.task3.exceptions.PostingsNotFoundException;
import com.example.A1.task3.service.PostingsService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/postings")
public class PostingsController {

    @Autowired
    private PostingsService postingsService;



    @GetMapping
    public ResponseEntity getOneUser(@RequestParam int id) {
        try {
            return ResponseEntity.ok(postingsService.getOneUser(id));
        } catch (PostingsNotFoundException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }

    }


    @GetMapping("/getall")
    public Iterable<PostingsEntity> getAll(){
        return postingsService.getAll();

    }

    @GetMapping("/date")
    public List<PostingsEntity> findAllByDocDate(@RequestParam String startDate, @RequestParam String endDate)
    {
        List<PostingsEntity> postings = postingsService.findAllByDocDate(startDate, endDate);
        return postings;
    }





}
