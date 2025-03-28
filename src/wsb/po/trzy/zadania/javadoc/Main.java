package wsb.po.trzy.zadania.javadoc;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Testy klasy prostokąt");

        Prostokat prostokat1 = new Prostokat();

        Prostokat prostokat2 = new Prostokat(6,7);

        Prostokat kwadrat = new Prostokat("kwadrat", 5,5);

        System.out.println(prostokat1 + " kwadrat ? " +prostokat1.isKwadrat());
        System.out.println(" obwód = " +prostokat1.getObwod() + " pole powierzchni = "+prostokat1.getPole());

        System.out.println(prostokat2 + " kwadrat ? " +prostokat2.isKwadrat());
        System.out.println(" obwód = " +prostokat2.getObwod() + " pole powierzchni = "+prostokat2.getPole());

        System.out.println(kwadrat + " kwadrat ? " +kwadrat.isKwadrat());
        System.out.println(" obwód = " +kwadrat.getObwod() + " pole powierzchni = "+kwadrat.getPole());

    }
}
