public class Product {
    private final String name;
    private final int price;
    private final String information;
    private final int stock;

    public Product(String name,int price, String information, int stock){
        this.name = name;
        this.price = price;
        this.information = information;
        this.stock = stock;
    }

    void printProductInfo(){
        if(stock <= 0){
            System.out.println("재고가 없습니다.");
        }
        else {
            System.out.println(name + "     |   " + price + "원   |   " + information);
        }
    }

}
