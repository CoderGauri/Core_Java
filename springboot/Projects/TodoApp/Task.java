// Task.java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task {
    private static int nextId = 1;
    private final int id;
    private String title;
    private String description;
    private boolean done;
    private final LocalDateTime createdAt;

    public Task(String title, String description) {
        this.id = nextId++;
        this.title = title;
        this.description = description == null ? "" : description;
        this.done = false;
        this.createdAt = LocalDateTime.now();
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public boolean isDone() { return done; }
    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
    public void setDone(boolean done) { this.done = done; }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return String.format("[%d] %s %s\n    %s (created: %s)",
                id,
                (done ? "✓" : " "),
                title,
                description.isEmpty() ? "(no description)" : description,
                createdAt.format(fmt));
    }

    // For saving/loading simple persistence we can write a CSV-like line
    public String toSaveString() {
        // Escape '|' from user input simply by replacing it (basic)
        String safeTitle = title.replace("|", " ");
        String safeDesc = description.replace("|", " ");
        return id + "|" + (done ? "1" : "0") + "|" + safeTitle + "|" + safeDesc + "|" + createdAt.toString();
    }

    public static void setNextId(int next) {
        nextId = next;
    }
}
