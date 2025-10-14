package kotlin.reflect;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: KProperty.kt */
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u000eJ\r\u0010\n\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000bJ\n\u0010\f\u001a\u0004\u0018\u00010\rH'R\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X¦\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, m7105d2 = {"Lkotlin/reflect/KProperty0;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/KProperty;", "Lkotlin/Function0;", "getter", "Lkotlin/reflect/KProperty0$Getter;", "getGetter$annotations", "()V", "getGetter", "()Lkotlin/reflect/KProperty0$Getter;", "get", "()Ljava/lang/Object;", "getDelegate", "", "Getter", "kotlin-stdlib"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public interface KProperty0<V> extends KProperty<V>, Function0<V> {

    /* compiled from: KProperty.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void getGetter$annotations() {
        }
    }

    /* compiled from: KProperty.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003¨\u0006\u0004"}, m7105d2 = {"Lkotlin/reflect/KProperty0$Getter;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/KProperty$Getter;", "Lkotlin/Function0;", "kotlin-stdlib"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* loaded from: classes8.dex */
    public interface Getter<V> extends KProperty.Getter<V>, Function0<V> {
    }

    V get();

    @SinceKotlin(version = "1.1")
    @Nullable
    Object getDelegate();

    @Override // kotlin.reflect.KProperty
    @NotNull
    Getter<V> getGetter();
}
