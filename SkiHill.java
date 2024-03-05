/**
*@author: Shiekh Ammaar Ahmad
*@description: The following code is for the SkiHill class which
*helps in defining each ski hill, giving a structure for each ski hill.
*It also sets up an array list for storing ski hills and provides getters
*and setters to access the ski hills infomation. We also count the number
*of open and closed hills and add them into two new array lists.
*/
// WRITE YOUR CODE HERE
import java.util.ArrayList;
public class SkiHill{
  //declaring the private variables for the class
  private String name;
  private ArrayList<SkiRun> skiRuns;
  public SkiHill( String name){
    this.name = name;
    this.skiRuns = new ArrayList<SkiRun>();
  }
  //defining getters and setters
  public String getName(){
    return name;
  }
  public ArrayList<SkiRun> getSkiRuns(){
    return skiRuns;
  }
  public void addSkiRun(SkiRun x){
    skiRuns.add(x);
  }
  public int numberSkiRuns(){
    return skiRuns.size();
  }
  public void openHill(){
    for (SkiRun x:skiRuns){
      x.openRun();
    }
  }
  public void CloseHill(){
    for (SkiRun x:skiRuns){
      x.closeRun();
    }
  }
  //counting number of open and closed runs
  public int numberOpenRuns(){
    int count = 0;
    for (SkiRun x:skiRuns){
      if(x.isOpen()){
        count++;
      }
    }
    return count;
  }
  public int numberClosedRuns(){
    int count = 0;
    for (SkiRun x:skiRuns){
      if(!x.isOpen()){
        count++;
      }
    }
    return count;
  }
  //adding open runs to getOpenRuns and returning it
  public ArrayList<SkiRun> getOpenRuns(){
    ArrayList<SkiRun> openRuns = new ArrayList<SkiRun>();
    for (SkiRun x:skiRuns){
      if(x.isOpen()){
        openRuns.add(x);
      }
    }
    return openRuns;
  }
  //adding closed runs to getClosedRuns and returning it
  public ArrayList<SkiRun> getClosedRuns(){
    ArrayList<SkiRun> closedRuns = new ArrayList<SkiRun>();
    for (SkiRun x:skiRuns){
      if(!x.isOpen()){
        closedRuns.add(x);
      }
    }
    return closedRuns;
  }

}
