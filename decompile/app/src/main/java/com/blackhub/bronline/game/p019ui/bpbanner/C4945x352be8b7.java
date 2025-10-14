package com.blackhub.bronline.game.p019ui.bpbanner;

import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyStaggeredGridDsl.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, m7105d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", ExifInterface.GPS_DIRECTION_TRUE, FirebaseAnalytics.Param.INDEX, "", "invoke", "androidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$4$1"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$4$1\n*L\n1#1,463:1\n*E\n"})
/* renamed from: com.blackhub.bronline.game.ui.bpbanner.BlackPassBannerGuiKt$BlackPassBannerContent$1$6$2$1$1$invoke$$inlined$items$default$3 */
/* loaded from: classes3.dex */
public final class C4945x352be8b7 extends Lambda implements Function1<Integer, StaggeredGridItemSpan> {
    public final /* synthetic */ List $items;
    public final /* synthetic */ Function1 $span;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4945x352be8b7(Function1 function1, List list) {
        super(1);
        this.$span = function1;
        this.$items = list;
    }

    @NotNull
    public final StaggeredGridItemSpan invoke(int i) {
        return (StaggeredGridItemSpan) this.$span.invoke(this.$items.get(i));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ StaggeredGridItemSpan invoke(Integer num) {
        return invoke(num.intValue());
    }
}
