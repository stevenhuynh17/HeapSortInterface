package com.HeapSort;

public interface MinHeap<E> extends Heap<E> {
  public E peekMin();
  public E popMin();
  public boolean deleteMin();
}
