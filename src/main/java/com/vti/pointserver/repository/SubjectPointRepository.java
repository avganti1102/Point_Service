package com.vti.pointserver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vti.pointserver.entity.SubjectPoint;

public interface SubjectPointRepository extends JpaRepository<SubjectPoint, Integer> {
	List<SubjectPoint> findByTrungBinhGreaterThan(Integer min);
	
	List<SubjectPoint> findByTrungBinhBetween(Integer min, Integer max);
	
	List<SubjectPoint> findByGroupId(Integer groupId);
	
	List<SubjectPoint> findByUserId(Integer userId);
	
	List<SubjectPoint> findBySubjectName(String name);
}
