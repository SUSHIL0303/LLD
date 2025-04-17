class CreditCardPayment extends PaymentMethod {
    @Override
    public void pay(int amount){
        System.out.println("paid with creditCard"+ amount);
    }
}
