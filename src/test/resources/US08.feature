@regression
Feature: US08
  Background: Password segment on Homepage should be editable
    Given kullanıcı gmibank anasayfasına gider
    And anasayfada giris ikonuna tiklar
    And signin butonuna tiklar
    And Username ve password girer, signin butonuna tiklar ve login olur
    And Administrator butonuna tıklar
    And passworda tıklar


  Scenario: Eski sifre kullanilmamalidir
    And current passwordu girer
    When New password kutusuna eski password girer
    Then eski password girilemeyecegi uyarisini alir


  Scenario Outline:Daha guclu şifre icin en az bir kucuk ve bir buyuk harf olmalı ve buna gore seviye tablosunun degismesini gormeli
    When US New password yerine bir kucuk harf ile bir buyuk harf "<sifre>" girer
    Then Strength barin bir arttigini dogrular
    Examples:
      | sifre |
      | aA    |
     # | bB    |


  Scenario Outline: En az bir kucuk ve bir buyuk harf ile bir rakam olmalı ve buna gore seviye tablosunun degişmesini gormeli
    When US New password yerine bir kucuk harf ve bir buyuk harf ile bir rakam "<sifre>" girer
    Then Strength barin iki arttigini dogrular
    Examples:
      | sifre |
      | aA1   |
     # | bB2   |


  Scenario Outline: En az bir kucuk ve bir buyuk harf, bir rakam ve bir ozel karakter olmalı ve buna gore seviye tablosunun degişmesini gormeli
    When US New password yerine bir kucuk harf ve bir buyuk harf ile bir rakam ve bir ozel kararter "<sifre>" girer
    Then Strengt barin uc arttgini dogrular
    Examples:
      | sifre |
      | aA1*  |
      #| bB2.  |


  Scenario Outline:  Daha guclu bir sifre icin en az yedi karakter olmalıdır
    When US bir kucuk, bir buyuk harf, bir rakam ile bir ozel karakterden olusan yedi karakter  "<sifre>" girer
    Then Strength barin tamamen yandigini test eder
    Examples:
      | sifre   |
      | abcdA1* |
     # | bB2345. |
