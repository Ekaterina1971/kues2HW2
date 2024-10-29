
public class Main {

    public static void main(String[] args) {
        try {
            ValidationService.validateLogin("Africa");
        } catch (WrongLoginException e) {
            throw new RuntimeException(e);
        }
        try {
            ValidationService.validatePassword("765tt", "765tt");
        } catch (WrongPasswordException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Все параметры верны");
    }

}
