package com.laye.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laye.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
