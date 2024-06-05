public enum Pianeta {
    MERCURIO(5, 4),
    VENERE(1, 2),
    URANO(3, 4),
    MARTE(6, 7),
    GIOVE(8, 9),
    SATURNO(5, 6),
    NETTUNO(7, 8),
    PLUTONE(2, 3);

    public int massa;
    public int raggio;

    Pianeta(int massa, int raggio) {
        this.massa = massa;
        this.raggio = raggio;
    }
}
