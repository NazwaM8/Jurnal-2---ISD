public class Atk implements Comparable<Atk> {
    private String kodeBarang;
    private String jenisBarang;
    private String namaBarang;
    private String stokBarang;

    public Atk(String kodeBarang, String jenisBarang, String namaBarang, String stokBarang) {
        this.kodeBarang = kodeBarang;
        this.jenisBarang = jenisBarang;
        this.namaBarang = namaBarang;
        this.stokBarang = stokBarang;
    }

    public String getKode() {
        return kodeBarang;
    }

    public String getJenis() {
        return jenisBarang;
    }

    public String getNama() {
        return namaBarang;
    }

    public String getStok() {
        return stokBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void setStokBarang(String stokBarang) {
        this.stokBarang = stokBarang;
    }

    @Override
    public String toString() {
        return "Atk [kodeBarang=" + kodeBarang + ", jenisBarang=" + jenisBarang + ", namaBarang=" + namaBarang
                + ", stokBarang=" + stokBarang + "]";
    }

    @Override
    public int compareTo(Atk o) {
        return this.getKode().compareTo(o.getKode());
    }
}