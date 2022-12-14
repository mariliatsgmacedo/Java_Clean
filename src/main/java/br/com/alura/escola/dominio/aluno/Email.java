package br.com.alura.escola.dominio.aluno;

public class Email {
    public String getEndereco() {
        return endereco;
    }

    //VALUE OBJECT AQUI NAO TEMOS UMA MANEIRA DE IDENTIFICAR UMA INSTANCIA QUE SEJA UNICA
    private String endereco;

    public Email( String endereco){
        if(endereco == null ||
        !endereco.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")){
            throw new IllegalArgumentException("E-mail inválido!");
        }
        this.endereco = endereco;
    }

}
