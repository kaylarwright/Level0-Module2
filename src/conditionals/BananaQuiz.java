//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package conditionals;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String input = JOptionPane.showInputDialog(null,"Do you like Bananas?");
		if(input.equals("No")){
			JOptionPane.showMessageDialog(null, "You are crazy");
		}else if(input.equals("Yes"));
			String hobby = JOptionPane.showInputDialog(null, "What is you favorite hobby?");
			JOptionPane.showMessageDialog(null, "Your " + hobby + " is much better with bananas");
		}
			
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than yes or no
		//	show a pop up that says You are bananas!â€�
	
	}


