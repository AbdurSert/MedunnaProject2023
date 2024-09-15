@regression
@US017
Feature: Admin, sistemde kullanici yonetimi yapabilmeli

  Background:
    Given Kullanici anasayfaya yonlenir
    And kullanici profil menusune tiklar
    And Admin olarak sisteme giris yapar
    And Administretion linkine tiklar
    And User Management sekmesine gider

    @US017_AC01
    Scenario: Admin, bir user rolunun aktivasyonunu yapar
      When kullanici Deactivated bir Role_User profilini aktive eder
      Then Aktivasyon dogrulanir
      And Admin cikis yapar

    @US017_AC02
    Scenario: Admin, bir employee rolunun aktivasyonunu yapar
      When kullanici Deactivated bir Role_Employee profilini aktive eder
      Then kullanici aktivasyonu dogrular
      And Admin cikis yapar

    @US017_AC03
    Scenario: Admin, bir manager rolunun aktivasyonunu yapar
      When kullanici Deactivated bir Role_Manager profilini aktive eder
      Then kullanici manager aktivasyonunu dogrular
      And Admin cikis yapar

    @US017_AC04
    Scenario: Admin, bir admin rolunun aktivasyonunu yapar
      When kullanici Deactivated bir Role_Admin profilini aktive eder
      Then kullanici admin aktivasyonunu dogrular
      And Admin cikis yapar

    @US017_AC05
    Scenario: Kullanici tum rollerin (admin, employee, manager, user) bilgilerini goruntuler
      Then kullanicilara ait tum bilgiler goruntulenir
      And Admin cikis yapar

    @US017_AC06
    Scenario: Kullanici tum rollerin (admin, employee, manager, user) bilgilerini guncelleyebilir
      Then kullanicilara ait bilgiler guncellenir
      And Admin cikis yapar

    @US017_AC07
    Scenario: Kullanici tum rolleri (admin, employee, manager, user) silebilir
      Then kullanici tum rolleri siler
      And Admin cikis yapar


