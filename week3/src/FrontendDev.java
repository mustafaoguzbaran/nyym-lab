import java.util.ArrayList;

public class FrontendDev extends Developer {

    public FrontendDev(String name, int salary) {
        this.setName(name);
        this.setSalary(salary);
    }

    public FrontendDev(String name) {
        this.setName(name);
        this.setSalary(60000);
    }

   String[] framework = {"React", "NextJS", "Nuxt", "VueJS"};

    @Override
    double returnSalary(int salary) {
        return super.returnSalary(55000);
    }

    public void showFrameworkSkills() {
        for(String framework : framework) {
            System.out.println(framework);
        }
    }
}
