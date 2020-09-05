package org.apache.bookkeeper;


import org.apache.bookkeeper.bookie.storage.ldb.*;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;

public class WriteCacheTest {

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void  WriteCacheConstructorTest() {
		    WriteCache wc = new WriteCache(null, 0 , 0);
		    
	}
	
	
}
