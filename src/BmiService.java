public class BmiService {

    public double calculate(double height, double weight) {
        return (int) (weight / (height * height));
    }
}
