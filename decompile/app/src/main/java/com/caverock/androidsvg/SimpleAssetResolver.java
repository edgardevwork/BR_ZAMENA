package com.caverock.androidsvg;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Log;
import androidx.media3.common.MimeTypes;
import coil.decode.SvgDecoder;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes6.dex */
public class SimpleAssetResolver extends SVGExternalFileResolver {
    public static final String TAG = "SimpleAssetResolver";
    public static final Set<String> supportedFormats;
    public AssetManager assetManager;

    public SimpleAssetResolver(AssetManager assetManager) {
        this.assetManager = assetManager;
    }

    static {
        HashSet hashSet = new HashSet(8);
        supportedFormats = hashSet;
        hashSet.add(SvgDecoder.MIME_TYPE_SVG);
        hashSet.add("image/jpeg");
        hashSet.add(MimeTypes.IMAGE_PNG);
        hashSet.add("image/pjpeg");
        hashSet.add("image/gif");
        hashSet.add(MimeTypes.IMAGE_BMP);
        hashSet.add("image/x-windows-bmp");
        hashSet.add("image/webp");
    }

    @Override // com.caverock.androidsvg.SVGExternalFileResolver
    public Typeface resolveFont(String str, int i, String str2) {
        Log.i(TAG, "resolveFont(" + str + "," + i + "," + str2 + ")");
        try {
            try {
                return Typeface.createFromAsset(this.assetManager, str + ".ttf");
            } catch (RuntimeException unused) {
                return null;
            }
        } catch (RuntimeException unused2) {
            return Typeface.createFromAsset(this.assetManager, str + ".otf");
        }
    }

    @Override // com.caverock.androidsvg.SVGExternalFileResolver
    public Bitmap resolveImage(String str) {
        Log.i(TAG, "resolveImage(" + str + ")");
        try {
            return BitmapFactory.decodeStream(this.assetManager.open(str));
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // com.caverock.androidsvg.SVGExternalFileResolver
    public boolean isFormatSupported(String str) {
        return supportedFormats.contains(str);
    }

    @Override // com.caverock.androidsvg.SVGExternalFileResolver
    public String resolveCSSStyleSheet(String str) {
        Log.i(TAG, "resolveCSSStyleSheet(" + str + ")");
        return getAssetAsString(str);
    }

    public final String getAssetAsString(String str) throws Throwable {
        Throwable th;
        InputStream inputStreamOpen;
        try {
            inputStreamOpen = this.assetManager.open(str);
        } catch (IOException unused) {
            inputStreamOpen = null;
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpen = null;
        }
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStreamOpen, Charset.forName("UTF-8"));
            char[] cArr = new char[4096];
            StringBuilder sb = new StringBuilder();
            for (int i = inputStreamReader.read(cArr); i > 0; i = inputStreamReader.read(cArr)) {
                sb.append(cArr, 0, i);
            }
            String string = sb.toString();
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException unused2) {
                }
            }
            return string;
        } catch (IOException unused3) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException unused4) {
                }
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }
}
