package com.stir.cscu9t4practical1;

public class SprintEntry extends Entry {


    private int repetitions;
    private int recovery;
    /**
     * Constructor for objects of class Cycling
     */
public SprintEntry(String n, int d, int m, int y, int h, int min, int s, float dist, int rep,int rec )
{
super(n, d, m, y, h, min, s, dist);
this.repetitions= rep; 
this.recovery= rec; 

}
public int getRepetitions() {
return repetitions;
} 
public void setRepetitions(int rep) {
	  this.repetitions= rep;
	} //setRepetitions

public int getRecovery() {
return recovery;
} 
public void setRecovery(int rec) {
	  this.recovery= rec;
	} //setRecovery

/**
* An example of a method - replace this comment 
* 
* @param y a sample parameter for a method 
* @return the sum of x and y 
*/

public String getEntry () {
String result = getName()+" ran " + getDistance() + " km in "
        +getHour()+":"+getMin()+":"+ getSec() + " on "
        +getDay()+"/"+getMonth()+"/"+getYear()+ getRepetitions() +":"+ getRecovery() + "\n" ;
return result;
}
}
