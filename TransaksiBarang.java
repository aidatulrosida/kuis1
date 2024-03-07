class TransaksiBarang {
    public Barang[] barangs;

    public TransaksiBarang(Barang[] barangs) {
        this.barangs = barangs;
    }
    public void lakukanPembelian(String kodeBarang, int jumlah) {
        // Implementasi sesuai kebutuhan
        // ...
    }

    public void tampilkanBarangPembelian() {
        // Implementasi sesuai kebutuhan
        // ...
    }
    public void tampilkanBarang() {
        System.out.println("=====================");
        System.out.println("   Daftar Barang");
        System.out.println("=====================");
        System.out.printf("%-10s %-20s %-10s %-10s%n", "Kode", "Nama", "Harga", "Stok");
        System.out.println("=====================================================");
        for (Barang barang : barangs) {
            String stokStr = String.valueOf(barang.getStok());
            if (barang.getStok() == 0) {
                stokStr = "Stok Habis";
            }
            System.out.printf("%-10s %-20s %-10.2f %-10s%n", barang.getKode(), barang.getNama(), barang.getHarga(), stokStr);
        }
        System.out.println("=====================================================");
    }
}