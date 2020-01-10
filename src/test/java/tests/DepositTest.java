package tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DepositTest extends ProviderTest {
    @When("I login successfully with account as (.*)")
    public void loginSuccess(String username) throws InterruptedException {
        Thread.sleep(20000);
        getLoginPage().setBtnClickCustomerLogin();
        Thread.sleep(7000);
        getLoginPage().setUserSelect(username);
        Thread.sleep(6000);
        getLoginPage().setBtnSubmit();
    }

    @And("I click on Deposit button")
    public void btnDeposit() throws InterruptedException {
        Thread.sleep(5000);
        getDepositPage().setBtnDeposit();
    }
    @Then("I verify deposit form is appeared")
    public void depositFormAppeared() throws InterruptedException {
        Thread.sleep(3000);
//        getDepositPage().verifyDepositForm();
    }

    @And("I type amount to be Deposited as (.*)")
    public void inputDeposit(String deposit) throws InterruptedException {
        Thread.sleep(7000);
        getDepositPage().setInputAmount(deposit);
    }

    @And("I click on the Deposit button to submit deposit")
    public void btnSubmitDeposit() throws InterruptedException {
        Thread.sleep(5000);
        getDepositPage().setBtnSubmitDeposit();
    }



    @And("I verify user deposit successfully")
    public void depositSuccess() throws InterruptedException {
        Thread.sleep(5000);
        getDepositPage().verifyDepositSuccessfully();
    }

}
