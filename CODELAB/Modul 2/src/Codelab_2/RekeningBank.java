package src.Codelab_2;

public class RekeningBank {
    String nomorRekening;
    String namaPemilik;
    Double saldo;

    public void tampilkaninfo(){
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: " + saldo);
        System.out.println();
    }

    public void setorUang(double jumlah){
        saldo += jumlah;
        System.out.println(namaPemilik + "Menyetor Rp" + jumlah + "Saldo sekarang: Rp" + saldo);
    }

    public void tarikUang(double jumlah){
        if  (saldo < jumlah ){
            System.out.println(namaPemilik + "Menarik Rp" + jumlah + "(Gagal saldo tidak mencukupi) Saldo saat ini: Rp" + saldo);
        }else {
            saldo -= jumlah;
            System.out.println(namaPemilik + "Menarik Rp" + jumlah + "(Berhasil) Saldo sekarang: Rp" + saldo);
            System.out.println();
        }
    }
}
