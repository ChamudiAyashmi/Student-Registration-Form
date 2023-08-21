package edu.icet.service;

import edu.icet.dao.StudentEntity;
import edu.icet.dto.Student;
import edu.icet.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository studentRepository;
    public boolean isValidAge(int age){
        if (age>10){
            return true;
        }else {
            return false;
        }
    }
    public boolean isValidPhoneNumber(String phoneNumber){
        if (phoneNumber.length()==10 & phoneNumber.charAt(0)==0){
            return true;
        }else {
            return false;
        }
    }
    @Override
    public void registerStudent(Student student) {

        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setFirstName(student.getFirstName());
        studentEntity.setLastName(student.getLastName());

        if (isValidAge(student.getAge())){
            studentEntity.setAge(student.getAge());
        }else {
            return;
        }
        if (isValidPhoneNumber(student.getPhoneNumber())){
            studentEntity.setPhoneNumber(student.getPhoneNumber());
        }else {
            return;
        }

        studentEntity.setEmailAddress(student.getEmailAddress());
        studentEntity.setAddress(student.getAddress());
        studentEntity.setInstitute(student.getInstitute());
        studentEntity.setBatch(student.getBatch());
        studentEntity.setGuardiansName(student.getGuardiansName());
        studentRepository.save(studentEntity);

/*       if (student.getAge()<=10){
            return;
        }else {
            studentEntity.setAge(student.getAge());
        }
        if (student.getPhoneNumber().length()<10 & student.getPhoneNumber().charAt(0)==0){
            return;
        }else {
            studentEntity.setPhoneNumber(student.getPhoneNumber());
        }
        studentEntity.setEmailAddress(student.getEmailAddress());
        studentEntity.setAddress(student.getAddress());
        studentEntity.setInstitute(student.getInstitute());
        studentEntity.setBatch(student.getBatch());
        studentEntity.setGuardiansName(student.getGuardiansName());*/

        //studentRepository.save(studentEntity);
    }
    @Override
    public List<StudentEntity> getAllStudents() {
        return (List<StudentEntity>) studentRepository.findAll();
    }
}
