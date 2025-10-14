package androidx.compose.material3.carousel;

import androidx.annotation.VisibleForTesting;
import androidx.compose.p003ui.util.MathHelpersKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: Strategy.kt */
@Metadata(m7104d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001a \u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001a0\u0010\u0000\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0002¨\u0006\u000e"}, m7105d2 = {"lerp", "Landroidx/compose/material3/carousel/Keyline;", TtmlNode.START, "end", "fraction", "", "Landroidx/compose/material3/carousel/KeylineList;", "from", "to", "outputMin", "outputMax", "inputMin", "inputMax", "value", "material3_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strategy.kt\nandroidx/compose/material3/carousel/StrategyKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,509:1\n277#2,3:510\n69#2,4:513\n280#2,2:517\n74#2:519\n282#2:520\n*S KotlinDebug\n*F\n+ 1 Strategy.kt\nandroidx/compose/material3/carousel/StrategyKt\n*L\n488#1:510,3\n488#1:513,4\n488#1:517,2\n488#1:519\n488#1:520\n*E\n"})
/* loaded from: classes3.dex */
public final class StrategyKt {
    @VisibleForTesting
    @NotNull
    public static final Keyline lerp(@NotNull Keyline keyline, @NotNull Keyline keyline2, float f) {
        return new Keyline(MathHelpersKt.lerp(keyline.getSize(), keyline2.getSize(), f), MathHelpersKt.lerp(keyline.getOffset(), keyline2.getOffset(), f), MathHelpersKt.lerp(keyline.getUnadjustedOffset(), keyline2.getUnadjustedOffset(), f), f < 0.5f ? keyline.isFocal() : keyline2.isFocal(), f < 0.5f ? keyline.isAnchor() : keyline2.isAnchor(), f < 0.5f ? keyline.isPivot() : keyline2.isPivot(), MathHelpersKt.lerp(keyline.getCutoff(), keyline2.getCutoff(), f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float lerp(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : MathHelpersKt.lerp(f, f2, (f5 - f3) / (f4 - f3));
    }

    @VisibleForTesting
    @NotNull
    public static final KeylineList lerp(@NotNull KeylineList keylineList, @NotNull KeylineList keylineList2, float f) {
        ArrayList arrayList = new ArrayList(keylineList.size());
        int size = keylineList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(lerp(keylineList.get(i), keylineList2.get(i), f));
        }
        return new KeylineList(arrayList);
    }
}
