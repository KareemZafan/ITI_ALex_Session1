public class Main {

    public static void main(String[] args) {

        String ip = "192.168.1.5";
		
	//git task: 
	String emanIp = "192.168.1.2";
		
        String [] ipSplitters = ip.split("\\.");
        for (String i:ipSplitters){
            System.out.println(i);
        }

    }
}
