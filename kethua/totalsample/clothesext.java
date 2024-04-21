public class clothes extends product{
    private String size;
    
    public clothes(){
        public clothes ( String size , String id, String name , double price , String description){
            super ( id ,name , price , description )
            this.size = size ;
        }
    //getter & setter
    public String getSize(){
        return size;
    }
    public void setSize(String size){
        this.size = size;
    }
    }
}