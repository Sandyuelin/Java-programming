import java.awt.Color;
public class KernelFilter {
    private static Picture applyKernel(Picture picture, double[][] kernel) {
        int width = picture.width();
        int height = picture.height();
        Picture result = new Picture(width, height);

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                double redSum = 0, greenSum = 0, blueSum = 0;

                // Loop through the kernel
                for (int i = 0; i < kernel.length; i++) {
                    for (int j = 0; j < kernel[i].length; j++) {
                        // Compute the coordinates for the neighboring pixel and kernel application
                        int xCoord = (x + i - kernel.length / 2 + width) % width;
                        int yCoord = (y + j - kernel[i].length / 2 + height) % height;

                        // Get the color for the neighboring pixel
                        Color color = picture.get(xCoord, yCoord);

                        // Apply the kernel on this neighbor
                        redSum += color.getRed() * kernel[i][j];
                        greenSum += color.getGreen() * kernel[i][j];
                        blueSum += color.getBlue() * kernel[i][j];
                    }
                }

                // Clamping values between 0 and 255
                int red = (int) Math.min(255, Math.max(0, Math.round(redSum)));
                int green = (int) Math.min(255, Math.max(0, Math.round(greenSum)));
                int blue = (int) Math.min(255, Math.max(0, Math.round(blueSum)));

                // Set the resulting color to the pixel in new image
                result.set(x, y, new Color(red, green, blue));
            }
        }
        return result;
    }

    // Returns a new picture that applies the identity filter to the given picture.
    public static Picture identity(Picture picture){
        double[][] kernel = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        return applyKernel(picture, kernel);
    }


    // Returns a new picture that applies a Gaussian blur filter to the given picture.
    public static Picture gaussian(Picture picture){
        double[][] kernel = {
                {1.0/16, 2.0/16, 1.0/16},
                {2.0/16, 4.0/16, 2.0/16},
                {1.0/16, 2.0/16, 1.0/16}
        };
        return applyKernel(picture, kernel);
    }

    // Returns a new picture that applies a sharpen filter to the given picture.
    public static Picture sharpen(Picture picture){
        double[][] kernel = {
                {0, -1, 0},
                {-1, 5, -1},
                {0, -1, 0}
        };
        return applyKernel(picture, kernel);
    }

    // Returns a new picture that applies a Laplacian filter to the given picture.
    public static Picture laplacian(Picture picture){
        double[][] kernel = {
                {-1,-1,-1},
                {-1,8,-1},
                {-1,-1,-1}
        };
        return applyKernel(picture, kernel);
    }

    // Returns a new picture that applies an emboss filter to the given picture.
    public static Picture emboss(Picture picture){
        double[][] kernel = {
                {-2,-1,0},
                {-1,1,1},
                {0,1,2}
        };
        return applyKernel(picture, kernel);
    }

    // Returns a new picture that applies a motion blur filter to the given picture.
    public static Picture motionBlur(Picture picture){
        double v = 1.0 / 9;
        double[][] kernel = {
                {v,0,0,0,0,0,0,0,0},
                {0,v,0,0,0,0,0,0,0},
                {0,0, v,0,0,0,0,0,0},
                {0,0,0, v,0,0,0,0,0},
                {0,0,0,0, v,0,0,0,0},
                {0,0,0,0,0, v,0,0,0},
                {0,0,0,0,0,0, v,0,0},
                {0,0,0,0,0,0,0, v,0},
                {0,0,0,0,0,0,0,0,v },

        };
        return applyKernel(picture, kernel);
    }

    // Test client (ungraded).
    public static void main(String[] args) {
        // Assuming you have a Picture class that can handle file operations
        Picture originalPic = new Picture("baboon.png"); // Load your image file

        // Test identity filter
        Picture identityPic = identity(originalPic);
        identityPic.save("identity_baboon.png");

        // Test Gaussian blur filter
        Picture gaussianPic = gaussian(originalPic);
        gaussianPic.save("gaussian_baboon.png");

        // Test sharpen filter
        Picture sharpenPic = sharpen(originalPic);
        sharpenPic.save("sharpen_baboon.png");

        // Test Laplacian filter
        Picture laplacianPic = laplacian(originalPic);
        laplacianPic.save("laplacian_baboon.png");

        // Test emboss filter
        Picture embossPic = emboss(originalPic);
        embossPic.save("emboss_baboon.png");

        // Test motion blur filter
        Picture motionBlurPic = motionBlur(originalPic);
        motionBlurPic.save("motion_blur_baboon.png");
    }

}