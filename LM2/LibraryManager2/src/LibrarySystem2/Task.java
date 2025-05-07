package LibrarySystem2;
import java.util.Date;

public class Task {
    String description;
    int priority;
    Date dueDate;
    String status;

    // Default constructor
    public Task() {
        this.description = "No description";
        this.priority = 0;
        this.dueDate = new Date();
        this.status = "Pending";
    }

    // Parameterized constructor
    public Task(String description, int priority, Date dueDate, String status) {
        this.description = description;
        this.priority = priority;
        this.dueDate = dueDate;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task [description=" + description + ", priority=" + priority + ", dueDate=" + dueDate + ", status=" + status + "]";
    }
}
