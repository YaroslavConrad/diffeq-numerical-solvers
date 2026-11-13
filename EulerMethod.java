public class EulerMethod{
    
    //inputs should be step size (h), differential equation (ex. dy/dx = x + 2y)
    //initial value (ex. y(0) = 1) (potentially as a plotted point)
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

    //test parameters: (3, 0, 2, 0, 1, 0.2, 0.4) expected output: 2.6
    public EulerMethod(double deX, double deY, double deC, double iniX, double iniY, double stepSize, double finalX)
    {
        this.iniY = iniY;
        this.iniX = iniX;

        this.deY = deY;
        this.deX = deX;
        this.deC = deC;

        this.stepSize = stepSize;
        this.finalX = finalX;
    }

    public String estimateY()
    {
        double currentY = iniY;
        double previousY = 0;
        double m = 0;

        // y = mx + b
        //1. iniY * deY + iniX * deX (S0)
        //2. Looking for Y1 at next X1 (iniX + stepSize)
        //3. Y1 = S0 * X1 + iniY
        //repeat...
        //1. S1 = Y1 * deY + X1 * deX 
        //2. X2 is X1 + stepSize;
        //3. Y2 = S1 * X2 + Y1
        for(double i = iniX; i < finalX; i+=stepSize)
        {
            m = currentY * deY  +  i * deX  + deC ;
            previousY = currentY;
            currentY = m * stepSize + previousY;
        }

        return "deY: " + deY + " deX: " + deX + " deC: " + deC + "\nfinal Y: " + currentY + "\nfinal m: " + m + "\nprevious Y: " + previousY; 
    }

}