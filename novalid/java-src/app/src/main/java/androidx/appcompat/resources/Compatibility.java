package androidx.appcompat.resources;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import org.xmlpull.p066v1.XmlPullParser;
import org.xmlpull.p066v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes4.dex */
public final class Compatibility {

    @RequiresApi(21)
    public static class Api21Impl {
        @DoNotInline
        public static void inflate(@NonNull Drawable drawable, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        @DoNotInline
        public static int getChangingConfigurations(@NonNull TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @NonNull
        @DoNotInline
        public static Drawable createFromXmlInner(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
            return Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }
    }

    @RequiresApi(18)
    public static class Api18Impl {
        @DoNotInline
        public static void setAutoCancel(@NonNull ObjectAnimator objectAnimator, boolean z) {
            objectAnimator.setAutoCancel(z);
        }
    }

    @RequiresApi(15)
    public static class Api15Impl {
        @DoNotInline
        public static void getValueForDensity(@NonNull Resources resources, int i, int i2, @NonNull TypedValue typedValue, boolean z) {
            resources.getValueForDensity(i, i2, typedValue, z);
        }
    }
}
