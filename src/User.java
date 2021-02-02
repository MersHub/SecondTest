public class User {

   private String firstName ;
   private String lastName ;
   private int age ;

    User () {

    }

    User (String firstName , String lastName , int age) {

        this.firstName = firstName ;
        this.lastName = lastName ;
        this.age = age ;

        System.out.println("User test with parameters");

    }

    public void setFirstName (String firstName) {

        this.firstName = firstName ;
    }

    public String getFirstName () {

        return firstName;
    }

    public  void setLastName (String lastName) {

        this.lastName = lastName;
    }

    public  String getLastName(){

        return lastName;
    }

    public void setAge(int age ) {

        if (age > 0) {

            this.age = age;

        }else System.out.println("Error");
    }

    public int getAge() {

        return age;
    }

    void method(){

        System.out.println("User::Method ");
    }
}
