public class StaticVariable {
  
  public static int resultBuffer = 0;

  public static String menuString = """
    1. 사용 설명
    2. 계산하기
    3. 프로그램 종료
    """;

  // public String menuString = """

  //   메뉴를 입력하세요
  //   1 : 설명서 띄우기 || 2 : 계산하기 || 3 : 종료하기
  //   입력 : """;

  public static String scriptString = """

======================================================================================
초간단 계산기의 사용 설명서입니다.
1.직전 계산의 결과값을 다음 계산에 사용하실 수 있습니다.
2.결과값에 소수가 나올 경우 소수점 6자리까지 계산합니다.
3. 사용가능한 연산자는 +,-,/,*입니다
4. 수식의 길이는 (     )까지 받을 수 있습니다.
5.수학적 정의에 올바른 수식만 받을 수 있습니다.
Ex) 0으로 나누려한 경우,괄호의 짝이 맞지 않는 경우 등등 입력 받을 수 없습니다.
계산하기 창에서 3~5의 규칙을 어길 경우 오류 문구를 출력하고 재입력 받습니다.
======================================================================================
""";
}

