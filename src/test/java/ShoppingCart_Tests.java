import org.example.Product;
import org.example.ProductNotFoundException;
import org.example.ShoppingCart;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShoppingCart_Tests {

    private static ArrayList<Product>items = new ArrayList<>();
    private static ShoppingCart cart1;
    private static ShoppingCart cart2;
    private static ShoppingCart cart3;
    private static Product product1;
    private static Product product2;
    private static Product product3;
    private static Product product4;


    @BeforeAll
    public static void setUp(){
        cart1 = new ShoppingCart();
        cart2 = new ShoppingCart();
        cart3 = new ShoppingCart();
        product1 = new Product("Produto1", 2);
        product2 = new Product("Produto2", 3);
        product3 = new Product("Produto3", 0);
        product4 = new Product("Produto4", 20);
        items.add(product1);
        items.add(product2);
    }

    @Test
    void emptyTest(){
        cart1 = new ShoppingCart(items);
        int expected_value;
        cart1.empty();
        expected_value = 0;
        assertEquals(expected_value, cart1.empty().getItemCount(), "Not expected value");
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 0 , 4})
    void getItemCountTest(int expected_value){
        ShoppingCart cart_Empty = new ShoppingCart();
        assertEquals(expected_value, cart_Empty.getItemCount(), "Error not equals");
    }
    @ParameterizedTest
    @ValueSource(ints = {20, 2, 5, 25, 0})
    void getBalanceTest(int expected_value) {
        //assertEquals(expected_value, cart1.getBalance(), "Balance not as expected");
        //assertEquals(expected_value, cart2.getBalance(), "Balance not as expected");
        assertEquals(expected_value, cart3.getBalance(), "Balance not as expected");
    }

    @Test
    void addItemTest(){
        cart1.addItem(product1);
        cart1.addItem(product4);

        assertEquals(2, cart1.getItemCount(),"Not expected value");
    }
}
