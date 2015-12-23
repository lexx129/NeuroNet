package lab2;

public class Neuron {
    private int[] w;
    private int[] p;
    private int b;

    public Neuron(int[] w, int[] p, int b) {
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
    public void configure(int e){
        for (int i = 0; i < w.length; i++) {
            this.w[i] += e * p[i];
            this.b += e;
        }
    }
}
