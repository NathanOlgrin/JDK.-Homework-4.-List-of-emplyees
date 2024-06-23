import java.util.ArrayList;

public class ListOfEmployees {
    ArrayList<Employee> employees = new ArrayList<>();

    public void add(Employee employee){
        employees.add(employee);
    }

    public ArrayList<Employee> findForWorkExpirence(int workExpirence){
        ArrayList<Employee> employeesWithExpirence = new ArrayList<>();
        for (Employee employee: employees) {
            if(employee.getWorkExpirence()==workExpirence){
                employeesWithExpirence.add(employee);
            }
        }
        if(!employeesWithExpirence.isEmpty()){
            return employeesWithExpirence;
        }
        else {
            return null;
        }
    }

    public ArrayList<String> getEmployeesPhoneNumber(String name){
        ArrayList<String> employeesPhoneNumber = new ArrayList<>();
        for (Employee employee: employees) {
            if(employee.getName().equals(name)){
                employeesPhoneNumber.add(employee.getPhoneNumber());
            }
        }
        if(!employeesPhoneNumber.isEmpty()){
            return employeesPhoneNumber;
        }
        else {
            return null;
        }
    }

    public Employee getEmployeeForTabelNumber(int tabelNumber){
        for (Employee employee: employees) {
            if(employee.getTabelNumber()==tabelNumber){
                return employee;
            }
        }
        return null;
    }
}
