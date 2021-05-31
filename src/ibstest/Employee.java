package ibstest;

abstract class Employee {
    private int workingDay;
    private String fullName;
    
    public abstract void payroll();
    public abstract void working();

    public int getWorkingDay() {
        return workingDay;
    }

    public void setWorkingDay(int workingDay) {
        this.workingDay = workingDay;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Employee(int workingDay, String fullName) {
        this.workingDay = workingDay;
        this.fullName = fullName;
    }
}
