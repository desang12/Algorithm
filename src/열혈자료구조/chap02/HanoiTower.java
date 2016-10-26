package 열혈자료구조.chap02;

public class HanoiTower {

	public static void main(String[] args) {
		hanoiTowerMove(4, 'A', 'B', 'C');

	}
	
	static void hanoiTowerMove(int num, char from, char by, char to) {
		if(num == 1) {
			System.out.println("원반" + num + "을 " + from + "에서 " + to + "로 이동");
		} else {
			hanoiTowerMove(num - 1, from, to, by);
			System.out.println("원반" + num + "을 " + from + "에서 " + to + "로 이동");
			hanoiTowerMove(num - 1, by, from, to);
		}
	}

}
