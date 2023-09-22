import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Task> taskTreeSet = new TreeSet<>(new TaskComparator());

        taskTreeSet.add(new Task("Покормить лошадь"));

        taskTreeSet.add(new Task("Антону напомнить об отчете"));

        taskTreeSet.add(new Task("Купить молоко"));

        taskTreeSet.add(new Task("Выбросить мусор"));

        System.out.println(taskTreeSet.ceiling(new Task("Покормить лоша")));
        System.out.println(taskTreeSet.floor(new Task("Купить мол")));
        System.out.println(taskTreeSet.contains(new Task("Купить молоко")));
        System.out.println(taskTreeSet.first());
        System.out.println(taskTreeSet.last());
        System.out.println(taskTreeSet.pollLast());
        for(Task task: taskTreeSet){
            System.out.println(task);
        }
        System.out.println();

        System.out.println();
    }
}
