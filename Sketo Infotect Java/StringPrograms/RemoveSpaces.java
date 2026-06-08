package StringPrograms;

public class RemoveSpaces {

    public static void main(String[] args) {
        
        String str = "India Won the Cricket match";
        str = str.toLowerCase();
        
        StringBuilder res = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(ch != ' '){
               res.append(ch);
            }      
        }
        System.out.println(res);
    }
    
}
