import java.util.Random;

public class Owl {

    private int wingSpan;
    private boolean hungry;
    private char sex;
    private boolean alive;

    Owl(int wingSpan, char sex, boolean alive){
        this.wingSpan = wingSpan;
        this.sex = sex;
        this.alive = alive;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public boolean isHungry() {
        return hungry;
    }

    public char getSex() {
        return sex;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean eat(){
        if(isAlive()) {
            Random randBool = new Random();
            boolean rand = randBool.nextBoolean();
            Random randCatchableSquirrels = new Random();
            int catchableSquirrels = randCatchableSquirrels.nextInt(10);
            if (rand) {
                System.out.println("Ugglan är hungrig. ");
                setHungry(true);
            }
            else {
                System.out.println("Ugglan är inte hungrig. ");
                setHungry(false);
            }
            if (getSex() == 'F') {
                if (isHungry()) {
                    System.out.println("Hon spanar ut på jakt efter en ekorre att äta.");
                    if (catchableSquirrels > 1) {
                        System.out.println("Hon hittar " + catchableSquirrels + " och kan äta sig mätt.");
                        setHungry(false);
                        return true;
                    }
                    else {
                        System.out.println("Hon hittar " + catchableSquirrels + " och det är för få för att äta sig mätt. " +
                                "\nHon dör tyvärr av svält");
                        setAlive(false);
                        return false;
                    }
                }
                else {
                    System.out.println("Ugglan återvänder hem utan att äta.");
                    return false;
                }
            }
            else if (getSex() == 'M') {
                if (isHungry()) {
                    System.out.println("Han spanar ut på jakt efter en ekorre att äta. ");
                    if (catchableSquirrels > 2) {
                        System.out.println("Han hittar " + catchableSquirrels + " och kan äta sig mätt.");
                        setHungry(false);
                        return true;
                    }
                    else {
                        System.out.println("Han hittar " + catchableSquirrels + " och det är för få för att äta sig mätt. " +
                                "\nHan dör tyvärr av svält");
                        setAlive(false);
                        return false;
                    }
                }
                else {
                    System.out.println("Ugglan återvänder hem utan att äta.");
                    return false;

                }
            }
            return true;
        }
        else{
            return false;
        }
    }
}
