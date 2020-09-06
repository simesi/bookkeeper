package org.apache.bookkeeper;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.powermock.*;

import com.google.common.net.InetAddresses;

import org.junit.Test;
import org.junit.Assert;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.apache.bookkeeper.net.*;


public class BookieSocketAddressTest {


	/*@Before
	public void initMock() {
		Mockito.when(InetAddresses.isInetAddress(Mockito.anyString())).thenReturn(true);
	}*/



	@Test (expected=java.lang.NullPointerException.class)
	public void BookieSocketAddressConstructorTest() throws UnknownHostException {
		//null input
		BookieSocketAddress b = new BookieSocketAddress(null);
		Assert.assertNotNull(b);
	}
	@Test
	public void BookieSocketAddressConstructorTest2() throws UnknownHostException {

		 
		InetAddresses mock = Mockito.mock(InetAddresses .class);
	    Mockito.when(mock.isInetAddress(Mockito.anyString())).thenReturn(true);
		
		//valid input
		BookieSocketAddress b = new BookieSocketAddress("hostname:1");
		Assert.assertNotNull(b.getSocketAddress());
	}


}
