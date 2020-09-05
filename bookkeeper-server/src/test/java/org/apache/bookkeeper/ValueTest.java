package org.apache.bookkeeper;


import java.util.HashSet;
import java.util.Set;

import org.apache.bookkeeper.metastore.*;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.powermock.*;
import org.powermock.api.mockito.PowerMockito;

//@RunWith(MockitoJUnitRunner.class)
public class ValueTest {


	Set<String> myEmptySet;
	Set<String> mySet = new HashSet<String>();

	//Value project(Set<String> fields)
	@Test
	public void projectTest() {
		Value v = new Value();          //null
		Assert.assertTrue(v.equals(v.project(null)));

	}
	@Test
	public void projectTest2() {
		Value v = new Value();         //empty set
		Assert.assertTrue(v.equals(v.project(myEmptySet)));

	}
	@Test
	public void projectTest3() {
		mySet.add("my Data");
		Value v = new Value();         //valid input
		Assert.assertNull((v.project(mySet).getField("my Data")));

	}
	
////Value merge(Value other)-------------------------------
	@Test (expected = java.lang.NullPointerException.class)
	public void mergeTest1() {
	   Value v = new Value();         //null
		Assert.assertNull((v.merge(null))); //never reached

	}
	@Test (expected = java.lang.ClassCastException.class)
	public void mergeTest2() {
	   Value v = new Value();         //invalid input
		Assert.assertNull((v.merge((Value)new Object()))); //never reached

	}
	
	
}
