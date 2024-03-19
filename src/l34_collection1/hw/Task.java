package l34_collection1.hw;

import java.util.Objects;

public class Task {
    private static int counter = 0;
    private static final int ID_BASE = 892232;
    private final int id;
    private final String title;
    private TaskStatus status;

    public Task (String title) {
        this.title = title;
        this.id = ID_BASE + counter;
        this.status = TaskStatus.UNIT;
        Task.counter +=1;
    }

    public int getId() {
        return id;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public static void setCounter (int Counter) {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
