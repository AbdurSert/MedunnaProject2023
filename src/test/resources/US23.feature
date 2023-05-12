@regression
Feature: US023

  @smoke
  @us23
  Scenario: Sistem, api uc noktasini kullanarak tum Basvuru Sahiplerini okumaya izin vermelidir

    When Sistem butun kullanici bilgilerini okur

    Then data seti dogrular

