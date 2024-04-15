package srp2;

import java.util.Scanner;

public class InputFromConsole {

    private Scanner scanner = new Scanner(System.in);
    private final Order order;

    public InputFromConsole(Order order) {
        this.order = order;
    }

    public void inputFromConsole() {
        order.setClientName(prompt("Имя клиента: "));
        order.setProduct(prompt("Продукт: "));
        order.setQnt(Integer.parseInt(prompt("Количество: ")));
        order.setPrice(Integer.parseInt(prompt("Цена: ")));
    }
    private String prompt(String message){
        System.out.println(message);
        return scanner.nextLine();
    }

}
