package src.Codelab_2;

public class Main {
    public static void main(String[]args) {
        RekeningBank rekening1 = new RekeningBank();
        RekeningBank rekening2 = new RekeningBank();

        rekening1.nomorRekening = "202410370110505";
        rekening2.nomorRekening = "202410370110523";

        rekening1.namaPemilik = "Gyfandi";
        rekening2.namaPemilik = "Maman";

        rekening1.saldo = 300000.0;
        rekening2.saldo = 500000.0;

        rekening1.tampilkaninfo();
        rekening2.tampilkaninfo();

        rekening1.setorUang(200000.0);
        rekening2.setorUang(500000.0);

        rekening1.tarikUang(800000.0);
        rekening2.tarikUang(300000.0);

        rekening1.tampilkaninfo();
        rekening2.tampilkaninfo();
    }
}
