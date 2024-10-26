public class ValidationService {

    public static final String VALIDATE_SYMBOLS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";
    public static void validate(String login, String password, String confirmPassword){
        validateLogin(login);
        validatePassword(password,confirmPassword);
    }

    public static void validateLogin(String login) {
        if(login.length() > 20){
            throw new WrongLoginException("Логин содержит более 20 символов");
        }
        for(int i=0; i<login.length(); i++){
            if(!VALIDATE_SYMBOLS.contains(String.valueOf(login.charAt(i)))){
                throw new WrongLoginException("Логин содержит запрещенный символ");
            }
        }

    }
    public static void validatePassword(String password, String confirmPassword){
        if(password.length() > 20){
            throw new WrongPasswordException("Пароль больше 20 символов");
        }
        for(int i =0; i < password.length(); i ++){
            if(!VALIDATE_SYMBOLS.contains(String.valueOf(password.charAt(i)))){
                throw new WrongPasswordException("Пароль содержит запрещенный символ");
            }
        }
        if(!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }

    }

    public static void validateLogin() {
    }

    public static void validatePassword() {
    }
}
