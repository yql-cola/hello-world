package springday001.property;

import java.util.List;
import java.util.Map;
import java.util.Properties;



public class Person {
	private String Pname;

	public void setPname(String pname) {
		Pname = pname;
	}
	private String[] arrs;
	private List<String> list;
	private Map<String, String> map;
	private Properties Pp;
	
	public void setArrs(String[] arrs) {
		this.arrs = arrs;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public void setPp(Properties pp) {
		Pp = pp;
	}

	public void test1(){
		System.out.println(arrs);
		System.out.println(list);
		System.out.println(map);
		System.out.println(Pp);
//		System.out.println("<<<person>>>"+Pname);
	}
}
