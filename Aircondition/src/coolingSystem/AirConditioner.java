package coolingSystem;

public class AirConditioner {
    private String productName;
    private int temperature;
    private boolean isOn;

    public AirConditioner(String name) {
       setProductName(name);
    }

    public void setProductName() {
        setProductName();
    }

    public void setProductName(String productName) { this.productName= productName;
    }

    public void setOn() {
        if (isOn==false) {
            isOn = true;
            setTemperature(16);
        }
        else if (isOn == true){
            isOn=false;
        }
    }

    public void setTemperature(int temperature) {
        if (isOn && temperature >=16 && temperature<=30){
            this.temperature = temperature;
        }
    }


    public void decreaseTemperature() {
        if (isOn&&temperature>16){
            temperature--;
        }
    }

    public void increaseTemperature() {
        if (isOn&&temperature<30) {
            temperature++;
        }
    }

    public int getTemperature() {
            return temperature;
    }


    public boolean isOn() {
        return isOn;
    }
}

