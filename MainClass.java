import Service.ToysService;
import Toy.Toys;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("\nМагазин игрушек");
        System.out.println();

        int trys = 10;

        ToysService toys = new ToysService();
        toys.create(1111, "Плюшевый Заяц", 2);
        toys.create(2222, "Черепаха", 2);
        toys.create(3333, "Акула", 6);
        toys.create(4444, "Чебурашка", 10);

        for (int i = 0; i < trys; i++) {
            toys.getToysWithProbability(toys.getAllToys());
            System.out.println();
        }
        for (Toys q: toys.getAllToys()) {
            System.out.println(q + " из " + trys + " попыток.");
        }
        System.out.println("\nДанные записаны в файл!");

        System.out.println();
        System.out.println("Сортировка по убыванию Id");
        toys.printToys(toys.getSortedByToysId());
    }
}
