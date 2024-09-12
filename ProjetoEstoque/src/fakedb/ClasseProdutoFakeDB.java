package fakedb;

import java.util.ArrayList;
import java.time.LocalDate;
import dominio.ClasseProduto;

public class ClasseProdutoFakeDB extends BaseFakeDB<ClasseProduto>{
    @Override
    protected void preencherDados() {
        this.tabela = new ArrayList<ClasseProduto>();
        this.tabela.add(new ClasseProduto(1, "Carnes", LocalDate.now()));
        this.tabela.add(new ClasseProduto(2, "Bebidas", LocalDate.now()));
        this.tabela.add(new ClasseProduto(3, "Laticínios", LocalDate.now()));
        this.tabela.add(new ClasseProduto(4, "Higiene", LocalDate.now()));
        this.tabela.add(new ClasseProduto(5, "Limpeza", LocalDate.now()));
    }

    public ClasseProdutoFakeDB(){
        super();
    }
}