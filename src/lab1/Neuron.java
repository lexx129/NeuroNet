package lab1;

/**
 * Created by Lexx on 02.12.2015.
 */
public class Neuron {
    private int[] w;
    private int[] p;
    private int b;

    public Neuron(int[] w, int[]p, int b) {
        this.w = w;
        this.p = p;
        this.b = b;
    }

    public void divide(){
        int sum = 0;
        for (int i = 0; i < w.length; i++) {
            sum += w[i] * p[i];
        }
        sum += b;
        System.out.println(sum);
        if (sum > 0)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
