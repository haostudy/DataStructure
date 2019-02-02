package chapter7;

public class Book {
    private String name;

    public String getName() {
        int id =0;
        setName("java");
        return id+this.name;
    }

    private void setName(String name){
        this.name=name;
    }

    public Book getBook(){
        return this;
    }
}
