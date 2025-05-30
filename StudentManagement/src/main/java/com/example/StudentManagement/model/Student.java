package com.example.StudentManagement.model;

import jakarta.persistence.*;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class Student {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int rollno;

        private String sname;
        private Long mobileno;
        private String bloodgrp;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Long getMobileno() {
        return mobileno;
    }

    public void setMobileno(Long mobileno) {
        this.mobileno = mobileno;
    }

    public String getBloodgrp() {
        return bloodgrp;
    }

    public void setBloodgrp(String bloodgrp) {
        this.bloodgrp = bloodgrp;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", sname='" + sname + '\'' +
                ", mobileno=" + mobileno +
                ", bloodgrp='" + bloodgrp + '\'' +
                '}';
    }
}


