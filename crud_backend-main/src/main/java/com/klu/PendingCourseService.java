package com.klu;

import com.klu.PendingCourse;
import com.klu.PendingCourseRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PendingCourseService {

    private final PendingCourseRepository pendingCourseRepository;

    public PendingCourseService(PendingCourseRepository pendingCourseRepository) {
        this.pendingCourseRepository = pendingCourseRepository;
    }

    public List<PendingCourse> getAllPendingCourses() {
        return pendingCourseRepository.findAll();
    }

    public PendingCourse addPendingCourse(PendingCourse course) {
        return pendingCourseRepository.save(course);
    }

    public void deletePendingCourse(Long id) {
        pendingCourseRepository.deleteById(id);
    }
}