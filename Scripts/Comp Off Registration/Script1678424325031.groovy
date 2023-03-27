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

Mobile.startApplication('C:\\Users\\191060\\Downloads\\com.ust.uandust (3).apk', true)

Mobile.tap(findTestObject('Object Repository/Absence Request/android.widget.Button - LOGIN WITH UST'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Absence Request/android.widget.EditText'), 5)

Mobile.sendKeys(findTestObject('Object Repository/Absence Request/android.widget.EditText'), '191060@ust-global.com')

Mobile.tap(findTestObject('Object Repository/Absence Request/android.widget.Button - Next'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Absence Request/android.widget.EditText (1)'), '2023@24Lpa', FailureHandling.STOP_ON_FAILURE)

'Sign In'
Mobile.tap(findTestObject('Object Repository/Absence Request/android.widget.Button - Sign in'), 0)

'OTP'
Mobile.tap(findTestObject('Object Repository/Absence Request/android.widget.Button - Sign in (1)'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Absence Request/android.widget.ImageButton'), 120)

Mobile.tap(findTestObject('Object Repository/Absence Request/android.widget.ImageButton'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Absence Request/android.widget.TextView - TESTING'), 5)

Mobile.tap(findTestObject('Object Repository/Absence Request/android.widget.TextView - TESTING'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Absence Request/android.widget.EditText (2)'), 'U23719')

Mobile.tap(findTestObject('Object Repository/Absence Request/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Absence Request/android.widget.Button - OK (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Absence Request/android.widget.Button - OK (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Absence Request/android.widget.TextView - HOME'), 0)

Mobile.tap(findTestObject('Object Repository/Absence Request/android.widget.TextView - TIME'), 0)

Mobile.closeApplication()

