import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testdata.InternalData as InternalData
import com.kms.katalon.core.testdata.InternalData

String username = "pettawan09@gmail.com";
String password = "123456789"

'Open browser and navigate'
WebUI.openBrowser('')
WebUI.navigateToUrl('http://vivblind.play2pay.me/')
WebUI.maximizeWindow()
WebUI.waitForPageLoad(5)

'Input username'
WebUI.setText(findTestObject('Login_Page/input_EMAIL'), username)

'Input password'
WebUI.setText(findTestObject('Login_Page/input_password'), password)

'click submit button login'
WebUI.click(findTestObject('Button/login_submit_btn'))
WebUI.waitForPageLoad(5)

'check when login success'
checklogin = WebUI.getText(findTestObject('Home_Page/link_logout'))
WebUI.verifyMatch(checklogin, "ออกจากระบบ", false)

'Close browser'
WebUI.closeBrowser()
