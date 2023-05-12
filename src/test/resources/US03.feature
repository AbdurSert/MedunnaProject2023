
Feature: US03


  Background: kullanıcı kayıt sayfasına gider ve kayıt olur
    Given kullanıcı gmibank anasayfasına gider
    And anasayfada giris ikonuna tiklar
    And Register butonuna tiklar

  Scenario Outline:Daha guclu şifre icin en az bir kucuk ve bir buyuk harf olmalı ve buna gore seviye tablosunun degismesini gormeli
    When New password yerine bir kucuk harf ile bir buyuk harf "<sifre>" girer
    Then Strength barin bir arttigini test eder
    Examples:
      |sifre|
      |aA|
      |bB|


  Scenario Outline: En az bir kucuk ve bir buyuk harf ile bir rakam olmalı ve buna gore seviye tablosunun degişmesini gormeli
    When New password yerine bir kucuk harf ve bir buyuk harf ile bir rakam "<sifre>" girer
    Then Strength barin iki arttigini test eder
    Examples:
      |sifre|
      |aA1|
      |bB2|

  Scenario Outline: En az bir kucuk ve bir buyuk harf, bir rakam ve bir ozel karakter olmalı ve buna gore seviye tablosunun degişmesini gormeli
    When New password yerine bir kucuk harf ve bir buyuk harf ile bir rakam ve bir ozel kararter "<sifre>" girer
    Then Strengt barin uc arttigini test eder
    Examples:
      |sifre|
      |aA1*|
      |bB2.|

  Scenario Outline:  Daha guclu bir sifre icin en az yedi karakter olmalıdır
    When bir kucuk, bir buyuk harf, bir rakam ile bir ozel karakterden olusan yedi karakter  "<sifre>" girer
    Then Strength barin hepsinin yandigini test eder
    Examples:
      |sifre|
      |abcdA1*|
      |bB2345.|


    #renkleri kontrol et






