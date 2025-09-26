package com.klu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface ReportRepository extends JpaRepository<Report, Integer> {
	List<Report> findByStudentId(int studentId);
	List<Report> findBySubjectId(int subjectId);
}
