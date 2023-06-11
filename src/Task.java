import java.util.ArrayList; // class is a resizable array
import java.util.List;
import java.util.Scanner; //class is used to get user input, and it is found
public class Task{
    private String description;
    private boolean isComplete;

    public Task(String description){

        this.description = description;
        this.isComplete = false;
    }

    public String getDescription(){
        return description;
    }
    public boolean isComplete(){
        return  isComplete;
    }
    public void markComplete(){
        isComplete = true ;
    }
}
