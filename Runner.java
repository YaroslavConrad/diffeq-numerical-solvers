import java.util.Scanner;

public class Runner{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //gathering preliminary info
        System.out.println("Input the inital Y value: ");
        double initialY = scanner.nextInt();
        System.out.println("Input the initial X value: ");
        double initialX = scanner.nextInt();
        System.out.println("Input the step size: ");
        double stepSize = scanner.nextDouble();
        System.out.println("Input the y of the first order DE");
        double deY = scanner.nextDouble();
        System.out.println("Input the x of the first order DE");
        double deX = scanner.nextDouble();

        //public EulerMethod(double deX, double deY, double deC, double iniX, double iniY, double stepSize, double finalX)

        EulerMethod test1 = new EulerMethod(3.0, 0.0, 2.0, 0.0, 1.0, 0.2, 0.4);
        System.out.println(test1.estimateY());
        System.out.println(initialY);

        //Goal 1: Figure out EulerMethod for 1st order DEs

    }
}