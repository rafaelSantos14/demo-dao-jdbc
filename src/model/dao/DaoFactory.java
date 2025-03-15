/*Classe auxiliar responsável por instanciar os DAOS*/

package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	//Somente para não precisar expor a implementação direto, deixar somente a interface
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
}
