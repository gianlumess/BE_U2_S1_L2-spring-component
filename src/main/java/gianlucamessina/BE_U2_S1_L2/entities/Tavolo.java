package gianlucamessina.BE_U2_S1_L2.entities;

import gianlucamessina.BE_U2_S1_L2.enums.StatoTavolo;

public class Tavolo {
        private int numeroTavolo;
        private int numeroCopertiMassimo;
        private StatoTavolo statoTavolo;


        public Tavolo(int numeroTavolo, int numeroCopertiMassimo) {
                this.numeroTavolo = numeroTavolo;
                this.numeroCopertiMassimo = numeroCopertiMassimo;
                this.statoTavolo = StatoTavolo.LIBERO;
        }

        public int getNumeroTavolo() {
                return numeroTavolo;
        }

        public void setNumeroTavolo(int numeroTavolo) {
                this.numeroTavolo = numeroTavolo;
        }

        public int getNumeroCopertiMassimo() {
                return numeroCopertiMassimo;
        }

        public void setNumeroCopertiMassimo(int numeroCopertiMassimo) {
                this.numeroCopertiMassimo = numeroCopertiMassimo;
        }

        public StatoTavolo getStatoTavolo() {
                return statoTavolo;
        }

        public void setStatoTavolo(StatoTavolo statoTavolo) {
                this.statoTavolo = statoTavolo;
        }

        @Override
        public String toString() {
                return "Tavolo{" +
                        "numeroTavolo=" + numeroTavolo +
                        ", numeroCopertiMassimo=" + numeroCopertiMassimo +
                        ", statoTavolo=" + statoTavolo +
                        '}';
        }
}
