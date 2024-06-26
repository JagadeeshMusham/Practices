package com.musham.practices.SpringBoot.StudentDB.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.musham.practices.SpringBoot.StudentDB.Model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}