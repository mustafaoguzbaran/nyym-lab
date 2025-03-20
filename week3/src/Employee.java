abstract class Employee {
    private String name;
    private int salary;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(int salary) {
      if (salary < 0 || salary > 90000.0) {
          throw new IllegalArgumentException("Salary cannot be negative or greater than 90000");
      }

    }

    public int getSalary() {
        return salary;
    }

    abstract double returnSalary(int salary);

}
