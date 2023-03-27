import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://login.zscaler.net/smsamlq?urlosfc=origurl%3Dhttps%253A%252F%252Flogin%252derwh%252dtest%252dsaasfaprod1%252efa%252eocs%252eoraclecloud%252ecom%252f%26_ordtok%3D5qZ3WVRsbqhjPr3fMLp3tJ3N7s&urlodmn=https%253A%252F%252Flogin%252derwh%252dtest%252dsaasfaprod1%252efa%252eocs%252eoraclecloud%252ecom%252f&saml_id=sBHrLVZDkQS3H&samlidp=0000000000000000&jscript=1set')

WebUI.setText(findTestObject('Object Repository/Fusion Absence/Page_Sign in to your account/input_Sign in_loginfmt'), '191060@ust-global.com')

WebUI.click(findTestObject('Object Repository/Fusion Absence/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Fusion Absence/Page_Acceptable Usage Policy/input_Corporate Internet Usage Policy_button'))

WebUI.setText(findTestObject('Object Repository/Fusion Absence/Page_Sign In/input_User ID_userid'), '157637')

WebUI.setEncryptedText(findTestObject('Object Repository/Fusion Absence/Page_Sign In/input_Password_password'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Fusion Absence/Page_Sign In/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Fusion Absence/Page_Welcome/a_Loading_pt1_UIScil1u'))

WebUI.click(findTestObject('Object Repository/Fusion Absence/Page_Oracle Fusion Cloud Applications/a_Add Absence'))

WebUI.click(findTestObject('Object Repository/Fusion Absence/Page_Add Absence - Oracle Fusion Cloud Appl_ec902f/a_CreateAbsenceType__FOpt1_FOr10_FONSr20MAn_32819f'))

WebUI.click(findTestObject('Object Repository/Fusion Absence/Page_Add Absence - Oracle Fusion Cloud Appl_ec902f/div_Bereavement Leave'))

WebUI.click(findTestObject('Object Repository/Fusion Absence/Page_Add Absence - Oracle Fusion Cloud Appl_ec902f/a_Press down arrow to access Calendar__FOpt_85515a'))

WebUI.click(findTestObject('Object Repository/Fusion Absence/Page_Add Absence - Oracle Fusion Cloud Appl_ec902f/td_15'))

WebUI.setText(findTestObject('Object Repository/Fusion Absence/Page_Add Absence - Oracle Fusion Cloud Appl_ec902f/textarea_Comments__FOpt1_FOr10_FONSr20MAnt2_af6923'), 
    'TEST')

WebUI.click(findTestObject('Object Repository/Fusion Absence/Page_Add Absence - Oracle Fusion Cloud Appl_ec902f/span_Submit'))

WebUI.click(findTestObject('Object Repository/Fusion Absence/Page_Oracle Fusion Cloud Applications/a_Existing Absences'))

WebUI.click(findTestObject('Object Repository/Fusion Absence/Page_Existing Absences - Oracle Fusion Clou_b990e7/img_Scheduled__FOpt1_FOr10_FONSr20MAnt20r10_1d250d'))

WebUI.click(findTestObject('Object Repository/Fusion Absence/Page_Existing Absences - Oracle Fusion Clou_b990e7/button_Delete'))

WebUI.click(findTestObject('Object Repository/Fusion Absence/Page_Existing Absences - Oracle Fusion Clou_b990e7/svg_Done'))

WebUI.click(findTestObject('Object Repository/Fusion Absence/Page_Oracle Fusion Cloud Applications/span_2'))

WebUI.click(findTestObject('Object Repository/Fusion Absence/Page_Oracle Fusion Cloud Applications/button_Dismiss'))

WebUI.click(findTestObject('Object Repository/Fusion Absence/Page_Oracle Fusion Cloud Applications/div_Good afternoon, sugguna Bk'))

WebUI.click(findTestObject('Object Repository/Fusion Absence/Page_Oracle Fusion Cloud Applications/img_Loading_pt1_UIScmil2u'))

WebUI.click(findTestObject('Object Repository/Fusion Absence/Page_Oracle Fusion Cloud Applications/a_Sign Out'))

WebUI.click(findTestObject('Object Repository/Fusion Absence/Page_Single Sign-Off consent/button_Confirm'))

WebUI.closeBrowser()

