package androidx.transition;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public class PropertyValuesHolderUtils {
    public static PropertyValuesHolder ofPointF(Property<?, PointF> property, Path path) {
        return Api21Impl.ofObject(property, path);
    }

    @RequiresApi(21)
    public static class Api21Impl {
        @DoNotInline
        public static <V> PropertyValuesHolder ofObject(Property<?, V> property, Path path) {
            return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
        }
    }
}
