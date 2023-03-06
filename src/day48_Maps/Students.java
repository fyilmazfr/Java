package day48_Maps;

public class Students {
    public String name;
    public String email;
    public int age;
    public boolean success;

    public Students(String name, String email, int age, boolean success) { //burda bir constructor olusturduk
        this.name = name;
        this.email = email;
        this.age = age;
        this.success = success;
    }

    @Override//sag tiklayip, toString methodunu sectik
    public String toString() {//bu classdan olusturdugumuz objelerin detaylarini toString METHODUYLA konsola yazdirdik
        return "Students[" +
                "name=" + name + '\'' +
                ", email=" + email + '\'' +
                ", age=" + age +
                ", success=" + success +
                ']';
    }
}
