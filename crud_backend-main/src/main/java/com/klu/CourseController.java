package com.klu;

import com.klu.PendingCourse;
import com.klu.CurrentCourse;
import com.klu.CourseService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@CrossOrigin(origins = "*")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    // ✅ Pending Courses
    @GetMapping("/pending")
    public List<PendingCourse> getPendingCourses() {
        return courseService.getPendingCourses();
    }

    @PostMapping("/pending")
    public PendingCourse addPendingCourse(@RequestBody PendingCourse course) {
        return courseService.addPendingCourse(course);
    }

    // ✅ Current Courses
    @GetMapping("/current")
    public List<CurrentCourse> getCurrentCourses() {
        return courseService.getCurrentCourses();
    }

    @PostMapping("/current")
    public CurrentCourse addCurrentCourse(@RequestBody CurrentCourse course) {
        return courseService.addCurrentCourse(course);
    }
}