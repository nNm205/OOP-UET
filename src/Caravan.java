public class Caravan implements Movable, Habitable {
    int max;
    int location;

    public Caravan(int max, int location) {
        this.max = max;
        this.location = location;
    }

    @Override
    public boolean canFit(int inhabitants) {
        return inhabitants <= max;
    }

    @Override
    public void move(int distance) {
        location += distance;
    }

    public static void main(String[] args) {
        Caravan caravan = new Caravan(100, 13);
        caravan.move(10);
        System.out.println(caravan.location);
        System.out.println(caravan.canFit(100));
    }
}
