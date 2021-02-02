import java.util.ArrayList;

public class Main {

    static void method (NoteBook noteBook) {

        noteBook.launch();
        noteBook.shutDown();
    }

    void method(Jet jet) {

        jet.fly();
    }

    void method (Helicopter helicopter) {

        helicopter.fly();
    }

    public static void main(String[] args) {

        User user = new User();
        User user1 = new User("Egor","Merzlov",21);
        Admin admin = new Admin("Egor","Mers",22,
                "programmer");

        System.out.println();
/////////////////////////////////////////////////////////////////

        MacBook macBook = new MacBook();
        PixelBook pixelBook = new PixelBook();

        ArrayList<NoteBook> noteBooks = new ArrayList<>();

        noteBooks.add(macBook);
        noteBooks.add(pixelBook);

      for (NoteBook noteBook : noteBooks) {
          
           noteBook.launch();
       }

        System.out.println();

        method(macBook);
        method(pixelBook);

        System.out.println();

        macBook.methodMacBook();
        pixelBook.methodPixelBook();

        System.out.println();

        macBook.setPrice(1000);
        pixelBook.setPrice(900);

          int Mac = macBook.getPrice();
          int Pixel = pixelBook.getPrice();



        System.out.println("MacBook price : " + Mac);
        System.out.println("PixelBook price : " + Pixel);

//////////////////////////////////////////////////////////////
        System.out.println();

        String userFirstname = user1.getFirstName();
        String userLastname = user1.getLastName();
        int userAge = user1.getAge();

        admin.setSpecialty("programmer");
        String adminSpecialty = admin.getSpecialty();

        System.out.println("User FirstName : " + userFirstname);
        System.out.println("User LastName : " + userLastname);
        System.out.println("User Age : " + userAge);
        System.out.println("Admin Specialty : " + adminSpecialty);

        System.out.println();

        user1.setFirstName("Егор");
        user1.setLastName("Мерзлов");
        user1.setAge(22);

        System.out.println(user1.getFirstName() + " " + user1.getLastName() +
                " " + user1.getAge());

        System.out.println();

        user.method();
        admin.method();
        admin.methodAdmin();

        User admin1 = new Admin();
        admin1.method();

        System.out.println();
///////////////////////////////////////////////////////////////

        Jet jet = new Jet();
        Helicopter helicopter = new Helicopter();

        jet.fly();
        helicopter.fly();



    }
}
