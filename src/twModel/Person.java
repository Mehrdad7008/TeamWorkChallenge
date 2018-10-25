package twModel;

public class Person {
    private float satisfication = 1 ;
    private String work;
    Bazaar bazaar =  new Bazaar(0);
    private int a = 1 ;

    public float personPoint() {
        return a * satisficationDeveloper();
    }
    public float satisficationDeveloper() {
        this.satisfication *= 1;
        return this.satisfication;
    }
    public String job() {
        return this.work;
    }


}