package br.com.senai.dao.util;

import org.junit.*;

public class DAOFactoryTest {
	@Test(expected=NoClassDefFoundError.class)
	public void criarUsuarioDaoTest(){
		DAOFactory.criarUsuarioDao();
	}
	@Test(expected=NoClassDefFoundError.class)
	public void criarOfertaDaoTest(){
		DAOFactory.criarOfertaDao();
	}
	@Test(expected=ExceptionInInitializerError.class)
	public void criarProdutoDaoTest(){
		DAOFactory.criarProdutoDao();
	}
	@Test(expected=NoClassDefFoundError.class)
	public void criarLanceDaoTest(){
		DAOFactory.criarLanceDao();
	}
}
