package kotlin.jvm.internal;

import com.caverock.androidsvg.SVG;
import kotlin.SinceKotlin;
import kotlin.reflect.KMutableProperty;

/* loaded from: classes8.dex */
public abstract class MutablePropertyReference extends PropertyReference implements KMutableProperty {
    public MutablePropertyReference() {
    }

    @SinceKotlin(version = "1.1")
    public MutablePropertyReference(Object obj) {
        super(obj);
    }

    @SinceKotlin(version = SVG.VERSION)
    public MutablePropertyReference(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
