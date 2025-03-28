class ParkingSystem {
    
    int small;
    int medium;
    int big;

    public ParkingSystem(int big, int medium, int small) {
        this.small = small;
        this.medium = medium;
        this.big = big;
    }
    
    public boolean addCar(int carType) {
        
        if(carType == 1){
            if(big > 0){
                big--;
                return true;
            }
        }
        
        if(carType == 2){
            if(medium > 0){
                medium--;
                return true;
            }
        }
        
        if(carType == 3){
            if(small > 0){
                small--;
                return true;
            }
        }
        
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */