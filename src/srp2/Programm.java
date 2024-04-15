package srp2;

/**
 * TODO: Переработать структуру приложения Order, приложение должно соответствовать
 *  принципу SRP.
 * @param
 */
public class Programm {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new Order();
        new InputFromConsole(order).inputFromConsole();
        new JsonSave(order).saveToJson();
    }
}
