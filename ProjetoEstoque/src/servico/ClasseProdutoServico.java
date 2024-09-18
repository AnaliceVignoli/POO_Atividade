package servico;

import java.util.ArrayList;
import dominio.ClasseProduto;
import repositorio.ClasseProdutoRepositorio;

public class ClasseProdutoServico extends BaseServico<ClasseProduto>{
    private ClasseProdutoRepositorio repositorio;

    public ClasseProdutoServico(){
        this.repositorio = new ClasseProdutoRepositorio();
    }

    @Override
    public ClasseProduto Criar(ClasseProduto obj) {
        return this.repositorio.Create(obj);
    }

    @Override
    public ArrayList<ClasseProduto> LerTodos() {
        return this.repositorio.ReadAll();
    }

    @Override
    public ClasseProduto Ler(int chave) {
        return this.repositorio.Read(chave);
    }

    @Override
    public ClasseProduto Atualizar(ClasseProduto obj) {
        return this.repositorio.Update(obj);
    }

    @Override
    public ClasseProduto Deletar(int chave) {
        return this.repositorio.Delete(chave);
    }
}