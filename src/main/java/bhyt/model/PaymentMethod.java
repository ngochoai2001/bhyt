package bhyt.model;

public enum PaymentMethod {
    VISA, MASTERCARD, CASH;
    public String getPaymentMethod(){
        switch(this){
            case VISA:
                return "VISA";
            case MASTERCARD:
                return "MASTERCARD";
            case CASH:
                return "Tiền mặt";
            default:
                return null;
        }
    }
}
