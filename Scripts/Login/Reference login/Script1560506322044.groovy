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

WebUI.click(findTestObject('Production linkedinlogin/a_Login with Google'))

WebUI.setText(findTestObject('Tagurln Manage Events/input_winjitstagingcloudappnet_identifier'), 'aashayg@gmail.com')

WebUI.click(findTestObject('Production linkedinlogin/span_Next'))

WebUI.setEncryptedText(findTestObject('Tagurln Manage Events/input_Too many failed attempts_password'), 'L1qY3hy3qwrkioPvZu7jDw==')

WebUI.click(findTestObject('Production linkedinlogin/span_Next'))

WebUI.click(findTestObject('Production linkedinlogin/span_Try another way'))

WebUI.click(findTestObject('Production linkedinlogin/div_Get a verification code at  20Standard rates apply'))

WebUI.setText(findTestObject('Page_Sign in  Google accounts/input_G-_idvPin'), '')

WebUI.click(findTestObject('Production linkedinlogin/span_Next'))

WebUI.click(findTestObject('Production linkedinlogin/div_Terms_ANuIbb IdAqtf'))

WebUI.closeBrowser()

