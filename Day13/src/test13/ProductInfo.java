package test13;

public class ProductInfo {
	public static void main(String[] args) {
		Product[] products = new Product[10];
		int cnt = 0;	//while�� �ۿ� �־���� �ݺ��ϸ鼭 ���Ѵ�.
		
		while(true) {
			System.out.print("��ǰ�߰�<1>, ��� ��ǰ ��ȸ<2>, ������<3>>>");
			int option = Product.sc.nextInt();
			switch (option) {
			case 1 :
				if(cnt > 9) {
					System.out.println("�� �̻� ��ǰ�� �߰��� �� �����ϴ�");
					continue;
				}
				System.out.print("å<1>, ����CD<2>, ȸȭå<3>>>");
				int product = Product.sc.nextInt();
				Product.sc.nextLine();
				
				switch (product) {
				case 1 :
					products[cnt] = new Book();
					break;
				case 2 :
					products[cnt] = new CompactDisc();
					break;
				case 3 :
					products[cnt] = new ConversationBook();

				}	//switch(product)
				products[cnt].setInfo(cnt);
				cnt++;	//�迭�ȿ� cnt++���൵�ȴ�.
				break;	//switch(option) case 1
				
			case 2 :	//��ǰ��ȸ
				for (int i = 0; i < cnt; i++) {
					products[i].printInfo();
					System.out.println();
				}
				break;
				
			case 3 :	//������
				System.exit(0);

			}	//switch(option)
		
		}	//while
		
		
		
		
	}

}
