Feature: Kullanici sisteme gecersiz bilgilerle giris yapamaz
  Background:
    Given Kullanici anasayfaya yonlenir
    And kullanici profil menusune tiklar
    And kullanici sign in eder
    And kullanici menuden user infoya gider

  Scenario Outline:

    When kullanici invalid bir "<e-posta>" girer
    Then invalid e-posta mesajini gorur
    And kullanici user menuden cikis yapar

    Examples:
    |e-posta|
    |employee2023gmail.com|
    |employee2023gmailcom|
    |employee2023@gmailcom|
    |employee2023@gmailcom.|
    |@employee2023gmail.com|

    Scenario: Kullanici sadece Ingilizce ve Turkce dilini secebilir
      Then kullanici Ingilzce ve Turkce secenegini gorur
      And kullanici user menuden cikis yapar
