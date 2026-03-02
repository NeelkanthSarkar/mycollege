package com.mycollege.util;

import com.mycollege.dto.StudentResponse;
import com.mycollege.dto.template.StuedntTemplate;
import com.mycollege.entity.Address;
import com.mycollege.entity.Student;
import com.mycollege.general.APIResponse;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;

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


    public static String createStudentId(String course, int studentCountByCourse) {
        StringBuilder studentId = new StringBuilder();
        studentId.append(course);
        studentId.append(LocalDate.now().getYear());
        if(studentCountByCourse<10){
            studentId.append("00");
            studentId.append(studentCountByCourse+1);
        }
        else if(studentCountByCourse<100){
            studentId.append("0");
            studentId.append(studentCountByCourse+1);
        }
        else{
            studentId.append(studentCountByCourse+1);
        }
        return studentId.toString();
    }
}
