package newpackage
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class directory {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I want to login to the webpage")
	def I_want_to_login_to_the_webpage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
		WebUI.maximizeWindow()
	}

	@When("I enter valid username and password")
	def I_enter_valid_username_and_password() {
		WebUI.setText(findTestObject('Object Repository/Directory/Page_OrangeHRM/input_Username_username'), 'Admin')
		WebUI.setEncryptedText(findTestObject('Object Repository/Directory/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')
		WebUI.click(findTestObject('Object Repository/Directory/Page_OrangeHRM/button_Login'))
	}

	@And("I click directory")
	def I_click_directory() {
		WebUI.click(findTestObject('Object Repository/Directory/Page_OrangeHRM/a_Directory'))
	}

	@And("I search for valid first name (.*)")
	def I_search_for_valid_first_name(String firstname) {
		WebUI.setText(findTestObject('Object Repository/Directory/Page_OrangeHRM/input'), firstname)
	}

	@And("I click for valid name(.*)")
	def I_click_for_valid_name(String name) {
		WebUI.click(findTestObject('Page_OrangeHRM/span_Lisa  Andrews', [('name') : name.trim()]))
		WebUI.verifyElementPresent(findTestObject('Object Repository/Directory/Page_OrangeHRM/p_Lisa  Andrews'), 0)
		WebUI.click(findTestObject('Object Repository/Directory/Page_OrangeHRM/button_Search'))
	}

	@Then ("I logout from the browser")
	def I_logout_from_the_browser() {
		WebUI.click(findTestObject('Object Repository/Directory/Page_OrangeHRM/i_Directory_oxd-icon bi-caret-down-fill oxd_f53e40'))
		WebUI.click(findTestObject('Object Repository/Directory/Page_OrangeHRM/a_Logout'))
		WebUI.closeBrowser()
	}

	@And("I search invalid name (.*)")
	def I_search_for_invalid_name(String name) {
		WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input'), name)
		WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Search'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/span_Invalid'), 0)
	}
}