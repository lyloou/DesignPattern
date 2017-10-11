package _5MVC;

public class Main{
	public static void main(String args[]) {
		// 得到视图
		StudentView sv = new StudentView();
		
		// 获取数据
		Student student = new Student();
		student.setName("zhangsan");
		student.setNo(1);
		
		// 控制器进行控制（控制数据到视图上面显示）
		StudentController sc = new StudentController(student,sv);
		sc.updateStudent();
		
		// 修改数据
		Student student2 = new Student();
		student2.setName("lisi");
		student2.setNo(2);
		sc.setStudent(student2);
		sc.updateStudent();
	}
}