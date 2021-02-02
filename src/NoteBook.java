public abstract class NoteBook {

    int price ;

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    abstract  void launch();

    void shutDown(){

        System.out.println("shutDown");
    }
}
