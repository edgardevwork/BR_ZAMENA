package kotlin.properties;

import androidx.exifinterface.media.ExifInterface;
import com.caverock.androidsvg.SVG;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* compiled from: Interfaces.kt */
@SinceKotlin(version = SVG.VERSION)
@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bç\u0080\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003J\"\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u00002\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007H¦\u0002¢\u0006\u0002\u0010\b¨\u0006\t"}, m7105d2 = {"Lkotlin/properties/PropertyDelegateProvider;", ExifInterface.GPS_DIRECTION_TRUE, "D", "", "provideDelegate", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "kotlin-stdlib"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public interface PropertyDelegateProvider<T, D> {
    D provideDelegate(T thisRef, @NotNull KProperty<?> property);
}
