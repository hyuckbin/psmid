package org.example.yalco;

public class Outer {

    //내부 클래스가 쓰이는 이유 : 강력한 캡슐화 -> 외부/내부 클래스간의 관계가 긴밀할 때 사용
    // 적절히 사용시 유지보수 증가, 가독성 증가

        private String name;
        public Outer (String name) {
            this.name = name;
        }

        //  매장신설 TF팀 - 본사에서 창설  --> static = 본사
        public static class LaunchTF {
            private String title;
            private String leader;

            public LaunchTF(String title, String leader) {
                this.title = title;
                this.leader = leader;
            }

            public Outer launch () {
                //  ⚠️ 인스턴스 필드는 사용 불가
                // System.out.println(this.name);
                return new Outer(title);
            }
        }

        //  매장마다의 기프트 - 매장에서 배부
        class Gift {
            private String message;

            public Gift(String to) {
                this.message = "From 얄코치킨 %s점 to %s님"
                        .formatted(name, to);
            }
        }

        public Gift getGift (String to) {
            return new Gift(to);
        }

}
