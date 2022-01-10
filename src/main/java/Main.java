public class Main {
    public static void main(String[] args) {

    Squirrel orre = new Squirrel(0.3,5,"Pine Tree Squirrel");
    boolean gotToEat = orre.eat(true);
    if(gotToEat){
        System.out.println("Detta är en historia om en lycklig " + orre.getSubspecies() + " som en dag fick en god måltid:");
    }
    else{
        System.out.println("Detta är en  sorglig historia om en " + orre.getSubspecies() + " som en dag inte fick någon mat:");
    }
    System.out.println(orre.getStory() + "\n");

    Owl owl = new Owl(23, 'F', true);
    owl.eat();
    System.out.println();

    PineTree pt = new PineTree(80, 80, 101);
    System.out.println(pt.fall(2));

    }
}
