import java.util.Scanner;
//maximum number of meat=3//
public class Dish{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		String aM1= "Chicken";
		String aM2= "Beef";
		String aM3= "Pork";
		String aM4= "Pork liver";
		String aM5="Hotdogs";
		String aM6= "Goat meat";
		String aS1= "Tomato sauce";
		String aS2= "Tomato paste";
		String aS3= "Soy sauce";
		String aV1= "Carrots";
		String aV2= "Potatoes";
		String aV3= "Bell pepper";
		String aV4= "Peas";
		String aV5= "Dried bay leaves";
		String aV6= "Raisins";
		String x= "Afritada";
		String y= "Menudo";
		String z= "Kaldereta";
		String h= "Mechado";
		String meat1a="";
		String meat2a="";
		String meat3a ="";
		String sauce1a="" ;
		String sauce2a=""; 
		String sauce3a="";
		String vega="";
		String vega2=""; 
		String vega3="";
		String vega4="";

		System.out.print("Please number of meat: ");
		int numMeat = sc.nextInt();
		System.out.println(numMeat);
		if (numMeat<1 || numMeat>3){
			System.out.println("INVALID DISH");
			System.exit(1);
		}
			
		System.out.print("Please input number of sauce: ");
		int numSauce= sc.nextInt();
		System.out.println(numSauce);
			if (numSauce<2||numSauce>3){
			System.out.println("INVALID DISH");
			System.exit(1);				
			}
			

		System.out.print("Please input number of vegetables: ");
		int numVeg= sc.nextInt();
		System.out.println(numVeg);	
		sc.nextLine();
			if (numVeg>4 || numVeg<3){
				System.out.println("INVALID DISH");
				System.exit(1);
			}


			if(numMeat==1&&numMeat<=3){
				System.out.println("What type of meat: ");
				meat1a=sc.nextLine();
			
			}else if (numMeat==2&&numMeat<=3){
				System.out.println("What type of meat: ");
				meat1a=sc.nextLine();
				meat2a=sc.nextLine();

			}else if (numMeat==3){
				System.out.println("What type of meat: ");
				meat1a=sc.nextLine();
				meat2a=sc.nextLine();
				meat3a=sc.nextLine();
			}

			
			if(numSauce==2&&numSauce<=3){
				System.out.println("What type of sauce: ");
				sauce1a=sc.nextLine();
				sauce2a=sc.nextLine();
	
		}
			else if (numSauce==3 && numSauce<=3){
				System.out.println("What type of sauce: ");
				sauce1a=sc.nextLine();
				sauce2a=sc.nextLine();	
				sauce3a=sc.nextLine();
		}
			
			if(numVeg==3 &&numVeg<=4){
				System.out.println("What type of vegetables: ");
				vega=sc.nextLine();
				vega2=sc.nextLine();
				vega3=sc.nextLine();		
		}
			else if (numVeg==4&&numVeg<=4){
				System.out.println("What type of vegetables: ");
				vega=sc.nextLine();
				vega2=sc.nextLine();
				vega3=sc.nextLine();
				vega4=sc.nextLine();	
			
		}
		//afritada
	if ((meat1a.equalsIgnoreCase(aM1))&& (sauce1a.equalsIgnoreCase(aS1))&&
			(sauce2a.equalsIgnoreCase(aS2))&& (vega.equalsIgnoreCase(aV1))
			&&(vega2.equalsIgnoreCase(aV2))&& (vega3.equalsIgnoreCase(aV3))&& (vega4.equalsIgnoreCase(aV4))){
		System.out.println("The dish is: " + x);	
	}
	
	//mechado 
	if ((meat1a.equalsIgnoreCase(aM2))||(meat1a.equalsIgnoreCase(aM3))&& (sauce1a.equalsIgnoreCase(aS1))&&
			(sauce2a.equalsIgnoreCase(aS2))&& (sauce3a.equalsIgnoreCase(aS3))&&(vega.equalsIgnoreCase(aV1))
			&&(vega2.equalsIgnoreCase(aV2))&& (vega3.equalsIgnoreCase(aV3))){
		System.out.println("The dish is: " + h);	
			}
	//menudo 
	
	if ((meat1a.equalsIgnoreCase(aM3))&&(meat2a.equalsIgnoreCase(aM4))&& (meat3a.equalsIgnoreCase(aM5))&& (sauce1a.equalsIgnoreCase(aS1))&&
			(sauce2a.equalsIgnoreCase(aS2))&&(vega.equalsIgnoreCase(aV1))
			&&(vega2.equalsIgnoreCase(aV2))&& (vega3.equalsIgnoreCase(aV5))&& (vega4.equalsIgnoreCase(aV6))){
		System.out.println("The dish is: " + y);	
			}
	//Kaldereta
		if ((meat1a.equalsIgnoreCase(aM6))&&(meat2a.equalsIgnoreCase(aM2))&&(sauce1a.equalsIgnoreCase(aS1))&&
			(sauce2a.equalsIgnoreCase(aS2))&& (sauce3a.equalsIgnoreCase(aS3))&&(vega.equalsIgnoreCase(aV1))
			&&(vega2.equalsIgnoreCase(aV2))&& (vega3.equalsIgnoreCase(aV3))){
		System.out.println("The dish is: " + z);	
			}
		
	}		
}