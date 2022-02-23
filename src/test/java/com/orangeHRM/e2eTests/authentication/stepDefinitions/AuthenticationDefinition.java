package com.orangeHRM.e2eTests.authentication.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.e2eTests.authentication.pages.AuthenticationPage;
import com.orangeHRM.e2eTests.utils.CommonMethods;
import com.orangeHRM.e2eTests.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthenticationDefinition {

	public WebDriver driver;
	private AuthenticationPage authenticationPage = new AuthenticationPage();
	private CommonMethods commonMethods = new CommonMethods();
	public AuthenticationDefinition() {
		driver = Setup.driver;
		PageFactory.initElements(driver, AuthenticationPage.class);
	}
	
	@Given("^Je me connect à l'application OrangeHRM$")
	public void jeMeConnectÀLApplicationOrangeHRM() throws Throwable {
		commonMethods.openURLWithConfigFile("url");
	}
	
	@When("^Je saisie Username \"([^\"]*)\"$")
	public void jeSaisieUsername(String name) throws Throwable {
		authenticationPage.fillUserName(name);
	}

	@When("^Je saisie Password \"([^\"]*)\"$")
	public void jeSaisiePassword(String password) throws Throwable {
		authenticationPage.fillUserPassword(password);
	}

	@When("^Je clique sur le bouton Login$")
	public void jeCliqueSurLeBoutonLogin() throws Throwable {
		authenticationPage.clickBtnLogin();
	}

	@Then("^Je me redirige vers le compte admin$")
	public void jeMeRedirigeVersLeCompteAdmin() throws Throwable {
	}

}
