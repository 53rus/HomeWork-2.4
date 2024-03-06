import exception.WrongLoginException;
import service.RegistrationServiceImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws WrongLoginException {
        RegistrationServiceImpl registrationService = new RegistrationServiceImpl() {
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Login");
        String login = scanner.nextLine();
        System.out.println("Password");
        String password = scanner.nextLine();
        System.out.println("Confirm Password");
        String confirmPassword = scanner.nextLine();

        registrationService.checkLoginPassword(login,password,confirmPassword);

    }
}