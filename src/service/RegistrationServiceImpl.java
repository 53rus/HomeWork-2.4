package service;

import exception.WrongLoginException;
import exception.WrongPasswordException;

public class RegistrationServiceImpl implements RegistrationService {


    public void checkLoginPassword(String login, String password,String confirmPassword) {
        try {
            check(login, password,confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println("Параметр Login содержит в себе только латинские буквы, цифры и знак подчеркивания. "
                                + "У параметра Login есть ограничение по длине – он должен быть равен или меньше 20 символов");
        } catch (WrongPasswordException e) {
            System.out.println("Параметр Password содержит в себе только латинские буквы, цифры и знак подчеркивания. "
                    + "У параметра Password есть ограничение по длине – он должен быть равен или меньше 20 символов");
        }

    }


    public void checkConfirmPassword(String password, String confirmPassword) {
        if (confirmPassword.equals(password)) {
            System.out.println("Регистрация завершена");

        } else {
            System.out.println("Пароли не совподают");
        }


    }

    @Override
    public void check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!login.matches("^[a-zA-Z0-9_]{1,20}$")) {
            throw new WrongLoginException();
        }
        if (!password.matches("^[a-zA-Z0-9_]{1,20}$")) {
            throw new WrongPasswordException();
        }else checkConfirmPassword(password,confirmPassword);
    }
}
