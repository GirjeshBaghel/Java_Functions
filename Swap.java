import java.util.*;
class Swap
{
    public static void main(String[] args)
    {
        accept();
    }

    public static void accept()
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the two no : ");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Old value of a : "+a);
        System.out.println("Old value of b : "+b);

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("New value of a : "+a);
        System.out.println("New value of b : "+b);
    }
}