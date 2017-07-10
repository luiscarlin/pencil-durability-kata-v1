package com.kata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PencilTest {

    @Test
    public void whenPencilWritesTextIsStored() {
        Pencil pencil = new Pencil();
        pencil.write("text");
        assertThat(pencil.getText(), is("text"));
    }

}
