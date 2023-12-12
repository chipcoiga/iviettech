package com.example.abcuniversity.repository;

import com.example.abcuniversity.entity.TestDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TestDetailRepository extends JpaRepository<TestDetail, Integer> {

    @Query(value = "select td from TestDetail td where " +
            "(td.studentEntity.email like %:searchText% or " +
            "td.studentEntity.firstName like %:searchText% or " +
            "td.studentEntity.lastName like %:searchText%) and " +
            "(td.testEntity.id = :testId and td.pointObtained >= 5 or :testId = 0)")
    List<TestDetail> findByEmailOrFullName(@Param("searchText") String searchText,
                                           @Param("testId") int testId);
}
