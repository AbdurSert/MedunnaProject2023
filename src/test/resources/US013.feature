Feature: US013
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


  @us013
  @smoke
  Scenario:  Bir Çalışan yeni bir Hesap oluşturabilir
    Given kullanıcı gmibank anasayfasına gider
    And anasayfada giris ikonuna tiklar
    And signin butonuna tiklar
    And Employee Username ve password girer, signin butonuna tiklar ve login olur
    And My Operations butonuna ardindan Manage Accounts butonuna tiklar
    When Create my account butonuna tiklar
    Then Description alani icin aciklama olusturur
    And Balance alanina bir sayi girer
    And Kullanici hesap tipi olarak CHECKING, SAVING, CREDIT_CARD or INVESTING secebilir
    And Hesap durumu ACTIVE, SUSPENDED or CLOSED olarak tanimlanmalidir
    And Kullanici acilir listeden bir calisan secebilir
    And Employee signout butonuna tiklar

#  Senaryo: Yeni bir hesap oluşturma
#  Verilen gmibank.com sitesi açılır
#  Kullanıcı "Çalışan Girişi" sayfasına gider
#  Kullanıcı hesap oluşturma sayfasına gider
#  Kullanıcı yeni hesap için bir açıklama girer
#  Kullanıcı ilk hesap bakiyesini (Dolar cinsinden) girer
#  Kullanıcı hesap türünü seçer (CHECKING, SAVING, CREDIT_CARD veya INVESTING)
#  Kullanıcının hesap durumunu belirtir (ACTIVE, SUSPENDED veya CLOSED)
#  Kullanıcı açılır listeden bir çalışan seçer
#  Kullanıcı yeni hesabı oluşturur
#  Başarılı bir mesaj görüntülenir
#  Kullanıcı yeni hesabın hesap bilgilerini kontrol eder ve doğru şekilde oluşturulduğundan emin olur
#
#  Bu senaryo, bir Çalışanın yeni bir hesap oluşturmak için belirtilen
#  kabul kriterlerini karşılayıp karşılamadığını kontrol eder.
#  Senaryo, kullanıcının yeni hesap bilgilerini
#  doğru şekilde oluşturmasını, hesap türünü, hesap durumunu
#  ve çalışanın adını belirlemesini içerir.
#  Ayrıca, kullanıcının yeni hesabın bilgilerini doğru şekilde
#  kontrol etmesini sağlar.







