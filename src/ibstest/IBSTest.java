package ibstest;

import java.util.ArrayList;
import java.util.HashSet;

public class IBSTest {

    public static void main(String[] args) {
        Employee dev = new Developer(8, "Никитина Ольга");
        Employee intern = new Intern(8, "Филимонов Максим");
        Employee tl = new TeamLeader(10, "Дмитриева Людмила");
        
        HashSet<Employee> emp = new HashSet<>();
        emp.add(dev);
        emp.add(intern);
        emp.add(tl);
        
        for (Employee employee : emp) {
            System.out.println(employee.getFullName());
        }
        System.out.println(emp.size());
        
        ArrayList<Employee> people = new ArrayList<>();
        people.addAll(0, emp);
        
        System.out.println(people.size());
    }
    
}
