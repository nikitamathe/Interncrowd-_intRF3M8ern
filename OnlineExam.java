import java.util.*;  
public class OnlineExam {  
 static Scanner sc = new Scanner(System.in);  
 static int choice, timer, score = 0;  
 static String[] questions = {"Question 1?", "Question 2?", "Question 3?", "Question 4?",  
"Question 5?"};  
 static String[][] options = {{"Option 1", "Option 2", "Option 3", "Option 4"}, {"Option 1",  
"Option 2", "Option 3", "Option 4"}, {"Option 1", "Option 2", "Option 3", "Option 4"},  
{"Option 1", "Option 2", "Option 3", "Option 4"}, {"Option 1", "Option 2", "Option 3", "Option  
4"}};  
 static int[] answers = {1, 2, 3, 4, 1};  
 static String[] userAnswers = new String[5];  
 static String username = "admin", password = "12345";  
 public static void public static void main(String[] args) {
    
 }(String[] args) {  
 login();  
 profile();  
 startExam();  
 calculateScore();  
 logout();  
 }  
 public static void login() {  
 System.out.println("Enter username:");  
 String enteredUsername = sc.nextLine();  
 System.out.println("Enter password:");  
 String enteredPassword = sc.nextLine();  
 if (enteredUsername.equals(username) && enteredPassword.equals(password)) {  
 System.out.println("Login successful!");  
 } else {  
 System.out.println("Invalid username or password. Please try again.");  
 login();  
 }  
 }  
 public static void profile() {
System.out.println("Do you want to update your profile and password? (y/n)");  
 String updateProfile = sc.nextLine();  
 if (updateProfile.equals("y")) {  
 System.out.println("Enter new username:");  
 username = sc.nextLine();  
 System.out.println("Enter new password:");  
 password = sc.nextLine();  
 System.out.println("Profile and password updated successfully!");  
 } else {  
 System.out.println("Profile and password not updated.");  
 }  
 }  
 public static void startExam() {  
 System.out.println("Starting exam...");  
 timer = 60;  
 Timer t = new Timer();  
 t.schedule(new TimerTask() {  
 public void run() {  
 System.out.println("Time's up!");  
 calculateScore();  
 System.exit(0);  
 }  
 }, timer * 1000);  
 for (int i = 0; i < questions.length; i++) {  
 System.out.println(questions[i]);  
 for (int j = 0; j < options[i].length; j++) {  
 System.out.println((j + 1) + ") " + options[i][j]);  
 }  
 System.out.println("Enter your answer (1-4):");  
 userAnswers[i] = sc.nextLine();  
 }  
 }  
 public static void calculateScore() {  
 System.out.println("Calculating score...");  
 for (int i = 0; i < answers.length; i++) {  
 if (userAnswers[i].equals(String.valueOf(answers[i]))) {  
 score++;  
 }  
 }  
 System.out.println("Your score is " + score + "/" + answers.length);  
 }  
 public static void logout() {  
 System.out.println("Closing session...");  
 System.out.println("Logout successful!");  
 }  
}
