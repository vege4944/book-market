public class Welcome {

    //실행매소드가필요하니 main 메소드 입력
    public static void main(String[] args) {
        System.out.println("****************************************************************");//출력명령어
        System.out.println("\tWelcome to Shopping Mall\t"); //탭만큼 띄우라는소리=escape sequence
        System.out.println("\tWelcome to Book Market!\t");
        System.out.println("****************************************************************");//ctrl+y 한줄지우기
        System.out.println(" 1. 고객 정보 확인하기\t\t\t\t 5. 바구니에 항목 추가하기");
        System.out.println(" 2. 장바구니 상품 목록 보기\t\t\t 6. 장바구니의 항목 수량 줄이기");
        System.out.println(" 3. 장바구니 비우기\t\t\t\t 7. 장바구니의 항목 삭제하기");
        System.out.println(" 4. 영수증 표기하기\t\t\t\t 8. 종료");
        System.out.println("****************************************************************");
    }//cli=command line 콘솔에 출력프로그램
    //항상위에부터 아래로 1차원적으로 순서대로 나열되고 실행된다
}
