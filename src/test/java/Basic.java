public class Basic {
    public  static void main(String[] args) {

        String s = "Dev";
        s = s.replace("D", "T");

        StringBuilder sb = new StringBuilder("Dev");
        sb.replace(0, 1, "T");

        System.out.println(s);
        System.out.println(sb);

    }
}
