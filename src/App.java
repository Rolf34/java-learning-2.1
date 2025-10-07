public class App {
    public static void main(String[] args) {
        Department dep = new Department("D001", "IT", "Інформаційні технології", null, null, null, 0);
        Position pos = new Position("P001", "Програміст", "Розробка систем", dep, null, null, 1);
        WorkSchedule schedule = new WorkSchedule("WS001", "Стандартний", 5, 8, "09:00", "17:00", "01:00", false);

        Employee emp = new Employee("E001", "Дмитро", "Швайка", "+380",
                dep, pos, "2023-09-01", 25000.0, schedule, true);

        System.out.println(emp.toString());
    }
}
