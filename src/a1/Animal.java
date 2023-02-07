package a1;

public class Animal {

    String name1;
    private Animal(String name){
        name1=name;
    }
    static Animal  build(){
        return new Animal("name3");
    }
}
class Dog {

    public static void main(String[] args) throws Exception {


    }

}