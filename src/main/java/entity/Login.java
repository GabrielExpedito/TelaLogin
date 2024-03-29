package entity;

public class Login {
    
    private String nome;
    private String Sobrenome;
    private String email;
    private String senha;

    public Login() {
    }

    public Login(String nome, String Sobrenome, String email, String senha) {
        this.nome = nome;
        this.Sobrenome = Sobrenome;
        this.email = email;
        this.senha = senha;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Login{" + "nome=" + nome + ", Sobrenome=" + Sobrenome + ", email=" + email + ", senha=" + senha + '}';
    }
    
    
    
    
}
