package com.klu;

import com.klu.CurrentCourse;
import com.klu.CurrentCourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/current-courses")
public class CurrentCourseController {

    private final CurrentCourseService currentCourseService;

    public CurrentCourseController(CurrentCourseService currentCourseService) {
        this.currentCourseService = currentCourseService;
    }

    @GetMapping
    public List<CurrentCourse> getAllCurrentCourses() {
        return currentCourseService.getAllCurrentCourses();
    }

    @PostMapping
    public CurrentCourse addCurrentCourse(@RequestBody CurrentCourse course) {
        return currentCourseService.addCurrentCourse(course);
    }

    @DeleteMapping("/{id}")
    public void deleteCurrentCourse(@PathVariable Long id) {
        currentCourseService.deleteCurrentCourse(id);
    }
}