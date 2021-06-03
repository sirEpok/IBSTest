package homework2;

import ibstest.Developer;
import ibstest.Employee;
import ibstest.Intern;
import ibstest.TeamLeader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class HomeWork2 {
    public static void main(String[] args) {
        Employee employee = new Employee(8, "Дима Жижин") {
            private String project;
            
            public void setProject(String project) {
                this.project = project;
            }

            public String getProject(){
                return project;
            }
            
            public void payroll() {
                System.out.println("45000");
            }
            public void working() {
                System.out.println("Разработка простых методов");
            }
        };
        
        List<Employee> workWithStream = new ArrayList<>();
        workWithStream.add(new Developer(8, "Валя Вальчинский"));
        workWithStream.add(new Intern(8, "Игорь Красноперов"));
        workWithStream.add(new TeamLeader(10, "Влад Зайков"));
        workWithStream.add(new Developer(8, "Макис Бондарович"));
        workWithStream.add(new Intern(5, "Леонид Коваль"));
        workWithStream.add(new TeamLeader(9, "Елена Кучерова"));
        workWithStream.add(new Developer(8, "Наталья Перевозчикова"));
        workWithStream.add(new Intern(8, "Наталья Плясунова"));
        workWithStream.add(new TeamLeader(10, "Дарья Изотова"));
        
        List <Employee> newWorkWithStream;
        newWorkWithStream = workWithStream
                .stream()
                .filter(new Predicate<Employee>() {
                    @Override
                    public boolean test(Employee employee) {
                        return employee.getWorkingDay() > 8;
                    }
                })
                .collect(Collectors.toList());
        newWorkWithStream.forEach(System.out::println);
        
        List<String> names = workWithStream
                .stream()
                .map(Employee::getFullName)
                .collect(Collectors.toList());
        names.forEach(System.out::println);
    }
}
