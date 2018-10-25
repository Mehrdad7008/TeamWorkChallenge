package twModel;

public class Person {
    private float satisfication = 1 ;
    private String work;
    Bazaar bazaar =  new Bazaar();
    private int a = 1 ;

    public float personPoint() {
        return a * satisficationDeveloper();
    }
    public float satisficationDeveloper() {
        this.satisfication *= ;
        return this.satisfication;
    }
    public String job() {
        return this.work;
    }


}