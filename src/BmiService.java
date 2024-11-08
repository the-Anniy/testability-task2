public class BmiService {

    public int calculate(double height, double weight) {
        return (int) (weight / (height * height));
    }
}
