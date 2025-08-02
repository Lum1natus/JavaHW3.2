public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 98; // вес, кг
        double height = 1.87; // рост, м
        int index = service.calculate(weight, height);
        System.out.println(index);
    }
}