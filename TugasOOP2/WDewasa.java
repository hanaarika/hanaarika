package TugasOOP2;

public class WDewasa extends Manusia implements Wanita{
        private float tinggi;
        private int berat;

        public float getTinggi(){
            return tinggi;
        }

        public int getBerat(){
            return berat;
        }

        public void setTinggi(float tinggi){
            this.tinggi = tinggi;
        }

        public void setBerat(int berat){
            this.berat = berat;
        }

        @Override
        public float hitungBMI() {
            return berat/(tinggi*tinggi);
        }

        @Override
        public String displayWanita() {
            return IdealWanita;
        }
    }