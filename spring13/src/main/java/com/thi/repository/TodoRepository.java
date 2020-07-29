package com.thi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thi.model.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

}
