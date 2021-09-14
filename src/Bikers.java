/* Five Bikers Compete in a race such that they drive at
a constant speed which may or may not be the same as
the other. To qualify the race, the speed of a racer must
be more than the average speed of all 5 racers.
Write a Java program to take as input the speed of each racer
and print back the speed of qualifying racers
*/
public class Bikers
{
    public static void main(String[] args)
    {
        float b1 = 20,b2=30,b3=40,b4=50,b5=60, avg;
        avg =(b1+b2+3+b4+b5)/5;
        System.out.println("Average = " +avg);
        if(b1>avg)
            System.out.println("b1 is qualified");
        if(b2>avg)
            System.out.println("b2 is qualified");
        if(b3>avg)
            System.out.println("b3 is qualified");
        if(b4>avg)
            System.out.println("b4 is qualified");
        if(b5>avg)
            System.out.println("b5 is qualified");
        if(b1< avg && b2<avg && b3<avg&& b4<avg&& b5<avg)    //aisa koi condition tabhi hi hoga jab b1=b2=b3=b4=b5 speed
            System.out.println("no one qualifies");
    }
}
