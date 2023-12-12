public class FirstNonRepeatedChar {

    public static void findFirst(String str){
        for(int i=0; i<str.length(); i++){
            boolean isUnique = true;
            for(int j=0; j<str.length(); j++){
                if(i!=j && str.charAt(i)==str.charAt(j))
                    isUnique = false;
            }
            if(isUnique){
                System.out.println(str.charAt(i));
                break;

            }
        }
    }

    public static void main(String[] args) {
        findFirst("ShubhamS");
    }
}
