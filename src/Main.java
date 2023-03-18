import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inp_name;
        Fighter f1 = new Fighter("Rokcy", 27,86.4,1.82,8.2,8.5);
        Fighter f2 = new Fighter("Muhammed Ali",28,77.4,1.78,9.1,8.5);

        System.out.println("Fighter: " + f1.name + "\n" + "Age: " + f1.age );
        f1.WeightCategoryCalculation();
        System.out.println("Fighter:" + f2.name + "\n" + "Age: " + f2.age);
        f2.WeightCategoryCalculation();

        System.out.println("Raund kazanma ihtimalleri 10 üzerinden değerlendirilmesi !!");
        System.out.print(f1.name+" = ");
        f1.WhoWinPosibility();
        System.out.print(f2.name+" = ");
        f2.WhoWinPosibility();



    }
}