package lab2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("������� ���� ������, ����������� - ';': \n");
        bw.flush();
        String ws = br.readLine();
        String[] temp = ws.split(";");
        int[] w = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            w[i] = Integer.parseInt(temp[i]);
        }
        bw.write("������� �������� ������ L: \n");
        bw.flush();
        int b = Integer.parseInt(br.readLine());
        bw.write("������� �������� ������ \n");
        bw.flush();
        String ps = br.readLine();
        temp = ps.split(";");
        int[] p = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            p[i] = Integer.parseInt(temp[i]);
        }
        lab1.Neuron neuron = new lab1.Neuron(w, p, b);
    }
}
