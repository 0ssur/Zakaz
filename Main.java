public class Main{
public static void main(String[] args) {
System.out.println("заказчик: ");
Client me = new Client (404, "Кацап В.Г.", "89524356503", "ул.Садовая,д.116А");
me.outputting();
System.out.println("");
System.out.println("Заказ: ");
Order hp = new Order(229, "Кацап В.Г.","Поп ит ", 1000,15,"01.04.2021", true );
hp.outputting();}
}