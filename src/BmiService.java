public class BmiService {
    public double calculate(double massKG, double heightMeters) {
        double result = massKG / (heightMeters * heightMeters);
        return result;
    }
}
