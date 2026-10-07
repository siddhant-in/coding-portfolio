interface Camera {
    void takePhoto();
}

interface Phone {
    void makeCall();
}

class SmartPhone implements Camera, Phone {

    public void takePhoto() {
        System.out.println("Taking photo...");
    }

    public void makeCall() {
        System.out.println("Making a call...");
    }
}

public class SmartDevicesApp {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.takePhoto();
        sp.makeCall();
    }
}
