package com.klu;

import com.klu.PendingCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PendingCourseRepository extends JpaRepository<PendingCourse, Long> {
}