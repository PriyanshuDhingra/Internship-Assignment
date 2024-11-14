import java.util.Date;

public class Employee {
    private String id;
    private String name;
    private int age;
    private Date dateOfJoining;

    public Employee(String id, String name, int age, Date dateOfJoining) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dateOfJoining = dateOfJoining;
    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    @Override
    public String toString() {
        return "Employee{id='" + id + "', name='" + name + "', age=" + age + ", dateOfJoining=" + dateOfJoining + '}';
    }
}

public class Main {
    public static void main(String[] args) {
        MyList<Employee> employeeList = new MyList<>();
        employeeList.add(new Employee("E001", "Alice", 30, new Date()));
        employeeList.add(new Employee("E002", "Bob", 28, new Date()));

        System.out.println("Employee at index 0: " + employeeList.get(0));
        employeeList.deleteByIndex(1);
        System.out.println("Size after deletion: " + employeeList.size());
    }
}

