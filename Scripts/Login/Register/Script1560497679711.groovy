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

WebUI.navigateToUrl('http://winjitstaging.cloudapp.net/Tagurin_dev/Login.aspx')

WebUI.delay(10)

WebUI.click(findTestObject('Tagurln Manage Events/input_Not Registered Yet _BtnSignup'))

WebUI.setText(findTestObject('Tagurln Manage Events/input_First Name _txtName'), 'Aashay ')

WebUI.setText(findTestObject('Tagurln Manage Events/input_Last Name _txtLastName'), 'Gondane')

WebUI.setText(findTestObject('Tagurln Manage Events/input_Email _txtUserEmail'), 'aashayg@gmail.com')

WebUI.waitForElementClickable(findTestObject('Production linkedinlogin/DDL'), 20)

WebUI.click(findTestObject('Production linkedinlogin/DDL'))

WebUI.click(findTestObject('Tagurln Manage Events/Drop-down select'))

not_run: WebUI.selectOptionByValue(findTestObject('Tagurln Manage Events/Drop-down select'), 'Local outdoor advertising', true)

not_run: WebUI.click(findTestObject('Production linkedinlogin/DDL'))

WebUI.setEncryptedText(findTestObject('Tagurln Manage Events/input_Password _txtUserPassword'), 'dzssRMxSYm/kqSYU9b3F0w==')

WebUI.setEncryptedText(findTestObject('Tagurln Manage Events/input_Confirm Password _txtRetypePassword'), 'dzssRMxSYm/kqSYU9b3F0w==')

WebUI.click(findTestObject('Production linkedinlogin/Signup'))

WebUI.click(findTestObject('Production linkedinlogin/span_Log Out'))

WebUI.click(findTestObject('Tagurln Manage Events/button_confirm'))

