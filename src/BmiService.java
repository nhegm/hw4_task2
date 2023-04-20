public class BmiService {
    public double calculate(int m, double h) {
        double result = m / (h * h);
        return result;
    }
}
