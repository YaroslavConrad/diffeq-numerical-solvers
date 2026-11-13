public class EulerMethod{
    
    //inputs should be step size (h), differential equation (ex. dy/dx = x + 2y)
    //initial value (ex. y(0) = 1) (potentially as a plotted point)
    private double stepSize = 0;
    private String diffEQ = "";
    private int initialY = 0;
    private int initialX = 0;

    public EulerMethod(String diffEQ, int initialY, int InitialX, double stepSize)
    {
        this.diffEQ = diffEQ;
        this.initialY = initialY;
        this.initialX = initialX;
        this.stepSize = stepSize;
    
    }

}