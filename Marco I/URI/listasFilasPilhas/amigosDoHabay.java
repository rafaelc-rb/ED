package listasFilasPilhas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class amigosDoHabay {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        ArrayList<String> yesList = new ArrayList<>();
        ArrayList<String> noList = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        String entry[] = new String[2];
        String habayFriend = "";

        entry = in.nextLine().split(" ");

        do{
            if (entry[1].equalsIgnoreCase("YES"))
                yesList.add(entry[0]);
            else
                noList.add(entry[0]);
            entry = in.nextLine().split(" ");
        }while(!entry[0].equalsIgnoreCase("FIM"));

        for(String name : yesList){
            if (name.length() > habayFriend.length())
                habayFriend = name;
        }
        
        yesList.sort(String.CASE_INSENSITIVE_ORDER);
        for(String name : yesList){
            if (!list.contains(name))
                list.add(name);
        }

        noList.sort(String.CASE_INSENSITIVE_ORDER);
        for(String name : noList){
            if (!list.contains(name))
                list.add(name);
        }

        for(String name : list){
            System.out.println(name);
        }

        System.out.println("\nAmigo do Habay:");
        System.out.println(habayFriend);

        in.close();
    }
}