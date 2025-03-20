public class BackendDev extends Developer {
    public BackendDev(String name, int salary) {
        this.setName(name);
        if (salary < 0.0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        if (salary > 90000.0) {
            throw new IllegalArgumentException("Salary cannot be greater than 90000");
        }
        this.setSalary(salary);
    }

    public BackendDev(String name) {
        this.setName(name);
        this.setSalary(55000);
    }

    String[] databaseTech = {"Mango", "CloudAtlas", "Postgres", "MySQL", "Amazon", "DynamoDB"};

    @Override
    double returnSalary(int salary) {
        return super.returnSalary(60000);
    }

    public void showFrameworkSkills() {
        for (String databaseTech : databaseTech) {
            System.out.println(databaseTech);
        }
    }
}
