package Estudos.collections.List;

public class Pessoa {
    private String name;
    private int age;

    public Pessoa(String name, int age) {
        this.name = name;
        this.age=age;
    }
    // o construtor existe para inicializar os atributos de um novo objeto quando esta sendo instanciado,
    // configurando os dados do objeto já alocado na memória pelo operador "new"

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
