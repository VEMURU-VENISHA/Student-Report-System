package com.klu;

public class ReportDTO {
    private int id;
    private String studentName;
    private String subjectName;
    private double attendancePercentage;
    private String grade;
    private String remarks;
    private int semester; // ✅ new semester field

    public ReportDTO(Report report) {
        this.id = report.getId();
        this.studentName = report.getStudent().getName();
        this.subjectName = report.getSubject().getName();
        this.attendancePercentage = report.getAttendancePercentage();
        this.grade = report.getGrade();
        this.remarks = report.getRemarks();
        this.semester = report.getSemester(); // ✅ map semester
    }

    // Getters
    public int getId() { return id; }
    public String getStudentName() { return studentName; }
    public String getSubjectName() { return subjectName; }
    public double getAttendancePercentage() { return attendancePercentage; }
    public String getGrade() { return grade; }
    public String getRemarks() { return remarks; }
    public int getSemester() { return semester; } // ✅ getter
}
