@regression
Feature: US18
#System should allow Admin to manage a customer
#All customers should show up on manage customers module populating the account information of the customer "First Name Last Name  Middle Initial  Email  Mobile Phone Number Phone Number Address Create Date"
#There should be a View option where customer can be navigated to all customer info and see edit button there
#There should be an Edit button where all customer information can be populated
#The Edit portal can allow user to create or update the user info
#User can delete a customer, but seeing a message if the user is sure about deletion
#
#Sistem, Yöneticinin bir müşteriyi yönetmesine izin vermelidir
#Tüm müşteriler, müşterinin hesap bilgilerini dolduran müşterileri yönetme modülünde görünmelidir "Ad Soyad Orta İlk E-posta Cep Telefonu Numarası Telefon Numarası Adres Oluşturma Tarihi"
#Müşterinin şunları yapabileceği bir Görünüm seçeneği olmalıdır: tüm müşteri bilgilerine gidin ve orada düzenle düğmesini görün
#Tüm müşteri bilgilerinin doldurulabileceği bir Düzenle düğmesi olmalıdır.
#Düzenleme portalı, kullanıcının kullanıcı bilgilerini oluşturmasına veya güncellemesine izin verebilir.
#Kullanıcı bir müşteriyi silebilir, ancak kullanıcı silme konusunda eminse bir mesaj görür

    #admin müşteriyi yönetemiyor, manager yaptım
@us18
@smoke
Scenario: Sistem Yoneticinin bir musteriyi yonetmesine izin vermelidir
    Given kullanıcı gmibank anasayfasına gider
    And anasayfada giris ikonuna tiklar
    And signin butonuna tiklar
    And Manager Username ve password girer, signin butonuna tiklar ve login olur
    And My Operations butonuna ardindan Manage Customers butonuna tiklar
    Then Tüm musteriler, musterinin hesap bilgilerini dolduran musterileri yonetme modulunde gorunur
    And musterilerin bilgilerini duzenleyen view butonunun oldugu dogrulanir
    And musterilerin bilgilerini duzenleyen edit butonunun oldugu dogrulanir
    And edit butonuna tiklanir ve create or update sayfasina gidilir
    And geri donulur ve silme tusuna tiklanir
    And silme konusunda emin olduguna iliskin mesaj gordugunu teyit eder
    And manager signout butonuna tiklar



