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

import org.junit.After
import org.openqa.selenium.Keys as Keys

'Open browser and navigate'
WebUI.openBrowser('')
WebUI.navigateToUrl('http://vivblind.play2pay.me/volunteer/register')
WebUI.maximizeWindow()
WebUI.waitForPageLoad(5)

'Click submit button'
WebUI.focus(findTestObject('Button/register_submit_btn'))
WebUI.click(findTestObject('Button/register_submit_btn'))
WebUI.waitForPageLoad(5)

'Vaildate message after record'
emailMessage = WebUI.getText(findTestObject('Check_Validate_Register/vaildate_message_Email'))
WebUI.verifyMatch(emailMessage, "กรุณากรอกอีเมลที่ใช้งานจริงเพื่อให้ทางมูลนิธิติดต่อกลับได้", false)

usernameMessage = WebUI.getText(findTestObject('Check_Validate_Register/vaildate_message_UserName'))
WebUI.verifyMatch(usernameMessage, "กรุณากรอกรหัสสมาชิก", false)

passwordMessage = WebUI.getText(findTestObject('Check_Validate_Register/vaildate_message_Password'))
WebUI.verifyMatch(passwordMessage, "กรุณากรอกรหัสผ่าน", false)

confirmPasswordMessage = WebUI.getText(findTestObject('Check_Validate_Register/vaildate_message_ConfirmPassword'))
WebUI.verifyMatch(confirmPasswordMessage, "กรุณายืนยันรหัสผ่านของท่าน", false)

nameMessage = WebUI.getText(findTestObject('Check_Validate_Register/vaildate_message_Name'))
WebUI.verifyMatch(nameMessage, "กรุณากรอกชื่อ", false)

lastNameMessage = WebUI.getText(findTestObject('Check_Validate_Register/vaildate_message_LastNames'))
WebUI.verifyMatch(lastNameMessage, "กรุณากรอกนามสกุล", false)

enNameMessage = WebUI.getText(findTestObject('Check_Validate_Register/vaildate_message_EnName'))
WebUI.verifyMatch(enNameMessage, "กรุณากรอกชื่อภาษาอังกฤษ", false)

enLastNameMessage = WebUI.getText(findTestObject('Check_Validate_Register/vaildate_message_EnLastNames'))
WebUI.verifyMatch(enLastNameMessage, "กรุณากรอกนามสกุลภาษาอังกฤษ", false)

idCardMessage = WebUI.getText(findTestObject('Check_Validate_Register/vaildate_message_IDCard'))
WebUI.verifyMatch(idCardMessage, "กรุณากรอกเลขบัตรประชาชน", false)

religionMessage = WebUI.getText(findTestObject('Check_Validate_Register/vaildate_message_Religion'))
WebUI.verifyMatch(religionMessage, "กรุณาเลือกศาสนา", false)

educationMessage = WebUI.getText(findTestObject('Check_Validate_Register/vaildate_message_Education'))
WebUI.verifyMatch(educationMessage, "กรุณาเลือกระดับการศึกษา", false)

careerMessage = WebUI.getText(findTestObject('Check_Validate_Register/vaildate_message_Career'))
WebUI.verifyMatch(careerMessage, "กรุณาเลือกอาชีพ", false)

numberMessage = WebUI.getText(findTestObject('Check_Validate_Register/vaildate_message_Number'))
WebUI.verifyMatch(numberMessage, "กรุณากรอกเลขที่", false)

provinceMessage = WebUI.getText(findTestObject('Check_Validate_Register/vaildate_message_Province'))
WebUI.verifyMatch(provinceMessage, "กรุณาเลือกจังหวัด", false)

districtMessage = WebUI.getText(findTestObject('Check_Validate_Register/vaildate_message_District'))
WebUI.verifyMatch(districtMessage, "กรุณาเลือกอำเภอ", false)

placeMessage = WebUI.getText(findTestObject('Check_Validate_Register/vaildate_message_Place'))
WebUI.verifyMatch(placeMessage, "กรุณาเลือกตำบล", false)

zipCodeMessage = WebUI.getText(findTestObject('Check_Validate_Register/vaildate_message_ZipCode'))
WebUI.verifyMatch(zipCodeMessage, "กรุณากรอกรหัสไปรษณีย์", false)

statusMessage = WebUI.getText(findTestObject('Check_Validate_Register/vaildate_message_Status'))
WebUI.verifyMatch(statusMessage, "กรุณาเลือกสถานะ การศึกษา,ทำงาน", false)

phoneNumberMessage = WebUI.getText(findTestObject('Check_Validate_Register/vaildate_message_PhoneNumber'))
WebUI.verifyMatch(phoneNumberMessage, "กรุณากรอกเบอร์มือถือ", false)

'Close browser'
WebUI.closeBrowser()