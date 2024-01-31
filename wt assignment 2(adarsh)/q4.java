import java.io.*;

class Employee implements Serializable {
    private String name;
    private int emp_id;
    private double salary;

    public Employee(String n, int id, double sal) {
        name = n;
        emp_id = id;
        salary = sal;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return emp_id;
    }

    public double getSalary() {
        return salary;
    }
}

public class q4 {
    public static void main(String[] args) throws IOException{
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Adarsh Mishra", 1, 50000.0);
        employees[1] = new Employee("Chetan", 2, 60000.0);
        employees[2] = new Employee("Pavan", 3, 70000.0);
        employees[3] = new Employee(" Abhijeet sir", 4, 80000.0);
        employees[4] = new Employee("Ritav", 5, 90000.0);
        employees[5] = new Employee("Rahul", 6, 100000.0);
        employees[6] = new Employee("tahseen", 7, 110000.0);
        employees[7] = new Employee("Garima", 8, 120000.0);
        employees[8] = new Employee("Ankit Sir", 9, 130000.0);
        employees[9] = new Employee("Mc Donadls", 0, 140000.0);

        try {
            FileOutputStream fos = new FileOutputStream("employees.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (int i = 0; i < employees.length; i++) {
                oos.writeObject(employees[i]);
            }

            oos.close();
            fos.close();
            System.out.println("Employees data saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("employees.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            double minSalary = 80000.0;
            double maxSalary = 130000.0;

            System.out.println("Employees with salary between " + minSalary + " and " + maxSalary + ":");

            while (true) {
                Employee e = (Employee) ois.readObject();
                if (e.getSalary() >= minSalary && e.getSalary() <= maxSalary) {
                    System.out.println("Name: " + e.getName() + ", ID: " + e.getId() + ", Salary: " + e.getSalary());
                }
            }

        } catch (EOFException e) {
            System.out.println("End of file reached.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}