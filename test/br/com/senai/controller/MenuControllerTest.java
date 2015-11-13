package br.com.senai.controller;

import org.junit.Assert;
import org.junit.Test;

public class MenuControllerTest {
	
	public MenuController ctrl;
	public MenuControllerTest() {
		ctrl = new MenuController();
	}
	@Test
	public void homeTest(){
		String valEsperado = "/pages/publico/admin.jsf";
		Assert.assertEquals(valEsperado, ctrl.home());
	}
	
	@Test
	public void usuarioCadPFTest(){
		String valEsperado = "/pages/admin/cadUsuarioPF.jsf";
		Assert.assertEquals(valEsperado, ctrl.usuarioCadPF());
	}
	@Test
	public void usuarioCadPJTest(){
		String valEsperado = "/pages/admin/cadUsuarioPJ.jsf";
		Assert.assertEquals(valEsperado, ctrl.usuarioCadPJ());
	}
	@Test
	public void usuarioConsultarTest(){
		String valEsperado = "/pages/admin/listarUsuarios.jsf";
		Assert.assertEquals(valEsperado, ctrl.usuarioConsultar());
	}
	@Test
	public void produtoNovoTest(){
		String valEsperado = "/pages/admin/cadProduto.jsf";
		Assert.assertEquals(valEsperado, ctrl.produtoNovo());
	}
	@Test
	public void produtoConsultarTest(){
		String valEsperado = "/pages/admin/listarProdutos.jsf";
		Assert.assertEquals(valEsperado, ctrl.produtoConsultar());
	}
	@Test
	public void produtoAlterarTest(){
		String valEsperado = "/pages/admin/cadProduto.jsf";
		Assert.assertEquals(valEsperado, ctrl.produtoAlterar());
	}
	@Test
	public void ofertaNovoTest(){
		String valEsperado = "../admin/cadOferta.jsf";
		Assert.assertEquals(valEsperado, ctrl.ofertaNovo());
	}
	@Test
	public void ofertaConsultarTest(){
		String valEsperado = "../admin/listarOfertas.jsf";
		Assert.assertEquals(valEsperado, ctrl.ofertaConsultar());
	}
	@Test
	public void leiloesTest(){
		String valEsperado = "/pages/lancador/leiloes.jsf";
		Assert.assertEquals(valEsperado, ctrl.leiloes());
	}
	@Test
	public void lancesTest(){
		String valEsperado = "/pages/lancador/lances.jsf";
		Assert.assertEquals(valEsperado, ctrl.lances());
	}
}
