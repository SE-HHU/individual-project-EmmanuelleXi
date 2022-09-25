package work01;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String [] args) throws IOException {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Equation01[] ep1 = new Equation01[n];
        Equation02[] ep2 = new Equation02[m];
        BufferedWriter bfw1 = new BufferedWriter(
                              new OutputStreamWriter(
                              new FileOutputStream(".\\Exercises.txt")));
        BufferedWriter bfw2 = new BufferedWriter(
                              new OutputStreamWriter(
                              new FileOutputStream(".\\Answers.txt")));
        for (int i = 0; i < n; i++) {
            ep1[i] = new Equation01();
            ep1[i].creat();
            for (int j = 0; j < i; j++) {
                if (ep1[i].compare(ep1[j])) {
                    ep1[i].creat();
                    j = 0;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            ep2[i] = new Equation02();
            ep2[i].creat();
            for (int j = 0; j < i; j++) {
                if (ep2[i].compare(ep2[j])) {
                    ep2[i].creat();
                    j = 0;
                }
            }
        }
        for(int i = 0;i < n;i++){
            bfw1.write((i+1)+". "+ep1[i].toString()+"\n");
            bfw2.write((i+1)+". "+ep1[i].ans+"\n");
        }
        for(int i = 0;i < m;i++){
            bfw1.write((i+n+1)+". "+ep2[i].toString()+"\n");
            bfw2.write((i+n+1)+". "+ep2[i].ans+"\n");
        }
        bfw1.flush();
        bfw1.close();
        bfw2.flush();
        bfw2.close();
    }
}