public class HambatanParalel extends Hambatan implements HambatanTotal{
    protected double R_TotalParalel;
    @Override
    protected void inputDataR() {
        System.out.print("Masukkan Nilai R1 : ");
        R1 = io.nextDouble();

        System.out.print("Masukkan Nilai R2 : ");
        R2 = io.nextDouble();

        System.out.print("Masukkan Nilai R3 : ");
        R3 = io.nextDouble();
    }

    @Override
    protected void tampilData() {
        System.out.printf("Total Hambatan Paralel = 1/%.3f = %.3f",R_TotalParalel,1/R_TotalParalel);
    }

    @Override
    public void hitungRTotal() {
        R_TotalParalel =  ((1 / R1) + (1 / R2) + (1 / R3));
    }
}
