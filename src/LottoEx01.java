import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<LottoNum> lm = new HashSet<LottoNum>(); // 로또 번호 클래스 생성
		Random rand = new Random(System.currentTimeMillis()); // 난수 생성. 뽑을 때마다 새로운 값 출력.
		//int[] sortNum = new int[6]; // 정렬 위한 배열
		
		for(int i=0; i<4; i++) {// 4세트
			
			while(lm.size() != 6){ // 6개씩
				lm.add(new LottoNum(rand.nextInt(45)+1)); // 난수 삽입하여 로또 번호 생성
			}
		
			for( LottoNum num : lm) {
					System.out.print(num.getNumber() + "\t"); // 로또 번호 출력

			}
			
			System.out.println();
			lm.clear(); // 초기화
		}
		
	}

}
