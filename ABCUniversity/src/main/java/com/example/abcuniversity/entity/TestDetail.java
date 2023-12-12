package com.example.abcuniversity.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "test_details")
public class TestDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private float pointMax;
    private float pointObtained;
    private String result;
    @ManyToOne
    @JoinColumn(name = "test_entity_id")
    private TestEntity testEntity;
    @ManyToOne
    @JoinColumn(name = "student_entity_id")
    private StudentEntity studentEntity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPointMax() {
        return pointMax;
    }

    public void setPointMax(float pointMax) {
        this.pointMax = pointMax;
    }

    public float getPointObtained() {
        return pointObtained;
    }

    public void setPointObtained(float pointObtained) {
        this.pointObtained = pointObtained;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public TestEntity getTestEntity() {
        return testEntity;
    }

    public void setTestEntity(TestEntity testEntity) {
        this.testEntity = testEntity;
    }

    public StudentEntity getStudentEntity() {
        return studentEntity;
    }

    public void setStudentEntity(StudentEntity studentEntity) {
        this.studentEntity = studentEntity;
    }
}
