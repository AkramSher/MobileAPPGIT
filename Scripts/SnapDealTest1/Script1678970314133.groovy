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

Mobile.startApplication('C:\\Users\\191060\\Downloads\\snapdeal-online-shopping-india-7-6-5.apk', true)

Mobile.tap(findTestObject('Object Repository/SnapDealDemo/android.widget.TextView - Men'), 0)

Mobile.tap(findTestObject('Object Repository/SnapDealDemo/android.widget.TextView - Winter wear'), 0)

Mobile.getText(findTestObject('Object Repository/SnapDealDemo/android.widget.TextView - 2,599'), 0)

Mobile.swipe(5, 0, 5, 0)

Mobile.tap(findTestObject('Object Repository/SnapDealDemo/android.widget.TextView - Duke - Green Nylon Slim Fit Mens Puffer Jacket ( Pack of 1 )'), 
    0)

Mobile.tap(findTestObject('Object Repository/SnapDealDemo/android.widget.TextView - Buy Now'), 0)

Mobile.tap(findTestObject('Object Repository/SnapDealDemo/android.widget.TextView - XL'), 0)

Mobile.tap(findTestObject('Object Repository/SnapDealDemo/android.widget.TextView - Buy Now (1)'), 0)

Mobile.tap(findTestObject('Object Repository/SnapDealDemo/android.widget.TextView - CONTINUE'), 0)

Mobile.closeApplication()

