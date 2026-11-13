import java.util.Scanner;

public class Runner{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //gathering preliminary info
        System.out.println("Input the inital Y value: ");
        int initialY = scanner.nextInt();
        System.out.println("Input the initial X value: ");
        int initialX = scanner.nextInt();
        System.out.println("Input the step size: ");
        double stepSize = scanner.nextDouble();
        System.out.println("Input the y of the first order DE");
        double deY = scanner.nextDouble();
        System.out.println("Input the x of the first order DE");
        double deX = scanner.nextDouble();

        System.out.println(initialY);

        //Goal 1: Figure out EulerMethod for 1st order DEs

    }
}