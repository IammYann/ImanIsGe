package Ques_3;

public class nonmenbers extends customer {
    nonmenbers(String name, double money){
        super(name, money);
    }
    double discount(){
        double discountrate = 0.07         ;
        return money-money*discountrate; 
    }
}
