public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Deklarasi variabel
        Kucing anggora, persia;

        // Instansiasi anggora
        anggora = new Kucing();
        anggora.nama = "Luna";
        anggora.mata = "Biru";
        anggora.bulu = "Putih";

        // Instansiasi persia
        persia = new Kucing();
        persia.nama = "Oscar";
        persia.mata = "Coklat";
        persia.bulu = "Abu-abu";

        // Menampilkan informasi kucing anggora
        System.out.println("Kucing Anggora:\n" +
                           "Nama: " + anggora.nama + "\n" +
                           "Mata: " + anggora.mata + "\n" +
                           "Bulu: " + anggora.bulu + "\n" +
                           "Suara: " + anggora.meow() + "\n" +
                           "Suara tambahan: ");
        anggora.purr();
        System.out.println();

        // Menampilkan informasi kucing persia
        System.out.println("Kucing Persia:\n" +
                           "Nama: " + persia.nama + "\n" +
                           "Mata: " + persia.mata + "\n" +
                           "Bulu: " + persia.bulu + "\n" +
                           "Suara: " + persia.meow() + "\n" +
                           "Suara tambahan: ");
        persia.purr();
    }
}
