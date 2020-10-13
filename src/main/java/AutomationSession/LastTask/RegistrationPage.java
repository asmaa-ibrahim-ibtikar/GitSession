package AutomationSession.LastTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends PageBase{
	public RegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input") WebElement FirstName;
	@FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[2]/div/div/input") WebElement LastName;
	@FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[3]/div/div/input") WebElement EmailAddress;
	@FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[4]/div/div/input") WebElement ConfirmEmailAddress;
	@FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[5]/div/div/input") WebElement UserName;
	@FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[6]/div/div/input") WebElement Password;
	@FindBy(id="datepicker") WebElement BirthDate;
	@FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[8]/div/div/input") WebElement Phone;
	@FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[9]/div/div/input") WebElement Address;
	@FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[10]/div/div/input") WebElement City;
	@FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[11]/div/div/select") WebElement State;
	@FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[12]/div/div/input") WebElement ZipCode;
	@FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[14]/div/button") WebElement RegisterButton;
	
	public void register(String firstName, String lastName, String emailAddress, String confirmEmailAddress, String userName, String password, String birthDate, String phone, String address, String city, String state, String zipCode) {
		FirstName.sendKeys(firstName);
		LastName.sendKeys(lastName);
		EmailAddress.sendKeys(emailAddress);
		ConfirmEmailAddress.sendKeys(confirmEmailAddress);
		UserName.sendKeys(userName);
		Password.sendKeys(password);
		BirthDate.sendKeys(birthDate);
		Phone.sendKeys(phone);
		Address.sendKeys(address);
		City.sendKeys(city);
		State.sendKeys(state);
		ZipCode.sendKeys(zipCode);
		RegisterButton.click();
	}
}
