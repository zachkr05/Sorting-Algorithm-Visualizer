



import java.util.ArrayList;

public class insertionsort {
    public static ArrayList<Integer> Insertionsorting(ArrayList<Integer> ArrayList, visualizer b){
            for (int i = 1; i<ArrayList.size(); i++){
                int current=ArrayList.get(i);

                int j=i-1;
                while(j >= 0 && ArrayList.get(j) > current){
                    ArrayList.set(j+1,ArrayList.get(j));
                    j--;
                }
                ArrayList.set(j+1, current);
                try {Thread.sleep(1);}catch(Exception ex){}
                b.repaint();
            }
            System.out.println(ArrayList);
        return ArrayList;
}
}
