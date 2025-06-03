class Person {
    private String name;
    private int age;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
public class que {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Suraj");
        p.setAge(23);
        p.setCountry("India");
        System.out.println(p.getName());
        p.setName("Aditya");
        System.out.println(p.getName());
    }
}
