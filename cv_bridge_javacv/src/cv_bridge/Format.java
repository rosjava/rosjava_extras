package cv_bridge;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tal.regev@gmail.com (Tal Regev)
 *
 */
//from http://stackoverflow.com/questions/11047756/getting-enum-associated-with-int-value
//from http://docs.opencv.org/modules/highgui/doc/reading_and_writing_images_and_video.html#Mat imread(const string& filename, int flags)
@SuppressWarnings("Convert2Diamond")
public enum Format { JPG("jpg"), JPEG("jpeg"), JPE("jpe"), PNG("png"), BMP("bmp"), DIB("dib"), PPM("ppm"), PGM("pgm"), PBM("pbm");
    protected String strFormat;

    static private Map<Format, String> map = new HashMap<Format, String>();
    static {
        for (Format format : Format.values()) {
            map.put(format, format.strFormat);
        }
    }

    Format(final String strFormat) { this.strFormat = strFormat; }

    static public String valueOf(Format format) {
        return map.get(format);
    }

    static public String getExtension(Format format){
        String ext = ".";
        return ext.concat(map.get(format));
    }
}