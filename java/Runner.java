public class Runner{

    public static void main(String[] args){

        //javac java/*.java
        //java -cp java Runner 0 1 1 1 0 0.2 0.2
        double initialX = Double.parseDouble(args[0]);
        double initialY = Double.parseDouble(args[1]);
        double deX = Double.parseDouble(args[2]);
        double deY = Double.parseDouble(args[3]);
        double deC = Double.parseDouble(args[4]);
        double stepSize = Double.parseDouble(args[5]);
        double finalX = Double.parseDouble(args[6]);

        //Goal 1: Figure out EulerMethod & RK4 for 1st order DEs [x]
        //Goal 2: Figure out EulerMethod & RK4 for 2nd order DEs []
        //Goal 3: Figure out EulerMethod & RK4 for DE's of all order []

        EulerMethod test1 = new EulerMethod(deX, deY, deC, initialX, initialY, stepSize, finalX);
        //System.out.println(test1.estimateY());

        //test h = 0.2, y(0) = 1, dy/dx = x + y, estimate with RK4 of y(0.2) = 1.2428
        //System.out.println(test1.RK4());
        //System.out.println();

        //CLI utility test
        test1.printTrajectory();

    }
}