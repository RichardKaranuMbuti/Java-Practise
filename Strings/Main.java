public class Main {
    // String in java is an object with methods
    public static void main(String[] args){
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int length = txt.length() ;
        System.out.println("Size of txt: " + length);
        String smaller = txt.toLowerCase();
        System.out.println("String to lowercase: "+ smaller);
        String capital = smaller.toUpperCase() ;
        System.out.println("Back to capital: "+ capital);

        Main maininstance = new Main();
        maininstance.location();
        maininstance.stringConcat();
    }

    // Index operator in java String
    public void location(){
        String sentence = "Please locate where 'locate' occurs" ;
        System.out.println("Locate occurs at: " + sentence.indexOf("locate") );
    }

    public String stringConcat(){
        // Approach 1
        String first_name = "Richie" ;
        String surname = "Mbuti" ;
        String full_name = first_name + " " + surname ;
        System.out.println("Full Names: " + full_name) ;

        // Approach 2
        String full_name1 = first_name.concat(surname) ;
        System.out.println("Full names Approach 2 :" + full_name1) ;
        return full_name;
    }
}
