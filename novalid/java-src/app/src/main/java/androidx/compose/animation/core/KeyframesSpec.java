package androidx.compose.animation.core;

import androidx.annotation.IntRange;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.blackhub.bronline.game.gui.tutorialhints.TutorialKeys;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.LinkedHashMap;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AnimationSpec.kt */
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0002\u000e\u000fB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J,\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\b\b\u0001\u0010\n*\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\n0\rH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m7105d2 = {"Landroidx/compose/animation/core/KeyframesSpec;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "config", "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "(Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;)V", "getConfig", "()Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "vectorize", "Landroidx/compose/animation/core/VectorizedKeyframesSpec;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "converter", "Landroidx/compose/animation/core/TwoWayConverter;", "KeyframeEntity", "KeyframesSpecConfig", "animation-core_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@Immutable
@SourceDebugExtension({"SMAP\nAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec\n+ 2 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,786:1\n382#2,4:787\n354#2,6:791\n364#2,3:798\n367#2,2:802\n387#2,2:804\n370#2,6:806\n389#2:812\n1810#3:797\n1672#3:801\n*S KotlinDebug\n*F\n+ 1 AnimationSpec.kt\nandroidx/compose/animation/core/KeyframesSpec\n*L\n560#1:787,4\n560#1:791,6\n560#1:798,3\n560#1:802,2\n560#1:804,2\n560#1:806,6\n560#1:812\n560#1:797\n560#1:801\n*E\n"})
/* loaded from: classes2.dex */
public final class KeyframesSpec<T> implements DurationBasedAnimationSpec<T> {
    public static final int $stable = 0;

    @NotNull
    private final KeyframesSpecConfig<T> config;

    public KeyframesSpec(@NotNull KeyframesSpecConfig<T> keyframesSpecConfig) {
        this.config = keyframesSpecConfig;
    }

    @NotNull
    public final KeyframesSpecConfig<T> getConfig() {
        return this.config;
    }

    /* compiled from: AnimationSpec.kt */
    @StabilityInferred(parameters = 2)
    @Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0006\u001a\u00028\u0001H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003*\u00028\u00012\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0096\u0004¢\u0006\u0002\u0010\fJ \u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003*\u00028\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0096\u0004¢\u0006\u0002\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0087\u0004¨\u0006\u0015"}, m7105d2 = {"Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/KeyframesSpecBaseConfig;", "Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "()V", "createEntityFor", "value", "createEntityFor$animation_core_release", "(Ljava/lang/Object;)Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", TutorialKeys.TUTORIAL_ADDITIONAL_TASK_PROGRESS_LIST_KEY, "timeStamp", "", "(Ljava/lang/Object;I)Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "atFraction", "fraction", "", "(Ljava/lang/Object;F)Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", JsonPOJOBuilder.DEFAULT_WITH_PREFIX, "", "easing", "Landroidx/compose/animation/core/Easing;", "animation-core_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes4.dex */
    public static final class KeyframesSpecConfig<T> extends KeyframesSpecBaseConfig<T, KeyframeEntity<T>> {
        public static final int $stable = 0;

        public KeyframesSpecConfig() {
            super(null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        /* renamed from: at */
        public /* bridge */ /* synthetic */ KeyframeBaseEntity mo33at(Object obj, int i) {
            return mo33at((KeyframesSpecConfig<T>) obj, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public /* bridge */ /* synthetic */ KeyframeBaseEntity atFraction(Object obj, float f) {
            return atFraction((KeyframesSpecConfig<T>) obj, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public /* bridge */ /* synthetic */ KeyframeBaseEntity createEntityFor$animation_core_release(Object obj) {
            return createEntityFor$animation_core_release((KeyframesSpecConfig<T>) obj);
        }

        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        @NotNull
        public KeyframeEntity<T> createEntityFor$animation_core_release(T value) {
            return new KeyframeEntity<>(value, null, 2, 0 == true ? 1 : 0);
        }

        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        @NotNull
        /* renamed from: at */
        public KeyframeEntity<T> mo33at(T t, @IntRange(from = 0) int i) {
            KeyframeEntity<T> keyframeEntity = new KeyframeEntity<>(t, null, 2, 0 == true ? 1 : 0);
            getKeyframes$animation_core_release().set(i, keyframeEntity);
            return keyframeEntity;
        }

        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        @NotNull
        public KeyframeEntity<T> atFraction(T t, float f) {
            return mo33at((KeyframesSpecConfig<T>) t, MathKt__MathJVMKt.roundToInt(getDurationMillis() * f));
        }

        @Deprecated(message = "Use version that returns an instance of the entity so it can be re-used in other keyframe builders.", replaceWith = @ReplaceWith(expression = "this using easing", imports = {}))
        public final void with(@NotNull KeyframeEntity<T> keyframeEntity, @NotNull Easing easing) {
            keyframeEntity.setEasing$animation_core_release(easing);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <V extends AnimationVector> VectorizedKeyframesSpec<V> vectorize(@NotNull TwoWayConverter<T, V> converter) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        MutableIntObjectMap<KeyframeEntity<T>> keyframes$animation_core_release = this.config.getKeyframes$animation_core_release();
        int[] iArr = keyframes$animation_core_release.keys;
        Object[] objArr = keyframes$animation_core_release.values;
        long[] jArr = keyframes$animation_core_release.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            linkedHashMap.put(Integer.valueOf(iArr[i4]), ((KeyframeEntity) objArr[i4]).toPair$animation_core_release(converter.getConvertToVector()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return new VectorizedKeyframesSpec<>(linkedHashMap, this.config.getDurationMillis(), this.config.getDelayMillis());
    }

    /* compiled from: AnimationSpec.kt */
    @StabilityInferred(parameters = 2)
    @Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, m7105d2 = {"Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/KeyframeBaseEntity;", "value", "easing", "Landroidx/compose/animation/core/Easing;", "(Ljava/lang/Object;Landroidx/compose/animation/core/Easing;)V", "equals", "", "other", "", "hashCode", "", "animation-core_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes4.dex */
    public static final class KeyframeEntity<T> extends KeyframeBaseEntity<T> {
        public static final int $stable = 0;

        public /* synthetic */ KeyframeEntity(Object obj, Easing easing, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i & 2) != 0 ? EasingKt.getLinearEasing() : easing);
        }

        public KeyframeEntity(T t, @NotNull Easing easing) {
            super(t, easing, null);
        }

        public boolean equals(@Nullable Object other) {
            if (other instanceof KeyframeEntity) {
                KeyframeEntity keyframeEntity = (KeyframeEntity) other;
                if (Intrinsics.areEqual(keyframeEntity.getValue$animation_core_release(), getValue$animation_core_release()) && Intrinsics.areEqual(keyframeEntity.getEasing(), getEasing())) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            T value$animation_core_release = getValue$animation_core_release();
            return ((value$animation_core_release != null ? value$animation_core_release.hashCode() : 0) * 31) + getEasing().hashCode();
        }
    }
}
