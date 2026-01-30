import java.util.List;
import java.util.Scanner;

public class CommerceSystem {
    private int count = 1;
//    Category category;
    private List<Category> categories;



    public CommerceSystem(List<Category> categories) {
        this.categories = categories;
    }

    public void start(){
        Scanner sc = new Scanner(System.in);
        int input1 = -1;

        while(true) {
            count = 1;
            int input2 = -1;
            // 제품 조회 반복을 위해서 초기화
            String forCategoryName = " ";

            System.out.println("[ 실시간 커머스 플랫폼 메인 ]");
            // 메뉴 출력
            for (Category categories : categories) {
                System.out.print(count++ + ". ");
                categories.printCategoryInfo();
            }
            System.out.println("0. 종료   |   프로그램 종료");
            input1 = sc.nextInt();
            System.out.println();
            // 가시성 위해서 공백 한줄 추가

            if(input1 == 0) {
                break;
            }
            // 반복문 탈출

            while(input2 != 0){
                count = 1;

                switch (input1){
                    case(1) -> forCategoryName = "전자제품";
                    case(2) -> forCategoryName = "의류";
                    case(3) -> forCategoryName = "식품";
                    default -> throw new IllegalArgumentException("존재하지 않는 항목입니다.");
                }

                System.out.println("[ " + forCategoryName + " 카테고리 ]");
                for(Category ex : categories){
                    if(ex.getCategoryName().equals(forCategoryName)){
                        for (Product product : ex.getProducts()) {
                            System.out.print( count++ + ". ");
                            product.printProductInfo();
                        }
                        System.out.println("0. 뒤로가기");

                        input2 = sc.nextInt();
                        if(input2 > 0 && input2 <= ex.getProducts().size()){
                            Product selectedProduct = ex.getProducts().get(input2 - 1);
                            selectedProduct.printSelectedProduct();
                            System.out.println();
                        }

                    }
                }
//                throw new IllegalArgumentException("존재하지 않는 항목입니다.");
            }


        }

        System.out.print("이름: ");
        String name = sc.next();
        System.out.print("이메일: ");
        String email = sc.next();
        System.out.print("금액: ");
        int amount = sc.nextInt();
        if(amount>=0) {
            Customer customer = new Customer(name, email, amount);
            customer.printCustomerInfo();
        }else{
            throw new IllegalArgumentException("금액이 잘못 입력 되었습니다.");
        }

        System.out.println("커머스 플랫폼을 종료합니다.");
        sc.close();
    }
//    public void manageProduct(Category category){
//
//    }
}
