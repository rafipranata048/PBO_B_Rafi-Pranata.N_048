public class Admin extends User {
   private String Username ;
   private String Password ;

   public Admin(String nama, String nim, String username, String password ){
       super(nama, nim);
       this.Username = username;
       this.Password = password;
   }

   @Override
    public boolean login(String inputUsername, String inputPassword ){ //dgn nama metode
        return inputUsername.equals(Username) && inputPassword.equals(Password);
    }

    @Override
    public void displayInfo(){
       System.out.println("login admin berhasil");
    }
}
