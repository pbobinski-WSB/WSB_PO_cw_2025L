package wsb.po.szpital.domain;

public abstract class Staff extends Person implements Billable{

    public Staff(String name, int age) {
        super(name,age);
    }

    public abstract void performDuties();
}
