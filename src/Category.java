import java.util.ArrayList;
import java.util.List;

public class Category {

    private String categoryName;
    private List<Product> products = new ArrayList<>();

    public Category(String categoryName){
        this.categoryName = categoryName;
    }

    public void addProducts(Product product){
        products.add(product);
    }

    public List<Product> getProducts(){
        return products;
    }

    public String getCategoryName(){
        return categoryName;
    }

    void printCategoryInfo(){
        System.out.println(categoryName);
    }
}
