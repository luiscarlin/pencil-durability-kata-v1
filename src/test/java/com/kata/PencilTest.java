package com.kata;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PencilTest {
    private Pencil underTest;

    @Before
    public void setup() {
        underTest = new Pencil(0);
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

    @Test
    public void whenPencilIsNotUsedShouldReturnEmptyString() {
        assertThat(underTest.getText(), is(""));
    }

    @Test
    public void whenPencilWritesTextShouldBeAppended() {
        underTest.write("first");
        assertThat(underTest.getText(), is("first"));
        underTest.write("second");
        assertThat(underTest.getText(), is("firstsecond"));
    }

    @Test
    public void whenICreateAPencilDurabilityCanBeSetAndCaBeRetrieved() {
        Pencil pencil = new Pencil(1);
        assertThat(pencil.getDurability(), is(1));

        Pencil secondPencil = new Pencil(2);
        assertThat(secondPencil.getDurability(), is(2));

    }

    @Test
    public void whenPencilWritesCharactersDurabilityDiminishesByOne() {
        Pencil pencil = new Pencil(4);
        pencil.write("h");
        assertThat(pencil.getDurability(), is(3));
    }

    @Test
    public void whenPencilWritesTwoCharsDurabilityDiminishesByTwo() {
        Pencil pencil = new Pencil(4);
        pencil.write("he");
        assertThat(pencil.getDurability(), is(2));
    }

    @Test
    public void whenPencilWritesASpaceDurabilityShouldNotDecrease() {
        Pencil pencil = new Pencil(4);
        pencil.write(" ");
        assertThat(pencil.getDurability(), is(4));
    }

    @Test
    public void whenPencilWritesTwoSpacesDurabilityShouldNotDecrease() {
        Pencil pencil = new Pencil(4);
        pencil.write("  ");
        assertThat(pencil.getDurability(), is(4));
    }

    @Test
    public void whenPencilWritesANewLineDurabilityShouldNotDecrease() {
        Pencil pencil = new Pencil(4);
        pencil.write("\n");
        assertThat(pencil.getDurability(), is(4));
    }
}
