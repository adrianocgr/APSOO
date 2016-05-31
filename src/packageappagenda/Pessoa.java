package packageappagenda;

public class Pessoa {
    private Integer cod;
    private String nome;
    private int fone;
    public Pessoa() {
    }
    public Pessoa(int cod, String nome, int fone) {
        this.cod = cod;
        this.nome = nome;
        this.fone = fone;
    }
    public Integer getCod() {
        return cod;
    }
    public void setCod(Integer cod) {
        this.cod = cod;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getFone() {
        return fone;
    }
    public void setFone(int fone) {
        this.fone = fone;
    }
}