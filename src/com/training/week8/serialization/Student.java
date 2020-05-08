package com.training.week8.serialization;

import java.io.Serializable;

public class Student implements Serializable {
    private Integer studentId;
    private String studentName;
    private transient Double tuitionFee;

    public Student(Integer studentId, String studentName, Double tuitionFee) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.tuitionFee = tuitionFee;
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

    public Double getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(Double tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", tuitionFee=" + tuitionFee +
                '}';
    }
}
