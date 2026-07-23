package com.raj.inmemorytaskmanagerbackend.service;

import com.raj.inmemorytaskmanagerbackend.model.Task;

import java.util.List;

public interface TaskService {

    String createTask(Task task);

    List<Task> getAllTasks();

    Task getTask(Integer id);

    String deleteTask(Integer id);

    String updateTask(Integer id);
}
