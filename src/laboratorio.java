import java.io.*;

public class laboratorio {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Cantidad a ingresar: ");
        int cE = Integer.parseInt(br.readLine());
        String[] aC = new String[cE];

        for (int i = 0; i < aC.length; i++) {
            System.out.print("Nombre del estudainte: ");
            String value = br.readLine();
            GValor(aC, i, value);

            System.out.print("4 notas del estudiante: ");
            int[] n;
            n = new int[4];
            for (int k = 0; k < n.length; k++) {
                int n = Integer.parseInt(br.readLine());
                n[k] = n;
            }
            int prom = cProm(n);
            System.out.print("Promedio del estudiante: " + prom);
        }
        IO(aC);
    }

    public static int cProm(int[] n) {
        int st = 0;
        for (int i = 0; i < n.length; i++) {
            st += n[i];
        }
        return st / n.length;
    }

    public static void GValor(String[] a, int position, String value) {
        if (a.length <= position) return;
        a[position] = value;
    }

    public static void IO(String[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }

    public static void IO(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }

    public static void nA(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);

        }

    }
}