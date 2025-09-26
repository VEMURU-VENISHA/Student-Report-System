package com.klu;

import com.klu.PendingCourse;
import com.klu.CurrentCourse;
import com.klu.PendingCourseRepository;
import com.klu.CurrentCourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    private final PendingCourseRepository pendingRepo;
    private final CurrentCourseRepository currentRepo;

    public CourseService(PendingCourseRepository pendingRepo, CurrentCourseRepository currentRepo) {
        this.pendingRepo = pendingRepo;
        this.currentRepo = currentRepo;
    }

    // Pending Courses
    public List<PendingCourse> getPendingCourses() {
        return pendingRepo.findAll();
    }

    public PendingCourse addPendingCourse(PendingCourse course) {
        return pendingRepo.save(course);
    }

    // Current Courses
    public List<CurrentCourse> getCurrentCourses() {
        return currentRepo.findAll();
    }

    public CurrentCourse addCurrentCourse(CurrentCourse course) {
        return currentRepo.save(course);
    }
}