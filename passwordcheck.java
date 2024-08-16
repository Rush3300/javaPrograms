// You are given a function.
// int CheckPassword(char str[], int n);
// The function accepts string str of size n as an argument. Implement the function which returns 1 if given string str is valid password else 0.
// str is a valid password if it satisfies the below conditions.

// – At least 4 characters
// – At least one numeric digit
// – At Least one Capital Letter
// – Must not have space or slash (/)
// – Starting character must not be a number

public class passwordcheck{
    public static boolean CheckPassword(String str){
        boolean num=false,CC=false;

        if(str.length()<4){
                System.out.println("your password should be atleast 4 characters.. ");
            }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                num=true;
            }else if(Character.isUpperCase(ch)){
                CC=true;
            }else if(ch==' ' || ch=='/'){
                return false;
        }
        }
        char ch = str.charAt(0);
            if(Character.isDigit(ch)){
                return false;
        }
    //  System.out.println("there should be atleast one number/Capital in password..");
         
      return num && CC;      
    }
    public static void main(String[] args) {
        String str = "aabbAA123";
        
        if(CheckPassword(str)){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}

