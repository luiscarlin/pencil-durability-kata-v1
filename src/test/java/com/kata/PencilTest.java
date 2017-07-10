package com.kata;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PencilTest {
    private Pencil underTest;

    @Before
    public void setup() {
        underTest = new Pencil();
    }

    @Test
    public void whenPencilWritesTextIsStored() {
        underTest.write("text");
        assertThat(underTest.getText(), is("text"));
    }

    @Test
    public void whenPencilWritesAnythingTextIsStored() {
        underTest.write("anything");
        assertThat(underTest.getText(), is("anything"));
    }
}
