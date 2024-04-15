package srp2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Order{


    private String clientName;
    private String product;
    private int qnt;
    private int price;


//    ------------------------------------------------------------------------------------------------------------

    /**
     * Думала сначала, что можно не выносить отсуда inputFromConsole() и prompt(). Также с этим думала вписать
     * запуск этих методов в контруктор, чтобы сразу при создании  заказа нужно было вводить данные,
     * без дополнительного их вызова в клиентском коде. Но решила попробовать все же вынести методы, ниже
     * закоментировала вариант, что описала здесь.
     */

//    private Scanner scanner = new Scanner(System.in);

//    public Order(){
//        inputFromConsole();
//    }
//
//    public  void inputFromConsole(){
//        clientName = prompt("Имя клиента: ");
//        product = prompt("Продукт: ");
//        qnt = Integer.parseInt(prompt("Количество: "));
//        price = Integer.parseInt(prompt("Цена: "));
//    }
//    private String prompt(String message){
//        System.out.println(message);
//        return scanner.nextLine();
//    }

//    ------------------------------------------------------------------------------------------------------------


    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }
    public Order(){
    }

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public int getPrice() {
        return price;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //    public void saveToJson() {
//        String fileName = "order.json";
//        try (FileWriter writer = new FileWriter(fileName, false)) {
//            writer.write("{\n");
//            writer.write("\"clientName\":\""+ clientName + "\",\n");
//            writer.write("\"product\":\""+product+"\",\n");
//            writer.write("\"qnt\":"+qnt+",\n");
//            writer.write("\"price\":"+price+"\n");
//            writer.write("}\n");
//            writer.flush();
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }

}
