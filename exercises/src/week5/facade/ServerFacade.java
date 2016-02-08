package week5.facade;

public class ServerFacade {
	ScheduleServer myServer = new ServerImpl();

	public void start() {
		myServer.startBooting();
		myServer.readSystemConfigFile();
		myServer.init();
		myServer.initializeContext();
		myServer.initializeListeners();
		myServer.createSystemObjects();
		System.out.println("Start working......");
	}
	public void stop() {
		myServer.releaseProcesses();
		myServer.destroy();
		myServer.destroySystemObjects();
		myServer.destoryListeners();
		myServer.destoryContext();
		myServer.shutdown();
		System.out.println("After work done.........");
	}
}
