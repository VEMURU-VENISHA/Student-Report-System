package com.klu;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

    @Autowired
    private ReportRepository reportRepository;

    // Insert Report
    public String insertReport(Report report) {
        reportRepository.save(report);
        return "Report inserted successfully!";
    }

    // Get all reports (return DTOs)
    public List<ReportDTO> getAllReports() {
        return reportRepository.findAll()
                .stream()
                .map(ReportDTO::new)   // convert to DTO
                .toList();
    }

    // Update Report
    public String updateReport(Report report) {
        reportRepository.save(report);
        return "Report updated successfully!";
    }

    // Delete Report
    public String deleteReport(int id) {
        reportRepository.deleteById(id);
        return "Report deleted successfully!";
    }

    // Get reports by Student ID (return DTOs)
    public List<ReportDTO> getReportsByStudentId(int studentId) {
        return reportRepository.findByStudentId(studentId)
                .stream()
                .map(ReportDTO::new)   // convert to DTO
                .toList();
    }
 // Get reports by Subject/Course ID
    public List<ReportDTO> getReportsByCourseId(int subjectId) {
        return reportRepository.findBySubjectId(subjectId)
                .stream()
                .map(ReportDTO::new)
                .toList();
    }

}
