public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double massKG = 64F;
        double heightMeters = 1.68F;         //height in meters
        double index = service.calculate(massKG, heightMeters);
        int bmiIndex = (int) index;
        System.out.println("Your body mass index: " + bmiIndex);
    }
}