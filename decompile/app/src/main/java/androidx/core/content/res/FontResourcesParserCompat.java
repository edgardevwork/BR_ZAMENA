package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import androidx.annotation.ArrayRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.C2171R;
import androidx.core.provider.FontRequest;
import androidx.media3.extractor.text.webvtt.WebvttCssParser;
import com.google.common.net.MediaType;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.p066v1.XmlPullParser;
import org.xmlpull.p066v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public class FontResourcesParserCompat {
    public static final int DEFAULT_TIMEOUT_MILLIS = 500;
    public static final int FETCH_STRATEGY_ASYNC = 1;
    public static final int FETCH_STRATEGY_BLOCKING = 0;
    public static final int INFINITE_TIMEOUT_VALUE = -1;
    public static final int ITALIC = 1;
    public static final int NORMAL_WEIGHT = 400;

    public interface FamilyResourceEntry {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FetchStrategy {
    }

    public static final class ProviderResourceEntry implements FamilyResourceEntry {

        @NonNull
        public final FontRequest mRequest;
        public final int mStrategy;

        @Nullable
        public final String mSystemFontFamilyName;
        public final int mTimeoutMs;

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public ProviderResourceEntry(@NonNull FontRequest fontRequest, int i, int i2, @Nullable String str) {
            this.mRequest = fontRequest;
            this.mStrategy = i;
            this.mTimeoutMs = i2;
            this.mSystemFontFamilyName = str;
        }

        public ProviderResourceEntry(@NonNull FontRequest fontRequest, int i, int i2) {
            this(fontRequest, i, i2, null);
        }

        @NonNull
        public FontRequest getRequest() {
            return this.mRequest;
        }

        public int getFetchStrategy() {
            return this.mStrategy;
        }

        public int getTimeout() {
            return this.mTimeoutMs;
        }

        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public String getSystemFontFamilyName() {
            return this.mSystemFontFamilyName;
        }
    }

    public static final class FontFileResourceEntry {

        @NonNull
        public final String mFileName;
        public final boolean mItalic;
        public final int mResourceId;
        public final int mTtcIndex;
        public final String mVariationSettings;
        public final int mWeight;

        public FontFileResourceEntry(@NonNull String str, int i, boolean z, @Nullable String str2, int i2, int i3) {
            this.mFileName = str;
            this.mWeight = i;
            this.mItalic = z;
            this.mVariationSettings = str2;
            this.mTtcIndex = i2;
            this.mResourceId = i3;
        }

        @NonNull
        public String getFileName() {
            return this.mFileName;
        }

        public int getWeight() {
            return this.mWeight;
        }

        public boolean isItalic() {
            return this.mItalic;
        }

        @Nullable
        public String getVariationSettings() {
            return this.mVariationSettings;
        }

        public int getTtcIndex() {
            return this.mTtcIndex;
        }

        public int getResourceId() {
            return this.mResourceId;
        }
    }

    public static final class FontFamilyFilesResourceEntry implements FamilyResourceEntry {

        @NonNull
        public final FontFileResourceEntry[] mEntries;

        public FontFamilyFilesResourceEntry(@NonNull FontFileResourceEntry[] fontFileResourceEntryArr) {
            this.mEntries = fontFileResourceEntryArr;
        }

        @NonNull
        public FontFileResourceEntry[] getEntries() {
            return this.mEntries;
        }
    }

    @Nullable
    public static FamilyResourceEntry parse(@NonNull XmlPullParser xmlPullParser, @NonNull Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        return readFamilies(xmlPullParser, resources);
    }

    @Nullable
    public static FamilyResourceEntry readFamilies(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, WebvttCssParser.PROPERTY_FONT_FAMILY);
        if (xmlPullParser.getName().equals(WebvttCssParser.PROPERTY_FONT_FAMILY)) {
            return readFamily(xmlPullParser, resources);
        }
        skip(xmlPullParser);
        return null;
    }

    @Nullable
    public static FamilyResourceEntry readFamily(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C2171R.styleable.FontFamily);
        String string = typedArrayObtainAttributes.getString(C2171R.styleable.FontFamily_fontProviderAuthority);
        String string2 = typedArrayObtainAttributes.getString(C2171R.styleable.FontFamily_fontProviderPackage);
        String string3 = typedArrayObtainAttributes.getString(C2171R.styleable.FontFamily_fontProviderQuery);
        int resourceId = typedArrayObtainAttributes.getResourceId(C2171R.styleable.FontFamily_fontProviderCerts, 0);
        int integer = typedArrayObtainAttributes.getInteger(C2171R.styleable.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(C2171R.styleable.FontFamily_fontProviderFetchTimeout, 500);
        String string4 = typedArrayObtainAttributes.getString(C2171R.styleable.FontFamily_fontProviderSystemFontFamily);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                skip(xmlPullParser);
            }
            return new ProviderResourceEntry(new FontRequest(string, string2, string3, readCerts(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals(MediaType.FONT_TYPE)) {
                    arrayList.add(readFont(xmlPullParser, resources));
                } else {
                    skip(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new FontFamilyFilesResourceEntry((FontFileResourceEntry[]) arrayList.toArray(new FontFileResourceEntry[0]));
    }

    public static int getType(TypedArray typedArray, int i) {
        return Api21Impl.getType(typedArray, i);
    }

    @NonNull
    public static List<List<byte[]>> readCerts(@NonNull Resources resources, @ArrayRes int i) throws Resources.NotFoundException {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (getType(typedArrayObtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(toByteArrayList(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(toByteArrayList(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static List<byte[]> toByteArrayList(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    public static FontFileResourceEntry readFont(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C2171R.styleable.FontFamilyFont);
        int i = C2171R.styleable.FontFamilyFont_fontWeight;
        if (!typedArrayObtainAttributes.hasValue(i)) {
            i = C2171R.styleable.FontFamilyFont_android_fontWeight;
        }
        int i2 = typedArrayObtainAttributes.getInt(i, 400);
        int i3 = C2171R.styleable.FontFamilyFont_fontStyle;
        if (!typedArrayObtainAttributes.hasValue(i3)) {
            i3 = C2171R.styleable.FontFamilyFont_android_fontStyle;
        }
        boolean z = 1 == typedArrayObtainAttributes.getInt(i3, 0);
        int i4 = C2171R.styleable.FontFamilyFont_ttcIndex;
        if (!typedArrayObtainAttributes.hasValue(i4)) {
            i4 = C2171R.styleable.FontFamilyFont_android_ttcIndex;
        }
        int i5 = C2171R.styleable.FontFamilyFont_fontVariationSettings;
        if (!typedArrayObtainAttributes.hasValue(i5)) {
            i5 = C2171R.styleable.FontFamilyFont_android_fontVariationSettings;
        }
        String string = typedArrayObtainAttributes.getString(i5);
        int i6 = typedArrayObtainAttributes.getInt(i4, 0);
        int i7 = C2171R.styleable.FontFamilyFont_font;
        if (!typedArrayObtainAttributes.hasValue(i7)) {
            i7 = C2171R.styleable.FontFamilyFont_android_font;
        }
        int resourceId = typedArrayObtainAttributes.getResourceId(i7, 0);
        String string2 = typedArrayObtainAttributes.getString(i7);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            skip(xmlPullParser);
        }
        return new FontFileResourceEntry(string2, i2, z, string, i6, resourceId);
    }

    public static void skip(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    @RequiresApi(21)
    public static class Api21Impl {
        @DoNotInline
        public static int getType(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }
}
