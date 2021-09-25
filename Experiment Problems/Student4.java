/*
java lab
Exp no 4:
Create a class 'Student' with three data members
which are name, age and address.
The constructor of the class assigns default values name as "unknown", age as
'0' and address as "not available".
It has two members with the same name 'setInfo'.
First method has two parameters for name and age and assigns the same
whereas the second method takes has three parameters
which are assigned to name, age and address
respectively.
Print the name, age and address of 10 students. Hint - Use array of objects.
 */

    import java.util.Scanner;
    class Student
    {
        String name;
        int age;
        String address;

        Student()
        {
            this.name="Unknown";
            this.age=0;
            this.address="Not available";
        }

        void setInfo(String name,int age)
        {
            this.name=name;
            this.age=age;
        }
        void setInfo(String name,int age,String address)
        {
            this.name=name;
            this.age=age;
            this.address=address;
        }
    }
    public class Student4
    {
        public static void main (String[] args)
        {
            int i;
            Student s1 = new Student();
            Scanner in = new Scanner(System.in);
            for(i=1;i<=10;i++)
            {
                System.out.println("Enter Name, age and Address of  student " +i+ " :");
                s1.name= in.next();
                s1.age=in.nextInt();
                s1.address= in.next();
                //s1.setInfo("");

                System.out.println("Name: " + s1.name + "\t\tAge: " + s1.age + "\t\tAddress:" + s1.address);
            }
        }
    }

