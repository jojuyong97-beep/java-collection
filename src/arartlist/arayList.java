package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArayListmain {
    static void main(String[] args) {
        // List타입의 컬렉션을 생성
        // List 안에 답을 내용은 String 타입의 문자열
        // <> : 제네릭(Generic)이라고 한다.
        List<String> colors = new ArrayList<>()
        colors.add("black");
        colors.add("white");
        colors.add("pink");
        colors.add("white"); // 중복을 허용한다.
        // 크기 출력
        System.out.println("colors 리스트의 크기:"+ colors.size());
        // 색인으로 접근
        System.out.printf("1번 인덱스의 내용"+colors[1]));
        // for 투표로 출력하기
        for(int i=0; i < colors,size()i++){
            System.out.println("index : "+i+"value"+colors.get(i));
        }

        // 삭제
        // pink 를 삭제, 없으면 없음,
        // 한방에 삭제하기
        colors.remove("pink");
        // for 투표로 출력하기
        for(int i=0; i < colors,size(); i++ {
            System.out.println("================");
        }
        System.out.println("===================");
    }
        //
    }

}
