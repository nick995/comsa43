/**
 *
 * Min-Gyu Jung 2017/11/09
 */
public class Location {

    private String name;
    private double lat, lon;

    public Location(){}
    public Location(String name, double lat, double lon){
        if(lat>90 || lat<-90){
            throw new IllegalArgumentException("Lat is out of range, it should be between 90 degrees and -90");
        }

        if (lon>180 || lon<-180){

            throw new IllegalArgumentException("lon is out of range, it must be between 180 degrees and -180");
        }
        this.name = name;
        this.lat = lat;
        this.lon = lon;
    }
    /*
    for getting Latitude
     */

    public double getLatitude() {return lat;}
    /*
    for getting Longitude
     */
    public double getLonitude() {return lon;}

    /*
    for getting name
     */
    public String getName(){return name;}

    /*
    for reporting
     */
    public String toString(){

        String report = "";

        report += "The name is " + this.name + "\n";
        report += "Laitude is " + this.lat + "\n";
        report += "Longitude is " + this.lon + "\n";
        return report;
    }

    public double distance(Location I){

        // earth's radius, in miles
        double earthRadius = 3963.1;
        // convert all angles to radians. Radians is another unit for measuring angles. Needed for trig methods
        double lat1 = Math.toRadians(this.lat); // notice I'm reusing variables here. You probably won't want to do this in your solution.
        double lat2 = Math.toRadians(I.lat);
        double lng1 = Math.toRadians(this.lon);
        double lng2 = Math.toRadians(I.lon);
        // calculate the Haversine formula in pieces
        double dLat = lat2-lat1;
        double dLng = lng2-lng1;
        double sindLat = Math.sin(dLat / 2);
        double sindLon = Math.sin(dLng / 2);
        double a = Math.pow(sindLat, 2) + Math.pow(sindLon, 2) * Math.cos(lat1) * Math.cos(lat2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        double dist = earthRadius * c;

        return dist;
    }

}
