import java.util.*;

class Programm {
    public static void main(String[] args) {
        // создание объекта и вызов конструктора
        Company factory = new Company("Премьер", 100, 1000000);
        factory.show();
        System.out.println("Средняя зарплата: " + factory.averageSalary());
        System.out.println("Отчисления: " + factory.negative(13, 4));
        System.out.println("Средняя зарплата?");
        Scanner in = new Scanner(System.in);
        int average = in.nextInt();
        System.out.println("Количество сотрудников: " + factory.maxPersons(average));
        in.close();
    }


}