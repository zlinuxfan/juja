package lab_10;

public class Merge {
    public static int[] merge(int[] fst, int[] snd) {
        int[] result = new int[fst.length + snd.length];
        int fstIndex = 0;
        int sndIndex = 0;
        int i = 0;

        if (fst.length == 0) {
            return snd;
        }

        if (snd.length == 0) {
            return fst;
        }

        while (i < result.length) {
            result[i] = fst[fstIndex] < snd[sndIndex] ? fst[fstIndex++] : snd[sndIndex++];
            if (fstIndex == fst.length) {
                System.arraycopy(snd, sndIndex, result, ++i, snd.length - sndIndex);
                break;
            }
            if (sndIndex == snd.length) {
                System.arraycopy(fst, fstIndex, result, ++i, fst.length - fstIndex);
                break;
            }
            i++;
        }
        return result;
    }
}
