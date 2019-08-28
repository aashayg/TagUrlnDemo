import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.waitForPageLoad(20)

WebUI.navigateToUrl('http://winjitstaging.cloudapp.net/Tagurin_dev/Login.aspx')

WebUI.click(findTestObject('Tagurln Manage Events/input_Not Registered Yet _BtnSignup'))

WebUI.setText(findTestObject('Tagurln Manage Events/input_First Name _txtName'), 'Aashay')

WebUI.setText(findTestObject('Tagurln Manage Events/input_Last Name _txtLastName'), 'Gondane')

WebUI.setText(findTestObject('Tagurln Manage Events/input_Email _txtUserEmail'), 'aashaygondane@gmail.com')

WebUI.waitForElementVisible(findTestObject('Production linkedinlogin/DDL'), 20)

WebUI.click(findTestObject('Production linkedinlogin/DDL'))

WebUI.waitForElementClickable(findTestObject('Tagurln Manage Events/Admin'), 20)

WebUI.click(findTestObject('Tagurln Manage Events/Admin'))

not_run: WebUI.acceptAlert()

not_run: WebUI.selectOptionByValue(findTestObject('Production linkedinlogin/select_--Select--AdminFriend or ColleagueSocial MediaLocal outdoor advertisingFound your website on GoogleOthers'), 
    'Found your website on Google', true)

WebUI.setEncryptedText(findTestObject('Tagurln Manage Events/input_Password _txtUserPassword'), 'dzssRMxSYm/kqSYU9b3F0w==')

WebUI.setEncryptedText(findTestObject('Tagurln Manage Events/input_Confirm Password _txtRetypePassword'), 'dzssRMxSYm/kqSYU9b3F0w==')

WebUI.click(findTestObject('Production linkedinlogin/Signup'))

not_run: WebUI.click(findTestObject('Tagurln Manage Events/input_Password and Password Confirmation do not match_btnRegister'))

not_run: WebUI.click(findTestObject('Production linkedinlogin/span_Email already exists'))

