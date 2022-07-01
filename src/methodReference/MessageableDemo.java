package methodReference;

public class MessageableDemo {
    public static void main(String[] args) {
        MessageAble ref=Message::new;
        ref.getMessage();
    }
}
