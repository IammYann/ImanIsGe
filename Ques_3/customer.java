package Ques_3;

public class customer {
    String name;
    double money;
    customer (String name, double money){
        this.name=name;
        this.money=money;
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("money:"+money);
    }
    double discount(){
        return money;
    }
}
