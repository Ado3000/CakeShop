/**
 * 
 * Class: ControllerChooserFactory
 * Author: Adnan Alihodzic
 * Description: Our main class from which we create our different controller factories
 *
 */
public class ControllerChooserFactory {

	public static ControllerChooser getController(AbstractControllerFactory factory){
		return factory.createController();
	}

}
