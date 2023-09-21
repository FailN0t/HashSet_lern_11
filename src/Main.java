import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> todoList = new HashSet<>();
        todoList.add("Купить молоко");
        todoList.add("Купить лошадь");//возврвщает булево значение
        todoList.add("Покормить кота");

        boolean horseAgain = todoList.add("Купить лошадь");
        System.out.println(horseAgain);
        todoList.add("Покормить кота");

        todoList.remove("Купить лошадь");

        for (String item : todoList) {
            System.out.println(item);
        }

        System.out.println(todoList.contains("sdfsadfa"));//есть ли такой объект
        System.out.println(todoList.isEmpty());
        System.out.println(horseAgain);
        System.out.println(todoList.size());

//        todoList.clear();
//        for (String iter : todoList) {
//            System.out.println(iter);
//        }
    }
}
