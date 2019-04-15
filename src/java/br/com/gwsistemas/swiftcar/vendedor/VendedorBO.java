package br.com.gwsistemas.swiftcar.vendedor;

/**
 *
 * @author mateus
 */
public class VendedorBO {
    
    public void cadastrar(){
        
    }
    
    public Vendedor carregar(int id){
        if (id == 0) {
            return null;
        }else{
            VendedorDAO dao = new VendedorDAO();
            return dao.carregar(id);
        }
    }
    
    public void excluir(){
        
    }
    
}
