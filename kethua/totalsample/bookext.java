public class book extends product {


    private String author;

    public book(){
        public book(String author, String id, String name, double price, String description){
            super(id, name , price , description);
            this.author = author;
        }

        //getter & setter
        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author){
            this.author = author;
        }
    }
}
