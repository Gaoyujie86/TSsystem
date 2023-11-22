package project5;
import java.util.Scanner; // 导入Scanner工具类，用于接收键盘输入

public class StringSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象实例，用于读取键盘输入
        
        // 循环10次读取字符串
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a mixed string of uppercase letters, lowercase letters, and numbers:");
            String input = scanner.nextLine(); // 接收用户键盘输入的一行文本
            
            // 用StringBuilder来拼接不同类型的字符
            StringBuilder uppercase = new StringBuilder(); // 用于存储大写字母
            StringBuilder lowercase = new StringBuilder(); // 用于存储小写字母
            StringBuilder digits = new StringBuilder(); // 用于存储数字
            
            // 遍历输入的字符串
            for (char c : input.toCharArray()) {
                if (Character.isUpperCase(c)) { // 判断字符是否为大写字母
                    uppercase.append(c);
                } else if (Character.isLowerCase(c)) { // 判断字符是否为小写字母
                    lowercase.append(c);
                } else if (Character.isDigit(c)) { // 判断字符是否为数字
                    digits.append(c);
                }
            }
            
            // 输出排序后的字符串
            System.out.println("Uppercase Letters: " + uppercase);
            System.out.println("Lowercase Letters: " + lowercase);
            System.out.println("Numbers: " + digits);
        }
        
        scanner.close(); // 关闭Scanner对象实例，释放资源
    }
}