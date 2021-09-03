import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        String task;
        ArrayList<String> toDoList = new ArrayList<>();

        while (true) {
            System.out.println("Выберите действие: \n 1. Добавить задачу \n 2. Вывести список задач \n 3. Удалить задачу \n 0. Выход");
            Scanner scanner = new Scanner(System.in);
            task = scanner.nextLine();
            if (task.equals("end")) {
                System.out.println("Программа завершена");
                break;
            }
            int task1 = Integer.parseInt(task);
            if (task1 == 1) {
                System.out.println("Введите задачу для планирования");
                task = scanner.nextLine();
                toDoList.add(task);
            } else if (task1 == 2) {
                System.out.println("Выводим весь список:");
                for (String element : toDoList) {
                    System.out.println(element);
                }
            } else if (task1 == 3) {
                System.out.println("Впишите название задачи,которую хотите удалить");
                task = scanner.nextLine();
                toDoList.remove(task);
            } else if (task1 == 0) {
                System.out.println("Программа завершена");
                break;
            }
        }
    }
}