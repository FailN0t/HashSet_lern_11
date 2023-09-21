import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Task> taskHashSet = new HashSet<>();
        taskHashSet.add(new Task("покормить лошадь"));
        System.out.println(taskHashSet.contains(new Task("Покормить лошадь")));
    }
}
