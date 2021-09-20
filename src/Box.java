//define a method

public class Subject {
    int Maths;
    int DBMS;
    int DSA;
    int PCOM;

 int Average(){
    return (PCOM + DSA + Maths + DBMS) / 4;
 }

 void setValues(int a, int b, int c, int d){ //pass arguments
     DBMS = a;
     DSA = b;
     Maths = c;
     PCOM = d;
     System.out.println("Values initialized");
 }
}