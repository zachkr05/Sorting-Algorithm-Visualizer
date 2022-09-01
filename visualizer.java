import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class visualizer extends JPanel{
    //Define the public variables
    public static ArrayList <Integer> ArrOfInts = new ArrayList<>();
    public int xloc = 0;
    public int yloc= 10;
    public static int width = 5;
    public static ArrayList<String> algorithms = new ArrayList<>();
    public static String algorithmInput ="";

        public static void main(String[] args){

            
        // Initalize the list of algorithms
            Collections.addAll(algorithms, "Merge","merge","Bubble","bubble","Insertion","insertion");
    
        //Initialize important variables
            //Swing related variables
                visualizer panel = new visualizer();
                JFrame frame = new JFrame();
            //Scanner related variables
                Scanner sc=new Scanner(System.in); 
                Scanner sca=new Scanner(System.in); 
            // Initalize the screen
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setLocationRelativeTo(null);
                    frame.add(panel);
                    frame.setBounds(400,100,1920,1080);

        //Find out how many integers are needed
            System.out.print("Enter the amount of numbers you would like to use, to visualize the sorting algorithm: ");
            int NumOfIntsWanted = sc.nextInt();
                // Make the bar chart more visible at higher loads
                    if (NumOfIntsWanted>207)
                        {
                            width=3;
                        }
                    if (NumOfIntsWanted>500)
                        {
                            width=1;
                        }
        
        // Ensure the user provides an algorithm that is appropriate   
            do
            {
                System.out.print("Please enter the algorithm you would like to use, the algorithms available are marge, insertion, and bubble? If this message continues to pop up then your answer was not sufficient. ");
                algorithmInput = sca.nextLine();
            }
            while((algorithms.contains(algorithmInput) == false));

        // Set the array list to random integers
            setArrListToRand(NumOfIntsWanted);
            
        // Check for which algorithm the user wants to use, and sort the algorithm with the user provided algorithm. If the algorithm entered is available then display the screen
                if (algorithmInput.equals("Bubble") || algorithmInput.equals("bubble"))
                {
                    frame.setVisible(true);
                    bubblesort.BubbleSorting(ArrOfInts, panel);
                }
                else if (algorithmInput.equals("Insertion") || algorithmInput.equals("insertion"))
                {
                    frame.setVisible(true);
                    insertionsort.Insertionsorting(ArrOfInts, panel);
                }

        //CLOSE THE SCANNERS
            sc.close();
            sca.close();
        
        } //main ends

        //draw the rectangles
            public void paintComponent(Graphics g){

                    super.paintComponent(g);
                    draw(g);
            }

        //draw the rectangles proportional to their value
            public void draw(Graphics g){
                //loop through the array and give them their proper sizing
                    for(int x=0; x<ArrOfInts.size(); x++){
                        xloc += width + 1;
                        g.fillRect(xloc, yloc, width, ArrOfInts.get(x));
                    }
                xloc = 0;
            }

        //set the array to random numbers
            private static ArrayList<Integer> setArrListToRand(int NumOfInts)
            { 
            //initialize variables
                Random rand = new Random(); 
                    //start assigning the random numbers to the array list 
                        for (int i = 0; i<NumOfInts; i++)
                        { 
                            ArrOfInts.add(rand.nextInt(NumOfInts));
                        }

            return ArrOfInts;
            }


} //class ends



