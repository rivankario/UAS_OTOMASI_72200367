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

WebUI.navigateToUrl('https://genesis.dutatani.id/si_petani/login.php?pesan=Mohon%20Login')

WebUI.setText(findTestObject('Object Repository/InsertPetani/Berhasil/Page_/input_ID User_id_user'), 'tester_otomasi')

WebUI.setEncryptedText(findTestObject('Object Repository/InsertPetani/Berhasil/Page_/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/InsertPetani/Berhasil/Page_/input_Password_btn btn-primary btn-lg'))

WebUI.click(findTestObject('Object Repository/InsertPetani/Berhasil/Page_/a_Pendataan Petani'))

WebUI.setText(findTestObject('Object Repository/InsertPetani/Berhasil/Page_/input_Id User_id_user (1)'), id)

WebUI.click(findTestObject('Object Repository/InsertPetani/Berhasil/Page_/input_Nama Petani_nama_petani'))

WebUI.setText(findTestObject('Object Repository/InsertPetani/Berhasil/Page_/input_Nama Petani_nama_petani'), petani)

WebUI.setText(findTestObject('InsertPetani/Berhasil/Page_/input_Tanggal Lahir_tanggal_lahir'), '090920018')

WebUI.setText(findTestObject('Object Repository/InsertPetani/Berhasil/Page_/input_Nama Istri  Suami_nama_istri'), pasangan)

WebUI.setText(findTestObject('Object Repository/InsertPetani/Berhasil/Page_/input_Alamat Petani_alamat_petani'), alamat)

WebUI.click(findTestObject('Object Repository/InsertPetani/Berhasil/Page_/div_Provinsi                               _c3df87'))

WebUI.selectOptionByValue(findTestObject('Object Repository/InsertPetani/Berhasil/Page_/select_Provinsi                            _919ea7'), 
    'JAWA TENGAH', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/InsertPetani/Berhasil/Page_/select_KabupatenKABUPATEN BANJARNEGARAKABUP_53d19e'), 
    'KABUPATEN PATI', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/InsertPetani/Berhasil/Page_/select_KecamatanSUKOLILOKAYENTAMBAKROMOWINO_a51879'), 
    'GUNUNG WUNGKAL', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/InsertPetani/Berhasil/Page_/select_Desa  KelurahanBANCAKGADUGAJIHANGILI_29c897'), 
    'BANCAK', true)

WebUI.setText(findTestObject('Object Repository/InsertPetani/Berhasil/Page_/input_Nomor Telepon_nomor_telpon'), telepon)

WebUI.selectOptionByValue(findTestObject('Object Repository/InsertPetani/Berhasil/Page_/select_SD                                  _d31312'), 
    'SMA', true)

WebUI.setText(findTestObject('Object Repository/InsertPetani/Berhasil/Page_/input_Jumlah Lahan_jml_lahan'), jml_lahan)

WebUI.setText(findTestObject('Object Repository/InsertPetani/Berhasil/Page_/input_Jumlah Tanggungan_jumlah_tanggungan'), 
    jml_tanggungan)

WebUI.setText(findTestObject('Object Repository/InsertPetani/Berhasil/Page_/input_Jumlah Tenaga Kerja Musiman_jml_tng_k_49b205'), 
    jml_tenagakerja)

WebUI.setText(findTestObject('Object Repository/InsertPetani/Berhasil/Page_/input_Email_email'), email)

WebUI.setText(findTestObject('Object Repository/InsertPetani/Berhasil/Page_/textarea_Deskripsi Keahlian_deskripsi_keahlian'), 
    keahlian)

WebUI.click(findTestObject('Object Repository/InsertPetani/Berhasil/Page_/label_Aktif'))

WebUI.click(findTestObject('Object Repository/InsertPetani/Berhasil/Page_/label_Laki-laki'))

WebUI.click(findTestObject('Object Repository/InsertPetani/Berhasil/Page_/input_Password_btn btn-primary btn-lg'))

WebUI.setText(findTestObject('Object Repository/InsertPetani/Berhasil/Page_/input_Cetak Daftar_input_cari'), 'Petani Biasa')

WebUI.click(findTestObject('Object Repository/InsertPetani/Berhasil/Page_/input_Cetak Daftar_cari'))

WebUI.comment('Data Ditemukan')

WebUI.closeBrowser()

