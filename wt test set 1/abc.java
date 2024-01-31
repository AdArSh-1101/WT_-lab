import java.io.*;
import java.util.*;

public class abc {

     static final int r = 50;
     static final int c = 4;

     int[][] a;
     int[][] b;

    public abc() {
        a = new int[r][c];
        b = new int[r][c];
    }

    public void get() {
        Random random = new Random();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = random.nextInt(101);
            }
        }
    }

    public void sort() {
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r - 1; j++) {
                for (int k = j + 1; k < r; k++) {
                    if (b[j][i] > b[k][i]) {
                        int temp = b[j][i];
                        b[j][i] = b[k][i];
                        b[k][i] = temp;
                    }
                }
            }
        }
    }
    public void cpy()
    {
        for (int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                b[i][j]=a[i][j];
            }
        }
    
    }

    public void writef(String fname) throws IOException {
        DataOutputStream d = new DataOutputStream(new FileOutputStream(fname));
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(fname.equals("file1.txt"))
                d.writeInt(a[i][j]);
                else
                d.writeInt(b[i][j]);
            }
        }
        d.close();
    }

    public void readf(String fname) throws IOException {
        DataInputStream d = new DataInputStream(new FileInputStream(fname));
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(d.readInt()+" ");
            }
            System.out.println();
        }
        System.out.println();
        d.close();
    }

   
    public static void main(String[] args) throws IOException {
        abc o = new abc();
        o.get();
        o.cpy();
        o.sort();
        o.writef("file1.txt");
        o.writef("file2.txt");
        o.readf("file1.txt");
        o.readf("file2.txt");
    }
}