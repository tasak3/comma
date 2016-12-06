/*
	- ���ļ���

	����
	1. 10�� ��ǰ�� ��ϵǾ� �ִ�. //�Ϸ�
	2. ������� �䱸�� ���� �������� ���·� ���ĵ� �����
	   ������..
		2-1. ���ļ��� ��ŷ��
		2-2. ���� ���ݼ�
		2-3. ���� ���ݼ�
		2-4. �ֱ� ����� ��("2016-12-06")
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
		return name + "\t���� : " + price + "\t����� : " + date + "\t��ŷ : " + rank + "�Դϴ�.\n";
	}
}

class Choose implements Comparator<Item> {
	@Override
	public int compare(Item i1, Item i2, Item i3, Item i4){
		//void SelectChoose(int Item)
		Scanner scan = new Scanner(System.in);
		System.out.println("���Ͻô� ���� ����� �����ϼ���.");
		System.out.println("1. ���ļ��� ��ŷ�� 2. ���� ���ݼ� 3. ���� ���ݼ� 4. �ֱ� ����� �� ");
		int sel = scan.nextInt();
		
        if (sel < 1 || sel > 4) { // ���� ���� ��� ���ý� SelectChoose()ȣ��
            System.out.println("�߸� �����ϼ̽��ϴ� 1~4���� �ٽ� �����Ͻʽÿ�.");
            //SelectChoose(Item);
        }
        else {                          // ���� ��� ���� switch��
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
			new Item("����Ű", "2016-01-06", 15,1),
			new Item("���ν��彺", "2016-02-06", 20,2),
			new Item("�Ƶ�ٽ�", "2016-03-06", 25,3),
			new Item("��籸��", "2016-04-06", 15,4),
			new Item("����  ", "2016-05-06", 30,5),
			new Item("���߶���", "2016-10-06", 10,6),
			new Item("�����Ľ�", "2016-07-06", 10,7),
			new Item("�ݽ�  ", "2016-08-06", 10,8),
			new Item("����Ʈ", "2016-09-06", 10,9),
			new Item("�ƽĽ�", "2016-10-06", 10,10)
		};

		Item i = new Item();
		Arrays.sort(list, i);
		
		System.out.println(Arrays.toString(list));
	}
}
