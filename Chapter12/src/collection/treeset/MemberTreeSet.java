package collection.treeset;

	import java.util.TreeSet;
	import java.util.Iterator;
	import collection.Member;

	public class MemberTreeSet {

		private TreeSet<Member> treeSet;
		
		public MemberTreeSet( ) {
			treeSet =new TreeSet<Member>(new Member());
		}
		
		public void addMember(Member member) {
			treeSet.add(member);	
		}
		
		public boolean removeMember(int memberId) {
			
			
			// ���ͷ����� ���� 
			Iterator<Member> iterator = treeSet.iterator();
			while( iterator.hasNext()) {
			  Member member = iterator.next();
			  
			  int tempId = member.getMemberId();
			  if( memberId == tempId) {
				  treeSet.remove(member);
					return true;
			}
		}
			
		
			System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
			return false;
		}
		
		public void showAll() {
			for(Member member : treeSet) {
				System.out.println(member);
			}
			System.out.println();
	        
			
		
		}
	}

