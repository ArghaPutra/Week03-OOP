import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nama user
        System.out.print("Masukkan Nama Anda : ");
        String nama = scanner.nextLine();

        int pilihan;
        do {
            System.out.println("\nString anda : " + nama);
            System.out.println("-----------------------------");
            System.out.println("1. charAt");
            System.out.println("2. length");
            System.out.println("3. substring(n)");
            System.out.println("4. substring(m,n)");
            System.out.println("5. contains");
            System.out.println("6. concat");
            System.out.println("7. replace");
            System.out.println("8. split");
            System.out.println("9. lowerCase");
            System.out.println("10. upperCase");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1: // charAt
                    System.out.println("-----charAt-----");
                    System.out.println("Nama : " + nama);
                    System.out.print("Input index : ");
                    int idx = scanner.nextInt();
                    System.out.println("Hasil : " + nama.charAt(idx));
                    break;

                case 2: // length
                    System.out.println("-----length-----");
                    System.out.println("Nama : " + nama);
                    System.out.println("Hasil : " + nama.length());
                    break;

                case 3: // substring(n)
                    System.out.println("-----substring(n)-----");
                    System.out.println("Nama : " + nama);
                    System.out.print("Input mulai : ");
                    int start = scanner.nextInt();
                    System.out.println("Hasil : " + nama.substring(start));
                    break;

                case 4: // substring(m,n)
                    System.out.println("-----substring(m,n)-----");
                    System.out.println("Nama : " + nama);
                    System.out.print("Input mulai : ");
                    int m = scanner.nextInt();
                    System.out.print("Input akhir : ");
                    int n = scanner.nextInt();
                    System.out.println("Hasil : " + nama.substring(m, n));
                    break;

                case 5: // contains
                    System.out.println("-----contains-----");
                    System.out.println("Nama : " + nama);
                    System.out.print("Input substring : ");
                    String sub = scanner.nextLine();
                    System.out.println("Hasil : " + nama.contains(sub));
                    break;

                case 6: // concat
                    System.out.println("-----concat-----");
                    System.out.println("Nama : " + nama);
                    System.out.print("Input tambahan : ");
                    String tambahan = scanner.nextLine();
                    System.out.println("Hasil : " + nama.concat(" - " + tambahan));
                    break;

                case 7: // replace
                    System.out.println("-----replace-----");
                    System.out.println("Nama : " + nama);
                    System.out.print("Input kata yang diganti : ");
                    String target = scanner.nextLine();
                    System.out.print("Input kata pengganti : ");
                    String pengganti = scanner.nextLine();
                    System.out.println("Hasil : " + nama.replace(target, pengganti));
                    break;

                case 8: // split
                    System.out.println("-----split-----");
                    System.out.println("Nama : " + nama);
                    System.out.print("Input pemisah : ");
                    String pemisah = scanner.nextLine();
                    String[] hasilSplit = nama.split(pemisah);
                    for (String h : hasilSplit) {
                        System.out.println("Hasil : " + h);
                    }
                    break;

                case 9: // lowerCase
                    System.out.println("-----lowerCase-----");
                    System.out.println("Nama : " + nama);
                    System.out.println("Hasil : " + nama.toLowerCase());
                    break;

                case 10: // upperCase
                    System.out.println("-----upperCase-----");
                    System.out.println("Nama : " + nama);
                    System.out.println("Hasil : " + nama.toUpperCase());
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}

