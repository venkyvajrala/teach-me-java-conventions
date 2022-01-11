public class PowerFinder {

    public static int  pow(int base, int power) {
        if(power==0 || base==1) return 1;
        else if(base==0) return 0;
        else return base*pow(base,power-1);

    }

}
