class Employee {
    int empId;
    String name;

    Employee(int eid, String n) {
        empId = eid;
        name = n;
    }

    public void showData() {
        System.out.println("EmpId = " + empId);
        System.out.print("Employee Name = " + name);
        System.out.println();
    }
}

class Main {
    public static void main(String args[]) {

        Employee[] obj = new Employee[2];

        obj[0] = new Employee(100, "ABC");
        obj[1] = new Employee(200, "PQR");

        // display the employee object data
        System.out.println("Employee Object 1:");
        obj[0].showData();
        System.out.println();
        System.out.println("Employee Object 2:");
        obj[1].showData();
    }
}
