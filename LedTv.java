package first;

public class LedTv implements Tv {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("�Ѵ�");
		
	}

	@Override
	public void turnOff() {
		System.out.println("����");

	}

	@Override
	public void changeVolume(int volume) {
		System.out.println("������ �����ϴ�.");

	}

	@Override
	public void changeChannel(int channel) {
		System.out.println("ä���� �����ϴ�.");

	}

}
