package br.com.senai.entity;

import org.junit.Assert;
import org.junit.Test;

public class StatusOfertaTest {

	@Test
	public void statusOfetaTest(){
		Assert.assertNotNull(StatusOferta.PROGRAMADA);
	}
}
