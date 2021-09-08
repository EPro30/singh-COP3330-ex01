import java.util.Scanner;
public class exOne {
    public static void main(String[] args)
    {
        System.out.println("What is you name?");
        Scanner sc = new Scanner(System.in);
        //String name = sc.next();
        String name = sc.nextLine();
        System.out.println("Hello, " + name + ", nice to meet you!");
    }
}
