package com.raj.inmemorytaskmanagerbackend.controller;

import com.raj.inmemorytaskmanagerbackend.Tasks;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

import static com.raj.inmemorytaskmanagerbackend.InmemorytaskmanagerbackendApplication.tasks;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin(origins = "http://localhost:5173/")
public class TaskController {

    @GetMapping("/get")
    public Map<Integer, Tasks> getTasks() {
        return tasks;
    }

    @PostMapping("/create")
    public String createTasks(@RequestBody Tasks task) {
        tasks.put(task.getId(), new Tasks(task.getId(), task.getTitle(), task.getDescription()));

        return "Task is created";
    }

    @PutMapping("/update")
    public String updateTasks(@RequestBody Tasks task) {

        if(tasks.isEmpty()) return "Hashmap is Empty... Insert some data first";
        tasks.put(task.getId(), new Tasks(task.getId(), task.getTitle(), task.getDescription()));

        return "Task is updated";
    }

    @DeleteMapping("/delete")
    public String deleteTasks(@RequestBody Tasks task) {

        if(tasks.isEmpty()) return "Hashmap is Empty... Insert some data first";
        tasks.remove(task.getId());

        return "Task is deleted";
    }
}