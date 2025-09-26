package com.klu;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/reports")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @PostMapping
    public String insert(@RequestBody Report report) {
        return reportService.insertReport(report);
    }

    @GetMapping
    public List<ReportDTO> getAll() {
        return reportService.getAllReports();
    }

    @PutMapping
    public String update(@RequestBody Report report) {
        return reportService.updateReport(report);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        return reportService.deleteReport(id);
    }

    @GetMapping("/student/{studentId}")
    public List<ReportDTO> getReportsByStudent(@PathVariable int studentId) {
        return reportService.getReportsByStudentId(studentId);
    }
    @GetMapping("/course/{courseId}")
    public List<ReportDTO> getReportsByCourse(@PathVariable int courseId) {
        return reportService.getReportsByCourseId(courseId);
    }

}
