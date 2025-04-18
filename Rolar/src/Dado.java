public class Dado {
    int face;
    int facePc;
    public int rolarDado() {
        face= (int) (Math.random()*6)+1;
        System.out.println("Yor dice rolled a: "+face);
        return face;
        }
    public int rolarDado2() {
        facePc= (int) (Math.random()*6)+1;
        System.out.println("My dice rolled a: "+facePc);
        return facePc;
    }
    }
