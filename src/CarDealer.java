/*Car Class for cars on sales in a Motor Dealer
Create a Cars class with the following attributes:
	Make (String)
	Model (String)
	Reg Number (int)
	Year (int)
	Miles (double)
	Price (double)
The class should be modelled on the employee class and should
have a constructor that accepts all of the above as arguments.
Provide setter and getters for each attribute
Provide toString method
Get total value of Stock
Average Price
Number of cars for each year from 2012 to 2017
*/
public class CarDealer 
{
    private String make;
    private String model;
    private String regNumber;
    private int year;
    private double miles;
    private double price;

    public CarDealer(String make, String model, String regNumber, int year, double miles, double price) {
        this.make = make;
        this.model = model;
        this.regNumber = regNumber;
        this.year = year;
        this.miles = miles;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public String toString()
    {
        return String.format("Make: %s\tModel: %s\tRegistration Number: %s"
                + "\tYear: %d\tMiles: %,.2f\tPrice: %,.2f\n", 
                getMake(), getModel(), getRegNumber(), getYear(), getMiles(), getPrice() );
    
    }
    
}//end class CarDealer
