
package wagesmanagementsystem;

//login interface
public interface Login {
    String username = "";
    String password = "";

    public boolean authenticate(String inputUsername, String inputPassword);

  
}
