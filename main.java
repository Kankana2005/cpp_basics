import java.util.Scanner;
public class main{


    // 1.function to print
    // public static void name(String n){
    //     System.out.println("hello worlds");
    //     return;
    // }

    //2.function to add
    // public static int add(int a, int b ){
    //     return a+b;
    // }

    //3.function to multiply two numbers
    // public static int mul(int a,int b){
    // return a*b;
    // }

    //4.factorial of a number
    // public static int multi(int n){
    //     int fact=1;
    //     for(int i=1;i<=n;i++){
    //         fact = fact*i;

    //     }
    //     return fact;
    // }

    //5.to check the number is prime or not
    // public static void isprime(int n){
    //     if(n<=1){
    //         System.out.println("prime");
    //         return;
    //     }
    //     for(int i=2;i<n;i++){
    //         if(n%i==0){
    //             System.out.println("itsnot prime");
    //             return;
    //         }
    //     }
        
    //         System.out.println("its prime");
        
    // }

    // //6.to check if the num is even or not
    // public static void iseven(int n){
    //     if(n%2==0){
    //         System.out.println("its even");

    //     }
    //     else{
    //         System.out.println("its not even");
    //     }
    //     return;

    // }

    //7. table of a given number 
    // public static void table(int n){
    //     int mul=1;
    //     for(int i=1;i<=10;i++){
    //         mul = i*n;
    //         System.out.println(n+"*"+i+"="+mul);


    //     }
    //     return;
    // }

    //8.print avearage
    // public static void average(int a,int b,int c){
    //     int avg;
    //     avg=(a+b+c)/3;
    //     System.out.println(avg);
    //     return;
    // }

    //9.print sum of all odd numbers from 1 to n 
    // public static void sum(int n) {
    //     int sum = 0;
    //     for(int i = 1; i<=n;i++){
    //         if(i%2==1){
    //             sum=sum+i;
    //         }
            
    //     }
    //     System.out.println(sum);
    //    return; 
    // }

    //10. function that returns circumference of a circle
    // public static void circumference(int r){
    //     double c=2*3.14*r;
    //     System.out.println(c);
    // }

    //11.eligible to vote
    // public static void vote(int age){
    //     if (age>=18){
    //         System.out.println("eligible to vote");
    //     }
    //     else{
    //         System.out.println("not eligible to vote");
    //     }
    // } 

    //12.fond x to the power of n
    // public static int power(int x , int n){
    //     int pow=(int)Math.pow(x,n);
    //     System.out.println(pow);
    //     return pow;
    // }

    // //13.to ginf gcd of a number
    // public static void gcd(int a,int b){
    //     while(a!=b){
    //         if(a>b){
    //             a=a-b;
    //         }
    //         else{
    //             b=b-a;
    //         }
    //     }
    //     System.out.println(a);
        
    // }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    //11.eligible to vote
    


        // 1.name("hello world");

        // 2,3 int a =sc.nextInt();
        // int b=sc.nextInt();
        // System.out.println(mul(a,b));

        // 4.System.out.println("enter a number:");
        // int n = sc.nextInt();
        // int fact=multi(n);
        // System.out.println(fact);

        //5. int n=sc.nextInt();
        // isprime(n);

        // 6. int n=sc.nextInt();
        // iseven(n);

        // 7.int n=sc.nextInt();
        // table(n);

        // 8.System.out.println("enter the first number: ");
        // int a = sc.nextInt();
        // System.out.println("enter the second number: ");
        // int b = sc.nextInt();
        // System.out.println("enter the third number: ");
        // int c = sc.nextInt();
        // average(a,b,c);

        // 9. System.out.println("enter the number: ");
        // int n = sc.nextInt();
        // sum(n);

        //10.  System.out.println("enter the radius: ");
        // int r = sc.nextInt();
        // circumference(r);

        // 11. System.out.println("enter the age: ");
        // int age = sc.nextInt();
        // vote(age);

        //  12.System.out.println("enter the number: ");
        // int x = sc.nextInt();
        // System.out.println("enter the power: ");
        // int n = sc.nextInt();
        // power(x,n);

        // 13.gcd(3,4);



        
        //1.print
        // System.out.println("hello world");

        //input,output,variables,datatypes
        // System.out.println("*");
        //  System.out.println("**");
        //   System.out.println("***");
        //    System.out.println("****");
        //     System.out.println("*****");

        // sum of two variables
        // System.out.print("Enter the first number : ");
        // int a = sc.nextInt();
        // System.out.println("enter the secount number : ");
        // int b = sc.nextInt();
        // int Sum= a+b;
        // System.out.println("Sum is : "+Sum);

        //Condional Statements
        //1,eligible to vote or not
        // System.out.println("Enter Your age: ");
        // int age = sc.nextInt();
        // if(age>=18){
        //     System.out.println("Your eligible to vote");
        // }
        // else{
        //     System.out.println("Your not eleigible to vote,come after "+(18-age)+" years");

        // Swith statement 
        // simple calculator 
        // System.out.println("Enter the operation you need to perform");
        // System.out.println("1.Add,2.Sub,3.Mul,4.Div");
        // int choice = sc.nextInt();
        // System.out.println("Enter the first number : ");
        //   int a = sc.nextInt();
        // System.out.println("Enter the second number : ");
       
        // int b = sc.nextInt();
        // switch(choice){
        //     case 1:
        //     System.out.println(a+b);
        //     break;
        //     case 2:
        //     System.out.println(a-b);
        //     break;
        //     case 3:
        //     System.out.println(a*b);
        //     break;
        //     case 4:
        //     System.out.println(a/b);
        //     if(b==0){
        //         System.out.println("Cannot divide by zero");
        //     }
        //     else{
        //         System.out.println(a/b);
        //     }
        //     default:
        //     System.out.println("Invalid choice" );
        // }


        // loops
        // for(int i=0;i<=5;i++){
        //     System.out.println("hello");

        // }

        //sum of first n natural numbers
        // int n = sc.nextInt();
        // int sum =0;
        // for(int i=1;i<=n;i++){
        //     sum=sum+i;  
        // }
        // System.out.println(sum);

        //print table os the number 
        // System.out.println("enter the numeber: ");
        // int n = sc.nextInt();
        // int mul = 1;
        // for(int i =1;i<=10;i++){
        //     mul=n*i;
        //     System.out.println(n+"*"+i+"="+mul);

        // }

        //Functions and methods
        //print a given number in a function

        //infinite loop using do while 
        // do{
        //     System.out.println("hello");
        // }while(true);

        //

        //pgm to enetr the nos till user want and count the number of pos ,neg and 0
    //   public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

        // Program to count positive, negative, and zero numbers until "exit" is typed
        // int pos = 0, neg = 0, zero = 0;
        // System.out.println("Enter numbers one by one, type 'exit' to stop:");

        // while (true) {
        //     String s = sc.next();

        //     if (s.equalsIgnoreCase("exit")) {
        //         break;
        //     }

        //     try {
        //         int num = Integer.parseInt(s);

        //         if (num > 0) {
        //             pos++;
        //         } else if (num < 0) {
        //             neg++;
        //         } else {
        //             zero++;
        //         }

        //     } catch (NumberFormatException e) {
        //         System.out.println("Invalid input. Please enter a valid number or type 'exit' to stop.");
        //     }
        // }

        // System.out.println("Positive numbers: " + pos);
        // System.out.println("Negative numbers: " + neg);
        // System.out.println("Zeros: " + zero);

        // write nos entered by the users x and n , write function to find x to the power n
        //14.to ginf fibbo of a number
        // int n = sc.nextInt();
        // int a=0,b=1;
        // System.out.println(a);
        // System.out.println(b);
        // for(int i=2;i<=n;i++){
        //     int c=a+b;
        //     System.out.println(c);
        //     a=b;
        //     b=c;
        // }


    }
}

      

        



        
        


    

    






    

    

