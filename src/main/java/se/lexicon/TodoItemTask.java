package se.lexicon;

public class TodoItemTask {
    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;


    public TodoItemTask(int id, TodoItem todoItem, Person assignee) {
        if (todoItem == null || assignee == null) {
            throw new IllegalArgumentException("TodoItem and Assignee cannot be null");
        }
        this.id = id;
        this.todoItem = todoItem;
        this.assignee = assignee;
        this.assigned = true;
    }


    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public boolean isAssigned() { return assigned; }
    public void setAssigned(boolean assigned) { this.assigned = assigned; }

    public TodoItem getTodoItem() { return todoItem; }
    public void setTodoItem(TodoItem todoItem) { this.todoItem = todoItem; }

    public Person getAssignee() { return assignee; }
    public void setAssignee(Person assignee) { this.assignee = assignee; }


    public String getSummary() {
        return "{" + "id: " + id + ", task: " + todoItem.getTitle() + ", assigned: " + assigned + "}";
    }
}