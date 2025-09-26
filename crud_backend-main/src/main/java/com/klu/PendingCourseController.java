package com.klu;

import com.klu.PendingCourse;
import com.klu.PendingCourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pending-courses")
public class PendingCourseController {

    private final PendingCourseService pendingCourseService;

    public PendingCourseController(PendingCourseService pendingCourseService) {
        this.pendingCourseService = pendingCourseService;
    }

    @GetMapping
    public List<PendingCourse> getAllPendingCourses() {
        return pendingCourseService.getAllPendingCourses();
    }

    @PostMapping
    public PendingCourse addPendingCourse(@RequestBody PendingCourse course) {
        return pendingCourseService.addPendingCourse(course);
    }

    @DeleteMapping("/{id}")
    public void deletePendingCourse(@PathVariable Long id) {
        pendingCourseService.deletePendingCourse(id);
    }
}