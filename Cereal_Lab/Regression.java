import java.util.ArrayList;

public class Regression {
    public double runRegression(ArrayList<Double> c, ArrayList<Double> s) {
        //finds r value - equation found here https://www.youtube.com/watch?v=kreWnfARO30
        double r = 0.0;
        double n = (double) c.size();
        double sumC = 0.0;
        double sumS = 0.0;
        double sumCSquared = 0.0;
        double sumSSquared = 0.0;
        double sumCTimesS = 0.0;

        for (double x : c) {
            sumC += x;
            sumCSquared += x*x;

        }
        for (double x : s) {
            sumS += x;
            sumSSquared += x*x;
        }

        for (int i=0; i < c.size(); i++) {
            sumCTimesS += c.get(i) * s.get(i);
        }

        r = ((n*((sumCTimesS))-(sumC*sumS))/(java.lang.Math.sqrt((n*(sumCSquared-(sumC*sumC))*(n*(sumSSquared-(sumS*sumS)))))));

        return r;
    }
}