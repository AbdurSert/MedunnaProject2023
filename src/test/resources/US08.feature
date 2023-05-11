@regression
Feature: US08
#  Password segment on Homepage should be editable
#  Ana Sayfadaki sifre bolumu duzenlenebilir olmalidir
#
#  The old password should not be used
#  There should be at least 1 lowercase char for stronger password and
#  see the level chart change accordingly
#  There should be at least 1 uppercase char and see the level  chart change accordingly
#  There should be at least 1 digit  and see the level  chart change accordingly
#  There should be at least 1 special char and see the level bar change accordingly
#  There should be at least 7 chars for a stronger password
#  The new password should be confirmed
#
#  Eski sifre kullanilmamalidir
#  Daha guclu bir sifre icin en az 1 kucuk karakter olmali ve seviye tablosunun buna göre değişmesini görmeli
#  En az 1 büyük harfli karakter olmalı ve seviye tablosu buna göre değişmeli
#  En az 1 rakam olmalı ve seviye tablosuna bakın buna göre değiştirin
#  En az 1 özel karakter olmalı ve seviye çubuğunu buna göre değiştirin
#  Daha güçlü bir şifre için en az 7 karakter olmalı
#  Yeni şifre onaylanmalıdır

  @us08
  @smoke
  Scenario:Ana Sayfadaki sifre bolumu duzenlenebilir olmalidir
    Given kullanıcı gmibank anasayfasına gider
    And anasayfada giris ikonuna tiklar
    And signin butonuna tiklar
    And Username ve password girer, signin butonuna tiklar ve login olur
    And Administrator butonuna tıklar
    And passworda tıklar
    And current passwordu girer
    When New password kutusuna eski password girer
    Then eski password girilemeyecegi uyarisini alir
    When New password kutusuna bir kucuk harf girer
    And Sonra buyuk harf ekler
    Then Strength barin bir arttigini dogrular
    And bir rakam ekler
    Then Strength barin iki arttigini dogrular
    And  ozel karakter ekler
    Then Strengt barin uc arttgini dogrular
    And bir kucuk, bir buyuk harf, bir rakam ile bir ozel karakter iceren yedi karakter girer
    Then Strength barin tamamen yandigini test eder
  And Administrator signout butonuna tiklar

