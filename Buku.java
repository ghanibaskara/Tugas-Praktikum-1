public class Buku {
    private String namabuku;
    private Penulis[] penulis;

    public Buku(String namabuku, Penulis... penulis){
        this.namabuku = namabuku;
        this.penulis = penulis;
    }

    public void TampilkanDetailBuku(){
        System.out.println("Nama Buku : \""+ namabuku + "\"");
        System.out.print("Nama Penulis : ");
        if (penulis.length > 1) {
            for (int i = 0; i < penulis.length - 1; i++){
                System.out.print(penulis[i].getNamaPenulis() + ", ");
            }
            System.out.println(penulis[penulis.length-1].getNamaPenulis() + ".");
        } else {
            System.out.println(penulis[0].getNamaPenulis() + ".");
        }
    }

}
