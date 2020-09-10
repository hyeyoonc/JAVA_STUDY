package first;

public class LedTv implements Tv {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("켜다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("끄다");

	}

	@Override
	public void changeVolume(int volume) {
		System.out.println("볼륨을 조정하다.");

	}

	@Override
	public void changeChannel(int channel) {
		System.out.println("채널을 지정하다.");

	}

}
