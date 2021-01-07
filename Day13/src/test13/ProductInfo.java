package test13;

public class ProductInfo {
	public static void main(String[] args) {
		Product[] products = new Product[10];
		int cnt = 0;	//while문 밖에 있어야지 반복하면서 변한다.
		
		while(true) {
			System.out.print("상품추가<1>, 모든 상품 조회<2>, 끝내기<3>>>");
			int option = Product.sc.nextInt();
			switch (option) {
			case 1 :
				if(cnt > 9) {
					System.out.println("더 이상 상품을 추가할 수 없습니다");
					continue;
				}
				System.out.print("책<1>, 음악CD<2>, 회화책<3>>>");
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
				cnt++;	//배열안에 cnt++해줘도된다.
				break;	//switch(option) case 1
				
			case 2 :	//상품조회
				for (int i = 0; i < cnt; i++) {
					products[i].printInfo();
					System.out.println();
				}
				break;
				
			case 3 :	//끝내기
				System.exit(0);

			}	//switch(option)
		
		}	//while
		
		
		
		
	}

}
