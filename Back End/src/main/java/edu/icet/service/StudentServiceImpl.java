package edu.icet.service;

import edu.icet.dao.StudentEntity;
import edu.icet.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository studentRepository;
    @Override
    public void registerStudent(StudentEntity student) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setFirstName(student.getFirstName());
        studentEntity.setLastName(student.getLastName());

        if (student.getAge()<=10){
            log.info("Invalid age");return;
        }else {
            studentEntity.setAge(student.getAge());
        }
        if (student.getPhoneNumber().length()<10){
            log.info("Invalid Phone Number");return;
        }else {
            studentEntity.setPhoneNumber(student.getPhoneNumber());
        }
        studentEntity.setEmailAddress(student.getEmailAddress());
        studentEntity.setAddress(student.getAddress());
        studentEntity.setInstitute(student.getInstitute());
        studentEntity.setBatch(student.getBatch());
        studentEntity.setGuardiansName(student.getGuardiansName());

        studentRepository.save(studentEntity);
    }
    @Override
    public List<StudentEntity> getAllStudents() {
        return (List<StudentEntity>) studentRepository.findAll();
    }
}
