public class Computer implements variance {
    @Override
    public double Variance(double[]sample){
        int length=sample.length;
        double sum=0;
        for (double v : sample) {
            sum+=v;
        }
        double av=sum/length;
        double x=0;
        for (double v : sample) {
            x+=(v-av)*(v-av);
        }
        return x/length;


    }
}
