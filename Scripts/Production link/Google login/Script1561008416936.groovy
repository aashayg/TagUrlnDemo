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

WebUI.navigateToUrl('https://www.tagurin.co.za/Login.aspx')

WebUI.selectOptionByValue(findTestObject('Object Repository/Production linkedinlogin/select_Login AsStandard Package - FREEProfessional PackageEnterprise PackageService Provider'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Production linkedinlogin/a_Login with LinkedIn'))

WebUI.setText(findTestObject('Object Repository/Production linkedinlogin/input_Welcome Back_session_key'), 'aashaygondane@gmail.com')

WebUI.click(findTestObject('Object Repository/Production linkedinlogin/label_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Production linkedinlogin/input_Welcome Back_session_password'), 
    'L1qY3hy3qwrkioPvZu7jDw==')

WebUI.click(findTestObject('Object Repository/Production linkedinlogin/button_Sign in'))

not_run: WebUI.click(findTestObject('Object Repository/Production linkedinlogin/button_Allow'))

WebUI.closeBrowser()

