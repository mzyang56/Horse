class Observation {
    float temp;
    int windDir;   // in degrees
    String description;
    
    Observation(String description, float temp, int windDir) {
       this.description = description;
       this.temp = temp;
       this.windDir = windDir;
    }
       
    public String toString() {
       return (temp + " degrees; " + description + " (wind: " + windDir + " degrees)");
    }
 }