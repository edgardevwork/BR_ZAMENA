package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyListIntervalContent.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001e\u0012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007¢\u0006\u0002\u0010\bJ?\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u0007H\u0016¢\u0006\u0002\u0010\u001aJ\u0092\u0001\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u000b2#\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00052#\u0010\u0017\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000521\u0010 \u001a-\u0012\u0004\u0012\u00020\u0018\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00060!¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u0007H\u0016¢\u0006\u0002\u0010\"J?\u0010#\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u0007H\u0017¢\u0006\u0002\u0010\u001aR\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006$"}, m7105d2 = {"Landroidx/compose/foundation/lazy/LazyListIntervalContent;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Landroidx/compose/foundation/lazy/LazyListInterval;", "Landroidx/compose/foundation/lazy/LazyListScope;", "content", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)V", "_headerIndexes", "", "", "headerIndexes", "", "getHeaderIndexes", "()Ljava/util/List;", "intervals", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "getIntervals", "()Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "item", "key", "", "contentType", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", FirebaseAnalytics.Param.ITEMS, CatchStreamerKeys.COUNT_KEY, "Lkotlin/ParameterName;", "name", FirebaseAnalytics.Param.INDEX, "itemContent", "Lkotlin/Function2;", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "stickyHeader", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class LazyListIntervalContent extends LazyLayoutIntervalContent<LazyListInterval> implements LazyListScope {
    public static final int $stable = 8;

    @Nullable
    private List<Integer> _headerIndexes;

    @NotNull
    private final MutableIntervalList<LazyListInterval> intervals = new MutableIntervalList<>();

    public LazyListIntervalContent(@NotNull Function1<? super LazyListScope, Unit> function1) {
        function1.invoke(this);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    @NotNull
    public MutableIntervalList<LazyListInterval> getIntervals() {
        return this.intervals;
    }

    @NotNull
    public final List<Integer> getHeaderIndexes() {
        List<Integer> list = this._headerIndexes;
        return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void items(int count, @Nullable Function1<? super Integer, ? extends Object> key, @NotNull Function1<? super Integer, ? extends Object> contentType, @NotNull Function4<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> itemContent) {
        getIntervals().addInterval(count, new LazyListInterval(key, contentType, itemContent));
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void item(@Nullable final Object key, @Nullable final Object contentType, @NotNull final Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> content) {
        getIntervals().addInterval(1, new LazyListInterval(key != null ? new Function1<Integer, Object>() { // from class: androidx.compose.foundation.lazy.LazyListIntervalContent.item.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            @NotNull
            public final Object invoke(int i) {
                return key;
            }
        } : null, new Function1<Integer, Object>() { // from class: androidx.compose.foundation.lazy.LazyListIntervalContent.item.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            @Nullable
            public final Object invoke(int i) {
                return contentType;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1010194746, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListIntervalContent.item.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(@NotNull LazyItemScope lazyItemScope, int i, @Nullable Composer composer, int i2) {
                if ((i2 & 14) == 0) {
                    i2 |= composer.changed(lazyItemScope) ? 4 : 2;
                }
                if ((i2 & 651) == 130 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1010194746, i2, -1, "androidx.compose.foundation.lazy.LazyListIntervalContent.item.<anonymous> (LazyListIntervalContent.kt:58)");
                }
                content.invoke(lazyItemScope, composer, Integer.valueOf(i2 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        })));
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    @ExperimentalFoundationApi
    public void stickyHeader(@Nullable Object key, @Nullable Object contentType, @NotNull Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> content) {
        List arrayList = this._headerIndexes;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this._headerIndexes = arrayList;
        }
        arrayList.add(Integer.valueOf(getIntervals().getSize()));
        item(key, contentType, content);
    }
}
