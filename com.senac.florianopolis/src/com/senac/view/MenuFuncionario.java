package com.senac.view;

import com.senac.DAO.FuncionarioDAO;
import com.senac.modelos.Funcionario;


public class MenuFuncionario {
	private static final int MENU_CADASTRAR_FUNCIONARIO = 1;
	private static final int MENU_LISTAR_FUNCIONARIO = 2;
	private static final int MENU_EDITAR_FUNCIONARIO = 3;
	private static final int MENU_EXCLUIR_FUNCIONARIO = 4;
	private static final int MENU_PESQUISA_ID_FUNCIONARIO = 5;
	private static final int MENU_SAIR = 6;

private static int showMenu(){
	String msg = MENU_CADASTRAR_FUNCIONARIO + " - Cadastrar funcionario\n"
			+ MENU_LISTAR_FUNCIONARIO + " - Listar funcionario\n"
			+ MENU_EDITAR_FUNCIONARIO + " - Editar funcionario\n"
			+ MENU_EXCLUIR_FUNCIONARIO + " - Excluir funcionario\n"
			+ MENU_PESQUISA_ID_FUNCIONARIO + " - Pesquisar por id\n"
			+ MENU_SAIR + " - Sair";
	return Painel.inputInt(msg);

}


public static void programa(){
	Funcionario f;
	FuncionarioDAO fDAO = new FuncionarioDAO();
	int opcao;
	do{
		opcao = showMenu();
		
		switch (opcao) {
			case MENU_CADASTRAR_FUNCIONARIO:
				f = putFuncionario();
				String res = fDAO.cadastrar(f);
				Painel.show(res);
				break;
				
			case MENU_EDITAR_FUNCIONARIO:
				Funcionario func = new Funcionario(7, "Daniel", "Cinfeiteiro", 38);
				f = editFuncionario(func);
				Painel.show(fDAO.editar(f));
				break;
			case MENU_EXCLUIR_FUNCIONARIO:
				Funcionario funcExcluir = new Funcionario(7, "Daniel", "Cinfeiteiro", 38);
				int confirma = excluirFuncionario(funcExcluir);
				if(confirma==0){
					Painel.show(fDAO.excluir(funcExcluir));
				}
				break;
				
			case MENU_LISTAR_FUNCIONARIO:
				Painel.show(fDAO.listar());
				break;
				
			case MENU_PESQUISA_ID_FUNCIONARIO:
				int id = Painel.inputInt("Digite o código do produto");
				Painel.show(fDAO.buscaPorId(id));
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


private static int excluirFuncionario(Funcionario funcExcluir) {
	// TODO Auto-generated method stub
	return 0;
}


private static Funcionario editFuncionario(Funcionario func) {
	// TODO Auto-generated method stub
	return null;
}


private static Funcionario putFuncionario() {
	// TODO Auto-generated method stub
	return null;
}

}
