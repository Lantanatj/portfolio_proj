package automaticBike;

public class AutomaticBike {
    private int automaticBikeSpeed;
    private int gearNumber;
    private boolean isOn;

    public void turnAutomaticBikeOn() {
        if (isOn == false){
            this.isOn = true;
        }

    }


    public void turnAutomaticBikeOff() {
        if (isOn==true){
            isOn =false;
        }
    }

    public int getAutomaticBikeSpeed() {
        return automaticBikeSpeed;
    }

    public void accelerateAutomaticBike() {
       if(automaticBikeSpeed>=0&&automaticBikeSpeed<21) {
           gearNumber = 1;
           automaticBikeSpeed++;
       }
           else
               if(automaticBikeSpeed>20&&automaticBikeSpeed<31){
                   gearNumber=2;
                   automaticBikeSpeed=automaticBikeSpeed+2;
               }
               else
                   if (automaticBikeSpeed>30&&automaticBikeSpeed<41){
                       gearNumber=3;
                       automaticBikeSpeed=automaticBikeSpeed+3;
                   }else{
                       gearNumber=4;
                       automaticBikeSpeed=automaticBikeSpeed+4;
                   }

    }


    public void decelerateAutomaticBike() {
        if(automaticBikeSpeed>40){
            automaticBikeSpeed= automaticBikeSpeed-4;

        }else
            if(automaticBikeSpeed>=31&&automaticBikeSpeed<41){
                gearNumber=3;
                automaticBikeSpeed=automaticBikeSpeed-3;
            }else
                if(automaticBikeSpeed>=21&&automaticBikeSpeed<31){
                    gearNumber=2;
                    automaticBikeSpeed=automaticBikeSpeed-2;
                }else
                    if(automaticBikeSpeed>=0&&automaticBikeSpeed<21){
                        gearNumber=1;
                        automaticBikeSpeed=automaticBikeSpeed-1;
                    }
    }

    public int getGearStatus() {
        return gearNumber;
    }

    public boolean isOn() {
       return isOn;
    }
}
