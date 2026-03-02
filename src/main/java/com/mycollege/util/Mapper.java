package com.mycollege.util;

import com.mycollege.dto.AddStudentRequest;
import com.mycollege.dto.StudentResponse;
import com.mycollege.dto.template.StuedntTemplate;
import com.mycollege.entity.Address;
import com.mycollege.entity.Course;
import com.mycollege.entity.Student;
import com.mycollege.general.Status;

import java.time.LocalDate;

public class Mapper {

    private Mapper(){}

    public static StudentResponse mapToStudentResponse(StuedntTemplate student) {
        StudentResponse studentResponse = new StudentResponse();
        studentResponse.setId(student.getId());
        studentResponse.setFirstName(student.getFirstName());
        studentResponse.setMiddleName(student.getMiddleName());
        studentResponse.setLastName(student.getLastName());
        studentResponse.setAge(student.getAge());
        studentResponse.setFatherName(student.getFatherName());
        studentResponse.setMotherName(student.getMotherName());
        studentResponse.setAddress(Mapper.mapAddress(student));
        studentResponse.setCourse(student.getCourse());
        studentResponse.setBatch(student.getBatch());
        studentResponse.setEmail(student.getEmail());
        studentResponse.setEnrollmentYear(student.getEnrollmentYear());
        studentResponse.setRole(student.getRole());
        studentResponse.setStatus(student.getStatus());
        studentResponse.setMobileNo(student.getMobileNo());
        studentResponse.setDateOfBirth(student.getDateOfBirth());
        return studentResponse;
    }

    private static Address mapAddress(StuedntTemplate student) {
        Address address = new Address();
        address.setId(student.getAddressId());
        address.setAddress1(student.getAddress1());
        address.setAddress2(student.getAddress2());
        address.setCity(student.getCity());
        address.setState(student.getState());
        address.setCountry(student.getCountry());
        address.setPinCode(student.getPinCode());
        address.setLandMark(student.getLandMark());
        return address;
    }

    public static Student mapAddNewStudentEntity(AddStudentRequest addStudentRequest, Course course, String addressId,int studentCountByCourse) {
        Student student = new Student();
        student.setStudentId(APIUtils.createStudentId(course.getId(),studentCountByCourse));
        student.setFirstName(addStudentRequest.getFirstName());
        student.setMiddleName(addStudentRequest.getMiddleName());
        student.setLastName(addStudentRequest.getLastName());
        student.setBatch(LocalDate.now().getYear()+"-"+ LocalDate.now().getYear()+1);
        student.setCourseId(course.getId());
        student.setStatus(Status.ACTIVE.toString());
        student.setEnrollmentYear(LocalDate.now().getYear());
        student.setDesignation("Student");
        student.setMobileNo(addStudentRequest.getMobileNo());
        student.setEmail(addStudentRequest.getEmail());
        student.setDateOfBirth(addStudentRequest.getDateOfBirth());
        student.setCreatedDate(LocalDate.now().toString());
        student.setAge(addStudentRequest.getAge());

        student.setMotherName(addStudentRequest.getMotherName());
        student.setFatherName(addStudentRequest.getFatherName());

        student.setAddressId(addressId);
        return student;
    }

    public static Address mapToAddress(AddStudentRequest addStudentRequest){
        Address address = new Address();
        address.setAddress1(addStudentRequest.getAddress1());
        address.setAddress2(addStudentRequest.getAddress2());
        address.setCity(addStudentRequest.getCity());
        address.setState(addStudentRequest.getState());
        address.setCountry(addStudentRequest.getCountry());
        address.setPinCode(addStudentRequest.getPinCode());
        address.setLandMark(addStudentRequest.getLandMark());
        return address;
    }
}
