public class Main {

    public static void main(String[] args) {
        //local ip
        String ip = "127.0.0.1";
        String [] ipSplitters = ip.split("\\.");
        for (String i:ipSplitters){
            System.out.println(i);
        }

    }
}
