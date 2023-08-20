package edu.icet.service;

import edu.icet.dao.StudentEntity;

import java.util.List;

public interface StudentService {
    void registerStudent(StudentEntity studentEntity);
    public List<StudentEntity> getAllStudents();
}
