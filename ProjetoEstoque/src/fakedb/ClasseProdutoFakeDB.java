package fakedb;

import java.time.LocalDate;
import java.util.ArrayList;
import dominio.ClasseProduto;

public class ClasseProdutoFakeDB extends BaseFakeDB<ClasseProduto> {
    public ClasseProdutoFakeDB(){
        super();
    }

    @Override
    protected void preencherDados() {
        this.tabela = new ArrayList<>();
        this.tabela.add(new ClasseProduto(1, "Bebidas", LocalDate.now()));
        this.tabela.add(new ClasseProduto(2, "Carnes", LocalDate.now()));
        this.tabela.add(new ClasseProduto(3, "Limpeza", LocalDate.now()));
        this.tabela.add(new ClasseProduto(4, "Laticínios", LocalDate.now()));
        this.tabela.add(new ClasseProduto(5, "Higiene", LocalDate.now()));
    }

}