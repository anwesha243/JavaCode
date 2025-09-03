class Array{
    public static void main(String args[]){

        // For taking input  create Scanner class object 
        Scanner in = new Scanner(System.in);

        // Declaration for array
        int num[] = new int[10];

        System.out.println("Enter the values : ");
        for(int i = 0 ; i < 10 ; i++) //Loop is created to enter values 
        num = in.nextInt();

        System.out.println("The value entered...");
        for(int i= 0;i<10;i++)
        System.out.println(num[i]+" "); //Print the array
    }
}