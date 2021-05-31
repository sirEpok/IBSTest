package ibstest;

public class Intern extends Employee {
    private String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    public Intern(int workingDay, String fullName) {
        super(workingDay, fullName);
    }

    @Override
    public void payroll() {
        System.out.println("20_000");
    }

    @Override
    public void working() {
        System.out.println("Чтение документации");
    }
}
