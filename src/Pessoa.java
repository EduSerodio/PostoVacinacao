import java.time.LocalDate;

public class Pessoa {

    //ATRIBUTOS
    private String nome;
    private String sobrenome;
    private String rg;
    private LocalDate dataAplicacao;
    private String nomeVacina;
    private LocalDate dataAgendada;

    //MÉTODOS
    public Pessoa(String nome, String sobrenome, String rg, LocalDate dataAplicacao, String nomeVacina, LocalDate dataAgendada) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.dataAplicacao = dataAplicacao;
        this.nomeVacina = nomeVacina;
        this.dataAgendada = dataAgendada;
    }

    //MÉTODOS




    //GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDate getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(LocalDate dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public LocalDate getDataAgendada() {
        return dataAgendada;
    }

    public void setDataAgendada(LocalDate dataAgendada) {
        this.dataAgendada = dataAgendada;
    }
}
