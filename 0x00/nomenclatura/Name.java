import java.util.Date;
import java.util.List;
import java.net.URL;

public class Name {

    // Classe usada nas assinaturas dos métodos
    public static class User {
    }

    // Classe de apoio para o retorno da busca
    public static class Testcase {
    }

    // Classe de apoio para a lista de contas
    public static class Account {
    }

    // variáveis que falam por si só
    public Date modifiedDate;

    public List<Testcase> findAllTestcasesByUser(Name.User user) {
        return null;
    }

    // Declaração correta usando List
    public List<Account> AccountList;

    // Sem prefixos no parâmetro
    public void deleteUser(Name.User user) {
    }

    // Evite mapa mental: nome claro
    public URL url;

    // Classe com nome de substantivo
    public class TableRepresenter {
    }

    // Métodos com verbo
    public void saveCar() {
    }

    // Uma palavra por conceito: mesma ação, mesmo verbo
    public void saveUser() {
    }

    public void saveAccount() {
    }

    public void saveContract() {
    }

    // Constantes em vez de "números mágicos"
    public static final int DAYS_IN_YEAR = 360;
    public static final int HOURS_IN_WEEK = 168;
}