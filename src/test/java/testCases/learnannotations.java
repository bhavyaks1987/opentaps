package testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class learnannotations {
	// annotation order does not matter here as it will execute in bs,bt,bc,bm,test,am,ac,at,as order
	// @test is mandatory to execute bs,bt,bc,bm,test,am,ac,at,.....when we run @test it internally checks 
	//for bm executes,bc,bt,bs..then @test will execute..then it chceks for @am,ac,at,as
	
	
	@Test
	public void test1() {
		System.out.println("test");
	}
	
	@Test
	public void test2() {
		System.out.println("test");
	}
	
	@BeforeSuite
	public void beforsuite() {
	System.out.println("before suite");
	}
	
	
	@BeforeTest
	public void beforetest() {
	System.out.println("before test");
	}
	
	@BeforeClass
	public void beforeclass() {
	System.out.println("before class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
		}
	
	
	@AfterMethod
	public void aftermethod() {
	System.out.println("aftermethod");
	}
	
	
	@AfterClass
	public void afterclass() {
	System.out.println("afterclass");
	}
	
	@AfterTest
	public void aftertest() {
	System.out.println("after test");
	}
	
	@AfterSuite
	public void aftersuite1() {
		System.out.println("aftersuite");
		}
	

	// testng annotations
//@beforesuite-----------------1time
    //  @beforetest------------1time
       //  @beforeclass--------1time
         //   @before method 
                      //@test-create lead
                      //@test-edit lead
              //@aftermethod 
         //@ afterclass--------1time
       //@aftertest------------1time
//@aftersuite------------------1time

/* taht is
 * //@beforesuite
    //  @beforetest
       //  @beforeclass
         //   @before method 
                      //@test-create lead
           //@aftermethod
            @before method 
                      //@test-edit lead
              //@aftermethod 
                @before method 
                      //@test-delete  lead
              //@aftermethod
               
         //@ afterclass
       //@aftertest
//@aftersuite
 */

	
	
	
	

}
