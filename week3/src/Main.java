//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BackendDev backendDev = new BackendDev("Mustafa Oğuz", 70000);
        FrontendDev frontendDev = new FrontendDev("Furkan");

        double backendSalary = backendDev.getSalary();
        String backendName = backendDev.getName();
        System.out.println("Backend Developer " + backendName + "'un " + "maaşı: " + backendSalary);
        backendDev.showFrameworkSkills();

        System.out.println("--------------------------------------------------------------------------------");
        double frontendSalary = frontendDev.getSalary();
        String frontendName = frontendDev.getName();
        System.out.println("Frontend Developer " + frontendName + "'ın " + "maaşı: " + frontendSalary);
        frontendDev.showFrameworkSkills();

    }
}