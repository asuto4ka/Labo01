package ch.heigvd.res.io;

import java.util.ArrayList;
import java.util.List;


public class Statistic {
   
   private String name;
   private List<Long> listTime = new ArrayList<>();
   private List<Integer> listSizeBlock = new ArrayList<>();
   
   
   public Statistic (String name) {
      this.name = name;
   }
   
   
   public void addTime (long value) {
      listTime.add(value);
   }
   
   public void addSizeBlock (int value) {
      listSizeBlock.add(value);
   }
   
   
   public List<String> getListTime() {
      List<String> listTimeString = new ArrayList<>();
      
      for (Long temp: listTime) 
         listTimeString.add(temp.toString());
      
      return listTimeString;
     }
   
   
   public List<String> getListBlock() {
      
      List<String> listBlockString = new ArrayList<>();
      for (Integer temp : listSizeBlock)
         listBlockString.add(temp.toString());
      
      return listBlockString;
   }
   
   
   public String getName () {
      return name;
   }
   
}
