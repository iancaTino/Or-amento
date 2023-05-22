public class Cliente {

    private String nome;
    private String email;
    private String contato;
    private String endereco;

    public Cliente(String nome, String email, String contato, String endereco) {
        this.nome = nome;
        this.email = email;
        this.contato = contato;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nEmail: " + email +
                "\nContato: " + contato +
                "\nEndereco: " + endereco + "\n";
    }
}
