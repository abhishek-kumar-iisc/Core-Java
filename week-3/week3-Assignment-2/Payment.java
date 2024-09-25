interface payment {
    public abstract void makepayment(int amount);
}


class PayByDebitCard implements payment {
    private int amount;

    public PayByDebitCard(int  amount){
        this.amount = amount;
    } 
    public void makepayment( int amount){
        if( this.amount > amount){
            this.amount = this.amount -amount;
            System.out.println("Making payment via  by Debit Card");
        }
        else if(this.amount < amount){
            System.out.println(" Transaction not possible ");
        }
       
    }
}


class PayByCreditCard implements payment {
    private int amount;

    public PayByCreditCard(int  amount){
        this.amount = amount;
    } 
    public void makepayment( int amount){
        if( this.amount > amount){
            this.amount = this.amount -amount;
            System.out.println("Making payment via CreditCard");
        }
        else if(this.amount < amount){
            System.out.println(" Transaction not possible ");
        }
       
    }
}

class PayByNetBanking implements payment {
    private int amount;

    public PayByNetBanking(int  amount){
        this.amount = amount;
    } 
    public void makepayment( int amount){
        if( this.amount > amount){
            this.amount = this.amount -amount;
            System.out.println("Making payment via NetBanking");
        }
        else if(this.amount < amount){
            System.out.println(" Transaction not possible ");
        }
       
    }
}

class PayByWallet implements payment {
    private int amount;

    public PayByWallet(int  amount){
        this.amount = amount;
    } 
    public void makepayment( int amount){
        if( this.amount > amount){
            this.amount = this.amount -amount;
            System.out.println("Making payment via Wallet");
        }
        else if(this.amount < amount){
            System.out.println(" Transaction not possible ");
        }
       
    }
}