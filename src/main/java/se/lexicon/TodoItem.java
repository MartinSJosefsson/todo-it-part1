package se.lexicon;

import java.time.LocalDate;

public class TodoItem {
    private int id;
    private String title;
    private String description;
    private LocalDate deadline;
    private boolean done;
    private Person creator;


    public TodoItem(int id, String title, String description, LocalDate deadline, Person creator) {
        if (title == null || title.isEmpty() || deadline == null) {
            throw new IllegalArgumentException("Title and deadline cannot be null or empty");
        }
        this.id = id;
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.done = false;
        this.creator = creator;
    }


    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public LocalDate getDeadline() { return deadline; }
    public void setDeadline(LocalDate deadline) { this.deadline = deadline; }

    public boolean isDone() { return done; }
    public void setDone(boolean done) { this.done = done; }

    public Person getCreator() { return creator; }
    public void setCreator(Person creator) { this.creator = creator; }


    public String getSummary() {
        return "{" + "id: " + id + ", title: " + title + ", deadline: " + deadline + ", done: " + done + "}";
    }


    public boolean isOverdue() {
        return LocalDate.now().isAfter(deadline);
    }
}
