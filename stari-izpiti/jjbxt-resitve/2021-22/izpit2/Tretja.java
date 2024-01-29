
/*
 * tj.exe
 */

public class Tretja {

    public static abstract class Predavalnica {
        private String oznaka;
        private int stMest;

        protected Predavalnica(String oznaka, int stMest) {
            this.oznaka = oznaka;
            this.stMest = stMest;
        }

        public String vrniOznako() {
            return this.oznaka;
        }

        public int vrniSteviloMest() {
            return this.stMest;
        }

        public abstract int specifika();

        // popravite / dopolnite ...
        public int casCiscenja() {
            return this.stMest * 2 + this.specifika();
        }
    }

    public static class Avditorna extends Predavalnica {

        public Avditorna(String oznaka, int stMest) {
            super(oznaka, stMest);
        }

        @Override
        public int specifika() {
            return 0;
        }


    }

    public static class Racunalnica extends Predavalnica {
        private int stRacunalnikov;

        public Racunalnica(String oznaka, int stMest, int stRacunalnikov) {
            super(oznaka, stMest);
            this.stRacunalnikov = stRacunalnikov;
        }

        public int vrniSteviloRacunalnikov() {
            return this.stRacunalnikov;
        }

        @Override
        public int specifika() {
            return this.stRacunalnikov * 3;
        }
    }

    public static class Garaza extends Predavalnica {
        private int povrsina;

        public Garaza(String oznaka, int stMest, int povrsina) {
            super(oznaka, stMest);
            this.povrsina = povrsina;
        }

        @Override
        public int specifika() {
            return this.povrsina;
        }
    }

    public static class Stavba {
        private Predavalnica[] predavalnice;

        public Stavba(Predavalnica[] predavalnice) {
            this.predavalnice = predavalnice;
        }

        public int casCiscenja() {
            int cas = 0;
            for (Predavalnica predavalnica: this.predavalnice) {
                cas += predavalnica.casCiscenja();
            }
            return cas;
        }

        public int[] razporedi(int stStudentov, int[] ostanek) {
            int[] raz = new int[this.predavalnice.length];
            for (int i = 0; i < this.predavalnice.length; i++) {
                if (this.predavalnice[i] instanceof Avditorna) {
                    raz[i] = this.predavalnice[i].vrniSteviloMest() < stStudentov ? this.predavalnice[i].vrniSteviloMest() : stStudentov;
                    stStudentov -= raz[i];
                }
            }
            for (int i = 0; i < this.predavalnice.length; i++) {
                if (this.predavalnice[i] instanceof Racunalnica) {
                    raz[i] = this.predavalnice[i].vrniSteviloMest() < stStudentov ? this.predavalnice[i].vrniSteviloMest() : stStudentov;
                    stStudentov -= raz[i];
                }
            }
            for (int i = 0; i < this.predavalnice.length; i++) {
                if (this.predavalnice[i] instanceof Garaza) {
                    raz[i] = this.predavalnice[i].vrniSteviloMest() < stStudentov ? this.predavalnice[i].vrniSteviloMest() : stStudentov;
                    stStudentov -= raz[i];
                }
            }
            ostanek[0] = stStudentov;
            return raz;
        }
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
