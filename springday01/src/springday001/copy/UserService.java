package springday001.copy;

public class UserService {
	//1����dao��������
	private UserDao userdao;
	//2����set�ķ���
	
	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}
	public void add(){
		System.out.println(".....service");
		//��service����õ�dao���󣬲��ܵõ�dao�ķ���
//		UserDao dao = new UserDao();
//		dao.add();
		userdao.add();
	}


	
}
