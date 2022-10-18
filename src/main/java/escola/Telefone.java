package escola;

public class Telefone {
    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero){

        if(ddd == null || numero == null){
            throw new IllegalArgumentException("Dados invalidos!");
        }
        if(!ddd.matches("\\d{2}")){
            throw new IllegalArgumentException("DDD invalido!");
        }

        if(!numero.matches("\\d{8}|\\d{9}")){
            throw new IllegalArgumentException("Numero invalido!");
        }
        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdd() {
        return this.ddd;
    }

    public String getNumero() {
        return this.numero;
    }
}
