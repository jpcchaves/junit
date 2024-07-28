package com.junittests;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)
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
