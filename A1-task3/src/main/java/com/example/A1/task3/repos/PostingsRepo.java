package com.example.A1.task3.repos;

import com.example.A1.task3.entity.PostingsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.util.List;


@EnableJpaRepositories
@Repository
public interface PostingsRepo extends JpaRepository<PostingsEntity, Long> {
    @Query(value = "SELECT * FROM postings WHERE Doc_Date between :startDate and :endDate ", nativeQuery = true)
    public List<PostingsEntity> findAllByDocDate(String startDate, String endDate);
}
