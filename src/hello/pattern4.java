package hello;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 3; i++) {

            for(int j = 1; j <= i; j++) { 

                if(j != i) {

                    System.out.print(" ");

                }
                else if(j == i){

                    System.out.print(".");    

                }
            }
            System.out.println();
        }

	}

}
