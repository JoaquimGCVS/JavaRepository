package Estudos.generics.entitiesF;

import java.util.Objects;

public class Pessoa {
    private Long id;
    private String name;

    public Pessoa (Long id, String name) {
        setId(id);
        setName(name);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true; // esses objetos (this(objeto 1 que chama o metodo, o(objeto dois passado por parametro)
        // apontam para o mesmo endereco de memoria?
        if (!(o instanceof Pessoa)) return false; // esse objeto eh do tipo Pessoa?
        Pessoa pessoa = (Pessoa)o; // Casting para garantir comparacao
        return id.equals(pessoa.id) && name.equals(pessoa.name); // os atributos id e nome de "this" sao iguais ao de "o"?
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,name);
    }
    @Override
    public String toString() {
        return "Name: " + getName() + ", ID: " + id;
    }
 }
