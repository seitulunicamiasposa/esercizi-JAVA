public enum Mese {
   GENNAIO(31),
    FEBBRAIO(28),
    MARZO(30);

   public int giorno;

   Mese(int giorno) {
       this.giorno = giorno;
   }

   public int getGiorno() {
       return giorno;
   }
}
