public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87; // рост в метрах
        double weight = 98; //вес в килограммах
        int bmi = service.calculate(height, weight);
        System.out.println(bmi);
    }
}