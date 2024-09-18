package repositorio;

import java.util.ArrayList;

public abstract class BaseRepositorio<TDominio> {
    protected ArrayList<TDominio> fonteDeDados;
    public abstract TDominio Create(TDominio instancia);

    public ArrayList<TDominio> ReadAll(){
        return this.fonteDeDados;
    }

    public abstract TDominio Read(int chave);

    public abstract TDominio Update(TDominio instancia);

    public abstract TDominio Delete(int chave);
    
}