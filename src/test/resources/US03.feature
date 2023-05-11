@regression
Feature: US03
# Registration page should restrict password usage to a secure and high level passcode
# Kayıt sayfası, şifre kullanımını güvenli ve yüksek seviyeli bir şifre ile sınırlandırmalıdır

#  There should be at least 1 lowercase char for stronger password and see the level chart change accordingly
#  There should be at least 1 uppercase char and see the level  chart change accordingly
#  There should be at least 1 digit  and see the level  chart change accordingly
#  There should be at least 1 special char and see the level bar change accordingly
#  There should be at least 7 chars for a stronger password
#
#  Daha güçlü şifre için en az 1 küçük karakter olmalı ve buna göre seviye tablosunun değişmesini görmeli
#  En az 1 büyük harfli karakter olmalı ve buna göre seviye tablosunun değişmesini görmeli
#  En az 1 hane olmalı ve seviye tablosunun buna göre değişmesini görmeli
#  en az 1 özel karakter ve seviye çubuğunun buna göre değiştiğini görün
#  Daha güçlü bir şifre için en az 7 karakter olmalıdır

  @us03
  @smoke
  Scenario: Kayıt sayfası, şifre kullanımını güvenli ve yüksek seviyeli bir şifre ile sınırlandırmalıdır
    Given kullanıcı gmibank anasayfasına gider
    And anasayfada giris ikonuna tiklar
    And Register butonuna tiklar
    When New password yerine bir kucuk harf girer
    And bir buyuk harf girer
    Then Strength barin bir arttgini test eder
    And bir tane rakam girer
    Then Strength barin iki arttigini test eder
    And bir ozel karakter girer
    Then Strengt barin uc arttgini test eder
    And bir kucuk, bir buyuk harf, bir rakam ile bir ozel karakterden olusan yedi karakter girer
    Then Strength barin hepsinin yandigini test eder
    And tarayiciyi kapatir
    #renkleri kontrol et






