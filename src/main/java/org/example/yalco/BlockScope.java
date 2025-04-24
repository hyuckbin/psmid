package org.example.yalco;

public class BlockScope {

        public static void main(String[] args) {
            new BlockScope().printKings();
        }

        String king = "사자";

        void printKings () {
            String king = "여우"; // 💡 그럼 이건 뭔가요??

            //  ⭐️ 인스턴스의 필드는 다른 영역으로 간주
            System.out.printf(
                    "인스턴스의 왕은 %s, 블록의 왕은 %s%n",
                    this.king, king
            );
        }

}
