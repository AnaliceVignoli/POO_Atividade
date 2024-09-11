package dominio;

import java.time.LocalDate;

public class SubclasseProduto extends BaseParametro{
    private int codigoClasse;

    public int getCodigoClasse(){
        return codigoClasse;
    }
    public void setCodigoClasse(int codigoClasse){
        this.codigoClasse = codigoClasse;
    }

    public SubclasseProduto(){
        super();
    }
    public SubclasseProduto(int codigo, String descricao, LocalDate dataInclusao,
    int codigoClasse){
        super(codigoClasse, descricao, dataInclusao);
        this.codigoClasse = codigoClasse;
    }

    @Override
    public String toString() {
        String msg = "SubclasseProduto";
        msg += "\n\tcodigo=" + this.codigo;
        msg += "\n\tdescricao=" + this.descricao;
        msg += "\n\tdataInclusao=" + this.dataInclusao;
        msg += "\n\tcodigoClasse=" + this.codigoClasse;
        return msg;
    }
}