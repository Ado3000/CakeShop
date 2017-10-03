/**
 * 
 * Class: CakeShopControllerFactory
 * Author: Adnan Alihodzic
 * Description: Factory class for the CakeShopController
 *
 */

public class CakeShopControllerFactory implements AbstractControllerFactory{

	@Override
	public ControllerChooser createController() {
		return new CakeShopController();
	}

}
