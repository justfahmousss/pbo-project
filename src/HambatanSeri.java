public class HambatanSeri extends Hambatan implements HambatanTotal{
    protected double R_TotalSeri;
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
        System.out.println("Total Hambatan Seri : "+R_TotalSeri + "\n");
    }

    @Override
    public void hitungRTotal() {
        R_TotalSeri = R1 + R2 + R3;
    }
}
