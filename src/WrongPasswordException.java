public class WrongPasswordException extends Exception{
    public String password;
    public String confirmPassword;

    public WrongPasswordException(String password){
      super("%s".formatted(password));
      this.password = password;
    }
    public WrongPasswordException(String password, String confirmPassword){
        super("%s %s".formatted(password, confirmPassword));
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getPassword(){
        return password;
    }
    public String getConfirmPassword(){
        return confirmPassword;
    }
}
