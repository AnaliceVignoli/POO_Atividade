package dominio;

import java.time.LocalDate;

public abstract class BaseParametro {
    protected int codigo;
    protected String descricao;
    protected LocalDate dataInclusao;

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInclusao() {
        return dataInclusao;
    }
    public void setDataInclusao(LocalDate dataInclusao) {
        this.dataInclusao = dataInclusao;
    }

    public BaseParametro() {
    }
    public BaseParametro(int codigo, String descricao, LocalDate dataInclusao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.dataInclusao = dataInclusao;
    }
}