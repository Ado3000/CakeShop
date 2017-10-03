/**
 * 
 * Interface: AbstractControllerFactory
 * Author: Adnan Alihodzic
 * Description: Main interface class from which we implement our different controllers
 *
 */
public interface AbstractControllerFactory {
	
	public ControllerChooser createController();

}
