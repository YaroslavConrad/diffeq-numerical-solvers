import java.util.Scanner;

public class Runner{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Goal 1: Figure out EulerMethod & RK4 for 1st order DEs [x]
        //Goal 2: Figure out EulerMethod & RK4 for 2nd order DEs []
        //Goal 3: Figure out EulerMethod & RK4 for DE's of all order []


        //gathering preliminary info
        
        System.out.println("Input the inital Y value: ");
        double initialY = scanner.nextDouble();
        System.out.println("Input the initial X value: ");
        double initialX = scanner.nextDouble();
        System.out.println("Input the step size: ");
        double stepSize = scanner.nextDouble();
        System.out.println("What x value do you want to estimate the y value at? ");
        double finalX = scanner.nextDouble();
        System.out.println("Input the y of the first order DE: ");
        double deY = scanner.nextDouble();
        System.out.println("Input the x of the first order DE: ");
        double deX = scanner.nextDouble();
        System.out.println("Input the constant of the first order DE: ");
        double deC = scanner.nextDouble();

        EulerMethod test1 = new EulerMethod(deX, deY, deC, initialX, initialY, stepSize, finalX);
        System.out.println(test1.estimateY());

        //test h = 0.2, y(0) = 1, dy/dx = x + y, estimate with RK4 of y(0.2) = 1.2428
        System.out.println(test1.RK4());

    }
}