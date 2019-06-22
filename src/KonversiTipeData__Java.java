/**
 * @author RizkyKhapidsyah
 */
public class KonversiTipeData__Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Nilai_Int = 450; //Panjang Integer = 32bit
        
        //Konversi Data
        System.out.println("------------------");
        System.out.println("KONVERSI DATA");
        System.out.println("------------------");
        System.out.println("Nilai Integer = " + Nilai_Int);
        
        //Coba memperluas rentang ke tipe data yang lebih besar
        long Nilai_Long = Nilai_Int;
        System.out.println("Nilai Long = " + Nilai_Long);   /*  Akan menampilkan hasil dengan baik secara otomatis,
                                                                Karena rentang tipe data Long lebih besar dari Int.
                                                                Atau jika nilai awal lebih kecil dari rentang tipe data target
                                                            */
        
        //Coba memperkecil rentang ke tipe data yang lebih kecil
        byte Nilai_Byte = (byte) Nilai_Int; /*  Ini adalah teknik Casting tipe data
                                                Namun akan bermasalah jika nilai awal lebih besar daripada rentang tipe data target (byte)
                                                jika dipaksakan, maka nilai hasil yang keluar akan berputar
                                                Lihat, print out berikut :
                                            */
        System.out.println("Nilai Byte = " + Nilai_Byte);   /*  rentang Maksimum nilai Byte adalah 127, Minimum Byte = -128,
                                                                Dalam source ini nilai integer = 450 (lebih besar dari rentang nilai byte)
                                                                jika dipaksakan, maka akan mengeluarkan hasil = -62, berbeda jauh dengan nilai awal (450).
                                                                Namun jika nilai 450 diganti menjadi 127, maka ini tidak menjadi masalah.
                                                            */
        
        //Casting Pembagian:
        System.out.println("------------------");
        System.out.println("CASTING PEMBAGIAN");
        System.out.println("------------------");
        
        int A = 10;
        int B = 4;
        
        float C = (float) A / B; //Variabel a di-casting ke float dan dibagi b, maka
        
        System.out.printf("%d - %d = %.1f\n", A, B, C);
    }
}
