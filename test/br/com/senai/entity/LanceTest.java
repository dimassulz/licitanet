package br.com.senai.entity;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;


public class LanceTest {
	public Lance entity;
	public LanceTest() {
		entity = new Lance();
	}
	
	@Test
	public void getLanceTest(){
		Usuario usuario = new Usuario();
		Oferta oferta = new Oferta();
		double valor = 999.99;
		Date data = new Date();
		boolean flVencedor = false;
		Lance lance = new Lance(usuario,oferta,valor,data,flVencedor);
		Assert.assertNotNull(lance);
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
	public void getUsuarioTest(){
		Assert.assertNull(entity.getUsuario());
	}
	
	@Test
	public void setUsuarioTest(){
		Usuario valorEsperado = new Usuario();
		entity.setUsuario(new Usuario());
		Assert.assertEquals(valorEsperado, entity.getUsuario());
	}
	
	@Test
	public void getOfertaTest(){
		Assert.assertNull(entity.getOferta());
	}
	
	@Test
	public void setOfertaTest(){
		Oferta valorEsperado = new Oferta();
		entity.setOferta(new Oferta());
		Assert.assertEquals(valorEsperado, entity.getOferta());
	}
	
	@Test
	public void getValorTest(){
		Assert.assertNull(entity.getValor());
	}
	
	@Test
	public void setValorTest(){
		double valorNaoEsperado = 88.98;
		entity.setValor(99.99);
		Assert.assertNotNull(entity.getValor());
		Assert.assertNotEquals(valorNaoEsperado, entity.getValor());
	}
	
	@Test
	public void getDataTest(){
		Assert.assertNull(entity.getData());
		Assert.assertNotNull(entity.getDataStr());
	}
	
	@Test
	public void setDataTest(){
		entity.setData(new Date());
		Assert.assertNotNull(entity.getData());
		Assert.assertNotNull(entity.getDataStr());
	}
	
	@Test
	public void getIsFlVencedorTest(){
		Assert.assertFalse(entity.isFlVencedor());
	}
	
	@Test
	public void setFlVencedorTest(){
		boolean valorNaoEsperado = false;
		entity.setFlVencedor(true);
		Assert.assertNotNull(entity.isFlVencedor());
		Assert.assertNotEquals(valorNaoEsperado, entity.isFlVencedor());
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
	public void equalsTestLance() {
		Assert.assertTrue(entity.equals(new Lance()));
	}
	
	@Test
	public void equalsTestIdFalse() {
		Lance lance = new Lance();
		lance.setId(12);
		Assert.assertFalse(entity.equals(lance));
	}
	
	@Test
	public void equalsTestValorFalse() {
		Lance lance = new Lance();
		lance.setValor(99.99);
		Assert.assertFalse(entity.equals(lance));
	}
	
	@Test
	public void equalsTestDataFalse() {
		Lance lance = new Lance();
		lance.setData(new Date());
		Assert.assertFalse(entity.equals(lance));
	}
	
	@Test
	public void equalsTestFlVencedorFalse() {
		Lance lance = new Lance();
		lance.setFlVencedor(true);
		Assert.assertFalse(entity.equals(lance));
	}
	
	@Test
	public void equalsTestOfertasFalse() {
		Lance lance = new Lance();
		lance.setOferta(new Oferta());
		Assert.assertFalse(entity.equals(lance));
	}
	
	@Test
	public void equalsTestUsuarioFalse() {
		Lance lance = new Lance();
		lance.setUsuario(new Usuario());
		Assert.assertFalse(entity.equals(lance));
	}
}
