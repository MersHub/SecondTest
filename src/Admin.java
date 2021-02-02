public class Admin extends User{

   private  String specialty ;

    public Admin () {

    }
    public Admin (String firstName , String lastName , int age , String specialty) {

        super(firstName,lastName ,age);

        System.out.println("Admin test with parameters");
    }

    public void setSpecialty(String specialty) {

        this.specialty = specialty;
    }

    public String getSpecialty() {

        return specialty;
    }


    @Override
    void method(){

        System.out.println("Admin::Method ");
    }

      void methodAdmin() {

        System.out.println("method::Admin");
    }

}
