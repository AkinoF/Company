public class Company {
    /**
     * Название
     */
    public String name;
    /**
     * Количество сотрудников
     */
    public int persons;
    /**
     * Месячный фонд зарплаты
     */
    public int money;

    /**
     * Конструктор
     * @param name
     * @param persons
     * @param money
     */
    public Company(String name, int persons, int money) {
        this.name = name;
        this.persons = persons;
        this.money = money;
    }

    public void show() {
        System.out.println("В компании " + name + " трудятся " + persons + " сотрудников");
        System.out.println("Фонд зарплаты: " + money);
    }

    public int averageSalary() {
        return persons > 0 ? money / persons : 0;
    }
}