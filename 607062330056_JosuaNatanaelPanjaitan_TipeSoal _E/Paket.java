public class Paket implements Comparable<Paket> {
    int id;
    String nama;
    int tanggalMasuk;
    String tipe;
    String alamat;
    int estimasiHari;

    public Paket(int id, String nama, int tanggalMasuk, String tipe, String alamat) {
        this.id = id;
        this.nama = nama;
        this.tanggalMasuk = tanggalMasuk;
        this.tipe = tipe.toLowerCase();
        this.alamat = alamat;
        this.estimasiHari = hitungEstimasiHari();
    }

    private int hitungEstimasiHari() {
        return switch (tipe) {
            case "biasa" -> 3;
            case "express" -> 2;
            case "kilat" -> 1;
            case "same day" -> 0;
            default -> 3;
        };
    }

    public int getTanggalKirim() {
        return tanggalMasuk + estimasiHari;
    }

    @Override
    public int compareTo(Paket p) {
        return Integer.compare(this.getTanggalKirim(), p.getTanggalKirim());
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nama: " + nama + ", Alamat: " + alamat +
                ", Tgl Masuk: " + tanggalMasuk + ", Tipe: " + tipe + 
                ", Tgl Kirim: " + getTanggalKirim();
    }
}