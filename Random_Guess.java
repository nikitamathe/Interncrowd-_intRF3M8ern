import java.util.*;  
class Random_Guess {  
/**
 * 
 */
public static void guessgame() {  
try (Scanner input = new Scanner(System.in)) {  
int num=1+(int)(100*Math.random());  
int k=7;  
int i,number,read;  
System.out.println("Welcome to Guess the Number game.....");  
System.out.println("System generates a number betweeen 1 to  
100"+"Guess the number within 7 trails");  
for(i=0;i<7;i++) {  
System.out.println("Guess the number:");  
number=input.nextInt();  
if(number>100 || number <0) {  
System.out.println("Guess the number between 1 to 100");  
}  
else if(num==number) {  
System.out.println("Congrtulations!! You have guessed the number correctly");  
break;  
}
else if(num<number && i!=k-1) {  
System.out.println("The number is less than the"+number);  
}  
else if(num>number && i!=k-1) {  
System.out.println("The number is greater than the"+number);  
}  
}  
if(i==k) {  
System.out.println("Trails are finished to guess the number");  
System.out.println("The number is"+num);  
System.out.println("Do you want to play again ??");  
System.out.println("If YES enter 1"+" "+"else enter 0");  
read=input.nextInt();  
if(read==1) {  
guessgame();  
}  
else {  
System.out.println("Thank you..");  
}  
}  
}  
}  
public static void main(String[] args) {  
// TODO Auto-generated method stub  
guessgame();  
}  
}
