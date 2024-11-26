public class Asgm1{
    int instanceVariable = 10;

    static int staticVariable = 20;

    public void showLocalVariable()
    {
        int localVariable = 30;
        System.out.println("Instance Varibale: " + instanceVariable);
        System.out.println("Static Variable: " + staticVariable);
        System.out.println("Local Variable: " + localVariable);
    }
    public void showInstanceVariable()
    {
        System.out.println("Instance Varibale: " + instanceVariable);
        System.out.println("Static Variable: " + staticVariable);
    }
public static void main(String[] args) {
    Asgm1 variableScope = new Asgm1();
    variableScope.showInstanceVariable();
    variableScope.showLocalVariable();
}
}
