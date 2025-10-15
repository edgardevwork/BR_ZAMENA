package androidx.compose.foundation.pager;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PagerLazyAnimateScrollScope.kt */
@Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¨\u0006\u0004"}, m7105d2 = {"PagerLazyAnimateScrollScope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;", "state", "Landroidx/compose/foundation/pager/PagerState;", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class PagerLazyAnimateScrollScopeKt {

    /* compiled from: PagerLazyAnimateScrollScope.kt */
    @Metadata(m7104d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0016J7\u0010\u0014\u001a\u00020\u00152'\u0010\u0016\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0017¢\u0006\u0002\b\u001bH\u0096@¢\u0006\u0002\u0010\u001cJ\u001c\u0010\u001d\u001a\u00020\u0015*\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005¨\u0006\u001f"}, m7105d2 = {"androidx/compose/foundation/pager/PagerLazyAnimateScrollScopeKt$PagerLazyAnimateScrollScope$1", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;", "firstVisibleItemIndex", "", "getFirstVisibleItemIndex", "()I", "firstVisibleItemScrollOffset", "getFirstVisibleItemScrollOffset", "itemCount", "getItemCount", "lastVisibleItemIndex", "getLastVisibleItemIndex", "visibleItemsAverageSize", "getVisibleItemsAverageSize", "calculateDistanceTo", "", "targetIndex", "targetItemOffset", "getVisibleItemScrollOffset", FirebaseAnalytics.Param.INDEX, "scroll", "", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapToItem", "scrollOffset", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nPagerLazyAnimateScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerLazyAnimateScrollScope.kt\nandroidx/compose/foundation/pager/PagerLazyAnimateScrollScopeKt$PagerLazyAnimateScrollScope$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,67:1\n116#2,2:68\n33#2,6:70\n118#2:76\n*S KotlinDebug\n*F\n+ 1 PagerLazyAnimateScrollScope.kt\nandroidx/compose/foundation/pager/PagerLazyAnimateScrollScopeKt$PagerLazyAnimateScrollScope$1\n*L\n45#1:68,2\n45#1:70,6\n45#1:76\n*E\n"})
    /* renamed from: androidx.compose.foundation.pager.PagerLazyAnimateScrollScopeKt$PagerLazyAnimateScrollScope$1 */
    public static final class C07651 implements LazyLayoutAnimateScrollScope {
        public C07651() {
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
        public int getFirstVisibleItemIndex() {
            return pagerState.getFirstVisiblePage();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
        public int getFirstVisibleItemScrollOffset() {
            return pagerState.getFirstVisiblePageOffset();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
        public int getLastVisibleItemIndex() {
            return ((PageInfo) CollectionsKt___CollectionsKt.last((List) pagerState.getLayoutInfo().getVisiblePagesInfo())).getIndex();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
        public int getItemCount() {
            return pagerState.getPageCount();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
        public int getVisibleItemScrollOffset(int i) {
            PageInfo pageInfo;
            List<PageInfo> visiblePagesInfo = pagerState.getLayoutInfo().getVisiblePagesInfo();
            int size = visiblePagesInfo.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    pageInfo = null;
                    break;
                }
                pageInfo = visiblePagesInfo.get(i2);
                if (pageInfo.getIndex() == i) {
                    break;
                }
                i2++;
            }
            PageInfo pageInfo2 = pageInfo;
            if (pageInfo2 != null) {
                return pageInfo2.getOffset();
            }
            return 0;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
        public void snapToItem(@NotNull ScrollScope scrollScope, int i, int i2) {
            pagerState.snapToItem$foundation_release(i, i2 / pagerState.getPageSizeWithSpacing$foundation_release());
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
        public float calculateDistanceTo(int targetIndex, int targetItemOffset) {
            return ((targetIndex - pagerState.getCurrentPage()) * getVisibleItemsAverageSize()) + targetItemOffset;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
        @Nullable
        public Object scroll(@NotNull Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
            Object objScroll$default = ScrollableState.scroll$default(pagerState, null, function2, continuation, 1, null);
            return objScroll$default == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objScroll$default : Unit.INSTANCE;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
        public int getVisibleItemsAverageSize() {
            return pagerState.getPageSize$foundation_release() + pagerState.getPageSpacing$foundation_release();
        }
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final LazyLayoutAnimateScrollScope PagerLazyAnimateScrollScope(@NotNull PagerState pagerState) {
        return new LazyLayoutAnimateScrollScope() { // from class: androidx.compose.foundation.pager.PagerLazyAnimateScrollScopeKt.PagerLazyAnimateScrollScope.1
            public C07651() {
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public int getFirstVisibleItemIndex() {
                return pagerState.getFirstVisiblePage();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public int getFirstVisibleItemScrollOffset() {
                return pagerState.getFirstVisiblePageOffset();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public int getLastVisibleItemIndex() {
                return ((PageInfo) CollectionsKt___CollectionsKt.last((List) pagerState.getLayoutInfo().getVisiblePagesInfo())).getIndex();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public int getItemCount() {
                return pagerState.getPageCount();
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public int getVisibleItemScrollOffset(int i) {
                PageInfo pageInfo;
                List<PageInfo> visiblePagesInfo = pagerState.getLayoutInfo().getVisiblePagesInfo();
                int size = visiblePagesInfo.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        pageInfo = null;
                        break;
                    }
                    pageInfo = visiblePagesInfo.get(i2);
                    if (pageInfo.getIndex() == i) {
                        break;
                    }
                    i2++;
                }
                PageInfo pageInfo2 = pageInfo;
                if (pageInfo2 != null) {
                    return pageInfo2.getOffset();
                }
                return 0;
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public void snapToItem(@NotNull ScrollScope scrollScope, int i, int i2) {
                pagerState.snapToItem$foundation_release(i, i2 / pagerState.getPageSizeWithSpacing$foundation_release());
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public float calculateDistanceTo(int targetIndex, int targetItemOffset) {
                return ((targetIndex - pagerState.getCurrentPage()) * getVisibleItemsAverageSize()) + targetItemOffset;
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            @Nullable
            public Object scroll(@NotNull Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
                Object objScroll$default = ScrollableState.scroll$default(pagerState, null, function2, continuation, 1, null);
                return objScroll$default == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objScroll$default : Unit.INSTANCE;
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
            public int getVisibleItemsAverageSize() {
                return pagerState.getPageSize$foundation_release() + pagerState.getPageSpacing$foundation_release();
            }
        };
    }
}
