package com.todolist.todolist.service;

import com.todolist.todolist.entity.Task;
import com.todolist.todolist.repository.TaskRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    public final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository){

        this.taskRepository = taskRepository;
    }

    // GET
    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    // GET
    public Optional<Task> getTaskById(Long id){
        return taskRepository.findById(id);
    }

    // POST
    public Task createTask(Task task){
        return taskRepository.save(task);
    }

    // DELETE
    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }

    // GET
    public List<Task> getCompletedTasks(boolean completed){
        return taskRepository.findByCompleted(completed);
    }


}
