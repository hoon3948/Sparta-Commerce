import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Category electronics = new Category("전자제품");
        Category clothes = new Category("의류");
        Category foods = new Category("식품");

        electronics.addProducts(new Product("Galaxy S25",1200000,"최신 안드로이드 스마트폰", 50));
        electronics.addProducts(new Product("iPhone 16",1350000,"Apple의 최신 스마트폰",50));
        electronics.addProducts(new Product("MacBook Pro",2400000,"M3 칩셋이 탑재된 노트북", 20));
        electronics.addProducts(new Product("AirPods Pro",350000,"노이즈 캔슬링 무선 이어폰", 120));

        clothes.addProducts(new Product("치마", 30000, "무지개 땡땡이 치마", 300));
        clothes.addProducts(new Product("냉장고 바지", 20000,"시원하고 편한 바지", 350));
        clothes.addProducts(new Product("티셔츠",400,"무난한 흰색 무지 티셔츠", 600));

        foods.addProducts(new Product("식빵",12000, "부드러운 우유식빵", 20));
        foods.addProducts(new Product("롤케이크",20000,"부드럽고 달콤한 롤케잌",7));
        foods.addProducts(new Product("낙엽 브레드", 3500, "피자빵!!", 3000));
        foods.addProducts(new Product("치즈케이크",30000,"부드럽습니다. 부드러워요.",5));
        foods.addProducts(new Product("티라미슈",30000,"가루를 조심하세요.",5));


        List<Category> categories = new ArrayList<>();
        categories.add(electronics);
        categories.add(clothes);
        categories.add(foods);

        CommerceSystem commerceSystem = new CommerceSystem(categories);
        commerceSystem.start();

    }
}
