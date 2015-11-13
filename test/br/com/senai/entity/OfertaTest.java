package br.com.senai.entity;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

public class OfertaTest {
	public Oferta entity;
	public OfertaTest() {
		entity = new Oferta();
	}
	
	@Test
	public void getOfertaComIdTest(){
		Integer id = 15;
		Date dataInicio = new Date();
		Date dataFim = new Date();
		Oferta oferta = new Oferta(id,dataInicio,dataFim);
		Assert.assertNotNull(oferta);
	}
	@Test 
	public void getOfertaComProdutoTest(){
		Produto produto = new Produto();
		int qtd = 10;
		Date dataInicio = new Date();
		Date dataFim = new Date();
		String descricao = "Produto descrição";
		Oferta oferta = new Oferta(produto,qtd, dataInicio,dataFim, descricao);
		Assert.assertNotNull(oferta);
	}
	@Test
	public void getOfertaComIdProdutoTest(){
		Integer id = 15;
		Integer idproduto = 10;
		String nomeProduto = "Modem 4g";
		Integer qtde = 10;
		Date dataInicio = new Date();
		Date dataFim = new Date();
		double menorLance = 2000.87;
		double menorLanceUsuario = 4000.68; 
		StatusOferta status = StatusOferta.ANDAMENTO;
		String descricao = "Produto descrição";
		Oferta oferta = new Oferta(id,idproduto, nomeProduto,dataInicio, dataFim, qtde, descricao,menorLance, menorLanceUsuario, status);
		Assert.assertNotNull(oferta);
	}
	@Test
	public void getIdTest(){
		Assert.assertNull(entity.getId());
	}
	
	@Test
	public void setIdTest(){
		Integer valorEsperado = 13;
		Integer valorNaoEsperado = 24;
		entity.setId(13);
		Assert.assertEquals(valorEsperado, entity.getId());
		Assert.assertNotEquals(valorNaoEsperado, entity.getId());
	}
	
	@Test
	public void getQtdTest(){
		Assert.assertNotNull(entity.getQuantidade());
	}
	
	@Test
	public void setQtdTest(){
		entity.setQuantidade(13);
		Assert.assertNotNull(entity.getQuantidade());
	}
	@Test
	public void getDescricaoTest(){
		Assert.assertNull(entity.getDescricao());
	}
	@Test
	public void getDataInicioTest(){
		Assert.assertNull(entity.getDataInicio());
	}
	@Test
	public void getDataFimTest(){
		Assert.assertNull(entity.getDataFim());
	}
	@Test
	public void getStatusTest(){
		Assert.assertNull(entity.getStatus());
	}
	@Test
	public void getLanceTest(){
		Assert.assertNull(entity.getLance());
	}
	
	@Test
	public void getMenorLanceTest(){
		Assert.assertNull(entity.getMenorLance());
	}
	
	@Test
	public void getMenorLanceUsuarioTest(){
		Assert.assertNull(entity.getMenorLanceUsuario());
	}
	@Test
	public void hashCodeTest() {
		Assert.assertNotNull(entity.hashCode());
	}
	@Test
	public void equalsTestFalse() {
		Assert.assertFalse(entity.equals(null));
	}
	@Test
	public void equalsTestObject() {
		Assert.assertFalse(entity.equals(this));
	}
	@Test
	public void equalsTestOferta() {
		Assert.assertTrue(entity.equals(new Oferta()));
	}
	
	@Test
	public void equalsTestIdFalse() {
		Oferta oferta = new Oferta();
		oferta.setId(12);
		Assert.assertFalse(entity.equals(oferta));
	}
	
	@Test
	public void equalsTestMenorLanceFalse() {
		Oferta oferta = new Oferta();
		oferta.setMenorLance(12.99);
		Assert.assertFalse(entity.equals(oferta));
	}
	
	@Test
	public void equalsTestMenorLanceUsuarioFalse() {
		Oferta oferta = new Oferta();
		oferta.setMenorLanceUsuario(12.789);
		Assert.assertFalse(entity.equals(oferta));
	}
	
	@Test
	public void equalsTestDescricaoFalse() {
		Oferta oferta = new Oferta();
		oferta.setDescricao("descricao do produto");
		Assert.assertFalse(entity.equals(oferta));
	}
	
	@Test
	public void equalsTestQtdFalse() {
		Oferta oferta = new Oferta();
		oferta.setQuantidade(5);
		Assert.assertFalse(entity.equals(oferta));
	}
	
	@Test
	public void equalsTestStatusFalse() {
		Oferta oferta = new Oferta();
		oferta.setStatus(StatusOferta.FINALIZADA);
		Assert.assertFalse(entity.equals(oferta));
	}
}
