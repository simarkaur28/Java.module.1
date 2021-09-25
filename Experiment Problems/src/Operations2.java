/*Exp No 2
        Write a menu driven Java program which will read
        a number and should implement the following
        methods
        1. factorial()
        2. testArmstrong()
        3. testPalindrome()
        4. testPrime()
        5. fibonacciSeries()*/
import java.util.Scanner;

    class math{
        public int number;

        static int factorial(int number)
        {
            int i, fact = 1;
            for (i=1;i<=number;i++)
            {
                fact = fact * i;
            }
            return fact;
        }

        public void armstrong(int number)
        {
            int a, b, c, count = 0, sum =0;
            a = c = number;
            while(a>0)
            {
                a /= 10;
                count++;
            }
            while(number >0){
                b = number % 10;
                sum = (int) (sum+Math.pow(b, count));
                number /= 10;
            }
            if(sum==c)
                System.out.println("It is an Armstrong number");
            else
                System.out.println("It is NOT an Armstrong number");
        }

        public void palindrome(int number){
            int c, d, r=0;
            c = this.number;
            while(this.number >0){
                d = this.number % 10;
                r = r*10+d;
                this.number = this.number / 10;
            }
            if(c==r){
                System.out.println("It is a palindrome number");
            }
            else{
                System.out.println("It is not a palindrome number");
            }
        }

        public void prime(int number){
            int i,c=0;
            for(i=1;i<=number;i++)
            {
                if(number%i==0){
                    c++;
                }
            }
            if (c == 2)
                System.out.println("It is a prime number");

            else
                System.out.println("It is not a prime number.");

        }

        public void fibonacci(int number){
            int num1=0,num2=1,num3,i;
            System.out.print(num1+" "+num2);
            for(i=3;i<=number;++i)
            {
                num3=num1+num2;
                System.out.println(" "+num3);
                num1=num2;
                num2=num3;
            }
        }
    }

    class Operation2{
        public static void main(String[] args){
            boolean quit = false;
            Scanner in = new Scanner(System.in);
            //System.out.println("Enter a number");
            //int number = in.nextInt();
            math operation = new math();
            int f;
            int choice;
            //boolean quit = false;
            do{
                System.out.println("Math Operations to test:");
                System.out.println("1.Factorial \n2.Armstrong \n3.Palindrome \n4.Prime \n5.Fibonacci Series \n0.Exit.");
                System.out.println("Enter a choice= ");
                choice = in.nextInt();
                switch(choice){
                    case 1:
                        System.out.println("Enter a number:");
                        int number = in.nextInt();
                        f = operation.factorial(number); //f for factorial
                        System.out.println("Factorial of number ="+f);
                        break;
                    case 2:
                        System.out.println("Enter a number to check if it is an Armstrong number or not:");
                        int numb = in.nextInt();
                        operation.armstrong(numb);
                        break;
                    case 3:
                        System.out.println("Enter a number to check if it is a Palindrome number or not:");
                        int numbe = in.nextInt();
                        operation.palindrome(numbe);
                        break;
                    case 4:
                        System.out.println("Enter a number:");
                        int n = in.nextInt();
                        operation.prime(n);
                        break;
                    case 5:
                        System.out.println("Enter number of terms to be printed:");
                        number = in.nextInt();
                        operation.fibonacci(number);
                        break;
                    case 0:
                        quit = true;
                        break;
                    default:
                        System.out.println("Invalid Input. Try again!");
                }
            }
            while(!quit);
            System.out.println("Sayonara!");
        }
    }

