public class LocalGlobalVariables {
    int x = 12;
    void localVariable() {
        int x = 72;
        System.out.println("Local variable a : " + x);
    }

    public static void main(String[] args) {
        LocalGlobalVariables obj = new LocalGlobalVariables();
        System.out.println("Instance variable x : " + obj.x);
        obj.localVariable();
    }
}