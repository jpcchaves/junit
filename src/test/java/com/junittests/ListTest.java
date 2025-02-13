package com.junittests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.*;
import static org.mockito.Mockito.*;

import java.util.List;
import org.junit.jupiter.api.Test;

public class ListTest {

  @Test
  void testMockingList_WhenSizeIsCalled_ShouldReturnTen() {

    // Given
    List<?> list = mock(List.class);

    when(list.size()).thenReturn(10);

    // When & Then
    assertEquals(10, list.size());
  }

  @Test
  void testMockingList_WhenSizeIsCalled_ShouldReturnMultipleValues() {

    // Given
    List<?> list = mock(List.class);

    when(list.size()).thenReturn(10).thenReturn(20).thenReturn(20);

    // When & Then
    assertEquals(10, list.size());
    assertEquals(20, list.size());
    assertEquals(20, list.size());
  }

  @Test
  void testMockingList_WhenGetIsCalled_ShouldReturnJoao() {

    // Given
    List list = mock(List.class);

    given(list.get(0)).willReturn("Joao");

    // When & Then
    assertEquals("Joao", list.get(0));
  }

  @Test
  void testMockingList_WhenGetIsCalled_ThrowsException() {

    // Given
    List list = mock(List.class);

    // When
    given(list.get(anyInt())).willThrow(new RuntimeException("Foo Bar!!"));

    // Then
    assertThrows(RuntimeException.class, () -> list.get(anyInt()));
  }

  @Test
  void testMockingList_WhenGetIsCalledWithArgumentMatcher_ShouldReturnJoao() {

    // Given
    List list = mock(List.class);

    when(list.get(anyInt())).thenReturn("Joao");

    // When & Then
    assertThat(list.get(anyInt()), is("Joao"));
  }
}
