package com.learnSphere.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnSphere.entities.Course;
import com.learnSphere.entities.Lesson;

public interface LessonRepository extends JpaRepository<Lesson ,Integer> {
	
	Lesson findById(int lessonId);
	

}
