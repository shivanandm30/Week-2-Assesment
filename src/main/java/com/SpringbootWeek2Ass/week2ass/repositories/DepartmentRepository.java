package com.SpringbootWeek2Ass.week2ass.repositories;

import com.SpringbootWeek2Ass.week2ass.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity,Long> {

}
