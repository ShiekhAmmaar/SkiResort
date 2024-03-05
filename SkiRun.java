/**
*@author: Shiekh Ammaar Ahmad
*@description: The following code is for the SkiRun class which
*helps in defining each ski runs, giving a structure for each ski run.
*It also provides getters and setters to access the ski runs information.
*We also have a few methods for checking whether the run is open or not.
*/
// WRITE YOUR CODE HERE
public class SkiRun{
    //declaring private variables for the class 
    private String name;
    private String symbol;
    private int DifficultyLevel;
    private boolean runIsOpen;
    //defining the constructor method
    public SkiRun( String n, String s, int l){
      this.name = n;
      this.symbol = s;
      this.DifficultyLevel = l;
      this.runIsOpen = true;
    }
    //defing the getters
    public String getName(){
      return name;
    }
    public String getSymbol(){
      return symbol;
    }
    public int getDifficultyLevel(){
      return DifficultyLevel;
    }
    public boolean isOpen(){
      return runIsOpen;
    }
    //defining the setters
    public void openRun(){
      runIsOpen = true;
    }
    public void closeRun(){
      runIsOpen = false;
    }
  }
  
