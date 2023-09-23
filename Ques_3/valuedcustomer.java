package Ques_3;

public class valuedcustomer extends customer{
    valuedcustomer(String name, double money){
        super(name, money);
    }
    double discount(){
        double discountrate = 0.10;
        return money-money*discountrate; 
    }
}
