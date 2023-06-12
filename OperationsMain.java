public class OperationsMain {
    public static void main(String[] args) {
        Operations op = new Operations();
        op.readInput();
        op.setTotalCost(op.getItemQuantity(), op.getItemPrice());
        op.writeOutput();
    }
}

