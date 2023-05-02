Feature: US023

#  "System should allow to read all Applicants using api end point
#  "https://www.gmibank.com/api/tp-account-registrations"
#  Read all registrants you created and validate them from your data set
#  Read all registrants you created and validate them 1 by 1
#
#  "Sistem, api uç noktasını kullanarak tüm Başvuru Sahiplerini okumaya izin vermelidir
#  "https://www.gmibank.com/api/tp-account-registrations"
#  Oluşturduğunuz tüm tescil ettirenleri okuyun ve bunları veri kümenizden doğrulayın
#  Oluşturduğunuz tüm tescil ettirenleri okuyun ve 1'e 1 doğrulayın
  @smoke
  @us23
  Scenario: Sistem, api uc noktasini kullanarak tum Basvuru Sahiplerini okumaya izin vermelidir

    When Sistem butun kullanici bilgilerini okur

    Then data seti dogrular

