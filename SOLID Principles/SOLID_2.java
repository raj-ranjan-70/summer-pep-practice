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