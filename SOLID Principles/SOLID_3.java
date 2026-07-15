interface SmartDevice {
    void turnOn();
    void turnOff();
}

interface TemperatureSetting {
    void setTemperature();
}

interface BrightnessSetting {
    void setBrightness();
}

interface PlaySetting {
    void play();
}

class SmartBulb implements SmartDevice, BrightnessSetting {

    @Override
    public void turnOn() {
        System.out.println("SmartBulb is turned ON...");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartBulb is turned OFF...");
    }

    @Override
    public void setBrightness() {
        System.out.println("The SmartBulb Brightness is SET...");
    }
}

class ThermoStat implements SmartDevice, TemperatureSetting {

    @Override
    public void turnOn() {
        System.out.println("ThermoStat is turned ON...");
    }

    @Override
    public void turnOff() {
        System.out.println("ThermoStat is turned OFF...");
    }

    @Override
    public void setTemperature() {
        System.out.println("The ThermoStat temperature is SET...");
    }
}

class Speaker implements SmartDevice, PlaySetting {

    @Override
    public void turnOn() {
        System.out.println("Speaker is turned ON...");
    }

    @Override
    public void turnOff() {
        System.out.println("Speaker is turned OFF...");
    }

    @Override
    public void play() {
        System.out.println("The Speaker is Played...");
    }
}