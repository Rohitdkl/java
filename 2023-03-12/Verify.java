import java.util.Scanner;
public class Verify {
    public static void main (String [] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("AGE VERICATION");
        System.out.println("Enter Your Name");
        String name= sc.next();
        System.out.println("Enter Your Name");
        int age= sc.nextInt();
        if (age>18){
            System.out.println("You're Eligible For Votting!");

        }
        else{
            System.out.println("You're Not Eligible For Votting!");
        }
    }
}
