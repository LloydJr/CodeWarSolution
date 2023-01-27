package src;

public class ILoveYouALittleALotPassionatelyNotAtAll {
    public static String howMuchILoveYou(int nb_petals) {

        String[] array = {"I love you", "a little", "a lot", "passionately", "madly", "not at all"};

        return array[(nb_petals - 1) % 6];
    }
}
