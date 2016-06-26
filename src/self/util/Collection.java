package self.util;

import java.util.Iterator;

public interface Collection<E> extends Iterable<E> {

  int size();

  boolean isEmpty();

  boolean contains(Object o);

  Iterator<E> iterator();

  Object[] toArray();

  <T> T[] toArray(T[] a);

  boolean add(E e);

  boolean remove(Object obj);

  boolean containsAll(Collection<?> c);

  boolean addAll(Collection<?> c);

  boolean removeAll(Collection<?> c);

  boolean retainAll(Collection<?> c);

  void clear();

  boolean equals(Object o);

  int hashCode();
}
