package Softskills;

public class Movehyphen {
    static void moveHyphenInFront(char str[]) {
        // Keep copying non-hyphen characters
        int i = str.length - 1;
        for (int j = i; j >= 0; j--)
            if (str[j] != '-')
                str[i--] = str[j];
        // Move hyphens to the beginning
        while (i >= 0)
            str[i--] = '-';
    }

    public static void main(String[] args) {
        char str[] = "Code- 4 -lyf".toCharArray();
        moveHyphenInFront(str);
        System.out.println(String.valueOf(str));
    }
}