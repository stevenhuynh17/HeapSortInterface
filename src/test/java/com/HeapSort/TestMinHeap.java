package com.HeapSort;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.ThreadLocalRandom;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMinHeap {
  private MinHeap<Integer> heap;
  
  @BeforeEach
  public void setup() {
    this.heap = new MyMinHeap();
  }
  
  @Test
  public void checkConstructor() {
    assertNotNull(this.heap);
  }
  
  @Test
  public void checkEmptyHeap() {
    assertTrue(this.heap.isEmpty());
    assertTrue(this.heap.size() == 0);
  }
  
  @Test
  public void checkAddOneElement() {
    this.heap.insert(Integer.valueOf(5));
    assertEquals(1, this.heap.size());
    assertFalse(this.heap.isEmpty());
  }
  
  public void addN(int n) {
    for (int i = 0; i < n; i++) {
      this.heap.insert(Integer.valueOf(i));
    }
  }
  
  @Test
  public void checkAddRandomNumElements() {
    // Ref: https://stackoverflow.com/a/363692
    int rand = ThreadLocalRandom.current().nextInt(10, 20 + 1);
    addN(rand);
    assertEquals(rand, this.heap.size());
    assertFalse(this.heap.isEmpty());
  }
  
  @Test
  public void addOneElementFromArray() {
    Integer arr[] = {1};
    this.heap.heapify(arr);
    assertFalse(this.heap.isEmpty());
    assertEquals(1, this.heap.size());
  }
  
  @Test
  public void findMinFromArray() {
    
  }
}
