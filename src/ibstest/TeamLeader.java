package ibstest;

public class TeamLeader extends Employee implements Manager {
    private String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    public TeamLeader(int workingDay, String fullName) {
        super(workingDay, fullName);
    }

    @Override
    public void payroll() {
        System.out.println("150_000");
    }

    @Override
    public void working() {
        System.out.println("Подбор оптимальной архитектуры приложения");
    }

    @Override
    public void personnelManagement() {
        System.out.println("Утрення разадача заданий");
    }

    @Override
    public void selectionOfEmployees() {
        System.out.println("Отбор лучших кандидатов на вакансии в команду");
    }
}
