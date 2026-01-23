import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommerceSystem {
    private final List<Product> products;
    public CommerceSystem(List<Product> products) {
        this.products = products;
    }


    public void start(){

        Scanner sc = new Scanner(System.in);

        // 메뉴 출력
        int count = 1;
        for (Product product : products) {
            System.out.print( count++ + ". ");
            product.printInfo();
        }
        System.out.println("0. 종료   |   프로그램 종료");
        int ans = sc.nextInt();
        if (ans == 0){
            System.out.println("커머스 플랫폼을 종료합니다.");
        }

    }

    void manageProduct(){

    }
}
