package com.cybertek.step_definitions;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class amazonSearchStepDef {
  //  amazonPage amazon;
    @Given("User is on the Amazon Home Page")
    public void user_is_on_the_amazon_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("amazon"));
        BrowserUtils.sleep(1);
    }
    @Given("User search for hats for men")
    public void user_search_for_hats_for_men() {
       //amazon = new amazonPage();
    }
    @Given("User adds thr first hat appearing to the cart with quantity two")
    public void user_adds_thr_first_hat_appearing_to_the_cart_with_quantity_two() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The total price and quantity should be correct")
    public void the_total_price_and_quantity_should_be_correct() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User reduce the quantity from two to one")
    public void user_reduce_the_quantity_from_two_to_one() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Total price and quantity has been changed correctly")
    public void total_price_and_quantity_has_been_changed_correctly() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
