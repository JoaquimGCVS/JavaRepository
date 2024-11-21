package Estudos.designpatterns.Singleton;

// codigo base para uso de singleton
public class DataBaseConnection {
    private static DataBaseConnection instance;
    private Connection connection;

    private DataBaseConnection() {
        // codigo de conexao com o banco de dados
    }

    public static synchronized DataBaseConnection getInstance() {
        if (instance==null) { // garante que a classe tenha apenas uma intancia
            instance = new DataBaseConnection(); // se nao tiver instancia ainda (=null), cria uma nova instancia
        }
        return instance; // retorna a instancia, criada ou ja existente
    }
}
