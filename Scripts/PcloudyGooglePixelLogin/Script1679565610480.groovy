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

Mobile.tap(findTestObject('Object Repository/PcloudyGooglePixel7/android.widget.Button - SIGN IN WITH UST'), 0)

Mobile.setText(findTestObject('Object Repository/PcloudyGooglePixel7/android.widget.EditText'), '191060@ust-global.com', 
    0)

Mobile.tap(findTestObject('Object Repository/PcloudyGooglePixel7/android.widget.Button - Next'), 0)

Mobile.setText(findTestObject('Object Repository/PcloudyGooglePixel7/android.widget.EditText (1)'), '2023@24Lpa', 0)

Mobile.tap(findTestObject('Object Repository/PcloudyGooglePixel7/android.widget.Button - Sign in'), 0)

Mobile.tap(findTestObject('Object Repository/PcloudyGooglePixel7/android.widget.TextView - Use a different verification option'), 
    0)

Mobile.tap(findTestObject('Object Repository/PcloudyGooglePixel7/android.widget.TextView - Call me at xx xxxxxx2778'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/PcloudyGooglePixel7/android.widget.TextView - TESTING'), 
    120)

Mobile.tap(findTestObject('Object Repository/PcloudyGooglePixel7/android.widget.TextView - TESTING'), 0)

Mobile.setText(findTestObject('Object Repository/PcloudyGooglePixel7/android.widget.EditText (2)'), 'U23719', 0)

Mobile.tap(findTestObject('Object Repository/PcloudyGooglePixel7/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/PcloudyGooglePixel7/android.widget.Button - OK (1)'), 0)

Mobile.tap(findTestObject('Object Repository/PcloudyGooglePixel7/android.widget.Button - OK (2)'), 0)

Mobile.tap(findTestObject('Object Repository/PcloudyGooglePixel7/android.widget.TextView - HOME'), 0)

Mobile.tap(findTestObject('Object Repository/PcloudyGooglePixel7/android.widget.TextView - TIME'), 0)

Mobile.tap(findTestObject('Object Repository/PcloudyGooglePixel7/android.widget.TextView - TIME SHEET'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/PcloudyGooglePixel7/android.widget.TextView - ABSENCE HISTORY'), 0)

Mobile.takeScreenshot('C:\\Users\\191060\\AppData\\Local\\Temp\\screenshot4376691654659613357.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/PcloudyGooglePixel7/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/PcloudyGooglePixel7/android.widget.TextView - PEOPLE FINDER'), 0)

Mobile.setText(findTestObject('Object Repository/PcloudyGooglePixel7/android.widget.EditText - Employee ID'), '191060', 
    0)

Mobile.tap(findTestObject('Object Repository/PcloudyGooglePixel7/android.widget.Button - SEARCH'), 0)

Mobile.closeApplication()

