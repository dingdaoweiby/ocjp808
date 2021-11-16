//Q29
//50 125 0. The compare before give the value to ns, so ns has 0,static int is always the last one.
public class Alpha {
    int ns;
    static int s;

    Alpha(int ns) {
        if (s < ns) {
            s = ns;
            this.ns = ns;
        }
    }

    void doPrint() {
        System.out.println("ns = " + ns + " s = " + s);
    }

    public static void main(String[] args) {
        Alpha r1 = new Alpha(50);
        Alpha r2 = new Alpha(125);
        Alpha r3 = new Alpha(100);
        r1.doPrint();
        r2.doPrint();
        r3.doPrint();
    }
}
