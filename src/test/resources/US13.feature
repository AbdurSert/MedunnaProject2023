@regression
Feature: US13
#  An Employee can create a new Account
#  User should create a description for the new account and it cannot be blank
#  User should provide a balance for the first time account creation as Dollar
#  User can select an account type as CHECKING, SAVING, CREDIT_CARD or INVESTING
#  Account status should be defined as ACTIVE, SUSPENDED or CLOSED
#  User can select an employee from the drop-down
#
#  Bir Çalışan yeni bir Hesap oluşturabilir
#  Kullanıcı, yeni hesap için bir açıklama oluşturmalı ve boş olamaz # bos olursa gorecegi uyariyi gormedigini teyit et
#  Kullanıcı ilk kez hesap oluştururken Dolar olarak bir bakiye sağlamalıdır.
#  Kullanıcı hesap tipi olarak CHECKING, SAVING, CREDIT_CARD or INVESTING seçebilir
#  Hesap durumu AKTİF, ASKIDA veya KAPALI olarak tanımlanmalıdır
#  Kullanıcı açılır listeden bir çalışan seçebilir

  #Bir çalışan seçilemiyor?


  @us13
  @smoke
  Scenario:  Bir Çalışan yeni bir Hesap oluşturabilir
    Given kullanıcı gmibank anasayfasına gider
    And anasayfada giris ikonuna tiklar
    And signin butonuna tiklar
    And Employee Username ve password girer, signin butonuna tiklar ve login olur
    And My Operations butonuna ardindan Manage Accounts butonuna tiklar
    When Create my account butonuna tiklar
    Then Description alanini bos birakinca uyari alir
    When Description alani icin aciklama olusturur
    And Balance alanina bir sayi girer
    And Kullanici hesap tipi olarak CHECKING, SAVING, CREDIT_CARD or INVESTING secebilir
    And Hesap durumu ACTIVE, SUSPENDED or CLOSED olarak tanimlanmalidir
    And Kullanici acilir listeden bir calisan secebilir
    And Employee signout butonuna tiklar








