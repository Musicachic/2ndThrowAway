/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 2/17/14
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*/

package Data;

import java.math.BigDecimal;

/**
 * This class is an hardcoded array of Products available for the prototype.
 * This will be updated by the manager once further along in the coding
 * process.
 */

public class ProductList extends Product
{
	public static Product[] products = new Product[4];

	/**
	 * This method contains the products available array.
	 *
	 * @return products This is the list of products available for purchase.
	 */

	public static Product[] getProducts()
	{

		products[0] = new Product();
		products[0].setUpc("12345678");
		products[0].setDescription("Street Fighter 2  ");
		products[0].setPrice(new BigDecimal(20.00));
		products[0].setQuantity(20);
		products[1] = new Product();
		products[1].setUpc("87654321");
		products[1].setDescription("Street Fighter 3  ");
		products[1].setPrice(new BigDecimal(30.00));
		products[1].setQuantity(20);
		products[2] = new Product();
		products[2].setUpc("11111111");
		products[2].setDescription("Street Fighter IV ");
		products[2].setPrice(new BigDecimal(40.00));
		products[2].setQuantity(20);
		products[3] = new Product();
		products[3].setUpc("22222222");
		products[3].setDescription("Marvel vs Capcom 3");
		products[3].setPrice(new BigDecimal(50.00));
		products[3].setQuantity(20);

		return products;
	}
}
