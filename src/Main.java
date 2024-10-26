
public class Main {

    public static void main(String[] args) {
        ValidationService.validateLogin("Africa");
        ValidationService.validatePassword("765tt", "765tt");
        try {
            ValidationService.validateLogin();
        } catch (WrongLoginException exception) {
            System.out.println("Логин:%s");
        }
        try {
            ValidationService.validatePassword();
        } catch (WrongPasswordException exception) {
            System.out.println("Пароль:%s");
        }
        System.out.println("Все параметры верны");
    }

}
