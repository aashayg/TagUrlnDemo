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

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://winjitstaging.cloudapp.net/Tagurin_dev/Login.aspx')

WebUI.waitForElementClickable(findTestObject('Tagurln Manage Events/Login as'), 10)

WebUI.click(findTestObject('Tagurln Manage Events/Login as'))

WebUI.waitForElementClickable(findTestObject('Production linkedinlogin/profession package'), 10)

WebUI.selectOptionByValue(findTestObject('Production linkedinlogin/select_Login AsStandard Package - FREEProfessional PackageEnterprise PackageService Provider (1)'), 
    '2', true)

WebUI.click(findTestObject('Tagurln Manage Events/input_OR_txtEmail'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Tagurln Manage Events/input_OR_txtEmail'), 'prof@gmail.com')

WebUI.click(findTestObject('Tagurln Manage Events/input__txtPassword'))

WebUI.setEncryptedText(findTestObject('Tagurln Manage Events/input__txtPassword'), 'xv5210b9pbsMZ1komzkxZQ==')

WebUI.click(findTestObject('Tagurln Manage Events/input__btnLogin'))

WebUI.waitForElementNotClickable(findTestObject('Tagurln Manage Events/a_Manage Events'), 10)

not_run: WebUI.verifyElementClickable(findTestObject('Tagurln Manage Events/a_Manage Events'))

WebUI.waitForPageLoad(10)

not_run: WebUI.waitForElementClickable(findTestObject('Tagurln Manage Events/a_Manage Events'), 10)

WebUI.click(findTestObject('Tagurln Manage Events/a_Manage Events'))

WebUI.waitForPageLoad(10)

not_run: WebUI.navigateToUrl('http://winjitstaging.cloudapp.net/Tagurin_dev/UI/TournamentDetails.aspx')

WebUI.waitForElementNotClickable(findTestObject('Tagurln Manage Events/input_Manage Events_ctl00ContentPlaceHolder1btnAdd'), 
    10)

WebUI.click(findTestObject('Tagurln Manage Events/input_Event Name _ctl00ContentPlaceHolder1txtTournamentName'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Tagurln Manage Events/Event text'), 'Fall Out Boy')

WebUI.selectOptionByValue(findTestObject('Production linkedinlogin/select_Choose from listWeddingBirthdayCorporateSportsBaby ShowerPartyAfricanReligiousFarewell'), 
    'Birthday', true)

WebUI.setText(findTestObject('Tagurln Manage Events/textarea_Description _ctl00ContentPlaceHolder1txtDescription'), 'Birthday party')

WebUI.click(findTestObject('Production linkedinlogin/img_Loading_ContentPlaceHolder1_ASPXStartDate_B-1Img'))

WebUI.click(findTestObject('Tagurln Manage Events/td_19'))

WebUI.click(findTestObject('Tagurln Manage Events/td_OK'))

WebUI.setText(findTestObject('Tagurln Manage Events/input_Venue_ctl00ContentPlaceHolder1txtVenue'), 'Winjit Technologies')

WebUI.click(findTestObject('Tagurln Manage Events/input_Is Active_ctl00ContentPlaceHolder1btnCustomize'))

WebUI.closeBrowser()

