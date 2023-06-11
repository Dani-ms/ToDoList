import java.util.ArrayList;
import java.util.List;


public class ToDoList{
    private List<Task> tasks;
    public ToDoList(){
        tasks = new ArrayList<>();
    }
    public void addTask(Task task){
        tasks.add(task);
        System.out.println("Task added successfully!");
    }
    public void markTaskComplete(int taskIndex){
        if(taskIndex >= 0 && taskIndex < tasks.size()){
            Task task = tasks.get(taskIndex);
            task.markComplete();
            System.out.println("Task marked as complete!");
        }else{
            System.out.println("Invalid task index!");
        }
    }
    public void viewTasks(){
        if(tasks.isEmpty()){
            System.out.println("No task found!");
        }else{
            System.out.println("Task:");
            for(int i = 0; i < tasks.size(); i++){
                Task task = tasks.get(i);
                System.out.printf(
                        "%d. %s [%s]\n",
                        i + 1,
                        task.getDescription(),
                        task.isComplete() ? "Complete" : "Incomplete"
                );
            }
        }
    }

    public void removeCompletedTasks(){
        tasks.removeIf(Task::isComplete);
        System.out.println("Completed tasks removed");
    }
}

