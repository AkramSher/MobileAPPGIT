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

Mobile.startApplication('comustuandustLatest.apk', true)

Mobile.waitForElementPresent(findTestObject('Object Repository/PcloudySamsungDeviceA72018/android.widget.Button - SIGN IN WITH UST'), 
    5)

Mobile.tap(findTestObject('Object Repository/PcloudySamsungDeviceA72018/android.widget.Button - SIGN IN WITH UST'), 0)

Mobile.setEncryptedText(findTestObject('Object Repository/PcloudySamsungDeviceA72018/android.widget.EditText'), '9PDb+GIdJbxPVV4Uk1gdQyT8Eoxjcby1', 
    0)

Mobile.tap(findTestObject('Object Repository/PcloudySamsungDeviceA72018/android.widget.Button - Next'), 0)

Mobile.setEncryptedText(findTestObject('Object Repository/PcloudySamsungDeviceA72018/android.widget.EditText (1)'), '2zaM2+EBwtQzdOfx8zu21w==', 
    0)

Mobile.tap(findTestObject('Object Repository/PcloudySamsungDeviceA72018/android.widget.Button - Sign in'), 0)

Mobile.tap(findTestObject('Object Repository/PcloudySamsungDeviceA72018/android.widget.TextView - Use a different verification option'), 
    0)

Mobile.tap(findTestObject('Object Repository/PcloudySamsungDeviceA72018/android.widget.TextView - Call me at xx xxxxxx2778'), 
    0)

