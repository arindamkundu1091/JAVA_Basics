package com.examly.springapp.repository;

import com.examly.springapp.entity.Taskentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
 
@Repository
public interface TaskRepository  extends JpaRepository<Taskentity,String>{
Optional<Taskentity> findByTaskId(String taskid);
void deleteByTaskId(String taskid);

}