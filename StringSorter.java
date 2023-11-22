package project5;
import java.util.Scanner; // ����Scanner�����࣬���ڽ��ռ�������

public class StringSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // ����Scanner����ʵ�������ڶ�ȡ��������
        
        // ѭ��10�ζ�ȡ�ַ���
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a mixed string of uppercase letters, lowercase letters, and numbers:");
            String input = scanner.nextLine(); // �����û����������һ���ı�
            
            // ��StringBuilder��ƴ�Ӳ�ͬ���͵��ַ�
            StringBuilder uppercase = new StringBuilder(); // ���ڴ洢��д��ĸ
            StringBuilder lowercase = new StringBuilder(); // ���ڴ洢Сд��ĸ
            StringBuilder digits = new StringBuilder(); // ���ڴ洢����
            
            // ����������ַ���
            for (char c : input.toCharArray()) {
                if (Character.isUpperCase(c)) { // �ж��ַ��Ƿ�Ϊ��д��ĸ
                    uppercase.append(c);
                } else if (Character.isLowerCase(c)) { // �ж��ַ��Ƿ�ΪСд��ĸ
                    lowercase.append(c);
                } else if (Character.isDigit(c)) { // �ж��ַ��Ƿ�Ϊ����
                    digits.append(c);
                }
            }
            
            // ����������ַ���
            System.out.println("Uppercase Letters: " + uppercase);
            System.out.println("Lowercase Letters: " + lowercase);
            System.out.println("Numbers: " + digits);
        }
        
        scanner.close(); // �ر�Scanner����ʵ�����ͷ���Դ
    }
}