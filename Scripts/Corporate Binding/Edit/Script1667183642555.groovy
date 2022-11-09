import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/li_Corporate Branding'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_Primary Color_oxd-color-input-preview'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_Corporate BrandingPrimary ColorHEXSecon_50cc0c'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_Primary Gradient Color 1_oxd-color-inpu_933daf'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_Corporate BrandingPrimary ColorSecondar_a4527b'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_Secondary Color_oxd-color-input oxd-col_593956'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_Secondary Color_oxd-color-picker-indicator'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_Primary ColorSecondary ColorHEXPrimary _cc3d3e'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_Primary Gradient Color 2_oxd-color-inpu_ec5035'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_Primary ColorSecondary ColorPrimary Fon_5e87ef'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Reset to Default'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Publish'))

WebUI.closeBrowser()

