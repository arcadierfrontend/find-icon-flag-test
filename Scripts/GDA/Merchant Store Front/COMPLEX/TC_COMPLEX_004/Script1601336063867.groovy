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

WebUI.callTestCase(findTestCase('UTILITIES/COVID19/Buyer Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('homepage_search/input_search'), 'item1600990526')

WebUI.click(findTestObject('homepage_search/btn_search'))

WebUI.click(findTestObject('nav_to_storefront/item_name'))

//WebUI.switchToWindowIndex(1)
WebUI.click(findTestObject('nav_to_storefront/seller_name'))

WebUI.setText(findTestObject('nav_to_storefront/input_search'), 'item1600990526')

WebUI.click(findTestObject('nav_to_storefront/btn_search'))

WebUI.verifyElementNotPresent(findTestObject('nav_to_storefront/find_flag'), 0)

