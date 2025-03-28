package wsb.po.trzy.zadania.javadoc;

public class Prostokat {

    /* Pola klasy */

    private String nazwa = "prostokąt";

    private double bokA = 3.5;

    private double bokB = 4.5;

    /* Konstruktory klasy */

    public Prostokat(String nazwa, double bokA, double bokB) {
        this.nazwa = nazwa;
        this.bokA = bokA;
        this.bokB = bokB;
    }

    public Prostokat(double bokA, double bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    public Prostokat() {

    }

    /* Metody klasy */

    public double getObwod () {
        return 2 * bokA + 2 * bokB;
    }

    public double getPole () {
        return bokA * bokB;
    }

    public boolean isKwadrat () {
        return bokA == bokB;
    }

    /* Metody dostępowe */

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getBokA() {
        return bokA;
    }

    public void setBokA(double bokA) {
        this.bokA = bokA;
    }

    public double getBokB() {
        return bokB;
    }

    public void setBokB(double bokB) {
        this.bokB = bokB;
    }

    /* Metoda ToString tworząca tekstowy opis obiektu */

    @Override
    public String toString() {
        return "Prostokat{" +
                "nazwa='" + nazwa + '\'' +
                ", bokA=" + bokA +
                ", bokB=" + bokB +
                '}';
    }
}
