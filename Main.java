//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        City city = new City("Улан-Удэ");
        City.Street street1 = city.new Street("Советов","площадь", 2.1);
        City.Street street2 = city.new Street("Жердева","улица", 12.1);
        City.Street street3 = city.new Street("КарлМаркса","Проспект", 4.1);

        System.out.println("Город: " + city.toString());
        System.out.println(street1);
        System.out.println(street2);
        System.out.println(street3);
    }

}