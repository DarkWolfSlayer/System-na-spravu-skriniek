
public class User {
    
    private int id_poradie;
    private String meno;
    private String priezvisko;
    private String tel_cislo;
    private String id_user;

    public User(int id_poradie, String meno, String priezvisko, String tel_cislo, String id_user)
    {
        this.id_poradie = id_poradie;
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.tel_cislo = tel_cislo;
        this.id_user = id_user;
    }

    public void setId_poradie(int id_poradie)
    {
        this.id_poradie = id_poradie;
    }

    public int getId_poradie()
    {
        return id_poradie;
    }

    public void setMeno(String meno) 
    {
        this.meno = meno;
    } 

    public String getMeno()
    {
        return meno;
    }

    public void setPriezvisko(String priezvisko) 
    {
        this.priezvisko = priezvisko;
    } 

    public String getPriezvisko()
    {
        return priezvisko;
    }

    public void setTel_cislo(String tel_cislo) 
    {
        this.tel_cislo = tel_cislo;
    }

    public String getTel_cislo()
    {
        return tel_cislo;
    }
    
     public void setId_user(String id_user) 
    {
        this.id_user = id_user;
    } 

    public String getId_user()
    {
        return id_user;
    }
}
