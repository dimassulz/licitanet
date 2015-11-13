package br.com.senai.dao.util;
import org.junit.*;

public class HibernateUtilTest {
	@Test(expected=NoClassDefFoundError.class)	
	public void getSessionFactoryTestFalse(){
		HibernateUtil.getSessionFactory();
	}
}
