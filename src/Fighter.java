public class Fighter {
    String name;
    int  age;
    double kg,size,average;
    double athlethics;              // Atletizm düzeyini 10 üzerinden değerlendirmek.
    double power;                   // Güç düzeyini 10 üzerinden değerlendirmek.


    Fighter(String name , int age , double kg, double size,double athlethics, double power){
        this.name=name;
        this.age=age;
        this.kg=kg;
        this.size=size;
        this.athlethics=athlethics;
        this.power=power;
    }

    void WeightCategoryCalculation(){
        if( kg>= 66.2 && kg <77.6){
            System.out.println("Hafif siklet.");
        }
        if( kg>= 77.6 && kg < 93.4){
            System.out.println("Orta siklet.");
        }
        if( kg>= 93.4 && kg <= 120.2){
            System.out.println("Ağır siklet.");
        }

    }


    void WhoWinPosibility(){
        this.average=average;
        average = (athlethics*0.35)+(power*0.45)+((1/age)*0.20);
        System.out.println(average);
    }





}
