//find average of students marks using classes

class Subject{
    int Maths;
    int DBMS;
    int DSA;
    int PCOM;
}

public class Student {
    public static void main(String args[]) {
        Subject a = new Subject(); //or new subject(a.60,b.70,c.80,d.70)
        int Average;

        a.setValues(a:60, b:70, c:80, d:70);
     /*   a.DBMS = 60;
        a.DSA = 70;
        a.Maths = 80;
        a.PCOM = 70; */

        Average = (a.PCOM + a.DSA + a.Maths + a.DBMS) / 4;
        System.out.println("Average marks of 4 subjects is:" + Average);
    }
}
