import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Vacinatest {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Test
    @DisplayName("Deve vacianr")
    void vacinarNaMesmaDataMarcada(){

        //MÉTODOS PŔOPIOS DO INTELLIJ PARA FORMATAÇÃO DE DATAS
        LocalDate dataAplicacao = LocalDate.parse("16/02/2023", formatter);
        LocalDate dataMarcada = dataAplicacao;

        //CRIANDO OBJETO PESSOA
        Pessoa p1 = new Pessoa("Jorge", "Lucas", "123456789", dataAplicacao,"pfizer", dataMarcada);
        IVacinar vacinar = new ServicoVacinarProxy();
        vacinar.vacinarPessoa(p1.getRg(), p1.getDataAplicacao(), p1.getNomeVacina(), p1.getDataAgendada());
        System.out.println(p1.getNome() + " " + p1.getSobrenome() + ", portador do RG: " + p1.getRg() +
                ", foi vacinada com sucesso" + " no dia " + p1.getDataAplicacao());
        System.out.println("-----------------------------------------------------------");
    }

    @Test
    @DisplayName("Deve vacianr")
    void vacinarEmDataPosteriorADataMarcada(){

        //MÉTODOS PŔOPIOS DO INTELLIJ PARA FORMATAÇÃO DE DATAS
        LocalDate dataAplicacao = LocalDate.parse("16/02/2023", formatter);
        LocalDate dataMarcada = LocalDate.parse("16/02/2023", formatter);

        //CRIANDO OBJETO PESSOA
        Pessoa p1 = new Pessoa("Maria", "silva", "123886789", dataAplicacao,"pfizer", dataMarcada);
        IVacinar vacinar = new ServicoVacinarProxy();
        vacinar.vacinarPessoa(p1.getRg(), p1.getDataAplicacao(), p1.getNomeVacina(), p1.getDataAgendada());
        System.out.println(p1.getNome() + " " + p1.getSobrenome() + ", portador do RG: " + p1.getRg() +
                ", foi vacinada com sucesso" + " no dia " + p1.getDataAplicacao());
        System.out.println("--------------------------------------------------------------------");
    }

    @Test
    @DisplayName("Deve vacianr")
    void vacinarEmDataAnteriorADataMarcada(){

        //MÉTODOS PŔOPIOS DO INTELLIJ PARA FORMATAÇÃO DE DATAS
        LocalDate dataAplicacao = LocalDate.parse("10/02/2023", formatter);
        LocalDate dataMarcada = LocalDate.parse("16/02/2023", formatter);

        //CRIANDO OBJETO PESSOA
        Pessoa p1 = new Pessoa("Talia", "Moura", "146886789", dataAplicacao,"pfizer", dataMarcada);
        IVacinar vacinar = new ServicoVacinarProxy();
        vacinar.vacinarPessoa(p1.getRg(), p1.getDataAplicacao(), p1.getNomeVacina(), p1.getDataAgendada());
        System.out.println("------------------------------------------------------------");

    }


}
