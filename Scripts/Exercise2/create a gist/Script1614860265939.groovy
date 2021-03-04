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

WebUI.callTestCase(findTestCase('Exercise2/Login github'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Gist/create gist/icon_plus'))

WebUI.click(findTestObject('Gist/create gist/submenu_New Gist'))

WebUI.setText(findTestObject('Gist/create gist/input_Filename inc extension'), 'create a gist')

WebUI.setText(findTestObject('Gist/create gist/input_content'), 'deskripsi kontent')

WebUI.click(findTestObject('Gist/create gist/dropdown_select gist'))

WebUI.click(findTestObject('Gist/create gist/dropdown_select public'))

WebUI.click(findTestObject('Gist/create gist/button_Create public gist'))

WebUI.closeBrowser()

