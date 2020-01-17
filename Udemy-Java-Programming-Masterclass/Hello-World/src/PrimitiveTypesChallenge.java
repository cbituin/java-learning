public class PrimitiveTypesChallenge {
    public static void main(String[] args){
        byte bytevalue = 23;
        short shortvalue = 21352;
        int intvalue = 24390285;
        long longvalue = 50_000 + 10L * (bytevalue + shortvalue + intvalue);
        short shortval = (short)(50_000 + 10L * (bytevalue + shortvalue + intvalue));

        System.out.println(longvalue);
        System.out.println(shortval);
    }
}
