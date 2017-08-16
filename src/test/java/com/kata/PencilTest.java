package com.kata;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PencilTest {
    private Pencil writeTestPencil;

    @Before
    public void setup() {
        writeTestPencil = new Pencil(100);
    }

    @Test
    public void whenPencilWritesTextIsStored() {
        writeTestPencil.write("text");
        assertThat(writeTestPencil.getText(), is("text"));
    }

    @Test
    public void whenPencilWritesAnythingTextIsStored() {
        writeTestPencil.write("anything");
        assertThat(writeTestPencil.getText(), is("anything"));
    }

    @Test
    public void whenPencilIsNotUsedShouldReturnEmptyString() {
        assertThat(writeTestPencil.getText(), is(""));
    }

    @Test
    public void whenPencilWritesTextShouldBeAppended() {
        writeTestPencil.write("first");
        assertThat(writeTestPencil.getText(), is("first"));
        writeTestPencil.write("second");
        assertThat(writeTestPencil.getText(), is("firstsecond"));
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

    @Test
    public void whenPencilWritesTextWithSpacesTheyShouldBeMaintained() {
        Pencil pencil = new Pencil(27);
        pencil.write("this is a text with spaces");
        assertThat(pencil.getText(), is("this is a text with spaces"));
    }

    @Test
    public void whenPencilWritesALowercaseLetterThenDurabilityDecreasesByOne() {
        Pencil pencil = new Pencil(4);
        pencil.write("t");
        assertThat(pencil.getDurability(), is(3));
    }
}
