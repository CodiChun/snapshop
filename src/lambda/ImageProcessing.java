package lambda;

import com.amazonaws.services.lambda.runtime.Context;
import filters.FlipHorizontalFilter;
import filters.GrayscaleFilter;
import filters.SoftenFilter;
import image.PixelImage;
 
/**
 * 
 * @author Codi Chun
 */
public class ImageProcessing {
        


    public static void handleRequest(Object event, Context context){
        PixelImage image = downloadImage(event);
        processImage(image);

    }

    public static PixelImage downloadImage(Object event){

        return null;

    }

    public static void processImage(PixelImage theImage){

        //filter the image
        GrayscaleFilter grayscale = new GrayscaleFilter();
        grayscale.filter(theImage);

        SoftenFilter soften = new SoftenFilter();
        soften.filter(theImage);

        FlipHorizontalFilter flip = new FlipHorizontalFilter();
        flip.filter(theImage);

        //save the image

    }

    

    public static void uploadImage(String fileName, String bucket, String ObjName){



    }







}
