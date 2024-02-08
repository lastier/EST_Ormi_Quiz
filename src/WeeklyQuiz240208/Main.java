package WeeklyQuiz240208;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 연락처 목록
        ArrayList<Contact> contacts = new ArrayList<>();

        // 반복적으로 연락처 정보 입력
        while (true) {
            System.out.print("이름: ");
            String name = scanner.nextLine();

            System.out.print("전화번호: ");
            String phoneNumber = scanner.nextLine();

            // 종료 조건
            if (name.isEmpty() || phoneNumber.isEmpty()) {
                break;
            }

            // 연락처 추가
            contacts.add(new Contact(name, phoneNumber));
        }

        // 모든 연락처 출력
        for (Contact contact : contacts) {
            System.out.println(contact);
        }

        // 이름으로 검색
        System.out.print("검색할 이름: ");
        String searchName = scanner.nextLine();

        // 검색 결과 출력
        for (Contact contact : contacts) {
            if (contact.getName().contains(searchName)) {
                System.out.println(contact);
            }
        }
    }
}
