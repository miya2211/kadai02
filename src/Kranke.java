public class Kranke {

//    Kranke: 患者のこと。このシステム利用者では患者をクランケと呼称することを想定している
//    mrn: カルテ番号のこと。medical record numberの略
//    dh: 歯科衛生士のこと。dental hygienistの略

    private int mrn;
    private String name;
    private int age;
    private String dh;

    public Kranke(int mrn, String name, int age, String dh) {
        this.mrn = mrn;
        this.name = name;
        this.age = age;
        this.dh = dh;
    }

    public int getMrn() {

        return mrn;
    }

    public String getName() {

        return name;
    }

    public int getAge() {

        return age;
    }

    public String getDh() {

        return dh;
    }

}