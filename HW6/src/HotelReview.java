import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class HotelReview {

    private String[] hotels;
    private int [][] reviews;
    private double [] avgRanks;
    private int  hotelsNum;
    private int reviewrNum;
    private String File;

    public static void main(String[] args){

            }

    public HotelReview(InputStream resourceAsStream)throws FileNotFoundException{
        this("");
    }

    public HotelReview(String File1)throws FileNotFoundException{

        this.File = File1;
        readData(File);
        calculatAvgRankings();
        displayAvgRanks();
        System.out.println();
        displayReviews();
        System.out.println();
        displayHotels();
        System.out.println();
        sortByRanking();
    }

    public int getHotelCount(){
        return hotelsNum;
    }

    public int getRankHotel(int review, int hotel){

        if(review> reviewrNum || hotel> hotelsNum){
            throw new IllegalArgumentException("Parameter is out of range");
        }
        return reviews[review][hotel];

    }

    public String getHotels(int index) {

        if(index> hotelsNum){
            throw new IllegalArgumentException("Parameter is out of range");
        }
        return hotels[index];
    }

    public double getAvgRanks(int index) {
        if(index>hotelsNum){
            throw new IllegalArgumentException("Parameter is out of range");
        }
        return avgRanks[index];
    }

    private void readData(String file) throws FileNotFoundException {

        File filea = new File(file);
        Scanner console = new Scanner(filea);

        hotelsNum = console.nextInt();
        reviewrNum = console.nextInt();

        if (reviewrNum < 0) {
            throw new FileNotFoundException("The number of reviewr cannot be less then 0");
        }

        if (hotelsNum < 0) {
            throw new FileNotFoundException("The number of hotels can not be less than 0");
        }

        reviews = new int[reviewrNum][hotelsNum];

        for (int i = 0; i < reviewrNum; i++) {
            for (int j = 0; j < hotelsNum; j++) {
                reviews[i][j] = console.nextInt();
            }
        }

        console.nextLine();
        hotels = new String[hotelsNum];
        for (int i = 0; i < hotelsNum; i++) {
            hotels[i] = console.nextLine();
        }
    }

    private void calculatAvgRankings(){

        avgRanks = new double[hotelsNum];
        double average = 0.0;
        double sum = 0.0;
        for(int i =0; i<hotelsNum; i++){
            for(int j =0; j<reviewrNum; j++){
                sum += reviews[j][i];
            }
            average = sum/reviewrNum;
            avgRanks[i] = average;
            sum = 0;

        }
    }

    private void displayReviews(){

        System.out.println("Displaying Reviews\n");

        for(int i = 0; i<reviewrNum; i++){
            for(int j = 0; j<hotelsNum; j++){
                System.out.print(reviews[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void displayAvgRanks(){
        System.out.println("Displaying Average Ranking\n");
        for(int i =0; i<reviewrNum; i++){
            System.out.print(avgRanks[i] + " ");
        }
        System.out.println();
    }

    private void displayHotels(){
        System.out.println("Displaying Hotels list\n");
        for(int i = 0; i<hotelsNum; i++){
            System.out.println(hotels[i] + " ");
        }
        System.out.println();
    }

    public void sortByRanking(){

        double[] newAvgRank= new double[hotelsNum];
        String []  newHotelTitle = new String[hotelsNum];
        int[][] newReviewers = new int[reviewrNum][hotelsNum];
        int[][] newRankedReview = new int[reviewrNum][hotelsNum];

        for(int i = 0; i<hotelsNum; i++){
            newAvgRank[i] = avgRanks[i];
        }

        Arrays.sort(newAvgRank);
        for(int j = 0; j<hotelsNum; j++){
            for(int k = 0; k<hotelsNum; k++){
                if(newAvgRank[j]==avgRanks[k]){
                    newHotelTitle[j] = hotels[k];
                    for(int p = 0; p< reviewrNum; p++){
                        newReviewers[p][j] = reviews[p][k];
                        newRankedReview[p][j] = reviews[p][k];
                    }
                }
            }
        }
        System.out.print(newHotelTitle.length)
        System.out.print(newAvgRank);


    }


    public static void test() throws FileNotFoundException{
        System.out.println("The test of class is starting");
        HotelReview Test = new HotelReview("data.txt");

    }

}
