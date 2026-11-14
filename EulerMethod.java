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
    }

    public String estimateY()
    {
        double currentY = iniY;
        double previousY = 0;
        double m = 0;

        //y_(n+1) = y_n + h * f(x_n, y_n)
        for(double i = iniX; i < finalX; i+=stepSize)
        {
            m = currentY * deY  +  i * deX  + deC ;
            previousY = currentY;
            currentY = m * stepSize + previousY;
        }

        return "deY: " + deY + " deX: " + deX + " deC: " + deC + "\nfinal Y: " + currentY + "\nfinal m: " + m + "\nprevious Y: " + previousY; 
    }

    public String RK4()
    {
        double currentY = intY;

        for(double i = iniX; i < finalX; i+=stepSize)
        {
            //inputs
            double h = stepSize;
            
            double k1 = currentX*deX + curreY*deY + deC;
            double k2 = ( currentX + h/2 )*deX + ( currentY + (h*k1/2) )*deY + deC;
            double k3 = ( currentX + h/2 )*deX + ( currentY + (h*k2/2) )*deY + deC;
            double k4 = ( currentX + h)*deX + ( currentY + (h*k3) )*deY + deC;

            previousY = currentY;
            currentY = previousY + (h/6)*(k1 + 2*k2 + 2*k3 + k4);
        }

        return "estimated y by RK4 at x = " + finalX + " is " + currY; 
    }

}