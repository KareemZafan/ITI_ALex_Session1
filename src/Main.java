public class Main {

    public static void main(String[] args) {

        String ip = "192.183.3.5";
        String [] ipSplitters = ip.split("\\.");
        for (String i:ipSplitters){
            System.out.println(i);
        }

    }
}
