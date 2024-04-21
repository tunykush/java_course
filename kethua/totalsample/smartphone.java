public class smartphone extends product(){
    private String color;
    public smartphone ( String color , String id , String name , double price , String description){
        super(id , name , price , description);
        this.color = color;
    }
    //getter& setter
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
}