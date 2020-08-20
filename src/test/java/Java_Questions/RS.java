package Java_Questions;

public class RS {


    public static void main(String[] args) {
        String text = "%%%%^^!@#*Se^#^^#l**e@@n@i!um";

        String ReverseText = text.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(ReverseText);

    }

}
