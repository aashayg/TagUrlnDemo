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

WebUI.selectOptionByValue(findTestObject('Production linkedinlogin/select_Login AsStandard Package - FREEProfessional PackageEnterprise PackageService Provider (1)'), 
    '2', true)

WebUI.setText(findTestObject('Tagurln Manage Events/input_OR_txtEmail'), 'profff@gmail.com')

WebUI.setEncryptedText(findTestObject('Tagurln Manage Events/input__txtPassword'), 'xv5210b9pbsMZ1komzkxZQ==')

WebUI.click(findTestObject('Tagurln Manage Events/input__btnLogin'))

WebUI.click(findTestObject('Production linkedinlogin/span_Email Address or Password or Subscription Type entered is incorrect'))

WebUI.closeBrowser()

