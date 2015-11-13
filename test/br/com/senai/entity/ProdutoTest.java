package br.com.senai.entity;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class ProdutoTest {
	public Produto entity;
	public ProdutoTest() {
		entity = new Produto();
	}
	
	@Test
	public void getProdutoTest(){
		String produto = "Modem 3G";
		String detalhes = "Modem 3G com chip";
		Produto prod = new Produto(produto,detalhes);
		Assert.assertNotNull(prod);
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
	public void getNomeTest(){
		Assert.assertNull(entity.getNome());
	}
	
	@Test
	public void setNomeTest(){
		String valorEsperado = "modem 4g";
		String valorNaoEsperado = "modem 3g";
		entity.setNome("modem 4g");
		Assert.assertEquals(valorEsperado, entity.getNome());
		Assert.assertNotEquals(valorNaoEsperado, entity.getNome());
	}
	
	@Test
	public void getDetalhesTest(){
		Assert.assertNull(entity.getDetalhes());
	}
	
	@Test
	public void setDetalhesTest(){
		String valorEsperado = "Detalhe do produto";
		String valorNaoEsperado = "Detalhe do produto 2";
		entity.setDetalhes("Detalhe do produto");
		Assert.assertEquals(valorEsperado, entity.getDetalhes());
		Assert.assertNotEquals(valorNaoEsperado, entity.getDetalhes());
	}
	
	@Test
	public void getOfertasTest() {
		Assert.assertNull(entity.getOfertas());
	}
	@Test
	public void setOfertasTest() {
		List<Oferta> ofertas;
		ofertas = new ArrayList<Oferta>();
		Oferta ofertaObj = new Oferta();
		ofertaObj.setId(10);
		ofertas.add(ofertaObj);
		List<Oferta> valorEsperado = ofertas;
		entity.setOfertas(ofertas);
		Assert.assertEquals(valorEsperado, entity.getOfertas());
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
	public void equalsTestProdutp() {
		Assert.assertTrue(entity.equals(new Produto()));
	}
	
	@Test
	public void equalsTestUsuarioIdFalse() {
		Produto produto = new Produto();
		produto.setId(12);
		Assert.assertFalse(entity.equals(produto));
	}
	@Test
	public void equalsTestUsuarioNomeFalse() {
		Produto produto = new Produto();
		produto.setNome("Modem 4G");
		Assert.assertFalse(entity.equals(produto));
	}
	@Test
	public void equalsTestDetalhesFalse() {
		Produto produto = new Produto();
		produto.setDetalhes("Modem 4G detalhando o produto");
		Assert.assertFalse(entity.equals(produto));
	}
	
	@Test
	public void equalsTestOfertasFalse() {
		Produto produto = new Produto();
		produto.setOfertas(new ArrayList<Oferta>());
		Assert.assertFalse(entity.equals(produto));
	}
}
