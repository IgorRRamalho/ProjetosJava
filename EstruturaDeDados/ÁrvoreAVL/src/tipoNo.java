public class tipoNo {
    int info;
    tipoNo esq;
    tipoNo dir;
    int alt;

    public tipoNo(int info) {
        this.info = info;
        this.esq = null;
        this.dir = null;
        this.alt = 1;
    }
}
