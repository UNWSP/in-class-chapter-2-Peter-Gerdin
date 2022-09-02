//  Peter Gerdin, Sep 1, 2022


public class Scopes {
    final int FINAL_VARIABLE = 13;  static int staticVariable = 14; public int publicVariable = 15;

    public static void main(String[] args){
        FINAL_VARIABLE = 12;
        System.out.println("static variable = " + staticVariable);

        staticVariable = 2;
        System.out.println("static variable again = " + staticVariable);

        publicVariable = publicVariable + 1;
        System.out.println("public variable = " + publicVariable);

        public int publicVariable = 3;

        System.out.println("public variable = " + publicVariable);
    }
}
