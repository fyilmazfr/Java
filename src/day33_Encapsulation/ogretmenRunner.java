package day33_Encapsulation;

public class ogretmenRunner {
    public static void main(String[] args) {
        ogretmen ogr1=new ogretmen();

        ogr1.setIsim("tulay");
        System.out.println(ogr1.getIsim());//tulay
        //herhangi biri kod'umuza baktiginda anlayacagi sudur ogretmen isimi once set edilmis yani degistirilmis
        //sonra get edilmis ve tulay yazdirilmis
        //bu yontemle data hiding degil daha ulasilabilir bir kod amaclanmis olur

    }
}
