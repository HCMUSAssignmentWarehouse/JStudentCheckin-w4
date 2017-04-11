package main.java.model;
// Generated Apr 11, 2017 10:02:26 PM by Hibernate Tools 4.3.1



/**
 * Attendance generated by hbm2java
 */
public class Attendance  implements java.io.Serializable {


     private AttendanceId id;
     private ClassSubject classsubject;
     private Student student;
     private Boolean isCheckedIn;

    public Attendance() {
    }

	
    public Attendance(AttendanceId id, ClassSubject classsubject, Student student) {
        this.id = id;
        this.classsubject = classsubject;
        this.student = student;
    }
    public Attendance(AttendanceId id, ClassSubject classsubject, Student student, Boolean isCheckedIn) {
       this.id = id;
       this.classsubject = classsubject;
       this.student = student;
       this.isCheckedIn = isCheckedIn;
    }
   
    public AttendanceId getId() {
        return this.id;
    }
    
    public void setId(AttendanceId id) {
        this.id = id;
    }
    public ClassSubject getClasssubject() {
        return this.classsubject;
    }
    
    public void setClasssubject(ClassSubject classsubject) {
        this.classsubject = classsubject;
    }
    public Student getStudent() {
        return this.student;
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }
    public Boolean getIsCheckedIn() {
        return this.isCheckedIn;
    }
    
    public void setIsCheckedIn(Boolean isCheckedIn) {
        this.isCheckedIn = isCheckedIn;
    }




}


