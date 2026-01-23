public class Customer {
    private String customerName;
    private String customerEmail;
    private String customerRating;
    private int orderAmount = 0;

    public Customer(String customerName,String customerEmail, int orderAmount){
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerRating = gradeRating();
        this.orderAmount = orderAmount;
    }

    private String gradeRating(){
        if(orderAmount<500000){
            this.customerRating = "Bronze";
        }
        else if(orderAmount >= 500000 && orderAmount < 1000000){
            this.customerRating = "Silver";
        }
        else if (orderAmount >= 1000000 && orderAmount < 2000000){
            this.customerRating = "Gold";
        }
        else if(orderAmount >= 2000000) {
            this.customerRating = "Platinum";
        }
    }

    public String getCustomerName(){
        return customerName;
    }
    public String getCustomerEmail(){
        return customerEmail;
    }
    public String getCustomerRating(){
        return customerRating;
    }
    public int getOrderAmount(){
        return orderAmount;
    }

    void printCustomerInfo(){
        System.out.println("고객이름: " + customerName + "고객이메일: " + customerEmail + "고객등급: " + customerRating + "누적금액: " + orderAmount);
    }
}
