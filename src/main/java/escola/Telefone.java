package escola;

public class Telefone {
    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero){
        //ddd 2 dig
        //numero 8 ou 9 dig
        if(ddd == null || numero == null){
            throw new IllegalArgumentException("Dados invalidos!");
        }
        this.ddd = ddd;
        this.numero = numero;
    }
}
