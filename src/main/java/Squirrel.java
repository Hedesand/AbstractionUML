import java.util.Random;

public class Squirrel {

    private double weight;
    private int numOfConesInNest;
    private int age;
    private String subspecies;
    private int numOfKittens;
    private boolean scared;
    private String story = "Det var en gång en skog. I den skogen stod en stor tall och i och på den tallen bodde det\n" +
            "många djur, växter och svampar. En av de som bodde i tallen var Ekorren Orre. Han hade fullt\n" +
            "upp den här dagen för det var höstsamling inför den stundande vintern.\n" +
            "I tallen bodde också Ugglan Uffe. Uffes favoritmat var ekorrar och just som han fick syn på en\n" +
            "frös den till. Det var som om den hade ögon i nacken.\n" +
            "Orre kände på sig att något var fel och att det var bäst att skynda tillbaka till hem trygga hem.";

    Squirrel(double weight, int age, String subspecies) {
        this.weight = weight;
        this.age = age;
        this.subspecies = subspecies;

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getNumOfConesInNest() {
        return numOfConesInNest;
    }

    public void setNumOfConesInNest(int numOfConesInNest) {
        this.numOfConesInNest = numOfConesInNest;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSubspecies() {
        return subspecies;
    }

    public void setSubspecies(String subspecies) {
        this.subspecies = subspecies;
    }

    public int getNumOfKittens() {
        return numOfKittens;
    }

    public void setNumOfKittens(int numOfKittens) {
        this.numOfKittens = numOfKittens;
    }

    public boolean isScared() {
        return scared;
    }

    public void setScared(boolean scared) {
        this.scared = scared;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story += story;
    }

    public boolean eat(boolean isOwlNear) {
        Random randomNumOfCones = new Random();
        setNumOfConesInNest(randomNumOfCones.nextInt(10));
        setStory("\nHemma väntade " + getNumOfConesInNest() + " st goda kottar. \n");
        Random randomNumOfKittens = new Random();
        setNumOfKittens(randomNumOfKittens.nextInt(4));
        if (getNumOfKittens() > 1) {
            setStory("Tillsammans med kottarna väntade hans " + getNumOfKittens() + " gulliga ungar på hans återvändo.\n");
        }

        if (isOwlNear) {
            setScared(true);
            setStory("Ugglan Uffe svävade över huvudet på Orre medans han sprang hemåt. Orre var väldigt rädd. \n");
            if (getNumOfKittens() > 0) {
                setNumOfKittens(getNumOfKittens() - 1);
                setNumOfConesInNest(getNumOfConesInNest() / 2);
                setStory("Strax innan Orre nådde boet såg han ugglan Uffe hastigt svepa förbi, i klorna hade han en av Orres älskade ungar och hälften av kottarna föll till marken.\n");
            }
        }
        switch (getNumOfKittens()) {
            case 0:
                if (getNumOfConesInNest() < 1) {
                    setStory("När Orre väl kom till boet inser han att kottarna är slut och han måste bege sig ut i den farliga skogen och leta efter mer. ");
                    return false;
                } else {
                    setStory("När Orre väl kom till boet kunde han i alla fall äta sig mätt. ");
                    return true;
                }
            case 1:
            case 2:
                if (getNumOfConesInNest() < 2) {
                    setStory("När Orre väl kom till boet inser han att kottarna inte räcker till dom båda, så Orre erbjuder sin älskade unge den sista kotten och Orre får bege sig ut hungrig för att leta efter fler ");
                    return false;
                } else {
                    setStory("När Orre väl kom till boet kunde han och hans älskade unge i alla fall äta sig mätta. ");
                    return true;
                }
            case 3:
            case 4:
                if (getNumOfConesInNest() < 3) {
                    setStory("När Orre väl kom till boet inser han att kottarna inte räcker till dom alla, så Orre erbjuder sin älskade ungar dom sista kottarna och Orre får bege sig ut hungrig för att leta efter fler ");
                    return false;
                } else {
                    setStory("När Orre väl kom till boet kunde han och hans älskade ungar i alla fall äta sig mätta. ");
                    return true;
                }
            default:
                return false;
        }
    }
}