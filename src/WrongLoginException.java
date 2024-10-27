public class WrongLoginException extends Exception{
    public String login;

    public WrongLoginException(String login){
        super(" %s ".formatted(login));
        this.login = login;
    }
    public String getLogin(){
        return login;
    }
}
