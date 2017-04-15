package main.java.model;
// Generated Apr 11, 2017 10:02:26 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * ClassSubject generated by hbm2java
 */
public class ClassSubject  implements java.io.Serializable {


     private String subjectId;
     private String subjectName;
     private Set students = new HashSet(0);
     private Set timetables = new HashSet(0);
     private Set attendances = new HashSet(0);

    public ClassSubject() {
    }

	
    public ClassSubject(String subjectId) {
        this.subjectId = subjectId;
    }
    public ClassSubject(String subjectId, String subjectName, Set students, Set timetables, Set attendances) {
       this.subjectId = subjectId;
       this.subjectName = subjectName;
       this.students = students;
       this.timetables = timetables;
       this.attendances = attendances;
    }
   
    public String getSubjectId() {
        return this.subjectId;
    }
    
    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }
    public String getSubjectName() {
        return this.subjectName;
    }
    
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
    public Set getStudents() {
        return this.students;
    }
    
    public void setStudents(Set students) {
        this.students = students;
    }
    public Set getTimetables() {
        return this.timetables;
    }
    
    public void setTimetables(Set timetables) {
        this.timetables = timetables;
    }
    public Set getAttendances() {
        return this.attendances;
    }
    
    public void setAttendances(Set attendances) {
        this.attendances = attendances;
    }

    public void addStudent(Student student)
    {
        students.add(student);
    }

}


