// An implementation of a Training Record as an ArrayList updated by Abrar at 12.22pm
package com.stir.cscu9t4practical1;




import java.util.*;


public class TrainingRecord {
    private List<Entry> tr;
    
    public TrainingRecord() {
        tr = new ArrayList<Entry>();
    } //constructor
    
    // add a record to the list
   public void addEntry(Entry e){
       tr.add(e);    
   } // addClass
   
   // look up the entry of a given day and month
   public String lookupEntry (int d, int m, int y) {
       ListIterator<Entry> iter = tr.listIterator();
       String result = "No entries found";
       while (iter.hasNext()) {
          Entry current = iter.next();
          if (current.getDay()==d && current.getMonth()==m && current.getYear()==y) 
             result = current.getEntry();
            }
       return result;
   } // lookupEntry
   
   public String FindAllEntry(int d, int m, int y) {
	   ListIterator<Entry> iter = tr.listIterator();
	   String result = "";
	   while (iter.hasNext()) {
		   Entry current = iter.next();
		   if (current.getDay() == d && current.getMonth() == m && current.getYear() ==y)
              result = result + current.getEntry();
	   }
	   return result;
   }
  
   public String remove(int d, int m, int y, String n) {
	   ListIterator<Entry> iter = tr.listIterator();
	   String result = "";
	   while (iter.hasNext()) {
		   Entry current = iter.next();
		   if (current.getDay() == d && current.getMonth() == m && current.getYear() ==y && n.equals(current.getName() ))
              result = result + current.getEntry();
	   }
	   return result;
   }
   
   public int getNumberOfEntries(){
       return tr.size();
   }
   // Clear all entries
   public void clearAllEntries(){
       tr.clear();
   }
   
} // TrainingRecord