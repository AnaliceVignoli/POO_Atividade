package visao;

import java.util.ArrayList;
import java.time.LocalDate;
import dominio.ClasseProduto;
import servico.ClasseProdutoServico;

public class ClasseProdutoVisao {
    
    private ClasseProdutoServico srv;

    public ClasseProdutoVisao(){
        this.srv = new ClasseProdutoServico();
    }

    public void CriarListar(){
        ClasseProduto cp = new ClasseProduto();
        cp.setCodigo(0);
        cp.setDescricao("Teste");
        cp.setDataInclusao(LocalDate.now());
        this.srv.Criar(cp);
        this.Imprimir(cp);
    }

    public void Exibir(){
        ArrayList<ClasseProduto> lista = this.srv.LerTodos();
        for (ClasseProduto cp : lista) {
            this.Imprimir(cp);
        }
    }

    private void Imprimir(ClasseProduto cp){
        System.out.println("Classe de Produto");
        System.out.println("Código: " + cp.getCodigo());
        System.out.println("Descrição: " + cp.getDescricao());
        System.out.println("Data de Inclusão: " + cp.getDataInclusao());
    }

    public void ExibirEmLinha(){
        ArrayList<ClasseProduto> lista = this.srv.LerTodos();
        for (ClasseProduto cp : lista) {
            this.ImprimirEmLinha(cp);
        }
    }

    private void ImprimirEmLinha(ClasseProduto cp){
        String msg = "Classe de Produto - ";
        msg += "Código: " + cp.getCodigo() + " | ";
        msg += "Descrição: " + cp.getDescricao() + " | ";
        msg += "Data de Inclusão: " + cp.getDataInclusao();
        System.out.println(msg);
    }
}