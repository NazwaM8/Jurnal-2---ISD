import java.util.ArrayList;
import java.util.Collections;

public class TokoAbc {
    public static void main(String[] args) {
        ListBarang<Atk> listAtk = new ListBarang<Atk>();
        ListBarang<Bag> listBag = new ListBarang<Bag>();
        
        listAtk.addData(new Atk("A001", "Pulpen", "Micron", "10"));
        listAtk.addData(new Atk("A003", "Pensil", "Faber Castell", "12"));
        listAtk.addData(new Atk("A002", "Spidol", "Copic", "20"));
        listAtk.addData(new Atk("B002", "Buku Tulis", "Potentate", "7"));
        listAtk.addData(new Atk("B001", "Kertas", "Kyra", "8"));

        listBag.addData(new Bag("C001", "Tempat Pensil", "Deli", "5"));
        listBag.addData(new Bag("C004", "Tas", "Eiger", "3"));
        listBag.addData(new Bag("C005", "Seragam", "Putih", "6"));
        listBag.addData(new Bag("C003", "Kaos Kaki", "Supreme", "10"));
        listBag.addData(new Bag("C002", "Topi", "Adidas", "8"));

        listAtk.sorting();
        listBag.sorting();
        
            System.out.println("Barang ATK :");
            System.out.println("==================");
            
        for (int i = 0; i < listAtk.size(); i++) {
            System.out.println("Barang " +(i + 1) + " : ");
            System.out.println("Kode Barang = " + listAtk.getIndex(i).getKode());
            System.out.println("Jenis Barang = " + listAtk.getIndex(i).getJenis());
            System.out.println("Nama Barang = " + listAtk.getIndex(i).getNama());
            System.out.println("Stok Barang = " + listAtk.getIndex(i).getStok());
            System.out.println("==================");
        }

            System.out.println("Barang Bag :");
            System.out.println("==================");

        for (int i = 0; i < listBag.size(); i++) {
            System.out.println("Barang " +(i + 1) + " : ");
            System.out.println("Kode Barang = " + listBag.getIndex(i).getKode());
            System.out.println("Jenis Barang = " + listBag.getIndex(i).getJenis());
            System.out.println("Nama Barang = " + listBag.getIndex(i).getNama());
            System.out.println("Stok Barang = " + listBag.getIndex(i).getStok());
            System.out.println("==================");
        }
    }
}
