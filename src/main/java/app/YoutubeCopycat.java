package app;


public class YoutubeCopycat {

	public static void main(String[] args) {

		AppController app = new AppController();
		UserInterface ui=new UserInterface(app);
		app.setUi(ui);
		try{
			ui.getCenter().getVideoTab().playVideo("https://www.youtube.com/watch?v=cggl4WN77Mw");
			
		}catch (InterruptedException interrupt){
			System.out.println("playing was interrupted");
		}


	}

}
