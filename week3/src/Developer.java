public class Developer extends Employee {
    @Override
    double returnSalary(int salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }

        if (salary > 90000) {
            throw new IllegalArgumentException("Salary cannot be greater than 90000");
        }
        return salary;
    }

}
