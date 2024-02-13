package dev.stella.javaList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTheDays {
    

    private List<String> dayWheeks;
    

    public ListTheDays() {
        this.dayWheeks = new ArrayList<>();
    }

    public void createListOfDayTheWeek() {
        dayWheeks.add("Lunes");
        dayWheeks.add("Martes");
        dayWheeks.add("Miércoles");
        dayWheeks.add("Jueves");
        dayWheeks.add("Viernes");
        dayWheeks.add("Sábado");
        dayWheeks.add("Domingo");
    }

    public List<String> getDayWheeks() {
      return dayWheeks;
    }
 
    public int getLenghtList() {
        return dayWheeks.size();
    }

    public void deleteDay(String day) {
        dayWheeks.remove(day);
    }

    public String getDay(int index) {
        if (index >= 0 && index < dayWheeks.size()) {
            return dayWheeks.get(index);
        
        
    }
        return null;}

    public boolean existDay(String day, boolean b) {
        return dayWheeks.contains(day);
    }

    public void orderAlfabetic() {
        Collections.sort(dayWheeks);
    }

    public void clearList() {
        dayWheeks.clear();
    }

   
    public void setDayWheeks(List<String> dayWheeks) {
        this.dayWheeks = dayWheeks;
    }
}