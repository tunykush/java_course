package zybook;

public class suburb {
    //constructor
    //public Suburb(String name, String city, State state, String postCode)
    private String name;
    private String city;
    private String state;
    private String postCode;
    public suburb( String name, String city, State state, String postCode)
    {
        this.name = validateName(name);
        this.city = validateCity(city);
        this.state = validateState(state);

    }
    //method
    //public String getName()	Returns the name of the suburb
    public String getName() {
        return name;
    }
    //public String getCity()	Returns the name of the city in which the suburb is located
    public String getCity() {
        return city;
    }
    //public String getPostCode()	Returns the postcode of the suburb
    public String getPostCode() {
        return postcode;
    }
    //public String toString()	Returns a string representation of the suburb that includes: name, city, postcode and state.
    
                    /*The format of the string is as follows:
                    name + : + city + : + state + : + postCode;
                    For example:
                    Carlton North:Melbourne:Victoria:3054
                    Henley Beach:Adelaide:South Australia:5379*/
    public String toString() {
        return name + "." + city + 
    }







}
