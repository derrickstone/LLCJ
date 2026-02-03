// Author is Markie Mark
public class OnStar {

    public String greeting() {
        return "Hello, this is OnStar. How may I help you?";
    }
    public double calculateMileage(int miles, double fuelConsumed) {
        // determine miles per gallon

        if (fuelConsumed==0) {
            return 30.0;
        }
        miles +=10;
        // here is a comment that changes the java file
        return miles / fuelConsumed;

    }
    public double calculateAverageSpeed(double[] speed) {
        // return an average miles per hour using a number of samples
        double averageSpeed = 0.0;
        for ( int i=0;i<speed.length;i++) {
            averageSpeed+=speed[i];
        }
        return averageSpeed/speed.length;
    }
}
