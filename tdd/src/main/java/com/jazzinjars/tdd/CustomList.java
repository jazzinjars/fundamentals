package com.jazzinjars.tdd;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class CustomList<E> implements List<E> {

	// The first implementation of the methods should return 0 or false to iterate over TDD cycles
	// After that, refactor them to pass the tests

	private Object[] internal = new Object[]{};

	@Override
	public int size() {
		return internal.length;
	}

	@Override
	public boolean isEmpty() {
		return internal.length == 0;
	}

	@Override
	public boolean contains(Object o) {
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		return null;
	}

	@Override
	public void forEach(Consumer<? super E> action) {

	}

	@Override
	public Object[] toArray() {
		return new Object[0];
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return null;
	}

	@Override
	public boolean add(E e) {
		Object[] temp = Arrays.copyOf(internal, internal.length + 1);
		temp[internal.length] = e;
		internal = temp;
		return true;
	}

	@Override
	public boolean remove(Object o) {
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean removeIf(Predicate<? super E> filter) {
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return false;
	}

	@Override
	public void replaceAll(UnaryOperator<E> operator) {

	}

	@Override
	public void sort(Comparator<? super E> c) {

	}

	@Override
	public void clear() {

	}

	@Override
	public E get(int index) {
		return (E) internal[index];
	}

	@Override
	public E set(int index, E element) {
		return null;
	}

	@Override
	public void add(int index, E element) {

	}

	@Override
	public E remove(int index) {
		return null;
	}

	@Override
	public int indexOf(Object o) {
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		return 0;
	}

	@Override
	public ListIterator<E> listIterator() {
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		return null;
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		return null;
	}

	@Override
	public Spliterator<E> spliterator() {
		return null;
	}

	@Override
	public Stream<E> stream() {
		return null;
	}

	@Override
	public Stream<E> parallelStream() {
		return null;
	}
}
