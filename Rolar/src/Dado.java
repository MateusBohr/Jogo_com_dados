public class Dado {
    private int face;

    public int rolarDado() {
        face= (int) (Math.random()*6)+1;
        System.out.println("Result: "+face);
        return face;
        }

    public int getFace() {
        return face;
    }
}
