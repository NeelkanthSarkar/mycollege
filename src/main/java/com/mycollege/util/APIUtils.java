package com.mycollege.util;

import com.mycollege.dto.StudentResponse;
import com.mycollege.dto.template.StuedntTemplate;
import com.mycollege.entity.Address;
import com.mycollege.entity.Student;
import com.mycollege.general.APIResponse;
import org.springframework.http.ResponseEntity;

public class APIUtils {

    private APIUtils(){}

    public static APIResponse createSuccessResponse(Object data){
        return new APIResponse(200,"Success",data);
    }

    public static APIResponse createFailureResponse(int code,String message,Object data){
        return new APIResponse(code,message,data);
    }

    public static APIResponse createFailureResponse(int code,String message){
        return new APIResponse(code,message,null);
    }

    public static APIResponse createAPIResponse(int code,String message){
        return new APIResponse(code,message,null);
    }

    public static StudentResponse mapToStudentResponse(StuedntTemplate student) {
        StudentResponse studentResponse = new StudentResponse();
        studentResponse.setId(student.getId());
        studentResponse.setFirstName(student.getFirstName());
        studentResponse.setMiddleName(student.getMiddleName());
        studentResponse.setLastName(student.getLastName());
        studentResponse.setAge(student.getAge());
        studentResponse.setFatherName(student.getFatherName());
        studentResponse.setMotherName(student.getMotherName());
        studentResponse.setAddress(APIUtils.mapAddress(student));
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
}
