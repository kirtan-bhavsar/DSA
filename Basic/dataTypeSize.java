package Basic;

public class dataTypeSize {

    public static int main(String args[]) {

        String str = "Character";
        switch (str) {
            case "Character":
                return 2;
            case "Integer":
                return 4;
            case "Long":
                return 8;
            case "Float":
                return 4;
            default:
                return 8;
        }
    }
}
