package wsb.po.szpital.domain;

import java.util.ArrayList;
import java.util.List;

public enum Hospital {

    instance("","");

//    public static Hospital getInstance(String name, String location) {
//        if (instance == null) {
//            instance = new Hospital(name, location);
//        }
//        return instance;
//    }

    private String name;
    private String location;

    private List<Department> departments = new ArrayList<>();

    public void addDepartment(Department department){
        departments.add(department);
    }

    Hospital(String name, String location) {
        this.setName(name);
        this.setLocation(location);
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + getName() + '\'' +
                ", location='" + getLocation() + '\'' +
                '}';
    }

    public void showStructure(){
        System.out.println("Struktura szpitala");
        System.out.println(this);
        System.out.println("Departamenty "+departments);
        //TODO
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
