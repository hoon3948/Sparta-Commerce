public class Customer {
    private String customerName;
    private String customerEmail;
    private String customerRating;
    private int orderAmount = 0;

    public Customer(String customerName,String customerEmail, int orderAmount){
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.orderAmount = orderAmount;
        this.customerRating = gradeRating();
    }

    private String gradeRating(){
        Rank rank = Rank.fromAmount(orderAmount);
        return customerRating = rank.getName();
    }


    void printCustomerInfo(){
        System.out.println("고객이름: " + customerName + " 고객이메일: " + customerEmail + " 누적금액: " + orderAmount + " 고객등급: " + customerRating );
    }
}
