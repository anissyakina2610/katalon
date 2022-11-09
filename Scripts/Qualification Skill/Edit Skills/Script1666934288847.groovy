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

WebUI.setText(findTestObject('Object Repository/Edit Skills/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Edit Skills/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Edit Skills/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/Edit Skills/Page_OrangeHRM/span_Admin'))

WebUI.click(findTestObject('Object Repository/Edit Skills/Page_OrangeHRM/i_Qualifications_oxd-icon bi-chevron-down'))

WebUI.click(findTestObject('Object Repository/Edit Skills/Page_OrangeHRM/li_Skills'))

WebUI.click(findTestObject('Object Repository/Edit Skills/Page_OrangeHRM/button_Marketing Skill_oxd-icon-button oxd-_301c48'))

WebUI.click(findTestObject('Object Repository/Edit Skills/Page_OrangeHRM/div_Edit SkillNameDescription  Required Can_8e1238'))

WebUI.setText(findTestObject('Object Repository/Edit Skills/Page_OrangeHRM/textarea_Description_oxd-textarea oxd-texta_fed1e5'), 
    'Business Skill')

WebUI.click(findTestObject('Object Repository/Edit Skills/Page_OrangeHRM/button_Save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Skills/Page_OrangeHRM/div_Programming Language'), 0)

WebUI.click(findTestObject('Object Repository/Edit Skills/Page_OrangeHRM/i_Qualifications_oxd-icon bi-caret-down-fil_587a45'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Edit Skills/Page_OrangeHRM/a_Logout'))

WebUI.closeBrowser()

