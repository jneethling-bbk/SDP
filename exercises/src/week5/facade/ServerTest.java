package week5.facade;

public class ServerTest {

	public static void main(String[] args) {
		ServerFacade myFacade= new ServerFacade();
		myFacade.start();
		myFacade.stop();

	}

}
