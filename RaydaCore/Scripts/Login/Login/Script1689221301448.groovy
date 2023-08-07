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

WebUI.navigateToUrl('https://portal.staging.rayda.co/login')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/AddAsset_OR/Page_Rayda/button_Sign in'))

WebUI.verifyElementText(findTestObject('Object Repository/AddAsset_OR/Page_Rayda/div_email is required'), 'email is required!')

WebUI.setText(findTestObject('Object Repository/AddAsset_OR/Page_Rayda/input_Email_email'), 'obaloluwa.peter@rayda.co')

WebUI.setEncryptedText(findTestObject('Object Repository/AddAsset_OR/Page_Rayda/input_Forgot Password_password'), 'MHSUC33hkPm2bSZlDqbkKg==')

WebUI.click(findTestObject('Object Repository/AddAsset_OR/Page_Rayda/i_Forgot Password_bx bx-hide'))

WebUI.click(findTestObject('Object Repository/AddAsset_OR/Page_Rayda/input_Forgot Password_remember-me'))

WebUI.click(findTestObject('Object Repository/AddAsset_OR/Page_Rayda/button_Sign in'))

