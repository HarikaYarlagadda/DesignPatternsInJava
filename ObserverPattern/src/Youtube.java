public class Youtube {
	
	public static void main(String[] args)
	{
		Channel mvs = new Channel();
		Subscriber s1 = new Subscriber("harika");
		Subscriber s2 = new Subscriber("harish");
		Subscriber s3 = new Subscriber("minnu");
		Subscriber s4 = new Subscriber("bean");
       
		
		mvs.Subscribe(s1);
		mvs.Subscribe(s2);
		mvs.Subscribe(s3);
		mvs.Subscribe(s4);
		
		
		s1.subscribeChannel(mvs);
		s2.subscribeChannel(mvs);
		s3.subscribeChannel(mvs);
		s4.subscribeChannel(mvs);
        mvs.upload("how to learn jdbc");

	}

}
