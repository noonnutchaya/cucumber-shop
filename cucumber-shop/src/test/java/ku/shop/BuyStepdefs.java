package ku.shop;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.util.Map;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuyStepdefs {

    private ProductCatalog catalog;
    private Order order;
    private Pets pet;


    @Before
    public void setup() {
        catalog = new ProductCatalog();
        order = new Order();
    }

    @Given("a product (.+) with price (.+) exists")
    public void a_product_with_price_exists(String name, double price) {
        catalog.addProduct(name, price);
    }


    @Given("Pet Shop sells")
    public void PetShopsells(DataTable table) {
        Map<String,Double> data = table.asMap(String.class, Double.class);

        for (String name : data.keySet()) {
            double price = data.get(name);
            catalog.addProduct(name, price);
        }
    }



    @Given("My pet shop has (.+) with quantity (.+) and (.+) for each.")
    public void Pet_Shop_Sells_With_Stock(String nameAni,int num ,double price) {
        pet = new Pets(nameAni,num ,price) ;
    }


    @When("I buy (.+) with quantity (.+)")
    public void i_buy_with_quantity(String name, int quant) {
        Product prod = catalog.getProduct(name);
        order.addItem(prod, quant);
    }

    @When("I bought (.+) with quantity (.+)")
    public void i_buy_pet_with_quantity(String name, int quant) {
        Product prod = catalog.getProduct(name);
        order.addItem(prod, quant);
    }

    @When("Pet-I bought (.+) with quantity (.+)")
    public void pet_I_buy_Dog_with_quantity(String name,int orderPet) {
        pet.checkStock(orderPet);
    }


    @Then("total should be (.+)")
    public void total_should_be(double total) {
        assertEquals(total, order.getTotal());
    }


    @Then("must have (.+) in stock:get (.+)")
    public void total_pets(int total,double money) {
        assertEquals(total, pet.getNum());
        assertEquals(money, pet.getMoney());
    }

    @Then("We don't have enough-stock still (.+)")
    public void donot_have_enough(int n)  {
        assertEquals(n, pet.getNum());
    }
}

