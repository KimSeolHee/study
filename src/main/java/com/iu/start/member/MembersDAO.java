package com.iu.start.member;

import java.util.ArrayList;

public interface MembersDAO {
	//ȸ������
	public int setJoin(BankMembersDTO bankMembersDTO) throws Exception; 
	//�˻��� �Է�, ���̵� ã��(a, b, c����)
	public ArrayList<BankMembersDTO> getSearchById(String search) throws Exception;
}
