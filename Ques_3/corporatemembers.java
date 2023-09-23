package Ques_3;

public class corporatemembers extends customer{
    corporatemembers(String name, double money){
        super(name, money);
    }
    double discount(){
        double discountrate = 0.07;
        return money-money*discountrate; 
    }
}
