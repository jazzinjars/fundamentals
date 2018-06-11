package com.jazzinjars.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CustomListTest {

	@Test
	public void givenEmptyList_whenIsEmpty_thenTrueIsReturned() {
		List<Object> list = new CustomList<>();

		Assertions.assertTrue(list.isEmpty());
	}

	@Test
	public void givenNonEmptyList_whenIsEmpty_thenFalseIsReturned() {
		List<Object> list = new CustomList<>();
		list.add(null);

		Assertions.assertFalse(list.isEmpty());
	}

	@Test
	public void givenListWithAnElement_whenSize_thenOneIsReturned() {
		List<Object> list = new CustomList<>();
		list.add(null);

		Assertions.assertEquals(1, list.size(), "Different number of elements in the list");
	}

	@Test
	public void givenListWithanElement_whenGet_thenThatElementIsReturned() {
		List<Object> list = new CustomList<>();
		list.add("jazzinjars");
		Object element = list.get(0);

		Assertions.assertEquals("jazzinjars", element, "Different elements");
	}

	@Test
	public void givenEmptyList_whenElementIsAdded_thenGetReturnsThatElement() {
		List<Object> list = new CustomList<>();
		boolean succeeded = list.add(null);

		Assertions.assertTrue(succeeded);
	}

	@Test
	public void givenListWithAnElement_whenAnotherIsAdded_thenGetReturnsBoth() {
		List<Object> list = new CustomList<>();
		list.add("john coltrane");
		list.add("miles davis");
		Object element1 = list.get(0);
		Object element2 = list.get(1);

		Assertions.assertEquals("john coltrane", element1, "Different elements");
		Assertions.assertEquals("miles davis", element2, "Different elements");

	}
}
