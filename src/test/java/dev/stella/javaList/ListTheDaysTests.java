package dev.stella.javaList;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ListTheDaysTests {
  

    @Test
    void testCreateListOfDayTheWeek() {
        ListTheDays list  = new ListTheDays();
        list.createListOfDayTheWeek();
        assertEquals(7 , list.getLenghtList());
    }

    @Test
    void testDeleteDay() {
        ListTheDays list  = new ListTheDays();
        list.createListOfDayTheWeek();
        list.deleteDay("Lunes");
        assertEquals(6 , list.getLenghtList());

    }


    @Test
    void testOrderAlfabetic() {
        ListTheDays list = new ListTheDays();
        list.createListOfDayTheWeek();
        list.orderAlfabetic();
        assertEquals("Domingo", list.getDay(0));
        assertEquals("Jueves", list.getDay(1));

    }
                                            
   
    
    @Test
    void testClearList() {
        ListTheDays list = new ListTheDays();
        list.createListOfDayTheWeek();
        list.clearList();
        assertEquals(0, list.getLenghtList());

    }

    @Test
    void testExistDay() {
        ListTheDays list = new ListTheDays();
        list.createListOfDayTheWeek();
        list.getDay(0);
        assertEquals("Lunes" , list.getDay(0));
        //no me quedo claro como verificar la existencia ????
    }

    @Test
    void testGetDay() {
        ListTheDays list = new ListTheDays();
        list.createListOfDayTheWeek();
        list.getDay(0);
        assertEquals("Lunes" , list.getDay(0));
        
    }

    @Test
    void testGetLenghtList() {
        ListTheDays list = new ListTheDays();
        list.createListOfDayTheWeek();
        list.getLenghtList();
        assertEquals(7 , list.getLenghtList());
        
    }
}
