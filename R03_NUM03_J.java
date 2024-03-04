public class R03_NUM03_J {
    // defective code
    public static int getInteger(DataInputStream is) throws IOException {
    return is.readInt();
}
    // fixed code
    public static long getInteger (DataInputStream is) throws IOException {
        return is.readInt() & 0xFFFFFFFFL ; // Mask with 32 one−bits
    }
}
