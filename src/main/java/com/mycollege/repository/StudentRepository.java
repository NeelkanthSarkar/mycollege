package com.mycollege.repository;

import com.mycollege.dto.template.StuedntTemplate;
import com.mycollege.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface StudentRepository extends MongoRepository<Student,String> {

    @Query(value = """
                        db.student.aggregate([
                        {
                          $lookup:{
                            from:"course",
                            localField:"courseId",
                            foreignField:"id",
                            as:"courseDetails"
                          }
                        },
                        {
                          $unwind:"$courseDetails"
                        },
                        {
                          $lookup:{
                            from:"address",
                            localField:"addressId",
                            foreignField:"id",
                            as:"addressDetails"
                          }
                        },
                        {
                          $unwind:"$addressDetails"
                        },
                        {
                          $lookup:{
                            from:"sharedvalues",
                            localField:"roleId",
                            foreignField:"id",
                            as:"roleDetails"
                          }
                        },
                        {
                          $unwind:"$roleDetails"
                        },
                        {
                          $project{
                             id:1,
                             firstName:1,
                             middleName:1,
                             lastName:1,
                             age:1,
                             addressId:"$addressDetails.id",
                             address1:"$addressDetails.address1",
                             address2:"$addressDetails.address2",
                             city:"$addressDetails.city",
                             state:"$addressDetails.state",
                             country:"$addressDetails.country",
                             pinCode:"$addressDetails.pinCode",
                             landMark:"$addressDetails.landMark",
                             role:"$roleDetails.value"
                             mobileNo:1,
                             email:1,
                             dateOfBirth:1,
                             fatherName:1,
                             motherName:1,
                             course:"$courseDetails.name"
                             enrollmentYear:1,
                             status:1,
                             batch:1
                          }
                        }
                        
                        ])
                        """)
    Optional<StuedntTemplate> findStudentById(int id);

    Optional<StuedntTemplate> findByStudentId(String id);

}
