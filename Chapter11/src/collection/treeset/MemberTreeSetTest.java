package collection.treeset;

/*
 * class MyCompare implements Comparator<String>{
 * 		@Override
 * 		public int compare(String s1, String s2){
 * 			return s1.compareTo(s2);
 * 		}
 * }
 */

public class MemberTreeSetTest {

	public static void main(String[] args) {

		MemberTreeSet manager = new MemberTreeSet();
		
		Member memberLee = new Member(300, "Lee");
		Member memberKim = new Member(100, "Kim");
		Member memberPark = new Member(200, "Park");

		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		
		manager.showAllMember();
	}
	
	/*
	 * TreeSet<String> set = new TreeSet<String>(new MyCompare());
	 * set.add("Park");
	 * set.add("Kim");
	 * set.add("Lee");
	 * 
	 * System.out.println(set);
	 */

}
