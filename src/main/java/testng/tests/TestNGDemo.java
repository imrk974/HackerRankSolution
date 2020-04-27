package testng.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("Before Suit");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("Before test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod(groups={"sanity"})
	public void beforeMethod() {
		System.out.println("Before method");
	}
	
	@Test (priority=1,suiteName="suite1",groups={"smoke"})
	public void test1() {
		System.out.println("inside test1");
	}
	
	@Test (priority=1,suiteName="suite2",groups={"smoke"})
	public void test2() {
		System.out.println("inside test2");
	}
	
	@Test (priority=1,suiteName="suite2",groups={"sanity"})
	public void test3() {
		System.out.println("inside test3");
	}
	@Test (priority=1,suiteName="suite2",groups={"sanity"})
	public void test4() {
		System.out.println("inside test4");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("After test");
	}
	
	@AfterSuite
	public void afterSuit() {
		System.out.println("After Suit");
	}
	
	
}
