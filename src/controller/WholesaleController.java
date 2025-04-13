package controller;
import model.Cliente;
import model.queue;
import model.Cliente;
public class WholesaleController {
	public void caixa(queue<Cliente> fila) throws Exception {
		while(!fila.isEmpty()) {	
			Cliente c = fila.remove();
			float total = c.getQp() * c.getVp();
			System.out.println("Cliente: " + c.getNome() + " | Total da Compra: R$ " + total);
			
		}	
	}
}


