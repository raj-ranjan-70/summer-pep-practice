/* 

Design a Login System that today uses email and password, but must later support Google OAuth and magic links - without changing the code that checks "Is this User logged In?" Keep the interface each provider implements minimal.
*/

interface Authentication {
    void authenticate(String email, String secret);
}

class AuthenticationUsingPassword implements Authentication {
    public void authenticate(String email, String secret) {
        // Code to authenticate using Email and Password...

        System.out.println("Authtication using Password");
    }
}

class AuthenticationUsingToken implements Authentication {
    public void authenticate(String email, String secret) {
        // Code to authenticate using Email and Token...

        System.out.println("Authtication using Token");
    }
}

class AuthenticationUsingLinks implements Authentication {
    public void authenticate(String email, String secret) {
        // Code to authenticate using Email and Links...

        System.out.println("Authtication using Links");
    }
}

class AuthService {
    private Authentication authentication;

    AuthService(Authentication authentication) {
        this.authentication = authentication;
    }

    void executeAuth(String email, String secret) {
        authentication.authenticate(email, secret);
    }
}

class Main {

    public static void main(String[] args) {
    AuthService authService1 = new AuthService(new AuthenticationUsingPassword());
    AuthService authService2 = new AuthService(new AuthenticationUsingToken());
    AuthService authService3 = new AuthService(new AuthenticationUsingLinks());

    authService1.executeAuth("raj@gmail.com", "Raj123");
    authService2.executeAuth("raj@gmail.com", "jkw5efk-kj8c-n84erw");
    authService3.executeAuth("raj@gmail.com", "https://raj.com?auth=raj-ranjan-70");
    }
}