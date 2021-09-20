class Subject{
    int Maths;
    int DBMS;
    int DSA;
    int PCOM;
}

public class Student {
    public static void main(String args[]) {
        Subject a = new Subject();
        double Average;
        a.DBMS = 60;
        a.DSA = 70;
        a.Maths = 80;
        a.PCOM = 70;

        Average = (a.PCOM + a.DSA + a.Maths + a.DBMS) / 4;
        System.out.println("Average marks of 4 subjects is:" + Average);
    }
}
