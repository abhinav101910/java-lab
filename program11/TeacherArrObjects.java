import java.util.Scanner;

class Person {
    String name;
    String gender;
    String address;
    int age;

    Person() {}

    Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

class Employee extends Person {
    int empid;
    String company_name, qualification;
    float salary;

    Employee() {}

    Employee(String name, String gender, String address, int age, int empid, String company_name, String qualification, float salary) {
        super(name, gender, address, age);
        this.empid = empid;
        this.company_name = company_name;
        this.qualification = qualification;
        this.salary = salary;
    }
}

class Teacher extends Employee {
    String subject, department;
    int teacherid;

    Teacher(String name, String gender, String address, int age, int empid, String company_name, String qualification, float salary, String subject, String department, int teacherid) {
        super(name, gender, address, age, empid, company_name, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherid = teacherid;
    }

    void display() {
        System.out.println("---------------------------");
        System.out.println("Teacher ID: " + teacherid);
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Company Name: " + company_name);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
    }
}

public class TeacherArrObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Teachers: ");
        int n = sc.nextInt();
        sc.nextLine();

        Teacher[] teacher = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Teacher " + (i + 1));

            System.out.print("Enter Teacher ID (integer): ");
            int tid = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee ID (integer): ");
            int empid = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Teacher Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Teacher Gender: ");
            String gender = sc.nextLine();

            System.out.print("Enter Teacher Address: ");
            String address = sc.nextLine();

            System.out.print("Enter Teacher Age (integer): ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Company Name: ");
            String company_name = sc.nextLine();

            System.out.print("Enter Qualification: ");
            String qualification = sc.nextLine();

            System.out.print("Enter Department: ");
            String department = sc.nextLine();

            System.out.print("Enter Subject: ");
            String subject = sc.nextLine();

            System.out.print("Enter Salary (float): ");
            float salary = sc.nextFloat();
            sc.nextLine();

            teacher[i] = new Teacher(name, gender, address, age, empid, company_name, qualification, salary, subject, department, tid);
        }

        System.out.println("\nAll Teachers Details:");
        for (Teacher t : teacher) {
            t.display();
        }

        sc.close();
    }
}
