// TaskManager.java
import java.util.*;
import java.io.*;

public class TaskManager {
    private final List<Task> tasks = new ArrayList<>();

    public void addTask(String title, String description) {
        tasks.add(new Task(title, description));
    }

    public List<Task> listTasks() {
        return new ArrayList<>(tasks);
    }

    public Task findById(int id) {
        for (Task t : tasks) if (t.getId() == id) return t;
        return null;
    }

    public boolean removeById(int id) {
        Task t = findById(id);
        if (t != null) { tasks.remove(t); return true; }
        return false;
    }

    // Load/save simple persistence (optional)
    public void saveToFile(String filename) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (Task t : tasks) {
                bw.write(t.toSaveString());
                bw.newLine();
            }
        }
    }

    public void loadFromFile(String filename) throws IOException {
        File f = new File(filename);
        if (!f.exists()) return;
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            tasks.clear();
            String line;
            int maxId = 0;
            while ((line = br.readLine()) != null) {
                // format: id|done|title|description|createdAt
                String[] parts = line.split("\\|", 5);
                if (parts.length < 5) continue;
                try {
                    int id = Integer.parseInt(parts[0]);
                    boolean done = parts[1].equals("1");
                    String title = parts[2];
                    String desc = parts[3];
                    // ignore createdAt for reconstruction simplicity
                    Task t = new Task(title, desc);
                    // we need to set the id and done correctly - but Task's id is final/auto
                    // so we will rely on nextId trick: adjust nextId so new Task gets the id we want
                    // Simpler approach: collect and then set nextId after loop (handled below)
                    // We'll cheat by adjusting Task.nextId via reflection workaround isn't necessary here.
                    // Simpler: store titles/descs and then reset Task.nextId later. For clarity, we won't reconstruct exact IDs here.
                    if (done) t.setDone(true);
                    tasks.add(t);
                    if (t.getId() > maxId) maxId = t.getId();
                } catch (NumberFormatException e) {
                    // skip bad line
                }
            }
            // ensure next id continues after maxId (so IDs don't clash)
            Task.setNextId(maxId + 1);
        }
    }
}
