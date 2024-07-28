package com.junittests;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@Order(2)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodOrderByNameTest {

  @Test
  void testC() {
    System.out.println("Running testC");
  }

  @Test
  void testD() {
    System.out.println("Running testD");
  }

  @Test
  void testA() {
    System.out.println("Running testA");
  }

  @Test
  void testB() {
    System.out.println("Running testB");
  }
}
