public class R04_STR03_J {
    // defective code
    BigInteger x = new BigInteger(”530500452766”);
    byte[] byteArray = x.toByteArray();
    Strings = new String(byteArray);
    byteArray = s.getBytes();
    x = new BigInteger(byteArray);
    // fixed code
    BigInteger x = new BigInteger(”530500452766”);
    String s = x.toString(); // Valid character data
    byte[] byteArray = s.getBytes();
    String ns = new String(byteArray);
    x = new BigInteger(ns);
}
