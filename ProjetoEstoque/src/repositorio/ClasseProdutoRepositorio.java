package repositorio;

import dominio.ClasseProduto;
import fakedb.ClasseProdutoFakeDB;

public class ClasseProdutoRepositorio extends BaseRepositorio<ClasseProduto>{
    private ClasseProdutoFakeDB db;

    public ClasseProdutoRepositorio(){
        this.db = new ClasseProdutoFakeDB();
        this.dados = this.db.getTabela();
    }

    @Override
    public ClasseProduto Read(int chave){
        for(ClasseProduto cp : this.dados){
            if(cp.getCodigo() == chave){
                return cp;
            }
        }
        return null;
    }

    @Override
    public ClasseProduto Edit(ClasseProduto instancia){
        ClasseProduto cp = this.Read(instancia.getCodigo());
        if (cp != null){
            cp.setDescricao(instancia.getDescricao());
            return cp;
        }
        else{
            return null;
        }
    }

    @Override
    public ClasseProduto Add(ClasseProduto instancia){
        int pos = this.dados.size() - 1;
        ClasseProduto cp = this.dados.get(pos);
        int proxChave = cp.getCodigo() + 1;
        
        //ClasseProduto cp = this.dados.getLast();
        //int proxChave = cp.getCodigo() + 1;
        
        instancia.setCodigo(proxChave);
        this.dados.add(instancia);
        return instancia;
    }

    @Override
    public ClasseProduto Delete(int chave){
        ClasseProduto cp = this.Read(chave);
        if (cp != null){
            this.dados.remove(cp);
            return cp;
        }
        else{
            return null;
        }
    }
}