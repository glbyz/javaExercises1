package exercises2;

public class Main {

	public static void main(String[] args) {
		ReCapDemo_DortIslem dortIslem = new ReCapDemo_DortIslem();
		int sonuc = dortIslem.Topla(3, 4);
		System.out.println(sonuc);

		// product main
		Product product = new Product(1,"Laptop","Asus Laptop",3000,3,"siyah");
		
			
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getKod());
		
		
		MethodOverloading overLoading=new MethodOverloading();
		System.out.println(overLoading.Topla(2, 3));
		overLoading.Topla(2, 3, 5);
		
		Customer customer=new Customer();
		Employee employee =new Employee();
		
		CustomerManager2 customerMan=new CustomerManager2();
		EmployeeManager employeeMan=new EmployeeManager();
		
		

	}

}
