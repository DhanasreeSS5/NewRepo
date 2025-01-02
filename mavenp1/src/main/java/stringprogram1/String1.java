package stringprogram1;

public class String1 {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			StringBuffer sb=new StringBuffer("Hello");
			System.out.println(sb);
			StringBuilder sbs=new StringBuilder("Welcome");
			System.out.println(sbs);
			//APPEND
			//for add new string at last
			//it cannot be used in string it can only used in buffer or builder
			sb.append("hi");
			sb.append(sb);//whatever append to last here we can use instead of concat but append in last
			System.out.println(sb);
			//INSERT
			//to insert something
			sbs.insert(3,"hey");
			System.out.println(sb);
			//REPLACE
			//TO REPLACE
			//1 start position,3 end position
			StringBuffer sbc=new StringBuffer("Goodmorning");
			sbs.replace(1, 3, "happy");
			sbc.replace(1, 6, "java");
			System.out.println(sbs);
			System.out.println(sbc);
			//REVERSE
			//reverse a string
			sbc.reverse();
			System.out.println(sbc);
			//DELETE
			//for delete  from 1 to 5 or delete character at particular position
			sbc.delete(1, 6);
			System.out.println(sbc);
	          



		}

}
