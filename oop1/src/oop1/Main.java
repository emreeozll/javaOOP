package oop1;

public class Main {

	public static void main(String[] args) {

		String message = "Vade orani";

		Product product1 = new Product();

		// set value (deger atamak)
		product1.setName("Delonghi kahve makinesi");
		product1.setUnitPrice(4700);
		product1.setDiscount(7);
		product1.setImageUrl("bilmemne.jpg");
		product1.setUnitInStock(3);

		// get value (okumak,yazmak)
		System.out.println(product1.getName() + "\n" + "Stok adet: " + product1.getUnitInStock());

		Product product2 = new Product();
		product2.setName("Smeg kahve makinesi");
		product2.setUnitPrice(6800);
		product2.setDiscount(5);
		product2.setImageUrl("bilmemne.jpg");
		product2.setUnitInStock(5);

		Product product3 = new Product();
		product3.setName("Kitchen Aid kahve makinesi");
		product3.setUnitPrice(700000);
		product3.setDiscount(2);
		product3.setImageUrl("bilmemne.jpg");
		product3.setUnitInStock(1);

		Product[] products = { product1, product2, product3 };

		System.out.println(" ");
		for (Product product : products) {

			System.out.println("Urunlerin adi:" + product.getName());
		}

		System.out.println(" ");

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("5345552233");
		individualCustomer.setCustomerNumber("190102");
		individualCustomer.setFirstName("Emre");
		individualCustomer.setLastName("Ozel");

		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(1);
		corporateCustomer.setPhone("5304447722");
		corporateCustomer.setCustomerNumber("21101");

		Customer[] customers = { individualCustomer, corporateCustomer };

		for (Customer customerr : customers) {

			System.out.println("Musteri No:"+ customerr.getCustomerNumber());
			System.out.println("Telefon No:" + customerr.getPhone()+"\n");
		}

	}

}
