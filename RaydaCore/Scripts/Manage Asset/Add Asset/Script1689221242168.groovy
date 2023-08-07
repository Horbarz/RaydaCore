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

WebUI.callTestCase(findTestCase('Login/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/AddAsset_OR/Page_Rayda/h3_Hello Obaloluwa'), 'Hello Obaloluwa!')

WebUI.click(findTestObject('Object Repository/AddAsset_OR/Page_Rayda/a_See all assets'))

WebUI.click(findTestObject('Object Repository/AddAsset_OR/Page_Rayda/button_Add asset'))

WebUI.setText(findTestObject('Object Repository/AddAsset_OR/Page_Rayda/input_Serial Number_serial_number'), GlobalVariable.SerialNumber)

WebUI.click(findTestObject('AddAsset_OR/Page_Rayda/select_asset_make'))

WebUI.click(findTestObject('Object Repository/AddAsset_OR/Page_Rayda/div_HP'))

WebUI.click(findTestObject('AddAsset_OR/Page_Rayda/select_asset_model'))

WebUI.click(findTestObject('Object Repository/AddAsset_OR/Page_Rayda/div_Envy110'))

WebUI.setText(findTestObject('Object Repository/AddAsset_OR/Page_Rayda/input_Purchase Price_purchase_price'), '300000')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddAsset_OR/Page_Rayda/select_Please select currencyADB Unit Of Ac_37609f'), 
    'NGN', false)

WebUI.setText(findTestObject('Object Repository/AddAsset_OR/Page_Rayda/input_Purchase Date_purchase_date'), '01/03/2020')

WebUI.click(findTestObject('AddAsset_OR/Page_Rayda/select_asset_vendor'))

WebUI.click(findTestObject('Object Repository/AddAsset_OR/Page_Rayda/div_Jumia'))

WebUI.click(findTestObject('Object Repository/AddAsset_OR/Page_Rayda/div_Select'))

WebUI.click(findTestObject('Object Repository/AddAsset_OR/Page_Rayda/div_Laptop'))

WebUI.selectOptionByValue(findTestObject('Object Repository/AddAsset_OR/Page_Rayda/select_Select yes if item is insuredNoYes'), 
    'no', true)

WebUI.click(findTestObject('AddAsset_OR/Page_Rayda/select_asset_location'))

WebUI.click(findTestObject('Object Repository/AddAsset_OR/Page_Rayda/div_VI'))

WebUI.selectOptionByValue(findTestObject('Object Repository/AddAsset_OR/Page_Rayda/select_Select asset typeComputer EquipmentF_9b6c70'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/AddAsset_OR/Page_Rayda/input_Next maintenance date_form-control fl_69f858'))

WebUI.setText(findTestObject('Object Repository/AddAsset_OR/Page_Rayda/input_Next maintenance date_form-control fl_69f858'), 
    '2023-07-13')

WebUI.selectOptionByValue(findTestObject('Object Repository/AddAsset_OR/Page_Rayda/select_Select asset statusDefectiveWorking _559757'), 
    'working perfectly', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddAsset_OR/Page_Rayda/select_Please selectAnnuallyBi-WeeklyMonthl_0acacb'), 
    'Annually', true)

WebUI.click(findTestObject('Object Repository/AddAsset_OR/Page_Rayda/input__asset_image'))

WebUI.click(findTestObject('AddAsset_OR/Page_Rayda/select_asset_personnel'))

WebUI.click(findTestObject('Object Repository/AddAsset_OR/Page_Rayda/div_Obaloluwa Abioye'))

WebUI.click(findTestObject('Object Repository/AddAsset_OR/Page_Rayda/input_Cancel_smallModal'))

WebUI.verifyElementText(findTestObject('Object Repository/AddAsset_OR/Page_Rayda/div_You have successfully added an asset'), 
    'You have successfully added an asset')

WebUI.verifyTextPresent(GlobalVariable.SerialNumber, false)

WebUI.callTestCase(findTestCase('Login/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

