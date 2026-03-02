package com.mycollege.util;

import com.mycollege.entity.Course;
import com.mycollege.entity.Department;
import com.mycollege.entity.SharedValues;

import java.time.LocalDate;
import java.util.List;

public class Constant {

    private Constant(){}

    public static final List<Course> courseList = List.of(
            new Course("BSCMATH","Bachelor of Science","BSc","Maths","Undergraduate","3 year",50000,6,"Science"),
            new Course("BSCCHEM","Bachelor of Science","BSc","Chemistry","Undergraduate","3 year",50000,6,"Science"),
            new Course("BSCBIO","Bachelor of Science","BSc","Biology","Undergraduate","3 year",50000,6,"Science"),
            new Course("BCA","Bachelor of Computer Applications","BCA","Computer Application","Undergraduate","3 year",50000,6,"Engineering"),
            new Course("MCA","Master of Computer Applications","MCA","Computer Application","Postgraduate","2 year",50000,4,"Engineering"),
            new Course("BBA","Bachelor of Business Administration","BBA","Business Administration","Undergraduate","3 year",50000,6,"Management"),
            new Course("MBAMARKT","Master of Business Administration","MBA","Marketing","Postgraduate","2 year",50000,4,"Management"),
            new Course("MBAFIN","Master of Business Administration","MBA","Finance","Postgraduate","2 year",50000,4,"Management"),
            new Course("MBAHRO","Master of Business Administration","MBA","Human Resource and Operations","Postgraduate","2 year",50000,4,"Management"),
            new Course("BTECHCSE","Bachelor of Technology","BTech","Computer Science and Engineering(CSE)","Undergraduate","3 year",50000,6,"Computer Science"),
            new Course("BTECHIT","Bachelor of Technology","BTech","Information Technology(IT)","Undergraduate","3 year",50000,6,"Computer Science"),
            new Course("BTECHECE","Bachelor of Technology","BTech","Electronics and Communication Engineering(ECE)","Undergraduate","3 year",50000,6,"Computer Science"),
            new Course("BTECHEEE","Bachelor of Technology","BTech","Electrical and Electronics Engineering(EEE)","Undergraduate","3 year",50000,6,"Computer Science"),
            new Course("BTECHME","Bachelor of Technology","BTech","Mechanical Engineering(ME)","Undergraduate","3 year",50000,6,"Computer Science"),
            new Course("BTECHCE","Bachelor of Technology","BTech","Civil Engineering(CE)","Undergraduate","3 year",50000,6,"Computer Science"),
            new Course("MTECHCSE","Master of Technology","BTech","Computer Science and Engineering(CSE)","Postgraduate","3 year",50000,6,"Computer Science"),
            new Course("BPHARMA","Bachelor of Pharmacy","BPharma","Pharmacy","Undergraduate","3 year",50000,6,"Pharmacy"),
            new Course("MPHARMA","Master of Pharmacy","MPharma","Pharmacy","Postgraduate","3 year",50000,6,"Pharmacy")
            );

    public static final List<SharedValues> sharedValues = List.of(
            new SharedValues("Student","Designation"),
            new SharedValues("Class Representative","Designation"),

            new SharedValues("Head of Department(HoD)","Designation"),
            new SharedValues("Professor","Designation"),
            new SharedValues("Associate Professor","Designation"),
            new SharedValues("Assistance Professor","Designation"),

            new SharedValues("Registrar","Designation"),
            new SharedValues("Controller of Examinations(CoE)","Designation"),
            new SharedValues("Training and Placement Officer(TPO)","Designation"),
            new SharedValues("Librarian","Designation"),
            new SharedValues("Administrative Officer","Designation"),
            new SharedValues("Accountant","Designation"),
            new SharedValues("Warden","Designation"),

            new SharedValues("Chairman","Designation"),
            new SharedValues("Director","Designation"),
            new SharedValues("Dean","Designation"),

            new SharedValues("Leadership & Governance","Department"),
            new SharedValues("Academic","Department"),
            new SharedValues("Administrative and Support","Department"),
            new SharedValues("Security","Department"),
            new SharedValues("House Keeping","Department"),
            new SharedValues("Student Support and Services","Department")

    );

    public static List<Department> departments = List.of(
            new Department("Leadership & Governance","Top in the management hierarchy who manages the all business affairs related to the institution",3, LocalDate.now().toString()),
            new Department("Academic","Course Curriculum delivery",3, LocalDate.now().toString()),
            new Department("Administrative and Support","Anything related to admission,release,degree, marksheet and other governing bodies",3, LocalDate.now().toString()),
            new Department("Security","Represents the physical security to protect institution assets",3, LocalDate.now().toString()),
            new Department("House Keeping","Cleaning services, Hospitality and gardening services",3, LocalDate.now().toString()),
            new Department("Student Support and Services","Library, Chemistry lab and physics lab management and services",3, LocalDate.now().toString())
    );


}
