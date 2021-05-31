package ibstest;

public class Developer extends Employee {

    private String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    public Developer(int workingDay, String fullName) {
        super(workingDay, fullName);
    }

    @Override
    public void payroll() {
        System.out.println("80_000");
    }

    @Override
    public void working() {
        System.out.println("Разработка функционала приложения");
    }
}
