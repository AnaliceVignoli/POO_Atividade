package dominio;

import java.time.LocalDate;

public class SubclasseProduto extends BaseParametro {
    private int codigoClasse;

    public int getCodigoClasse() {
        return codigoClasse;
    }
    public void setCodigoClasse(int codigoClasse) {
        this.codigoClasse = codigoClasse;
    }

    public SubclasseProduto() {
        super();
    }
    public SubclasseProduto(int codigo, String descricao, LocalDate dataDeInclusao, int codigoClasse) {
        super(codigo, descricao, dataDeInclusao);
        this.codigoClasse = codigoClasse;
    }

}