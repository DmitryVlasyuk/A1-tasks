package com.example.A1.task3.service;

import com.example.A1.task3.repos.PostingsRepo;
import com.example.A1.task3.entity.PostingsEntity;
import com.example.A1.task3.exceptions.PostingsNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostingsService {
    @Autowired
    private PostingsRepo postingsRepo;

    public PostingsEntity getOneUser(long id) throws PostingsNotFoundException {
        PostingsEntity postings = postingsRepo.findById(id).get();
        if (postings == null){
            throw new PostingsNotFoundException("запись не найдена");
        }
        return postings;
    }

    public Iterable<PostingsEntity> getAll(){
       return postingsRepo.findAll();
    }


    public List<PostingsEntity> findAllByDocDate(String startDate, String endDate)
    {
        List<PostingsEntity> postings = postingsRepo.findAllByDocDate(startDate, endDate);
        return postings;
    }

}
