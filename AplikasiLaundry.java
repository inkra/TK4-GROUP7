package laundry;
public class AplikasiLaundry {
    public static void main(String[] args) {
        // TODO code application logic here
        JenisLaundry jenisLaundry1 = new JenisLaundry();
        Client client1 = new Client();
        Petugas petugas1 = new Petugas();
        Transaksi transaksi1 = new Transaksi();
        Laporan laporan1 = new Laporan();
        
        //Menampilkan jenis laundry dan client
        laporan1.laporan(petugas1);
        laporan1.laporan(jenisLaundry1);
        laporan1.laporan(client1);
        
        //Proses laundry
        transaksi1.prosesTransaksi(client1, transaksi1, jenisLaundry1);
        
        //Menampilkan tabel client dan histori
        laporan1.laporan(client1);
        laporan1.laporan(transaksi1, jenisLaundry1);  
        
        
    }
}
