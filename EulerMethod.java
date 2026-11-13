public class EulerMethod{
    
    //inputs should be step size (h), differential equation (ex. dy/dx = x + 2y)
    //initial value (ex. y(0) = 1) (potentially as a plotted point)
    private double stepSize = 0;

    //the x coefficient and y coefficient of the 1st order linear DE
    private double deX = 0;
    private double deY = 0;

    //euler's method initial condition of y (ex. y(1) = 2)
    private int iniY = 0;
    private int iniX = 0;

    //final x value at which we will estimate the y value with Euler's
    private double finalX = 0.0;

    public EulerMethod(int deX, int deY, int iniY, int iniX, double stepSize, double finalX)
    {
        this.diffEQ = diffEQ;
        this.iniY = iniY;
        this.iniX = iniX;
        this.stepSize = stepSize;
        this.finalX = finalX;
    
    }

    public double estimateY()
    {
        for(int i = 0; i < ( stepSize/(finalX - iniX) ); i++)
        {

        }
        
        return 0.0;
    }

}