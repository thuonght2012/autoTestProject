package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DepositPage {
    @FindBy(xpath = "//button[contains(text(),'Deposit')]")
    WebElement btnDeposit;
    @FindBy(xpath = "//div[4]//form//input")
    WebElement inputAmount;
    @FindBy(xpath = "//div[4]//form/button")
    WebElement btnSubmit;
    @FindBy(xpath = "//div[2]/strong[2]")
    WebElement depositSuccess;
    @FindBy(css = ".error")
    WebElement message;
    @FindBy(name = "//form[@name=\"myForm\"]")
    WebElement checkForm;

    public void setBtnDeposit() {
        btnDeposit.click();
    }

    public void setInputAmount(String deposit) {
        inputAmount.clear();
        inputAmount.sendKeys(deposit);
    }

    public void setBtnSubmitDeposit() {
        btnSubmit.click();
    }

    public void verifyDepositSuccessfully() throws InterruptedException {
        if (message.isDisplayed() ) {
//            && depositSuccess.getText().equals("2000")
            System.out.println("Deposit Successful: " + depositSuccess.getText());
        } else System.out.println("The customer has not deposited yet");
    }

    public void verifyDepositForm() {
        if (checkForm.isDisplayed()) {
            System.out.println("Deposit form is appeared ");
        } else System.out.println("Deposit form is not appeared");
    }

}
