package najah.edu.acceptance_test;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class checkout {
int bananaprice=0, appleprice=0;
Market m=new Market();
	
	@Given("the price of a {String} is {int}")
	public void  the_price_of_is(String item , Integer price) {
		if ( item.equals("banana")) {
			bananaprice=price;
		} else {
			appleprice=price;
		}
	}

	@When ("I checkout {int} {String}")
	public void i_checkout(Integer itemCount,String item) {
		if (item.equals("banana")) {
			m.add(itemCount ,bananaprice);
		}
		else {
			m.add(itemCount ,appleprice);

		}
	}


	@Then ("the total price should be {int}")
	public void thetotalpriceshouldbe(Integer price) {
		assertEquals(price.intValue(),m.total());
	}

	
}
