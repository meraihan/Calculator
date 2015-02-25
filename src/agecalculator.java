/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sayed Mahmud Raihan
 */
import java.util.Scanner; 

import javax.swing.JOptionPane;

public class agecalculator {
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		int byear,bmonth,bdate,pyear,pmonth,pdate,tos,gos,dos,ros;
		String Birthday = JOptionPane.showInputDialog("Enter your birthyear.\n");
		byear = Integer.parseInt(Birthday);
		String Birthdays = JOptionPane.showInputDialog("Enter your birthmonth.\n");
		bmonth = Integer.parseInt(Birthdays);
		String Birthdayss = JOptionPane.showInputDialog("Enter your birthdays.\n");
		bdate = Integer.parseInt(Birthdayss);
		String present = JOptionPane.showInputDialog("Enter your current age: year.\n ");
		pyear = Integer.parseInt(present);
		String presents = JOptionPane.showInputDialog("Enter your current age: month.\n ");
		pmonth = Integer.parseInt(presents);
		String presentss = JOptionPane.showInputDialog("Enter your current age: days.\n ");
		pdate = Integer.parseInt(presentss);
		if(byear>pyear){
			JOptionPane.showMessageDialog(null,"Error ! in input.\n");
		}
		else{
			if(bdate>pdate){
				if(bmonth==4 || bmonth==6 || bmonth==9 || bmonth==11){
					pdate+=30;
					tos = pdate-bdate;
					bmonth+=1;
				}
				else if(bmonth==2){
					
					if(byear%400==0){
						pdate+=29;
						tos = pdate-bdate;
						bmonth+=1;
					}
					else if(byear%4==0){
						pdate+=29;
						tos = pdate-bdate;
						bmonth+=1;
					}
					else{
						pdate+=28;
						tos = pdate-bdate;
						bmonth+=1;
					}
				}
				else{
					pdate+=31;
					tos = pdate-bdate;
					bmonth+=1;
				}
			}
			else{
				tos = pdate-bdate;
			}
			if(bmonth>pmonth){
				pmonth+=12;
				gos = pmonth-bmonth;
				bmonth+=1;
			}
			else{
				gos = pmonth-bmonth;
			}
			
			if(byear<=pyear || bmonth<=pmonth || bdate<=pdate){
				
				
				tos = pdate-bdate;
				gos = pmonth-bmonth;
				dos = pyear-byear;
				if(gos<0){
					gos = 0;
				}
				
				JOptionPane.showMessageDialog(null, "Years: " + dos, "Your current age is: " , JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showMessageDialog(null, "Month: " + gos, "Your current age is: " , JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showMessageDialog(null, "Days: " + tos, "Your current age is: " , JOptionPane.PLAIN_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(null,"Wrong input !!!\n");
			}
		}
	}
}
