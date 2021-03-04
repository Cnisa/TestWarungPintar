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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.ebayURL)

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Ebay/Home page/link_Electronics'))

WebUI.delay(3)

WebUI.click(findTestObject('Ebay/Home page/link_Cell phones and accessories'))

WebUI.delay(3)

WebUI.click(findTestObject('Ebay/Smartphone And Accessories page/a_Cell Phones Smartphones'))

WebUI.delay(3)

WebUI.click(findTestObject('Ebay/Left Navigate Smartphone And Accessories page/link_More Refinements'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Ebay/Left Navigate Smartphone And Accessories page/tab_Screen Size'), FailureHandling.STOP_ON_FAILURE)

WebUI.check(findTestObject('Ebay/Left Navigate Smartphone And Accessories page/cbx_5.0 - 5.4 in'))

WebUI.click(findTestObject('Ebay/Left Navigate Smartphone And Accessories page/tab_Price'))

WebUI.setText(findTestObject('Ebay/Left Navigate Smartphone And Accessories page/Input_Min'), '2000000')

WebUI.setText(findTestObject('Ebay/Left Navigate Smartphone And Accessories page/input_Max'), '5000000')

WebUI.click(findTestObject('Ebay/Left Navigate Smartphone And Accessories page/tab_Item Location'))

WebUI.click(findTestObject('Ebay/Left Navigate Smartphone And Accessories page/rad_USOnly'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Ebay/Left Navigate Smartphone And Accessories page/button_Apply'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('Ebay/Verifikasi filter/cbx_resultScreenSize'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Ebay/Verifikasi filter/input_min result'))

WebUI.verifyElementVisible(findTestObject('Ebay/Verifikasi filter/input_max result'))

WebUI.verifyElementVisible(findTestObject('Ebay/Verifikasi filter/rad_checkItemLocation'))

WebUI.closeBrowser()

