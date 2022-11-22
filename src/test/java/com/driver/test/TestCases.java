package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

import com.driver.DeluxePizza;
import com.driver.Pizza;

public class TestCases {
     public final void testprintHelloWorld(){
         Pizza p = new Pizza(true);
         p.addExtraToppings();
         p.addTakeaway();
         assertEquals(390,p.getPrice());
     }
     public static void main(String[] args){
         testprint
     }
}
