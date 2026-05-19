package bank;

public class Account {
    public String name;
    protected String email;
    private String password;

    //getters & setters
    //getters = information back
    //setters = setting value 
    public String getPassword(){
        
        return this.password;
    }

   public String setPassword(String pass){
        this.password = pass;
        return pass;
    }
}
