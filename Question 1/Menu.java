import java.util.Scanner;
public class Menu {

    static void displayMainMenu(){
  Scanner scan = new Scanner(System.in);

  System.out.println("1.ConversionSubMenu");
  System.out.println("2.My1DArraySubMenu");

  System.out.print("Select : ");
  String Ans = scan.next();
  
        System.out.println("");
        
  int n1 = Integer.parseInt(Ans);	


  if(n1 ==1){
     displayConversionSubMenu();
  }else if(n1 ==2){
     displayMy1DArraySubMenu();
  }else{
    System.out.println("Error Selection Try Again");
     displayMainMenu();
  }


}




static void displayConversionSubMenu(){

  Scanner scan = new Scanner(System.in);

    System.out.println("1. Grams To ounces");
    System.out.println("2. Ounces To Grams");
    System.out.println("3. Kilograms to Stone"); 
    System.out.println("4. Stone to kilograms");
    System.out.println("5. Pounds to gram");
    System.out.println("6. Grams to pounds");
    System.out.println("0. Exit"); 

    System.out.print("Select : ");
    String Ans = scan.next();
    System.out.println("");
    
    int n1 = Integer.parseInt(Ans);	

  Conversion c1 = new Conversion();

  Scanner scan1 = new Scanner(System.in);

    if(n1 == 1){
      System.out.print("Input Weight : ");
      double w = scan.nextDouble();
      System.out.println("Answer is "+c1.GramsToOunces(w)+" Ounces");

    }else if(n1==2){
      System.out.print("Input Weight : ");
      double w = scan.nextDouble();
      System.out.println("Answer is "+c1.OunToGrams(w)+"g");
      

    }else if(n1 == 3){

      System.out.print("Input Weight : ");
      double w = scan.nextDouble();
      System.out.println("Answer is "+c1.KgToStone(w)+" Stones");


    }else if(n1 == 4){
      System.out.print("Input Weight : ");
      double w = scan.nextDouble();
      System.out.println("Answer is "+c1.StoneToKg(w)+"kg");



    }else if(n1 == 5){
      System.out.print("Input Weight : ");
      double w = scan.nextDouble();
      System.out.println("Answer is "+c1.PoundsToGram(w)+"g");



    }else if(n1 == 6){
      System.out.print("Input Weight : ");
      double w = scan.nextDouble();
      System.out.println("Answer is "+c1.GramToPound(w)+" Ounces");



    }else if(n1 == 0){
       displayMainMenu();

    }else{
      System.out.println("Wrong Input ,Try Again!");
      System.out.println("");
      displayConversionSubMenu();
    }

    System.out.println("");
    displayConversionSubMenu();
    System.out.println("");

}




static void displayMy1DArraySubMenu(){
    
    Scanner scan  = new Scanner(System.in);
    
    System.out.println("1 Total");
    System.out.println("2 Average");
    System.out.println("3 HighestInRow");
    System.out.println("0 Exit");
    
    int a = scan.nextInt();
    System.out.println("");
    
    
    My1DArray m1 =new My1DArray();
    
    
    Scanner scan1  = new Scanner(System.in);
    if(a ==1){
        System.out.print("Input the size of the array :");
        int size = scan1.nextInt();
        System.out.println("");
        
        System.out.print("Input the Elements :");
        System.out.println("");
        double[] array1 = new double[size]; 
        Scanner scan2  = new Scanner(System.in);
        
        for(int i =0;i<size;i++){
            array1[i] = scan1.nextDouble();
        }
        
        System.out.println("Total is "+m1.getTotal(array1));
        
        
    }else if(a==2){
        System.out.print("Input the size of the array :");
        int size = scan1.nextInt();
        System.out.println("");
        
        System.out.print("Input the Elements :");
        System.out.println("");
        double[] array1 = new double[size]; 
        Scanner scan2  = new Scanner(System.in);
        
        for(int i =0;i<size;i++){
            array1[i] = scan1.nextDouble();
        }
        
        System.out.println("Total is "+m1.getAverage(array1));
        
        
    }else if(a==3){
		
		
		
		System.out.print("Input the size of the array :");
        int size = scan1.nextInt();
        System.out.println("");
        
        System.out.print("Input the Elements :");
        System.out.println("");
        double[] array1 = new double[size]; 
        Scanner scan2  = new Scanner(System.in);
        
        for(int i =0;i<size;i++){
            array1[i] = scan1.nextDouble();
        }
        
		System.out.println("");
		System.out.println("Input the Index : ");
		Scanner s1 = new Scanner(System.in);
		int indexx = s1.nextInt();
		
		System.out.println("");
		
        System.out.println("Highest is "+m1.getHighestInRow(array1,indexx));
		
		
		
		
		
        
        
    }else if(a==0){
        displayMainMenu();
        System.out.println("");
        
        
    }else{
        System.out.println("Wrong input Try Again!!");
        System.out.println("");
        displayMy1DArraySubMenu();
        System.out.println("");
    }
    
    
    

}





public static void main(String []args){

displayMainMenu();

}
    
}


class Conversion  {
  
  double GramsToOunces(double weight){
    double answer = weight*0.03527396;
    return answer;
  }

   double OunToGrams(double weight){
     double answer = weight*28.3495231;
      return answer;

   }

    double KgToStone(double weight) {
      double answer = weight*0.15747304;
      return answer;
    }


    double StoneToKg(double weight){
      double answer = weight*6.35029318;
      return answer;
    }


     double PoundsToGram(double weight){
       double answer = weight*453.59237;
      return answer;
     }


      double GramToPound(double weight) {
      double answer = weight*0.00220462;
      return answer;
      }


}




class My1DArray{

double getTotal (double arr[]){
 int length = arr.length;
 int size = length-1;

 double total =0;

 for(int i=0;i<=size;i++){
   total= total+ arr[i];
 }
 return total;
} 



double getAverage (double arr[]){
  int length  = arr.length;
  int size = length-1;

  double total =0;
  for(int i=0;i<=size;i++){
   total= total+ arr[i];
 }

 double average = total/length;

 return average;
}

double getHighestInRow(double arr[],int rowNumber){
	
	int size = arr.length-1;
	double temp =0;
	
	for(int i=0;i<=size;i++){
		if(arr[i]>temp){
			temp =arr[i];
		}
		
	}
	
	return temp;
	
}




 

}