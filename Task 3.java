class task3 {

    public static void main(String[] args) {
        int check_message = 10;
        String message;
        for(int i=0; i<check_message;i++){
           message = (i%2==0) ? i+" is even number" : i+" is odd number";
           System.out.println(message);
        }
   }


}
