package com.iu.start.bankBook;

import java.util.ArrayList;

public interface BookDAO {
	
	//BankBook Table�� Insert
		//BOOKNUM�� ����ð��� �и�������� ��ȯ�Ͽ� �Է�
		//BOOKSALE�� ������ 1�� �Է�
		public int setBankBook(BankBookDTO BookDTO) throws Exception;

		//BankBook ��� �����͸� ��ȸ �ֽż�����
		public ArrayList<BankBookDTO> getList() throws Exception;
		
		//Sale �÷� ����
		public int setChangeSale(BankBookDTO bookDTO) throws Exception;
		
		//BookNum�� ������ ��ȸ
		public BankBookDTO getDetail(BankBookDTO bookDTO) throws Exception;

}
