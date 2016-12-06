/*
	- 지식쇼핑

	조건
	1. 10개 제품이 등록되어 있다. //완료
	2. 사용자의 요구에 따라 여러가지 형태로 정렬된 결과를
	   만들어낸다..
		2-1. 지식쇼핑 랭킹순
		2-2. 낮은 가격순
		2-3. 높은 가격순
		2-4. 최근 등록일 순("2016-12-06")
*/
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Item {
	private String name; 
	private String date;
	private int price;
	private int rank;

	public Item(String name, String date, int price, int rank){
		setName(name);
		setDate(date);
		setPrice(price);
		setRank(rank);
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getDate(){
		return date;
	}
	public void setDate(String date){
		this.date = date;
	}
	public int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public int getRank(){
		return rank;
	}
	public void setRank(int rank){
		this.rank = rank;
	}

	@Override
	public String toString(){
		return name + "\t가격 : " + price + "\t등록일 : " + date + "\t랭킹 : " + rank + "입니다.\n";
	}
}

class Choose implements Comparator<Item> {
	@Override
	public int compare(Item i1, Item i2, Item i3, Item i4){
		//void SelectChoose(int Item)
		Scanner scan = new Scanner(System.in);
		System.out.println("원하시는 정렬 방식을 선택하세요.");
		System.out.println("1. 지식쇼핑 랭킹순 2. 낮은 가격순 3. 높은 가격순 4. 최근 등록일 순 ");
		int sel = scan.nextInt();
		
        if (sel < 1 || sel > 4) { // 없는 정렬 방식 선택시 SelectChoose()호출
            System.out.println("잘못 선택하셨습니다 1~4에서 다시 선택하십시오.");
            //SelectChoose(Item);
        }
        else {                          // 정렬 방식 선택 switch문
            switch (sel) {
            case 1:
                int result = i1.getRank().compareTo(i1.getRank());
				return result;
				break;
            case 2:
                int result = i2.getPrice().compareTo(i2.getPrice());
				return result;
				break;
            case 3:
                int result = b1.getPrice().compareTo(b2.getPrice()) * -1;
				return result;
				break;
            case 4:
                int result = b1.getDate().compareTo(b2.getDate());
				return result;
				break;
            default:
                System.out.println("Switch error");
                break;
            }
        }
    }
}

class SortEx3 {
	public static void main(String[] args) {
		Item[] list = {
			new Item("나이키", "2016-01-06", 15,1),
			new Item("프로스펙스", "2016-02-06", 20,2),
			new Item("아디다스", "2016-03-06", 25,3),
			new Item("골든구스", "2016-04-06", 15,4),
			new Item("리복  ", "2016-05-06", 30,5),
			new Item("뉴발란스", "2016-10-06", 10,6),
			new Item("스케쳐스", "2016-07-06", 10,7),
			new Item("반스  ", "2016-08-06", 10,8),
			new Item("데상트", "2016-09-06", 10,9),
			new Item("아식스", "2016-10-06", 10,10)
		};

		Item i = new Item();
		Arrays.sort(list, i);
		
		System.out.println(Arrays.toString(list));
	}
}
