package com.lyloou.sample._5MVC;

class StudentController {
    Student student;
    StudentView sv;

    StudentController(Student student, StudentView sv) {
        this.student = student;
        this.sv = sv;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentView getSv() {
        return sv;
    }

    public void setSv(StudentView sv) {
        this.sv = sv;
    }

    public void updateStudent() {
        sv.showStudentDetail(student.getNo(), student.getName());
    }
}