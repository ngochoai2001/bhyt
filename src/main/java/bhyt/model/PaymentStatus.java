package bhyt.model;

public enum PaymentStatus {
    DONE, PROCESSING, NONE;
    public String getPaymentStatus(){
        switch(this){
            case DONE:
                return "Đã thanh toán";
            case PROCESSING:
                return "Giao dịch đang thực hiện";
            case NONE:
                return "Chưa thực hiện giao dịch";
            default:
                return null;
        }
    }
}
