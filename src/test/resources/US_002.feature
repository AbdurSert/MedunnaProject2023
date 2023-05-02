Feature: US_002 - Gecersiz bilgilerle sisteme kayit yapilamaz.

  Background:
    Given Kullanici anasayfaya yonlenir
    And kullanici profil menusune tiklar
    And kullanici kayit linkine tiklar

  @invalidRegister
  Scenario Outline: Kayit sayfasinda tum alanlar zorunlu doldurulmalidir

    And kullanici SSN girer
    And kullanici adini girer
    And kullanici soyadini girer
    And kullanici adres bilgisi alanini bos birakir
    And kullanici telefon numarasini girer
    And kullanici bir kullanici ismi girer
    And kullanici mail adresini girer
    And kullanici "<sifre>" girer
    And kullanici "<sifre>" dogrular
    When kullanici kayit tusunu tiklar
    Then kullanici basarisiz kayit islemini mesaj ile dogrular
    Examples:
      |sifre  |
      |A12m&  |
      |34Be/  |
      |4erH@5 |
      |1Bu#R  |


  Scenario Outline: SSN "-" haricinde herhangi bir karakter icermemeli

    And kullanici gecersiz bir SSN girer
    And kullanici adini girer
    And kullanici soyadini girer
    And kullanici adres bilgierini girer
    And kullanici telefon numarasini girer
    And kullanici bir kullanici ismi girer
    And kullanici mail adresini girer
    And kullanici "<sifre>" girer
    And kullanici "<sifre>" dogrular
    When kullanici kayit tusunu tiklar
    Then kullanici basarisiz kayit islemini mesaj ile dogrular
    Examples:
      |sifre  |
      |A12m&  |
      |34Be/  |
      |4erH@5 |
      |1Bu#R  |

  Scenario Outline: SSN "-" haricinde herhangi bir özel karakter icermemeli

    And kullanici ozel karakter iceren gecersiz bir SSN girer
    And kullanici adini girer
    And kullanici soyadini girer
    And kullanici adres bilgierini girer
    And kullanici telefon numarasini girer
    And kullanici bir kullanici ismi girer
    And kullanici mail adresini girer
    And kullanici "<sifre>" girer
    And kullanici "<sifre>" dogrular
    When kullanici kayit tusunu tiklar
    Then kullanici basarisiz kayit islemini mesaj ile dogrular
    Examples:
      |sifre  |
      |A12m&  |
      |34Be/  |
      |4erH@5 |
      |1Bu#R  |

  Scenario Outline: Telefon numarasi "-" haricinde herhangi bir karakter ve ya ozel karakter icermemeli

    And kullanici SSN girer
    And kullanici adini girer
    And kullanici soyadini girer
    And kullanici adres bilgierini girer
    And kullanici gecersiz bir "<telefonNumarasi>" girer
    And kullanici bir kullanici ismi girer
    And kullanici mail adresini girer
    And kullanici "<sifre>" girer
    And kullanici "<sifre>" dogrular
    When kullanici kayit tusunu tiklar
    Then kullanici basarisiz kayit islemini mesaj ile dogrular
    Examples:
      |telefonNumarasi ||sifre   |
      |555-A44-3322     ||A12m&   |
      |5&5-444-3322     | |34Be/  |
      |555-444-@322     ||4erH@5  |
      |?55-444-3322     ||1Bu#R   |


  Scenario Outline: Mail adresi "@" ve "." karakterlerini icermeli

    And kullanici SSN girer
    And kullanici adini girer
    And kullanici soyadini girer
    And kullanici adres bilgierini girer
    And kullanici telefon numarasini girer
    And kullanici bir kullanici ismi girer
    And kullanici gecersiz bir "<mail>" adresi girer
    And kullanici "<sifre>" girer
    And kullanici "<sifre>" dogrular
    When kullanici kayit tusunu tiklar
    Then kullanici basarisiz kayit islemini mesaj ile dogrular

    Examples:
      |mail           ||sifre   |
      |arggmail.com   ||A12m&   |
      |arg@gmailcom   ||34Be/   |
      |arggamilcom    ||4erH@5  |
      |&arg%@gmail.com||1Bu#R   |
