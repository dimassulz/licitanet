package br.com.senai.entity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class UsuarioTest {
	public Usuario entity;
	public UsuarioTest() {
		entity = new Usuario();
	}
	
	@Test
	public void getIdTest(){
		Assert.assertNull(entity.getId());
	}
	
	@Test
	public void setIdTest(){
		Integer valorEsperado = 10;
		Integer valorNaoEsperado = 20;
		entity.setId(10);
		Assert.assertEquals(valorEsperado, entity.getId());
		Assert.assertNotEquals(valorNaoEsperado, entity.getId());
	}
	
	@Test
	public void getLoginTest(){
		Assert.assertNull(entity.getLogin());
	}
	
	@Test
	public void setLoginTest(){
		String valorEsperado = "joao";
		String valorNaoEsperado = "paulo";
		entity.setLogin("joao");
		Assert.assertEquals(valorEsperado, entity.getLogin());
		Assert.assertNotEquals(valorNaoEsperado, entity.getLogin());
	}
	
	@Test
	public void getSenhaTest(){
		Assert.assertNull(entity.getSenha());
	}
	
	@Test
	public void setSenhaTest(){
		String valorEsperado = "123456";
		String valorNaoEsperado = "321654";
		entity.setSenha("123456");
		Assert.assertEquals(valorEsperado, entity.getSenha());
		Assert.assertNotEquals(valorNaoEsperado, entity.getSenha());
	}
	
	@Test
	public void getNomeTest(){
		Assert.assertNull(entity.getNome());
	}
	
	@Test
	public void setNomeTest(){
		String valorEsperado = "joao feliz";
		String valorNaoEsperado = "joao triste";
		entity.setNome("joao feliz");
		Assert.assertEquals(valorEsperado, entity.getNome());
		Assert.assertNotEquals(valorNaoEsperado, entity.getNome());
	}
	
	@Test
	public void getCpfTest(){
		Assert.assertNull(entity.getCpf());
	}
	
	@Test
	public void setCpfTest(){
		String valorEsperado = "692.123.400-10";
		String valorNaoEsperado = "692.123.400-20";
		entity.setCpf("692.123.400-10");
		Assert.assertEquals(valorEsperado, entity.getCpf());
		Assert.assertNotEquals(valorNaoEsperado, entity.getCpf());
	}
	
	@Test
	public void getRgTest() {
		Assert.assertNull(entity.getRg());
	}
	@Test
	public void setRgTest() {
		String valorEsperado = "123456897 SSP/DF";
		String valorNaoEsperado = "32165487 SSP/GO";
		entity.setRg("123456897 SSP/DF");
		Assert.assertEquals(valorEsperado, entity.getRg());
		Assert.assertNotEquals(valorNaoEsperado, entity.getRg());
	}
	@Test
	public void getEmailTest() {
		Assert.assertNull(entity.getEmail());
	}
	@Test
	public void setEmailTest() {
		String valorEsperado = "dimassulz@gmail.com";
		String valorNaoEsperado = "teste@gmail.com";
		entity.setEmail("dimassulz@gmail.com");
		Assert.assertEquals(valorEsperado, entity.getEmail());
		Assert.assertNotEquals(valorNaoEsperado, entity.getEmail());
	}
	@Test
	public void getTelefoneTest() {
		Assert.assertNull(entity.getTelefone());
	}
	@Test
	public void setTelefoneTest() {
		String valorEsperado = "(61)2154-8791";
		String valorNaoEsperado = "(48)2154-8791";
		entity.setTelefone("(61)2154-8791");
		Assert.assertEquals(valorEsperado, entity.getTelefone());
		Assert.assertNotEquals(valorNaoEsperado, entity.getTelefone());
	}
	@Test
	public void getRazaoSocialTest() {
		Assert.assertNull(entity.getRazaoSocial());
	}
	@Test
	public void setRazaoSocialTest() {
		String valorEsperado = "ABC LTDA";
		String valorNaoEsperado = "ABCD LTDA";
		entity.setRazaoSocial("ABC LTDA");
		Assert.assertEquals(valorEsperado, entity.getRazaoSocial());
		Assert.assertNotEquals(valorNaoEsperado, entity.getRazaoSocial());
	}
	@Test
	public void getNomeFantasiaTest() {
		Assert.assertNull(entity.getNomeFantasia());
	}
	@Test
	public void setNomeFantasiaTest() {
		String valorEsperado = "Leilao BSB";
		String valorNaoEsperado = "Leilao GYN";
		entity.setNomeFantasia("Leilao BSB");
		Assert.assertEquals(valorEsperado, entity.getNomeFantasia());
		Assert.assertNotEquals(valorNaoEsperado, entity.getNomeFantasia());
	}
	@Test
	public void getCnpjTest() {
		Assert.assertNull(entity.getCnpj());
	}
	@Test
	public void setCnpjTest() {
		String valorEsperado = "24.888.863/0001-05";
		String valorNaoEsperado = "24.888.863/0001-25";
		entity.setCnpj("24.888.863/0001-05");
		Assert.assertEquals(valorEsperado, entity.getCnpj());
		Assert.assertNotEquals(valorNaoEsperado, entity.getCnpj());
	}
	@Test
	public void getIeTest() {
		Assert.assertNull(entity.getIe());
	}
	@Test
	public void setIeTest() {
		String valorEsperado = "3216547 ME";
		String valorNaoEsperado = "123445 ME";
		entity.setIe("3216547 ME");
		Assert.assertEquals(valorEsperado, entity.getIe());
		Assert.assertNotEquals(valorNaoEsperado, entity.getIe());
	}
	@Test
	public void getTipoTest() {
		Assert.assertNull(entity.getTipo());
	}
	@Test
	public void setTipoTest() {
		String valorEsperado = "PF";
		String valorNaoEsperado = "PJ";
		entity.setTipo("PF");
		Assert.assertEquals(valorEsperado, entity.getTipo());
		Assert.assertNotEquals(valorNaoEsperado, entity.getTipo());
	}
	@Test
	public void isAtivoTest() {
		Assert.assertFalse(entity.isAtivo());
	}
	@Test
	public void setAtivoTest() {
		Boolean valorEsperado = true;
		Boolean valorNaoEsperado = false;
		entity.setAtivo(true);
		Assert.assertEquals(valorEsperado, entity.isAtivo());
		Assert.assertNotEquals(valorNaoEsperado, entity.isAtivo());
	}
	@Test
	public void getPermissaoTest() {
		Assert.assertNull(entity.getPermissao());
	}
	@Test
	public void setPermissaoTest() {
		Set<String> permissao;
		permissao = new HashSet<String>();
		permissao.add("asdf");
		Set<String> valorEsperado = permissao;
		entity.setPermissao(permissao);
		Assert.assertEquals(valorEsperado, entity.getPermissao());
	}
	@Test
	public void getLanceTest() {
		Assert.assertNull(entity.getLance());
	}
	@Test
	public void setLanceTest() {
		List<Lance> lance;
		lance = new ArrayList<Lance>();
		Lance lanceObj = new Lance();
		lanceObj.setId(15);
		lance.add(lanceObj);
		List<Lance> valorEsperado = lance;
		entity.setLance(lance);
		Assert.assertEquals(valorEsperado, entity.getLance());
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
		Assert.assertFalse(entity.equals(new Object()));
	}
	@Test
	public void equalsTestUsuario() {
		Assert.assertTrue(entity.equals(new Usuario()));
	}
	
	@Test
	public void equalsTestUsuarioAtivo() {
		Usuario usuario = new Usuario();
		usuario.setAtivo(true);
		Assert.assertFalse(entity.equals(usuario));
	}
	
	@Test
	public void equalsTestUsuarioCNPJFalse() {
		Usuario usuario = new Usuario();
		usuario.setCnpj("65.153.617/0001-92");
		Assert.assertFalse(entity.equals(usuario));
	}
	
	@Test
	public void equalsTestUsuarioCPFFalse() {
		Usuario usuario = new Usuario();
		usuario.setCpf("123.123.123-50");
		Assert.assertFalse(entity.equals(usuario));
	}
	
	@Test
	public void equalsTestUsuarioIdFalse() {
		Usuario usuario = new Usuario();
		usuario.setId(12);
		Assert.assertFalse(entity.equals(usuario));
	}
	
	@Test
	public void equalsTestUsuarioIeFalse() {
		Usuario usuario = new Usuario();
		usuario.setIe("12348797 ME");
		Assert.assertFalse(entity.equals(usuario));
	}
	
	@Test
	public void equalsTestUsuarioLoginFalse() {
		Usuario usuario = new Usuario();
		usuario.setLogin("dimassulz");
		Assert.assertFalse(entity.equals(usuario));
	}
	
	@Test
	public void equalsTestUsuarioNomeFalse() {
		Usuario usuario = new Usuario();
		usuario.setNome("Dimas");
		Assert.assertFalse(entity.equals(usuario));
	}
	
	
	@Test
	public void equalsTestUsuarioNomeFantasiaFalse() {
		Usuario usuario = new Usuario();
		usuario.setNomeFantasia("asdb");
		Assert.assertFalse(entity.equals(usuario));
	}
	
	@Test
	public void equalsTestUsuarioRazaoSocialFalse() {
		Usuario usuario = new Usuario();
		usuario.setRazaoSocial("ABCD LTDA");
		Assert.assertFalse(entity.equals(usuario));
	}
	
	@Test
	public void equalsTestUsuarioRgFalse() {
		Usuario usuario = new Usuario();
		usuario.setRg("123456789");
		Assert.assertFalse(entity.equals(usuario));
	}
	
	@Test
	public void equalsTestUsuarioSenhaFalse() {
		Usuario usuario = new Usuario();
		usuario.setSenha("123456");
		Assert.assertFalse(entity.equals(usuario));
	}
	
	@Test
	public void equalsTestUsuarioTelefoneFalse() {
		Usuario usuario = new Usuario();
		usuario.setTelefone("(61) 9878-9879");
		Assert.assertFalse(entity.equals(usuario));
	}
	
	@Test
	public void equalsTestUsuarioEmailFalse() {
		Usuario usuario = new Usuario();
		usuario.setEmail("dimassulz@gmail.com");
		Assert.assertFalse(entity.equals(usuario));
	}
	
	@Test
	public void equalsTestUsuarioTipoFalse() {
		Usuario usuario = new Usuario();
		usuario.setTipo("PF");
		Assert.assertFalse(entity.equals(usuario));
	}
	
	
}
