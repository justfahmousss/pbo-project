public class Main {
    public static void main(String[] args) {
        HambatanSeri hambatanSeri = new HambatanSeri();
        hambatanSeri.inputDataR();
        hambatanSeri.hitungRTotal();
        hambatanSeri.tampilData();

        HambatanParalel hambatanParalel = new HambatanParalel();
        hambatanParalel.inputDataR();
        hambatanParalel.hitungRTotal();
        hambatanParalel.tampilData();
    }
}