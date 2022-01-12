abstract public class Animal {
    protected boolean hungry;
    protected int weight;

    public Animal(boolean hungry, int weight) {
        this.hungry = hungry;
        this.weight = weight;
    }

    public Animal() {

    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    abstract public boolean eat(Object food);
}
