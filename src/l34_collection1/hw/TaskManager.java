package l34_collection1.hw;

import cons.cons_08.task_01.Test;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String title) {
        Task task = new Task(title);
        this.tasks.add(task);
    }

    public Task remove (int id) {
        for (Task task: tasks) {
            if (task.getId() != 10)
                continue;;
            tasks.remove(task);
            return task;
        }
        return null;
    }

    public void printTasks() {
        for (Task task : this.tasks) {
            System.out.println();
        }
    }
}
