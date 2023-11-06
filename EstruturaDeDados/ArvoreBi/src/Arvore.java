

public class Arvore {
    
    public Arvore Esq, Dir;
    public int info;

    public Arvore(int info){
        this.info = info;
        this.Dir= null;
        this.Esq = null;
    };

    public Arvore getEsq() {
        return Esq;
    }
    public void setEsq(Arvore esq) {
        Esq = esq;
    }
    public Arvore getDir() {
        return Dir;
    }
    public void setDir(Arvore dir) {
        Dir = dir;
    }
    public int getInfo() {
        return info;
    }
    public void setInfo(int info) {
        this.info = info;
    }

   




    

    
}
