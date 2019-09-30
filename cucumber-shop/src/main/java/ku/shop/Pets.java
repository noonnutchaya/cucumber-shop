package ku.shop;

public class Pets {
    private double price;
    private double money;
    private String nameAni;
    private int num;
    private String sent ;

    public Pets(String nameAni,int num ,double price ) {
        this.price = price;
        this.nameAni = nameAni;
        this.num = num;
        money = 0 ;
    }

    public void checkStock(int orderNum) {
        try {
            if (num < orderNum) {}

        }catch (Exception e) {
            sent = "We don't have enough. Sorry :(";
            System.out.println(e.getMessage());
        }
        if (num > orderNum) {
            num = num-orderNum;
            money = orderNum*price;
        }
    }

    public int getNum() {
        return num;
    }

    public double getMoney() {
        return money;
    }

    public String getError() {
        return sent;
    }
}
