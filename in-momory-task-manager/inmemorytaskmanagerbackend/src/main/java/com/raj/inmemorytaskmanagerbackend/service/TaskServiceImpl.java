package com.raj.inmemorytaskmanagerbackend.service;

import com.raj.inmemorytaskmanagerbackend.model.Task;
import com.raj.inmemorytaskmanagerbackend.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    TaskRepository taskRepository;

    @Override
    public String createTask(Task task) {
        taskRepository.save(task);
        return "Task is created";
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task getTask(Integer id) {
        return taskRepository.findById(id).orElse(null);
    }

    @Override
    public String deleteTask(Integer id) {
        taskRepository.deleteById(id);
        return "Task is deleted";
    }

    @Override
    public String updateTask(Integer id) {
        Task task = taskRepository.findById(id).orElse(null);
        taskRepository.save(task);
        return "Task is updated";
    }
}
