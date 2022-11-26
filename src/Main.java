import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please, enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        //comment only for github change
        System.out.printf("Your name is %s \n",name);
        Concret test1 = new Concret(10,15.2f);
        System.out.println(test1.getName());
        System.out.println(test1.getI());
        System.out.println(test1.getF());

    }


}