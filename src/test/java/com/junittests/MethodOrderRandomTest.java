package com.junittests;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.Random.class)
public class MethodOrderRandomTest {

  @Test
  void testA() {
    System.out.println("Running testA");
  }

  @Test
  void testB() {
    System.out.println("Running testB");
  }

  @Test
  void testC() {
    System.out.println("Running testC");
  }

  @Test
  void testD() {
    System.out.println("Running testD");
  }
}
