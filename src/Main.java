import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Kranke> krankeList = new ArrayList<Kranke>();

        krankeList.add(new Kranke(1, "佐藤紀子", 80, "加納"));
        krankeList.add(new Kranke(2, "坂本翔太", 8, "小山"));
        krankeList.add(new Kranke(3, "斎藤かおり", 25, "小山"));
        krankeList.add(new Kranke(4, "青木孝之", 74, "加納"));
        krankeList.add(new Kranke(5, "木村莉愛", 6, "加納"));


        System.out.println("【患者一覧】");

        krankeList.forEach(Kranke -> System.out.println("No." + Kranke.getMRN() + " 氏名:" + Kranke.getName() + " 年齢:" + Kranke.getAge() + "　担当衛生士:" + Kranke.getDH()));

        System.out.println();

        System.out.println("【小児一覧】");

        krankeList.forEach(Kranke -> {
            if (Kranke.getAge() <= 18) {
                System.out.println("No." + Kranke.getMRN() + " 氏名:" + Kranke.getName() + " 年齢:" + Kranke.getAge() + "　担当衛生士:" + Kranke.getDH());
            }
        });

    }

}