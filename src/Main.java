public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.85; // рост в метрах
        double weight = 64; //вес в килограммах
        int result = (int) service.calculate(height, weight);
        System.out.println(result);
    }
}