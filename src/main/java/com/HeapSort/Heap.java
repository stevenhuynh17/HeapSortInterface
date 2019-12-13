package com.HeapSort;

public interface Heap<E> {
  public boolean insert(E element);
  public void createHeap();
  public void heapify(E inputArray[]);
  public int size();
  public boolean isEmpty();
}
