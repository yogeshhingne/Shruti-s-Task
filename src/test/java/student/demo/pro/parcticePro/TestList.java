package student.demo.pro.parcticePro;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class TestList {

    @Test
    public void testList_ReturnsSingle_value() {

        List mocklist = mock(List.class);
        when(mocklist.size()).thenReturn(1);

        assertEquals(1, mocklist.size());
        assertEquals(1, mocklist.size());

        System.out.println(mocklist.size());
        System.out.println(mocklist);
    }


    @Test
    public void testList_Returns_MultipleValues() {

        List mocklist = mock(List.class);
        when(mocklist.size()).thenReturn(1).thenReturn(2).thenReturn(3).thenReturn(4);

        assertEquals(1, mocklist.size());
        assertEquals(2, mocklist.size());
        assertEquals(3, mocklist.size());
        assertEquals(4,mocklist.size());

        System.out.println(mocklist.size());
        System.out.println(mocklist);

    }
    @Test
    public void testList_get() {

        List mocklist = mock(List.class);

        when(mocklist.get(0)).thenReturn("Mockito");

        assertEquals("Mockito", mocklist.get(0));
        System.out.println(mocklist.get(0));
    }
    @Test
    public void test() {

        List spyArrayList = spy(ArrayList.class);
        assertEquals(0, spyArrayList.size());

        // adding an item in the list
        spyArrayList.add("Mockito");
        assertEquals(1, spyArrayList.size());
    }
}


