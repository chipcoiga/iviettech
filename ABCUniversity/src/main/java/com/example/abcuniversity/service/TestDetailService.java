package com.example.abcuniversity.service;

import com.example.abcuniversity.entity.TestDetail;

import java.util.List;

public interface TestDetailService {
    List<TestDetail> search(String searchText, int testId);
}
