package eraser;
/**
 * 칠판 지우개를 테스트하는 클래스
 * @author PC38207
 *
 */
public class EraserTest {

	public static void main(String[] args) {
		// 1. 선언 : 칠판 지우개 객체 참조 변수 선언
		Eraser eraser1;
		Eraser eraser2;

		// 2. 초기화
		eraser1 = new Eraser(13.0, 4.5, 2, 5);
		eraser2 = new Eraser(13.0, 4.5, 2, 5);
		// 3. 사용
		// (1) 두 지우개의 초기 상태 출력
		eraser1.print();
		eraser2.print();
		
		// (2) eraser2 의 한 겹을 제거
		eraser2.peel();
		
		// (3) eraser2 의 한 겹을 제거 두 지우개의 상태 출력
		eraser1.print();
		eraser2.print();
		
		// (4) eraser2 의 한 겹을 제거
		eraser2.peel();
		
		// (5) eraser2 의 한 겹을 제거 두 지우개의 상태 출력
		eraser1.print();
		eraser2.print();
		
		// (6) 남은 겹의 수가 -(음수)로 가지 않는지 확인
		eraser2.peel();
		eraser2.print();
		eraser2.peel();
		eraser2.print();
		eraser2.peel();
		eraser2.print();
		eraser2.peel();
		
		// (7) eraser2  상태 출력
		eraser2.print();
	}

}
