public class counter {
    private int pocetskriniek = 20;
    private int skrinkaobsadena = 0;
    private int skrinkaprazdna= 0;
    
    void setpocetskriniek (int pocetskriniek){
        this.pocetskriniek = pocetskriniek;
    }
    
    public int getpocetskriniek()
    {
        return pocetskriniek;
    }
    
    
    
    void skrinkaobsadena (int skrinkaobsadena){
        this.skrinkaobsadena = skrinkaobsadena;
    }
    
    public int skrinkaobsadena()
    {
        return skrinkaobsadena;
    }
    
    
    
    
    void skrinkaprazdna (int skrinkaprazdna){
        this.skrinkaprazdna = skrinkaprazdna;
    }
    
    public int skrinkaprazdna()
    {
        return skrinkaprazdna;
    }

}
