package com.training.week6.compare;

public class Student implements Comparable {
    private Integer studentId;
    private String studentName;

    public Student(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object object) {
        Student student = (Student) object;
        if (this.studentId > student.studentId) {
            return +1;
        } else if (this.studentId < student.studentId) {
            return -1;
        } else {
            return 0;
        }
    }

}
