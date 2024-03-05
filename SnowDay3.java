/**
*@author: Shiekh Ammaar Ahmad
*@description: The following code is for the SnowDay3 class. This 
*class acts as the interface between the user and the code and asks
*the user inputs on the basis of which it provides outputs of the
*ski hill, name and level of the skier and the ski runs that the skier
*can access based on his/her level.
*/
// WRITE YOUR CODE HERE
import java.util.Scanner;

public class SnowDay3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //System.out.print("What's the name of the ski hill? ");
        String skiHillName = in.nextLine();


        SkiHill skiHill = new SkiHill(skiHillName);

        //System.out.print("How many ski runs from top of hill? ");
        int numberRuns = in.nextInt(); in.nextLine();
        //setting counters for iterating through possible ski runs per skier
        int counter1=0;
        int counter2=0;
        int counter3=0;
        // for loop for adding ski runs of different difficulties for the ski hill
        for (int i=1; i<=numberRuns; i++) {
            
            int difficulty = in.nextInt();
            String runName = in.nextLine().trim();
            if (difficulty == 1) {
                skiHill.addSkiRun(new EasyRun(runName));
            }
            else if (difficulty == 2) {
                skiHill.addSkiRun(new MediumRun(runName));
            }
            else {
                skiHill.addSkiRun(new HardRun(runName));
            }
        }
        //taking input for number of skiers in total
        int totalSkiers = in.nextInt();
        
        System.out.println("Welcome to "+skiHillName+"!\n");
        //setting for loop for iterating through each skier
        for(int i =1; i<=totalSkiers; i++){
            int skierLevel = in.nextInt();
            String name = in.nextLine();
            Skier skier = new Skier(name, skierLevel);
            System.out.println("Welcome "+ skier.getName());
            System.out.println("Your ski level is: "+ skier.getSkierLevel()+"\n");
            System.out.println("For your level, check out these runs:");
            //setting up for loop for each possible level of a skier
            for(int j=0; j<skiHill.numberSkiRuns();j++){
                //condition when skier is level 1 
                if(skier.getSkierLevel()== 1 && skiHill.getSkiRuns().get(j).getDifficultyLevel()==1){
                    counter1++;
                    System.out.println(counter1+". "+skiHill.getSkiRuns().get(j).getName() + " (" + skiHill.getSkiRuns().get(j).getSymbol() + " - Level " + skiHill.getSkiRuns().get(j).getDifficultyLevel() + ")");
                }
                //condition when skier is level 2
                else if(skier.getSkierLevel()== 2 && (skiHill.getSkiRuns().get(j).getDifficultyLevel()==2 || skiHill.getSkiRuns().get(j).getDifficultyLevel()==1)){
                    counter2++;
                    System.out.println(counter2+". "+skiHill.getSkiRuns().get(j).getName() + " (" + skiHill.getSkiRuns().get(j).getSymbol() + " - Level " + skiHill.getSkiRuns().get(j).getDifficultyLevel() + ")");
                }
                //condition when skier is level 3
                else if(skier.getSkierLevel()== 3 && (skiHill.getSkiRuns().get(j).getDifficultyLevel()==3 || skiHill.getSkiRuns().get(j).getDifficultyLevel()==2 ||skiHill.getSkiRuns().get(j).getDifficultyLevel()==1)){
                    counter3++;
                    System.out.println(counter3+". "+skiHill.getSkiRuns().get(j).getName() + " (" + skiHill.getSkiRuns().get(j).getSymbol() + " - Level " + skiHill.getSkiRuns().get(j).getDifficultyLevel() + ")");
                }
            }
            //resetting the counters evrytime a skier's information is completed
            counter1=0;
            counter2=0;
            counter3=0;

        }
    }
}        