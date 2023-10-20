import org.example.Product;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Product_Tests {

    @ParameterizedTest
    @ValueSource (strings = {"Produto 1", "Produto 2", "", "1_@d"})
    void getTitle(String expected_title){
        Product item = new Product(expected_title, 0);
        assertEquals(expected_title,item.getTitle(), "Not the same title");
    }

    @ParameterizedTest
    @ValueSource(ints = {2,3,4,5,6,7,10000,1231231,-1,0})
    void getPrice(int expected_price){
        Product item = new Product("Product", expected_price);
        assertEquals(expected_price, item.getPrice(), "Not the same price");
    }

    @ParameterizedTest
    @ValueSource(strings = {"Produto 1", "Produto 2", "", "1_@d"})
    void equalsTest(String expected_title) {
        Product item = new Product(expected_title, 0);
        Product item2 = new Product(expected_title, 1);
        assertTrue(item.equals(item2));
    }
}
