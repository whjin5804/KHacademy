
public class BoxingUnBoxing {
	public static void main(String[] args) {
		//�ڽ�(�⺻�ڷ���>��üȭ)
		Integer iObj = new Integer(10);
		Double dObj = new Double(10.1);
		
		//��ڽ�(��ü>�⺻�ڷ���)
		int num1 = iObj.intValue();
		double num2 = dObj.doubleValue();
		
		// iObj���� ����
		iObj = new Integer(iObj.intValue() + 5);
		dObj = new Double(dObj.doubleValue() + 1);
		
		Integer iObj2 = 10;	//����ڽ�
		//Integer iObj2 = new Integer(10); >�ڵ����� �����Ϸ��� �̷��� �ؼ�
		int num3 = iObj;	//�����ڽ�
		// int num3 = iObjc.intValue(); > �ڵ����� �ؼ�����.
		iObj = iObj + 5;
		//iObj = new Integer(iObj.intValue() + 5); > �ڵ��ؼ�
	}

}
