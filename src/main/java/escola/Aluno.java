package escola;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private CPF cpf;
    private String nome;
    private Email email;

    public CPF getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public Email getEmail() {
        return email;
    }

    //um aluno pode ter varios numeros de telefone
    private List<Telefone> telefones = new ArrayList<>();

    public void adicionarTelefone(String ddd, String numero){
        this.telefones.add(new Telefone(ddd,numero));
    }
}
