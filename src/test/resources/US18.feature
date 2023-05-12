@regression
Feature: US18
    Background: Sistem Yoneticinin bir musteriyi yonetmesine izin vermelidir
        Given kullanıcı gmibank anasayfasına gider
        And anasayfada giris ikonuna tiklar
        And signin butonuna tiklar
        And Manager Username ve password girer, signin butonuna tiklar ve login olur
        And My Operations butonuna ardindan Manage Customers butonuna tiklar

    Scenario: Tum musteriler, musterinin hesap bilgilerini dolduran müşterileri yonetme modulunde gorunmelidir
        Then Tum musteriler, musterinin hesap bilgilerini dolduran musterileri yonetme modulunde gorunur

    Scenario: Müşterinin şunları yapabileceği bir Görünüm seçeneği olmalıdır: tüm müşteri bilgilerine gidin ve orada düzenle düğmesini görün
        And musterilerin bilgilerini duzenleyen view butonunun oldugu dogrulanir

    Scenario: Tüm müşteri bilgilerinin doldurulabileceği bir Düzenle düğmesi olmalıdır.
        And musterilerin bilgilerini duzenleyen edit butonunun oldugu dogrulanir


    Scenario: Düzenleme portalı, kullanıcının kullanıcı bilgilerini oluşturmasına veya güncellemesine izin verebilir.
        And edit butonuna tiklanir ve create or update sayfasina gidilir

    Scenario: Kullanıcı bir müşteriyi silebilir, ancak kullanıcı silme konusunda eminse bir mesaj görür
        And ilk musteriye ait silme tusuna tiklanir
        And silme konusunda emin olduguna iliskin mesaj gordugunu teyit eder

