package com.blackhub.bronline.game.p019ui.blackpass;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyGridDsl.kt */
@SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$2\n*L\n1#1,563:1\n*E\n"})
/* renamed from: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeListUiKt$BlackPassPrizeListUiContent$3$1$1$2$1$invoke$$inlined$items$default$2 */
/* loaded from: classes.dex */
public final class C4897x1b833f18 extends Lambda implements Function1<Integer, Object> {
    public final /* synthetic */ List $items;
    public final /* synthetic */ Function1 $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4897x1b833f18(Function1 function1, List list) {
        super(1);
        this.$key = function1;
        this.$items = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }

    @NotNull
    public final Object invoke(int i) {
        return this.$key.invoke(this.$items.get(i));
    }
}

