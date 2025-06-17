import java.util.ArrayList;
import java.util.Collections;

public class DaftarPaket {
    ArrayList<Paket> daftar = new ArrayList<>();

    public void terimaKiriman(int id, String nama, int tanggal, String tipe, String alamat) {
        daftar.add(new Paket(id, nama, tanggal, tipe, alamat));
    }

    public void cetakDataPaket() {
        Collections.sort(daftar);
        for (Paket p : daftar) {
            System.out.println(p);
        }
    }
}