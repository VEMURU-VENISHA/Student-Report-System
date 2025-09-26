package com.klu;

import com.klu.CurrentCourse;
import com.klu.CurrentCourseRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CurrentCourseService {

    private final CurrentCourseRepository currentCourseRepository;

    public CurrentCourseService(CurrentCourseRepository currentCourseRepository) {
        this.currentCourseRepository = currentCourseRepository;
    }

    public List<CurrentCourse> getAllCurrentCourses() {
        return currentCourseRepository.findAll();
    }

    public CurrentCourse addCurrentCourse(CurrentCourse course) {
        return currentCourseRepository.save(course);
    }

    public void deleteCurrentCourse(Long id) {
        currentCourseRepository.deleteById(id);
    }
}