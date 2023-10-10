public class bankBeraksi {
        private int saldoSaatIni;
        private int simpanUangg;
        private int saldoSaatInii;
        private int ambilUang;
        private int saldosaatini;
        //constructor
        public void bank (int saldoSaatIni, int simpanUangg, int saldoSaatInii, int
                ambilUang, int saldosaatini)
        {
            this.saldoSaatIni = saldoSaatIni;
            this.simpanUangg = simpanUangg;
            this.saldoSaatInii = saldoSaatInii;
            this.ambilUang = ambilUang;
            this.saldosaatini = saldosaatini;
        }
        //method
        public void simpanUang ()
        {
            System.out.println("simpanUangg : " + saldoSaatIni );
            System.out.println("saldoSaatInii : " + simpanUangg );
            System.out.println("ambilUang : " + saldoSaatInii );
            System.out.println("saldosaatini : " + saldosaatini );
        }
        public void ambilUangg ()
        {
            System.out.println("saldoSaatIni : " + saldoSaatIni );
            System.out.println("simpanUangg : " + saldoSaatIni );
            System.out.println("saldoSaatInii : " + simpanUangg );
            System.out.println("ambilUang : " + saldoSaatInii );
            System.out.println("saldosaatini : " + saldosaatini );
        }
        public void getSaldo ()
        {
            System.out.println("saldoSaatIni : " + saldoSaatIni );
            System.out.println("simpanUangg : " + saldoSaatIni );
            System.out.println("saldoSaatInii : " + simpanUangg );
            System.out.println("ambilUang : " + saldoSaatInii );
            System.out.println("saldosaatini : " + saldosaatini );
        }
    }


