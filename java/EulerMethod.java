public class EulerMethod{
    //delta x 
    private double stepSize = 0;
    //the x coefficient and y coefficient of the 1st order linear DE
    //and potential constants (deC) of dy/dx. 
    private double deX = 0;
    private double deY = 0;
    private double deC = 0;
    //euler's method initial condition of y (ex. y(1) = 2)
    private double iniY = 0;
    private double iniX = 0;
    //final x value at which we will estimate the y value with Euler's
    private double finalX = 0.0;
    //computes the total steps in advance
    private int totalSteps;

    //constructor
    public EulerMethod(double deX, double deY, double deC, double iniX, double iniY, double stepSize, double finalX)
    {
        this.iniY = iniY;
        this.iniX = iniX;

        this.deY = deY;
        this.deX = deX;
        this.deC = deC;

        this.stepSize = stepSize;
        this.finalX = finalX;
        totalSteps = (int)Math.round( (finalX - iniX) /stepSize );
    }

    //goal: print out columns in this format: x, y (eulers), y (RK4)
    //Need a loop that prints all three things in one system.out.println() function for each interation
    //Loop: calculate each ste
    private double iterativeEulers(double currentX, double currentEulers){
        double m = 0;
        double previousY = currentEulers;

        m = currentX*deX + currentEulers*deY + deC;

        currentEulers = m*stepSize + previousY;
        return currentEulers;
    }

    private double iterativeRK4(double currentX, double currentRK4){
        double previousY = currentRK4;

        double k1 = currentX*deX + currentRK4*deY + deC;
        double k2 = ( currentX + stepSize/2 )*deX + ( currentRK4 + (stepSize*k1/2) )*deY + deC;
        double k3 = ( currentX + stepSize/2 )*deX + ( currentRK4 + (stepSize*k2/2) )*deY + deC;
        double k4 = ( currentX + stepSize)*deX + ( currentRK4 + (stepSize*k3) )*deY + deC;

        return ( previousY + (stepSize/6)*(k1 + 2*k2 + 2*k3 + k4) );
    }

    public void printTrajectory(){

        double currentEulers = iniY;
        double currentRK4 = iniY;

        System.out.println(iniX + "," + currentEulers + "," + currentRK4);

        for(int x= 0; x < totalSteps; x++)
        {
            double currentX = stepSize*x + iniX;
            double nextX = stepSize*(x+1) + iniX;

            currentEulers = iterativeEulers(currentX, currentEulers);
            currentRK4 = iterativeRK4(currentX, currentRK4);
            //must have a var that shows output of RK4, X, and Eulers for each iteration
            //X, Y (eulers), Y(RK4)
            System.out.println(nextX + "," + currentEulers + "," + currentRK4);
        }
    }

}