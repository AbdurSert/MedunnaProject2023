@regression
Feature: US13
 #Bir çalışan seçilemiyor?

  Background: Bir Çalışan yeni bir Hesap oluşturabilir
    Given kullanıcı gmibank anasayfasına gider
    And anasayfada giris ikonuna tiklar
    And signin butonuna tiklar
    And Employee Username ve password girer, signin butonuna tiklar ve login olur
    And My Operations butonuna ardindan Manage Accounts butonuna tiklar
    When Create a new account butonuna tiklar

  Scenario:  Kullanici yeni hesap için bir aciklama olusturmali ve aciklama bos olamaz
    Then Description alanini bos birakinca uyari alir


  Scenario:  Kullanıcı hesap tipi olarak CHECKING, SAVING, CREDIT_CARD or INVESTING seçebilir
    When Description alani icin aciklama olusturur
    And Balance alanina bir sayi girer
    And Kullanici hesap tipi olarak  CREDIT_CARD  secer
    Then Hesap tipini dogrular


  Scenario: Hesap durumu AKTİF, ASKIDA veya KAPALI olarak tanımlanmalıdır
    When Hesap durumu SUSPENDED olarak tanimlar
    Then Hesap durumunu dogrular


  Scenario: Kullanıcı açılır listeden bir çalışan seçebilir
    And Kullanici acilir listeden bir calisan secebilir






