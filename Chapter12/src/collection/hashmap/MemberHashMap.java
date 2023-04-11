package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {
	
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap( ) {
		hashMap = new HashMap<Integer, Member>();
	}

	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member );
	}
	
	public boolean removeMember(int memberId) {
		
		if(hashMap.containsKey(memberId)) {
			
		hashMap.remove(memberId);
		 return true;
			
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		
		while(ir.hasNext()) {
			int Key = ir.next();
			
			Member member = hashMap.get(Key);
			System.out.println(member);
		}
	}
}
