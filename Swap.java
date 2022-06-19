//WAP to swap a two values without taking a third no
import java.util.*;
class Swap
{
    // accept method accepting two no from user
    public static void accept()
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the two no : ");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Old value of a : "+a);
        System.out.println("Old value of b : "+b);

        // logical of swaping value
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("New value of a : "+a);
        System.out.println("New value of b : "+b);
    }
    
    public static void main(String[] args)
    {
        accept();
    }
}
