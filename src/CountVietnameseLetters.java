import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class CountVietnameseLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi chữ cái Latin: ");
        String input = scanner.nextLine();

        // Định nghĩa các quy tắc chữ cái Tiếng Việt trong telex
        String vietnamesePattern = "aw|aa|dd|ee|oo|ow|w";

        // Tạo đối tượng Pattern từ quy tắc
        Pattern pattern = Pattern.compile(vietnamesePattern);

        // Tạo đối tượng Matcher từ chuỗi nhập vào
        Matcher matcher = pattern.matcher(input);

        // Đếm số lượng chữ cái Tiếng Việt trong chuỗi
        int count = 0;
        while (matcher.find()) {
            count++;
        }

        System.out.println("Số lượng   các chữ cái Tiếng Việt có thể được tạo thành trong 1 chuỗi chữ cái latin nhập vào từ bàn phím là: " + count);
    }
}

