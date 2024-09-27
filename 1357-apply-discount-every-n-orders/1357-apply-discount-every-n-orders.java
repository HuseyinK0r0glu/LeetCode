class Cashier {

    int costumers,n,discount;
    int[] products;
    int[] prices;

    
    public Cashier(int n, int discount, int[] products, int[] prices) {
        this.n = n;
        this.discount = discount;
        this.products = products;
        this.prices = prices;
        costumers = 0;
    }
    
    public double getBill(int[] product, int[] amount) {
        
        costumers++;
        double bill = 0;
        double total = 0;
        
        for(int i = 0;i<product.length;i++){
            
            int productNumber = product[i];
            int priceNumber = 0;
            
            for(int k = 0;k<products.length;k++){

                if(products[k] == productNumber){
                    priceNumber = k;
                    break;
                }
            }
            
            total += amount[i] * prices[priceNumber];
            
        }
        
        if(costumers % n == 0){
            // discount
            bill = total * ((100 - discount))/100;
        }else {
            // no discount
            bill = total;
        }
        
        return bill;
    }
}

/**
 * Your Cashier object will be instantiated and called as such:
 * Cashier obj = new Cashier(n, discount, products, prices);
 * double param_1 = obj.getBill(product,amount);
 */