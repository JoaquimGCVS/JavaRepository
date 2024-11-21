package Estudos.designpatterns.Singleton;

public class Main {
    public static void main(String[]args) {
//        DataBaseConnection dbc = new DataBaseConnection() da erro, pois o construtor da classe de singleton eh PRIVADO
        // Forma correta:
        DataBaseConnection dbc = DataBaseConnection.getInstance(); // cria a intancia
        DataBaseConnection dbc2 = DataBaseConnection.getInstance(); // usa a instancia ja criada
        // so permite instanciar o DataBase a partir do metodo getter
    }
}
