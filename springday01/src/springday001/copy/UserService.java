package springday001.copy;

public class UserService {
	//1定义dao类型属性
	private UserDao userdao;
	//2生称set的方法
	
	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}
	public void add(){
		System.out.println(".....service");
		//在service里面得到dao对象，才能得到dao的方法
//		UserDao dao = new UserDao();
//		dao.add();
		userdao.add();
	}


	
}
