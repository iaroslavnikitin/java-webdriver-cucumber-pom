package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.QuoteForm;

import java.util.*;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginPage {
    @Given("User lands on {requested page}")
    public void iNavigateToPage(String page) {
        switch (page) {
            case "quote":
                new QuoteForm().open();
                break;
            default:
                throw new RuntimeException("Unknown page: " + page);
        }
    }
}
