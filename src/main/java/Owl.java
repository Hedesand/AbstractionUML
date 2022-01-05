public class Owl {

    private int wingSpan;
    private boolean hungry;
    private char sex;
    private boolean alive;

    Owl(int wingSpan, boolean hungry, char sex, boolean alive){
        this.wingSpan = wingSpan;
        this.hungry = hungry;
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

    boolean eat(){
        return true;
    }
}
