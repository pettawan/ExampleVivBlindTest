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
import java.util.Random;

def length = 10
def pool = ['a'..'z', 'A'..'Z', 0..9, '-'].flatten()
Random random = new Random(System.currentTimeMillis())
def randomChars = (0..length-1).collect { pool[random.nextInt(pool.size())] }
def randomString = randomChars.join()

Random rn = new Random();
String randomIdCard = "";
long id = 0;
for(int i = 1; i <= 12; i++){
	randomIdCard += String.valueOf(rn.nextInt(9) + 1);
}
id = Long.parseLong(randomIdCard); 
long base = 100000000000l;
int basenow; 
int sum = 0; 
for(int i = 13; i > 1; i--) { 
	basenow = (int)Math.floor(id/base); 
	id = id - basenow*base; 
	sum += basenow*i; 
	base = base/10; 
}
int checkbit = (11-(sum%11))%10; 
randomIdCard = randomIdCard+checkbit;

String randomEmail = randomString+"@gmail.com"
String password = randomString
String name = "รันจวน"
String lastName = "หอมหวน"
String en_Name = randomString
String en_LastName = randomString
String idCard = randomIdCard
String birthday = "25/09/1991"
String religion = "พุทธ"
String educational = "ปริญญาตรี"
String career = "รับราชการ"
String address_No = "149/6"
String address_Moo = "10"
String address_Road = "สันทรายพร้าว"
//38 = เชียงใหม่
String province = "38"
//581 = สันทราย
String district = "581"
//14039 = ป่าไผ่
String subdistrict = "14039"
String address_ZipCode = "50210"
String status_Edu_Work = "กำลังทำงาน";
String address_All = "บ้าน";
String phone = "053354121";
String cell_Phone = "0901255710";
String fax = "085532111";


'Open browser and navigate'
WebUI.openBrowser('')
WebUI.navigateToUrl('http://vivblind.play2pay.me/volunteer/register')
WebUI.maximizeWindow()
WebUI.waitForPageLoad(5)

'Input username'
WebUI.setText(findTestObject('Register_Page/input_EMAIL'), randomEmail)

'Input password'
WebUI.setText(findTestObject('Register_Page/input_PASSWORD'), password)

'Input confirmat password'
WebUI.setText(findTestObject('Register_Page/input_PASSWORD_CONFIRMATION'), password)

'Input name'
WebUI.setText(findTestObject('Register_Page/input_FIRST_NAME_TH'), name)

'Input lastName'
WebUI.setText(findTestObject('Register_Page/input_LAST_NAME_TH'), lastName)

'Input en name'
WebUI.setText(findTestObject('Register_Page/input_FIRST_NAME_EN'), en_Name)

'Input en lastName'
WebUI.setText(findTestObject('Register_Page/input_LAST_NAME_EN'), en_LastName)

'Input idcard'
WebUI.setText(findTestObject('Register_Page/input_CITIZEN_ID'), idCard)

'Input birthday'
WebUI.setText(findTestObject('Register_Page/input_BIRTH_DATE'), birthday)

'Input religion'
WebUI.selectOptionByValue(findTestObject('Register_Page/select_RELIGION'), religion, true)

'Input educational'
WebUI.selectOptionByValue(findTestObject('Register_Page/select_EDUCATIONAL'), educational, true)

'Input career'
WebUI.selectOptionByValue(findTestObject('Register_Page/select_CAREER'), career, true)

'Input address no'
WebUI.setText(findTestObject('Register_Page/input_ADDRESS_NO'), address_No)

'Input address moo'
WebUI.setText(findTestObject('Register_Page/input_ADDRESS_MOO'), address_Moo)

'Input address road'
WebUI.setText(findTestObject('Register_Page/input_ADDRESS_ROAD'), address_Road)

'Input province'
WebUI.selectOptionByValue(findTestObject('Register_Page/select_ADDRESS_PROVINCE'), province, true)

'Input district'
WebUI.selectOptionByValue(findTestObject('Register_Page/select_ADDRESS_DISTRICT'), district, true)

'Input subdistrict'
WebUI.selectOptionByValue(findTestObject('Register_Page/select_ADDRESS_SUBDISTRICT'), subdistrict, true)

'Input address zipcode'
WebUI.setText(findTestObject('Register_Page/input_ADDRESS_POSTCODE'), address_ZipCode)

'Input status educational work'
WebUI.selectOptionByValue(findTestObject('Register_Page/select_STATUS_EDU_WORK'), status_Edu_Work, true)

'Input address all'
WebUI.setText(findTestObject('Register_Page/input_ADDRESS_ALL'), address_All)

'Input phone'
WebUI.setText(findTestObject('Register_Page/input_PHONE'), phone)

'Input cell phone'
WebUI.setText(findTestObject('Register_Page/input_CELL_PHONE'), cell_Phone)

'Input fax'
WebUI.setText(findTestObject('Register_Page/input_FAX'), fax)

'Click submit button'
WebUI.click(findTestObject('Button/register_submit_btn'))
WebUI.waitForPageLoad(5)

'Check the message when registration is complete'
registerMessage = WebUI.getText(findTestObject('Register_Page/message_REGISTER_COMPLETE'))
WebUI.verifyMatch(registerMessage, "ขอบคุณสำหรับการลงทะเบียนโปรดตรวจสอบที่อีเมลของท่านเพื่อทำการระบุตัวตน", false)

'Click to register Page'
WebUI.click(findTestObject('Register_Page/link_Register_Page'))
WebUI.waitForPageLoad(5)

'Input username'
WebUI.setText(findTestObject('Register_Page/input_EMAIL'), randomEmail)

'Input password'
WebUI.setText(findTestObject('Register_Page/input_PASSWORD'), password)

'Input confirmat password'
WebUI.setText(findTestObject('Register_Page/input_PASSWORD_CONFIRMATION'), password)

'Input name'
WebUI.setText(findTestObject('Register_Page/input_FIRST_NAME_TH'), name)

'Input lastName'
WebUI.setText(findTestObject('Register_Page/input_LAST_NAME_TH'), lastName)

'Input en name'
WebUI.setText(findTestObject('Register_Page/input_FIRST_NAME_EN'), en_Name)

'Input en lastName'
WebUI.setText(findTestObject('Register_Page/input_LAST_NAME_EN'), en_LastName)

'Input idcard'
WebUI.setText(findTestObject('Register_Page/input_CITIZEN_ID'), idCard)

'Input birthday'
WebUI.setText(findTestObject('Register_Page/input_BIRTH_DATE'), birthday)

'Input religion'
WebUI.selectOptionByValue(findTestObject('Register_Page/select_RELIGION'), religion, true)

'Input educational'
WebUI.selectOptionByValue(findTestObject('Register_Page/select_EDUCATIONAL'), educational, true)

'Input career'
WebUI.selectOptionByValue(findTestObject('Register_Page/select_CAREER'), career, true)

'Input address no'
WebUI.setText(findTestObject('Register_Page/input_ADDRESS_NO'), address_No)

'Input address moo'
WebUI.setText(findTestObject('Register_Page/input_ADDRESS_MOO'), address_Moo)

'Input address road'
WebUI.setText(findTestObject('Register_Page/input_ADDRESS_ROAD'), address_Road)

'Input province'
WebUI.selectOptionByValue(findTestObject('Register_Page/select_ADDRESS_PROVINCE'), province, true)

'Input district'
WebUI.selectOptionByValue(findTestObject('Register_Page/select_ADDRESS_DISTRICT'), district, true)

'Input subdistrict'
WebUI.selectOptionByValue(findTestObject('Register_Page/select_ADDRESS_SUBDISTRICT'), subdistrict, true)

'Input address zipcode'
WebUI.setText(findTestObject('Register_Page/input_ADDRESS_POSTCODE'), address_ZipCode)

'Input status educational work'
WebUI.selectOptionByValue(findTestObject('Register_Page/select_STATUS_EDU_WORK'), status_Edu_Work, true)

'Input address all'
WebUI.setText(findTestObject('Register_Page/input_ADDRESS_ALL'), address_All)

'Input phone'
WebUI.setText(findTestObject('Register_Page/input_PHONE'), phone)

'Input cell phone'
WebUI.setText(findTestObject('Register_Page/input_CELL_PHONE'), cell_Phone)

'Input fax'
WebUI.setText(findTestObject('Register_Page/input_FAX'), fax)

'Click submit button'
WebUI.click(findTestObject('Button/register_submit_btn'))
WebUI.waitForPageLoad(5)

'Check the message already id card'
alreadyIdCardMessage = WebUI.getText(findTestObject('Check_Validate_Register/vaildate_message_Already_IdCard'))
WebUI.verifyMatch(alreadyIdCardMessage, "เลขบัตรประชาชนนี้ถูกใช้งานไปแล้ว", false)

'Check the message already email'
alreadyEmailMessage = WebUI.getText(findTestObject('Check_Validate_Register/vaildate_message_Already_Email'))
WebUI.verifyMatch(alreadyEmailMessage, "อีเมลนี้ถูกใช้งานไปแล้ว", false)

'Close browser'
WebUI.closeBrowser()

