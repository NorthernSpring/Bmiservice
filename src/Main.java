public class Main {
    public static void main(String[] args) {
        BodyMassCalculate service = new BodyMassCalculate();
        double weight = 77;
        double height = 1.87;
        int index = service.calculate(weight, height);
        System.out.println("Индекс массы тела:" + index);
    }
}
