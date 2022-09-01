

import java.util.ArrayList;



public class bubblesort{

    public static ArrayList<Integer> BubbleSorting(ArrayList<Integer> ArrayList, visualizer b){
            
        // loop through the array
            for(int x=0; x<ArrayList.size()-1;x++)
            {
            //
                for(int i=0; i<ArrayList.size()-1 - x; i++)
                {

                    //if the value on the left is greater than the value on the right swap the two values
                        if (ArrayList.get(i).compareTo(ArrayList.get(i+1))>0)
                        {

                            int j=ArrayList.get(i);
                            ArrayList.set(i,ArrayList.get(i+1));
                            ArrayList.set(i+1,j);
                        }

                        //repaint the GUI and make them able to see the changes
                        try {Thread.sleep(1);}catch(Exception ex){}
                        b.repaint();
                }
            }


        
        return ArrayList;
    }
    
}
