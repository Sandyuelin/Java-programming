public class AudioCollage {

    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha) {
        double[] result = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] * alpha;
        }
        return result;
    }

    // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a) {
        double[] result = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[a.length - 1 - i];
        }
        return result;
    }

    // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b) {
        double[] result = new double[a.length + b.length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
    }

    // Returns a new array that is the sum of a[] and b[], padding the shorter arrays with trailing 0s if necessary.
    public static double[] mix(double[] a, double[] b) {
        int length = Math.max(a.length, b.length);
        double[] result = new double[length];
        for (int i = 0; i < length; i++) {
            double sampleA = i < a.length ? a[i] : 0.0;
            double sampleB = i < b.length ? b[i] : 0.0;
            result[i] = sampleA + sampleB;
        }
        return result;
    }

    // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[]a, double alpha) {
        int newLength = (int) (a.length / alpha);
        double[] result = new double[newLength];
        for (int i = 0; i < newLength; i++) {
            result[i] = a[(int) (i * alpha)];
        }
        return result;
    }
    public static void main(String[] args) {
        // Read WAV files
        double[] beatbox = StdAudio.read("beatbox.wav");
        double[] buzzer = StdAudio.read("buzzer.wav");
        double[] chimes = StdAudio.read("chimes.wav");
        double[] cow = StdAudio.read("cow.wav");
        double[] dialup = StdAudio.read("dialup.wav");

        // Apply effects
        double[] amplifiedBeatbox = amplify(beatbox, 1.5);
        double[] reversedBuzzer = reverse(buzzer);
        double[] mergedChimesCow = merge(chimes, cow);
        double[] mixedBeatboxDialup = mix(beatbox, dialup);
        double[] spedUpChimes = changeSpeed(chimes, 1.5);

        // Create collage
        double[] part1 = merge(amplifiedBeatbox, reversedBuzzer);
        double[] part2 = merge(mergedChimesCow, mixedBeatboxDialup);
        double[] collage = merge(part1, spedUpChimes);
        collage = merge(collage, part2);

        // Ensure collage duration is within the required range
        int minSamples = 441000; // 10 seconds
        int maxSamples = 2646000; // 60 seconds
        if (collage.length < minSamples) {
            // Repeat until at least 10 seconds
            while (collage.length < minSamples) {
                collage = merge(collage, collage);
            }
        } else if (collage.length > maxSamples) {
            // Truncate to at most 60 seconds
            double[] truncated = new double[maxSamples];
            System.arraycopy(collage, 0, truncated, 0, maxSamples);
            collage = truncated;
        }

        // Play the collage
        StdAudio.play(collage);
    }
}


