public class Kranke {

    private int MRN;
    private String name;
    private int age;
    private String DH;

    public Kranke(int MRN, String name, int age, String DH) {
        this.MRN = MRN;
        this.name = name;
        this.age = age;
        this.DH = DH;
    }

    public int getMRN() {
        return MRN;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDH() {
        return DH;
    }

}