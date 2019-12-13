package com.HeapSort;

public interface MaxHeap<E> extends Heap<E> {
  public E peekMax();
  public E popMax();
  public boolean deleteMax();
}
