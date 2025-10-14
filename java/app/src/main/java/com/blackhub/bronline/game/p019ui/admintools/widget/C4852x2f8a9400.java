package com.blackhub.bronline.game.p019ui.admintools.widget;

import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyGridDsl.kt */
@SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$3\n*L\n1#1,563:1\n*E\n"})
/* renamed from: com.blackhub.bronline.game.ui.admintools.widget.ATGridBlockKt$ATGridBlock$2$1$1$1$1$1$1$invoke$$inlined$items$default$3 */

public final class C4852x2f8a9400 extends Lambda implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {
    public final /* synthetic */ List $items;
    public final /* synthetic */ Function2 $span;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4852x2f8a9400(Function2 function2, List list) {
        super(2);
        this.$span = function2;
        this.$items = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
        return GridItemSpan.m8240boximpl(m14887invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
    }

    /* renamed from: invoke-_-orMbw, reason: not valid java name */
    public final long m14887invoke_orMbw(@NotNull LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
        return ((GridItemSpan) this.$span.invoke(lazyGridItemSpanScope, this.$items.get(i))).getPackedValue();
    }
}

