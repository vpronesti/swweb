package bean;

public class BeanLogin {
    private String username;
    private String password;
    private String nome;
    private String cognome;

    public BeanLogin() {
        this.username = "";
        this.password = "";
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    
    public boolean validate() {
        // Controllo sintattico
        if (this.username.equals("") || this.password.equals("")) {
            return false;
        }

        LoginController controller = LoginController.getInstance();
        Utente found = controller.login(this.username, this.password);
        return  (found != null);
    }
}
