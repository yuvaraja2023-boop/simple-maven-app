package com.example;

import org.junit.test;
import static org.junit.Assert.*;

public class appTest {
  
  @Test
  public void test.Add(){
    App.app=new App();
    assertEquals(5,app.add(2,3));
  }
}
    
