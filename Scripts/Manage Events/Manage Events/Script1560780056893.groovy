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

WebUI.callTestCase(findTestCase('Login/Login'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('http://winjitstaging.cloudapp.net/Tagurin_dev/Login.aspx')

not_run: WebUI.click(findTestObject('Tagurln Manage Events/Login as'))

not_run: WebUI.waitForElementClickable(findTestObject('Tagurln Manage Events/Login as'), 10)

not_run: WebUI.selectOptionByValue(findTestObject('Production linkedinlogin/profession package'), '2', true)

not_run: WebUI.setText(findTestObject('Tagurln Manage Events/input_Email _txtUserEmail'), 'prof@gmail.com')

not_run: WebUI.setEncryptedText(findTestObject('Tagurln Manage Events/input_Password _txtUserPassword'), 'xv5210b9pbsMZ1komzkxZQ==')

not_run: WebUI.click(findTestObject('Tagurln Manage Events/input__btnLogin'))

WebUI.waitForElementNotClickable(findTestObject('Tagurln Manage Events/a_Manage Events'), 0)

WebUI.click(findTestObject('Tagurln Manage Events/a_Manage Events'))

WebUI.click(findTestObject('Tagurln Manage Events/Create button'))

WebUI.setText(findTestObject('Tagurln Manage Events/input_Event Name _ctl00ContentPlaceHolder1txtTournamentName'), 'Meetup')

WebUI.selectOptionByValue(findTestObject('Production linkedinlogin/select_Choose from listWeddingBirthdayCorporateSportsBaby ShowerPartyAfricanReligiousFarewell'), 
    'Party', true)

WebUI.setText(findTestObject('Tagurln Manage Events/textarea_Description _ctl00ContentPlaceHolder1txtDescription'), 'Meeting new people')

WebUI.setText(findTestObject('Tagurln Manage Events/input_Venue_ctl00ContentPlaceHolder1txtVenue'), 'C1/1,Street-3,Winjit Technologies,Nashik')

WebUI.setText(findTestObject('Tagurln Manage Events/input_Physical Address_ctl00ContentPlaceHolder1txtAddress'), 'Johannesburg')

WebUI.click(findTestObject('Tagurln Manage Events/td_Loading_dxic'))

WebUI.click(findTestObject('Tagurln Manage Events/td_Loading_ContentPlaceHolder1_ASPXStartDate_B-1'))

WebUI.click(findTestObject('Tagurln Manage Events/td_20'))

WebUI.click(findTestObject('Tagurln Manage Events/td_OK'))

WebUI.click(findTestObject('Tagurln Manage Events/input_Is Active_ctl00ContentPlaceHolder1btnCustomize'))

WebUI.closeBrowser()

