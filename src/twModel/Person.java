package twModel;

public class Person {
    private float satisfication = 1 ;
    private String work;
    private int a = 1 ;

    Bazaar bazaar = new Bazaar();

    public float personPoint() {
        return a * satisficationDeveloper();
    }
    public float satisficationDeveloper() {
        this.satisfication *= bazaar.bazaarLvl;
        return this.satisfication;
    }
    public String job() {
        return this.work;
    }


}