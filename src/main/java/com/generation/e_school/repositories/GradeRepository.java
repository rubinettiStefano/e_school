package com.generation.e_school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.e_school.model.Grade;

public interface GradeRepository extends JpaRepository<Grade,Integer>
{

}
