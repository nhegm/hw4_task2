public class Main {
    public static void main(String[] args) {
        BmiService bmi = new BmiService();
        int mass = 98;
        double heightMeter = 1.87F;         //height in meters
        double index = bmi.calculate(mass, heightMeter);
        int bmindex = (int) index;
        System.out.println("Your body mass index: " + bmindex);
    }
}