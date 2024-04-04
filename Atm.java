
import java.util.Scanner;

public class Atm {
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userName,password;
    int right = 3;
    int balance = 1500;
     int select;
    while ( right > 0) {


        System.out.print(" Kullanıcı Adınız : ");
        userName = scan.nextLine();

        System.out.print(" Parolanız : ");
        password = scan.nextLine();

        if (userName.equals("yılmaz") && password.equals("3131")) {
            System.out.println("Merhaba, X Bankasına Hoşgeldiniz! ");

            do {

                System.out.print(
                        "1- Para Yatırma \n" +
                                "2- Para Çekme \n" +
                                "3- Bakiye Sorgulama \n" +
                                "4- Güncel Dolar Kuru Sorgulama \n"+
                                "5- Çıkış Yap");
                    System.out.print("Lütfen Yapmak istediğiniz işlemi seçiniz : ");
              select = scan.nextInt();
              if (select==1){
                  System.out.println("Para Miktarı :");
                  int price = scan.nextInt();
                  balance += price;
              } else if (select == 2) {
                  System.out.print("Çekeceğiniz Para Miktarı : ");
                  int price = scan.nextInt();
                  if (price > balance) {
                      System.out.println("Bakiye Yetersiz.");

                  } else {
                      balance -= price;
                  }
              }
                  else if ( select ==3){
                  System.out.println("Bakiyeniz : "+balance);

              } else if (select == 4) {
                  System.out.println(" Güncel Dolar Kuru : Alış : 30,90 \n"
                  +"                     Satış : 32,65 ");

              }

            }while(select !=5);
            System.out.println("Tekrar Görüşmek Üzere :))) ");
            break;

        } else {
        right--;

                System.out.println("Hatalı Kullanıcı adı veya şifre. Tekrar deneyiniz. ");
                if (right == 0 ){
                    System.out.println("hesabınız bloke olmuştur banka ıle ıletışime geçiniz");}
                    else {
                    System.out.println("Kalan Hakkınız : " + right);
                }

        }


      }
    }
}
