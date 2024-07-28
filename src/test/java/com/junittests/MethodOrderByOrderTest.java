package com.junittests;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodOrderByOrderTest {

  StringBuilder actualValue = new StringBuilder();

  @AfterEach
  void afterEach() {
    System.out.println("The actual value is " + actualValue);
  }

  @Test
  @Order(3)
  void testA() {
    System.out.println("Running testA");
    actualValue.append("1");
  }

  @Test
  @Order(2)
  void testB() {
    System.out.println("Running testB");
    actualValue.append("2");
  }

  @Test
  @Order(1)
  void testC() {
    System.out.println("Running testC");
    actualValue.append("3");
  }

  @Test
  @Order(0)
  void testD() {
    System.out.println("Running testD");
    actualValue.append("4");
  }
}
