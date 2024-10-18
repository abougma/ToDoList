package com.apprentissage.gestache.TaskRepository;

import com.apprentissage.gestache.TaskModel.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
