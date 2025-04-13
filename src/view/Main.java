package view;
import model.queue;
import java.util.Random;

import controller.Cliente;
import controller.WholesaleController;


public class Main {

	public static void main(String[] args) throws Exception {
		queue<Cliente> q = new queue<>();
		Random r = new Random();
		
		
		// insert de 20 clientes
		for(int i =1; i<=20; i++) {
			String nome = "cliente" + i;
			int qtd = 20 + r.nextInt(31);
			float value = 5 + r.nextFloat() * (100-5); // random de 5.00 a 100.00
			
			Cliente c = new Cliente( nome, qtd, value);
			q.insert(c);
		}

		WholesaleController ctrl = new WholesaleController();
		ctrl.caixa(q);
		System.out.println("Fila criada com " + q.size() + " clientes.");
	}

}
