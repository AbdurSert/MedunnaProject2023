package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US018_Pages {
    public US018_Pages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//span[normalize-space()='My Operations']") public WebElement myOperations;
    @FindBy(xpath="//span[normalize-space()='Manage Customers']") public WebElement manageCustomers;



    @FindBy(xpath="//span[normalize-space()='ID']") public WebElement iD;
    @FindBy(xpath="//span[normalize-space()='First Name']") public WebElement firstName;
    @FindBy(xpath="//span[normalize-space()='Last Name']") public WebElement lastName;
    @FindBy(xpath="//span[normalize-space()='Middle Initial']") public WebElement middleInitial;
    @FindBy(xpath="//span[normalize-space()='Email']") public WebElement email;
    @FindBy(xpath="//span[normalize-space()='Mobile Phone Number']") public WebElement mobilePhoneNumber;
    @FindBy(xpath="//span[normalize-space()='Phone Number']") public WebElement phoneNumber;
    @FindBy(xpath="//span[normalize-space()='Address']") public WebElement address;
    @FindBy(xpath="//span[normalize-space()='Create Date']") public WebElement createDate;

    @FindBy(xpath="//span[normalize-space()='Create or edit a Customer']") public WebElement createOrEditACustomer;
    @FindBy(xpath="//span[contains(text(),'Back')]") public WebElement back;

    @FindBy(xpath="(//span[contains(text(),'View')])[1]") public WebElement view;
    @FindBy(xpath="(//span[contains(text(),'Edit')])[1]") public WebElement edit;
    @FindBy(xpath="(//span[contains(text(),'Delete')])[1]") public WebElement delete;
    @FindBy(xpath="//span[normalize-space()='Confirm delete operation']") public WebElement confirmDeleteOperation;
    @FindBy(xpath="//div[@id='gmibankfrontendApp.tPCustomer.delete.question']") public WebElement areYouSureYouWantToDelet;
    @FindBy(xpath="//button[@id='jhi-confirm-delete-tPCustomer']//span[contains(text(),'Delete')]") public WebElement confirmDelete;
    @FindBy(xpath="//span[normalize-space()='Cancel']") public WebElement cancel;
    @FindBy(xpath="//span[normalize-space()='Barney Sanford']") public WebElement managerBoss;
    @FindBy(xpath="//span[normalize-space()='Sign out']") public WebElement signOut;








}
