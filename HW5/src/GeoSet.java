import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
/**
 *
 * Min-Gyu Jung 2017/11/09
 */

public class GeoSet
{
    private String filename;
    private String[] locname;
    private Location[] LocXY,tempLoc;
    private int countLoc;
    private Location locFind;
    /**
     * Constructor
     */
    public GeoSet(String fileName) throws FileNotFoundException
    {
        this.filename = fileName;
        createReport();
    }

    /**
     * Getting total count
     */
    public int getCount()
    {
        return this.countLoc;
    }

    /**
     * Finding minnium distance
     */
    public double findMinDist()
    {
        double minDist = Math.PI*3963.1, curDist;
        for(int i=0; i<countLoc-1; i++){
            curDist = LocXY[i].distance(LocXY[i+1]);
            if(curDist < minDist){
                minDist = curDist;
            }
        }
        return minDist;
    }

    /**
     * Find the Location in file
     */
    public Location find(String name){

        for(int i=0; i<countLoc; i++){
            String nameTemp = LocXY[i].getName();
            try{
                if(nameTemp.equals(name)){
                    locFind = LocXY[i];
                }
            }catch(Exception e){
                return null;
            }

        }
        return locFind;
    }

    /**
     * Finding the fartest between two location
     */
    public Location[] farthest(){
        tempLoc = new Location[2];
        double maxDist = 0, MaxCurDist;
        for(int i=0; i<countLoc-1; i++){
            for(int a = 0; a<countLoc;a++){
                MaxCurDist = LocXY[i].distance(LocXY[a]);
                if(MaxCurDist > maxDist){
                    maxDist = MaxCurDist;
                    tempLoc[0] = LocXY[i];
                    tempLoc[1] = LocXY[a];
                }
            }
        }
        return tempLoc;
    }

    /**
     * To String
     */
    public String toString(){
        String report = "";
        report += "=============================================\n";
        report += "Total Location                                   "+countLoc+"\n";
        report += "Min Distance                            "+findMinDist()+"\n";
        report += "Farthest distance between        " +  tempLoc[0].getName() +" and "+ tempLoc[1].getName() +"\n";
        report += "=============================================";
        return report;
    }

    /**
     * Create what we need in GeoSet
     */
    public void createReport()throws FileNotFoundException
    {

        File temp = new File(this.filename);
        Scanner file = new Scanner(temp);
        countLoc = file.nextInt();
        LocXY = new Location[countLoc];
        String name = "";
        double latTemp = 0.0,lonTemp = 0.0;
        if(countLoc<2)throw new IllegalArgumentException("It needs to have two or more location in txt!");
        for(int i=0; i<countLoc;i++){

            name = file.next();
            latTemp = file.nextDouble();
            lonTemp = file.nextDouble();

            LocXY[i] = new Location(name,latTemp,lonTemp);
        }
    }
}
