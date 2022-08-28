package ClassPrograms_Lecture_09_to_12;
import java.util.ArrayList;


class Continent{
    private String cname;
    private ArrayList<Country> ListofCountries = new ArrayList<>();
    private double size;      // area of Continent

   public void setCname(String cname){
        this.cname = cname;
    } // end of setter of Cname
    public String getCname(){
        return cname;
    }  // end of getter of Cname

    void setSize(double size){
       this.size = size;
    }     // end of setter of size
    double getSize(){
       return size;
    }   // end of getter of size

    public ArrayList<Country> getListofCountries() {
        return ListofCountries;
    }
    public void setListofCountries(ArrayList<Country> listofCountries) {
        ListofCountries = listofCountries;
    }    // end of method

}    // end of class Continent
class Country{
    String conname;
    City capital;
    ArrayList<City> ListOfCities = new ArrayList<>();
    double size;

    Country(String conname, String [] listOfCities, double [] population, double size){
        this.conname = conname;
        for(int i=0; i<listOfCities.length; i++)
        {
            City temp = new City();
            temp.setCityname(listOfCities[i]);
            temp.setPopulation(population[i]);
            ListOfCities.add(temp);
        }      // end of for loop
        this.size = size;
        capital = new City();
    }   // end of Constructor Country
    static class City{
        String cityName;
        double population;
        void setCityname(String c){
            cityName = c;
        }    // end of method
        @Override
        public String toString(){
            return cityName+" "+population;
        }
        void setPopulation(double population){
            this.population = population;
        }     // end of method
        String getCityname(){ return cityName; }
        double getPopulation() { return population; }

    }   // end of class City
        void displayCities(){
            for(int i=0; i<ListOfCities.size(); i++) {
                System.out.println("City is " + ListOfCities.get(i).getCityname()+" with population "+ ListOfCities.get(i).getPopulation());
            }     // end of for loop

        }     // end of method
}  // end of class Country


public class Lecture_11_12_ContinentClass_Program{
    public static void main(String[] args) {

        String [] cities = {"Tando Allahyar", "Hyderabad", "Karachi"};
        double [] pop = {4500, 465889, 78946};
        Country c = new Country("Pakistan", cities, pop, 44391162);
        c.displayCities();



    }   // end of main() method
}      // end of program
