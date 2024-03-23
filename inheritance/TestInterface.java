//TestInterface.java
//package out.production.abstraction;



	interface MobilePhoneInt{
		void display();
	}

	interface MusicInt{
		void play();
	}
	class XiaomiInt implements MobilePhoneInt, MusicInt{

    @Override
    public void display() {
        System.out.println("Xiaomi Phone Display");
    }

    @Override
    public void play() {
        System.out.println("Xiaomi Music Playing");
    }
}

	class RedmiInt implements MobilePhoneInt{

    @Override
    public void display() {
        System.out.println("Redmi Phone Display");
    }
}



	public class TestInterface {
		public static void main(String[] args) {

        XiaomiInt x = new XiaomiInt();
        x.display();
        x.play();

        RedmiInt r = new RedmiInt();
        r.display();

        MobilePhoneInt m = new XiaomiInt();
        m.display();

        MusicInt music = new XiaomiInt();
        music.play();

        m = new RedmiInt();
        m.display();

        MobileRepairInt.repair(x);
    }
}

class MobileRepairInt{

    public static void repair(MobilePhoneInt m){
        System.out.println("repair method");
        m.display();
    }
}