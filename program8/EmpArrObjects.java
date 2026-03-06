import java.util.Scanner;

class Employee {
    int eno;
    String ename;
    double esal;

    public Employee() {}

    Employee(int eno, String ename, double esal) {
        this.eno = eno;
        this.ename = ename;
        this.esal = esal;
    }

    public void showdata() {
        System.out.println("EmpID: " + eno + " Name: " + ename + " Salary: " + esal);
    }
}

public class EmpArrObjects {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Employee[] emp = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter employee details....");

            System.out.print("Enter Employee ID: ");
            int eid = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter Name: ");
            String ename = sc.nextLine();

            System.out.print("Enter Salary: ");
            double esal = sc.nextDouble();

            emp[i] = new Employee(eid, ename, esal);
        }

        System.out.println("\nEmployee Details:");
        for (Employee y : emp) {
            y.showdata();
        }

        sc.close();
    }
}
