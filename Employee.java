public class Employee {
    private int id;
    private String name;
    private int floor;
    private double salary;

    public Employee(int id, String name, int floor, double salary) {
        this.id = id;
        this.name = name;
        this.floor = floor;
        this.salary = salary;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "" +
                ", name='" + name + '\'' +
                ", floor=" + floor +
                "";
    }
}
