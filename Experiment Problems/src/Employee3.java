/*
Exp no.3
Write a program that would print the information
(name, year of joining, salary, address) of three
employees by creating a class named 'Employee'.

The output should be as follows

Name    Year of Joining  Address
---------------------------------
Robert  2001 			 Kurla
Mahesh  2002			 Bandra */

    class Employee {
        String name;
        int year;
        String address;
        int salary;

    }
    public class Employee3 {
        public static void main (String[] args)
        {
            Employee e1 = new Employee();
            Employee e2 = new Employee();
            Employee e3 = new Employee();

            e1.name = "Robert";
            e1.year= 2001;
            e1.address= "Kurla";
            e1.salary=50000;
            e2.name = "Mahesh" ;
            e2.year= 2002;
            e2.address= "Bandra";
            e2.salary=45000;
            e3.name = "Amrit";
            e3.year= 2005;
            e3.address= "Kharghar";
            e3.salary=40000;
            System.out.println("    Name    Year of Joining    Address     Salary(Rs) ");
            System.out.println("-------------------------------------------------------");
            System.out.println("   "+e1.name+"\t\t"+e1.year+"\t\t  "+e1.address+"\t\t     "+e1.salary);
            System.out.println("   "+e2.name+"\t\t"+e2.year+"\t\t  "+e2.address+"\t\t "+e2.salary);
            System.out.println("   "+e3.name+"\t\t"+e3.year+"\t\t  "+e3.address+"\t\t "+e3.salary);

        }
    }

