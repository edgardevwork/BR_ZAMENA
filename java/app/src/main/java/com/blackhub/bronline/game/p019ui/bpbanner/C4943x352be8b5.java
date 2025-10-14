package com.blackhub.bronline.game.p019ui.bpbanner;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyStaggeredGridDsl.kt */
@SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$2$1\n*L\n1#1,463:1\n*E\n"})
/* renamed from: com.blackhub.bronline.game.ui.bpbanner.BlackPassBannerGuiKt$BlackPassBannerContent$1$6$2$1$1$invoke$$inlined$items$default$1 */
/* loaded from: classes3.dex */
public final class C4943x352be8b5 extends Lambda implements Function1<Integer, Object> {
    public final /* synthetic */ List $items;
    public final /* synthetic */ Function1 $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4943x352be8b5(Function1 function1, List list) {
        super(1);
        this.$key = function1;
        this.$items = list;
    }

    @NotNull
    public final Object invoke(int i) {
        return this.$key.invoke(this.$items.get(i));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }
}

