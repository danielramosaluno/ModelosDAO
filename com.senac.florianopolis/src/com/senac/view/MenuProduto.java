package com.senac.view;

import javax.swing.JOptionPane;

import com.senac.DAO.ProdutoDAO;
import com.senac.modelos.Produto;

public class MenuProduto {
	private static final int MENU_CADASTRAR_PRODUTO = 1;
	private static final int MENU_LISTAR_PRODUTO = 2;
	private static final int MENU_EDITAR_PRODUTO = 3;
	private static final int MENU_EXCLUIR_PRODUTO = 4;
	private static final int MENU_PESQUISA_ID_PRODUTO = 5;
	private static final int MENU_SAIR = 6;
	
	public static int showMenu(){
		String msg = MENU_CADASTRAR_PRODUTO + " - Cadastrar produto\n"
				+ MENU_LISTAR_PRODUTO + " - Listar produtos\n"
				+ MENU_EDITAR_PRODUTO + " - Editar produto\n"
				+ MENU_EXCLUIR_PRODUTO + " - Excluir produto\n"
				+ MENU_PESQUISA_ID_PRODUTO + " - Pesquisar por id\n"
				+ MENU_SAIR + " - Sair";
		return Painel.inputInt(msg);
	}
	
	
	public static void programa(){
		Produto p;
		ProdutoDAO pDAO = new ProdutoDAO();
		int opcao;
		do{
			opcao = showMenu();
			
			switch (opcao) {
				case MENU_CADASTRAR_PRODUTO:
					p = putProduto();
					String res = pDAO.cadastrar(p);
					Painel.show(res);
					break;
					
				case MENU_EDITAR_PRODUTO:
					Produto prod = new Produto(7, "Arros", 5.50, 10);
					p = editProduto(prod);
					Painel.show(pDAO.editar(p));
					break;
				case MENU_EXCLUIR_PRODUTO:
					Produto prodExcluir = new Produto(7, "Arros", 5.50, 10);
					int confirma = excluirProduto(prodExcluir);
					if(confirma==0){
						Painel.show(pDAO.excluir(prodExcluir));
					}
					break;
					
				case MENU_LISTAR_PRODUTO:
					Painel.show(pDAO.listar());
					break;
					
				case MENU_PESQUISA_ID_PRODUTO:
					int id = Painel.inputInt("Digite o código do produto");
					Painel.show(pDAO.buscaPorId(id));
					break;
					
				case MENU_SAIR:
					Painel.show("Bye");
					break;
					
				default:
					Painel.show("Opção inválida");
					break;
			}
		}while(opcao != MENU_SAIR);

	}
	
	public static Produto putProduto(){
		Produto produto = new Produto();
		produto.setId(Painel.inputInt("Digite o código do produto"));
		produto.setNome(Painel.input("Digite o nome do produto"));
		produto.setQuantidade(Painel.inputInt("Digite a quantidade"));
		produto.setValor(Painel.inputDouble("Digite o valor do produto"));
		return produto;
	}
	
	public static Produto editProduto(Produto prod){
		Produto produto = new Produto();
		produto.setId(prod.getId());
		produto.setNome(Painel.input("Digite o nome do produto", prod.getNome()));
		produto.setQuantidade(Painel.inputInt("Digite a quantidade", String.valueOf(prod.getQuantidade())));
		produto.setValor(Painel.inputDouble("Digite o valor do produto", String.valueOf(prod.getValor())));
		return produto;
	}
	
	public static int excluirProduto(Produto prod){
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja excluir o produto "+prod.getNome()+"?");
		return escolha;
	}
}
