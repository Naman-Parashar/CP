public class super_150 {
//        public static void main(String args[]) {
//            Scanner sc = new Scanner(System.in);
//            String str = "abc";
//            String op = "";
//            int count = 0;
//            int i=0;
//            int j=0;
//
//            while(i<str.length() && j<str.length()){
//                if (str.charAt(j)==str.charAt(i)){
//                    count++;
//                    j++;
//                }
//                else {
//                    op+=str.charAt(i);
//                    op+=count;
//                    i=j;
//                    count =0;
//                }
//            }
//            op+=str.charAt(i);
//            op+=count;
//            System.out.println(op);
//
//        }

//    public static void main(String[] args) {
//        Scanner scn=new Scanner(System.in);
//        String str="AxAxA";
//        output(str, 0);
//    }
//    public static void output(String str, int count) {
//        if(str.length()==2) {
//            System.out.println(count);
//            return;
//        }
//        char ch1=str.charAt(0);
//        char ch2=str.charAt(2);
//        String ros=str.substring(1);
//        if(ch1==ch2) {
//            count++;
//        }
//        output(ros,count);
//    }

    public static void main(String[] args) {
        int[][] arr = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        boolean f = false;
        for (int i = 0; i < arr.length; i++) {
            f = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 1){
                    f= true;
                    break;
                }
            }
            if (f == false){
                System.out.print(i);
                break;
            }
        }
        if (f){
            System.out.print("No Celebrity");
        }
    }
}
