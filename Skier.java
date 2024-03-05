/**
*@author: Shiekh Ammaar Ahmad
*@description: The following code is for the Skier class which
*helps in defining each skier's information, giving a structure 
for the same. it also provides getters and setters to access 
*the skier's information.
*/
// WRITE YOUR CODE HERE
public class Skier{
    //declaring private variables for the class
    private String name;
    private int skierLevel;
    //defining the constructor method
    public Skier(String name, int skierLevel){
      this.name = name;
      this.skierLevel = skierLevel;
    }
    //defining the getters
    public String getName(){
      return name;
    }
    public int getSkierLevel(){
      return skierLevel;
    }
    public boolean canSki(Skier x){
      int xLevel = x.getSkierLevel();
      return skierLevel >= xLevel; 
    }
  }
