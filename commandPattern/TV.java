public class TV implements Device {
   
        @Override
        public void turnOn() {
            System.out.println("The TV is powered up!"); 
    }
    
        @Override
        public void turnOff(){
         System.out.println("The TV is powered down");
    }


    public class TurnOn implements Command{
        private Device device;

    public TurnOn(Device device) {
        this.device = device;
    }

        @Override
        public void execute() {
        device.turnOn();
        }
    }
}