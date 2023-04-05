Feature: US018
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

    #admin müşteriyi yönetemiyor, manager yaptım ben de
@us018
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

#Senaryo: Bir müşteriyi yönetme
#Verilen gmibank.com sitesi açılır.
#Kullanıcı "Yönetici Girişi" sayfasına gider.
#Kullanıcı yönetim müşterileri sayfasına gider.
#Kullanıcı, tüm müşterilere ait hesap bilgilerin listelendiği bir sayfa görür.
#Kullanıcı bir müşterinin adına tıklayarak, müşterinin tüm bilgilerini görüntüleyen bir sayfaya yönlendirilir.
#Kullanıcı müşteri bilgilerinde değişiklik yapmak istediğinde, kullanıcı düzenleme seçeneğini tıklar.
#Kullanıcı müşteri bilgilerinde değişiklik yapabilir veya yeni bir müşteri kaydı oluşturabilir.
#Kullanıcı müşteri silme seçeneğini tıklar ve silme işlemini onaylar.
#Başarılı bir mesaj görüntülenir.
#Kullanıcı müşteri bilgilerini kontrol eder ve doğru şekilde yönetildiğinden emin olur.
#Bu senaryo, Yöneticinin Müşteri Yönetim portalında belirtilen kabul kriterlerine uygun olarak bir müşteri yönetip yönetemediği konusunda test edilir. Senaryo ayrıca, kullanıcının müşteri bilgilerini görüntülemesine, düzenlemesine, silmesine izin verir ve müşteri bilgilerinin doğru şekilde yönetildiğini kontrol eder.




