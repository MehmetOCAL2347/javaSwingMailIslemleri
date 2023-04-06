import javax.mail.MessagingException;

public class Main {
    public static void main(String[] args) {

        /*
            1. Terminalden java -version ile versiyon kontrolü yapılmalı. Ben java 17 kullanıyorum
                java -version
                java version "17.0.5" 2022-10-18 LTS

            2. Aşağıda mail atılacak adres ve MailIslemleri classında bulunan mail ve password bilgileri güncellenmeli

            3. JarFilesZip isimli klasor altına projeye import edilmesi gereken jar dosyaları yüklendi buradan indirip
                Libraries altına import edilmeli

            Şu an bu değişiklikler yapılarak mail gönderme işlemi gerçekleştirilebilmektedir.
         */

        MailIslemleri mail = new MailIslemleri();
        try {
            mail.mailGonder("xxxxx@gmail.com");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}