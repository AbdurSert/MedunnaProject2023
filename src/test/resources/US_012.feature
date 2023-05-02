@US012
Feature: Calisan, musteri sayfasini yonetebilir

  Background:
    Given Kullanici anasayfaya yonlenir
    And kullanici profil menusune tiklar
    And kullanici Sign In linkine tiklar
    And kullanici Employee olarak giris yapar
    And kullanici my operations linkinden manage customer modulune gider

  @US012_AC01
  Scenario: Tum musteri bilgileri, musteri yonetme modulunde "Ad, Soyad, Middle Initial, E-Posta, Cep Telefon Numarasi,
  Telefon Numarasi, Adres ve Olusturma Tarihi basliklari goruntulenir

    Then Ad, Soyad, Middle Initial, E-Posta, Cep telefon numarasi, Telefon Numarasi, Adres ve Tarih olusturma basliklarini goruntulenir
    And Employee hesaptan cikis yapilir

  @US012_AC02/1
  Scenario: Musteri sayfasindaki View(Goruntule) secengi goruntulenir
    Then kullanici view secenegini goruntuler
    And Employee hesaptan cikis yapilir

  @US012_AC02/2
  Scenario: Goruntulenen musteri sayfasinda Edit(Duzenle) secenegi goruntulenir
    Then kullanici view sayfasinda edit butonunu goruntuler
    And Employee hesaptan cikis yapilir

  @US012_AC03/1
  Scenario:Tum musteri bilgilerinin dolduralabilecegi Duzenle dugmesi olmalidir
    Then kullanici manage customer modulunde Duzenle secenegini gorur
    And Employee hesaptan cikis yapilir

  @US012_AC01/2
    Scenario: Duzenle butonu tikladiktan sonra sayfaya yonlendirilir
    When kullanici duzenle butonuna tiklar
    Then kullanici Creat or edit a Customer mesajini gorur
    And Employee hesaptan cikis yapilir

  @US012_AC04
  Scenario: Musteri bilgileri Duzenle sayfasinda guncellenebilir
    And kullanici edit butonuna tiklar
    And kullanici guncel e-posta, adres ve telefon numarasi bilgilerini girer
    When kullanici Save tusunu tiklar
    Then kullanici guncel bilgiler kaydedildi mesajini gorur
    And Employee hesaptan cikis yapilir

  @US012_AC05
  Scenario: Kullanici sistemden musteriyi silmek ister, ama "Silme isleminden emin misiniz?" mesaji gorur
    And kullanici musteri sil tusuna tiklar
    Then Silme islemini dogrulama mesajini gorur






