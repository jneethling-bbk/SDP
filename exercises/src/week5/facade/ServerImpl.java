package week5.facade;

public class ServerImpl implements ScheduleServer {

	@Override
	public void startBooting() {
		System.out.println("Starting boot");	
	}

	@Override
	public void readSystemConfigFile() {
		System.out.println("System config file ready");		
	}

	@Override
	public void init() {
		System.out.println("Init started");
	}

	@Override
	public void initializeContext() {
		System.out.println("Context init completed");
	}

	@Override
	public void initializeListeners() {
		System.out.println("Listener init completed");	
	}

	@Override
	public void createSystemObjects() {
		System.out.println("System objects created");
	}

	@Override
	public void releaseProcesses() {
		System.out.println("Releasing processes");
	}

	@Override
	public void destroy() {
		System.out.println("Destroying objects");
	}

	@Override
	public void destroySystemObjects() {
		System.out.println("System objects destroyed");
	}

	@Override
	public void destoryListeners() {
		System.out.println("Listeners destroyed");
	}

	@Override
	public void destoryContext() {
		System.out.println("Context destroyed");
	}

	@Override
	public void shutdown() {
		System.out.println("Shutting down");
	}

}
