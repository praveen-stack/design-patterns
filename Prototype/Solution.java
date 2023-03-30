package Prototype;

interface Prototype {
    Prototype clone();
}

class Notebook implements Prototype {
    private String name;
    private int noOfPages;
    private String type;

    public Notebook(String name, int noOfPages, String type) {
        this.name = name;
        this.noOfPages = noOfPages;
        this.type = type;
    }

    public Notebook(Notebook note) {
        this.name = note.name;
        this.noOfPages = note.noOfPages;
        this.type = note.type;
    }

    public Notebook clone() {
        return new Notebook(this);
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + this.name + "'" +
            ", noOfPages='" + this.noOfPages + "'" +
            ", type='" + this.type + "'" +
            "}";
    }
    
}

public class Solution {

    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("n1", 100, "type1");
        Notebook notebook2 = notebook1.clone();
        System.out.println(notebook1);
        System.out.println(notebook2);
    }

}