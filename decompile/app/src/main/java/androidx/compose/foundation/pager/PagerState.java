package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.layout.Remeasurement;
import androidx.compose.p003ui.layout.RemeasurementModifier;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.Snapshot;
import com.blackhub.bronline.game.gui.fractions.Const;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PagerState.kt */
@Metadata(m7104d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J7\u0010\u009a\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009c\u0001\u001a\u00020\u00032\t\b\u0002\u0010\u009d\u0001\u001a\u00020\u00052\u0010\b\u0002\u0010\u009e\u0001\u001a\t\u0012\u0004\u0012\u00020\u00050\u009f\u0001H\u0086@¢\u0006\u0003\u0010 \u0001J$\u0010¡\u0001\u001a\u00030\u009b\u00012\u0007\u0010¢\u0001\u001a\u00020S2\t\b\u0002\u0010£\u0001\u001a\u00020\u0013H\u0000¢\u0006\u0003\b¤\u0001J\u0011\u0010¥\u0001\u001a\u00030\u009b\u0001H\u0082@¢\u0006\u0003\u0010¦\u0001J\u0013\u0010§\u0001\u001a\u00030\u009b\u00012\u0007\u0010¨\u0001\u001a\u00020=H\u0002J\u0012\u0010©\u0001\u001a\u00020\u00052\u0007\u0010ª\u0001\u001a\u00020\u0005H\u0016J\u0010\u0010«\u0001\u001a\u00020\u00052\u0007\u0010\u009c\u0001\u001a\u00020\u0003J\u0012\u0010¬\u0001\u001a\u00020\u00132\u0007\u0010\u00ad\u0001\u001a\u00020\u0005H\u0002J\t\u0010®\u0001\u001a\u00020\u0013H\u0002J#\u0010¯\u0001\u001a\u00020\u00032\b\u0010°\u0001\u001a\u00030±\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0000¢\u0006\u0003\b²\u0001J\u001c\u0010³\u0001\u001a\u00030\u009b\u00012\u0007\u0010ª\u0001\u001a\u00020\u00052\u0007\u0010¨\u0001\u001a\u00020=H\u0002J\u0012\u0010´\u0001\u001a\u00020\u00052\u0007\u0010ª\u0001\u001a\u00020\u0005H\u0002JK\u0010µ\u0001\u001a\u00030\u009b\u00012\b\u0010¶\u0001\u001a\u00030·\u00012.\u0010¸\u0001\u001a)\b\u0001\u0012\u0005\u0012\u00030º\u0001\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u009b\u00010»\u0001\u0012\u0007\u0012\u0005\u0018\u00010¼\u00010¹\u0001¢\u0006\u0003\b½\u0001H\u0096@¢\u0006\u0003\u0010¾\u0001J%\u0010¿\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009c\u0001\u001a\u00020\u00032\t\b\u0002\u0010\u009d\u0001\u001a\u00020\u0005H\u0086@¢\u0006\u0003\u0010À\u0001J\"\u0010Á\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009c\u0001\u001a\u00020\u00032\u0007\u0010Â\u0001\u001a\u00020\u0005H\u0000¢\u0006\u0003\bÃ\u0001J\u0013\u0010Ä\u0001\u001a\u00030\u009b\u00012\u0007\u0010¢\u0001\u001a\u00020SH\u0002J\r\u0010Å\u0001\u001a\u00020\u0003*\u00020\u0003H\u0002J!\u0010Æ\u0001\u001a\u00030\u009b\u0001*\u00030º\u00012\u0007\u0010\u009c\u0001\u001a\u00020\u00032\t\b\u0002\u0010\u009d\u0001\u001a\u00020\u0005J\u0016\u0010Ç\u0001\u001a\u00030\u009b\u0001*\u00030º\u00012\u0007\u0010\u0091\u0001\u001a\u00020\u0003R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001c\u0010\u0016\"\u0004\b\u001d\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u00020&X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u001e\u0010-\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u000e\u0010/\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u00100\u001a\u0002018F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00104\u001a\u000205X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0014\u00108\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u0016R+\u00109\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b;\u0010\u001a\u001a\u0004\b9\u0010\u0016\"\u0004\b:\u0010\u0018R\u0011\u0010<\u001a\u00020=8F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0018\u0010@\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003@BX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010A\u001a\u00020B8@X\u0080\u0084\u0002¢\u0006\f\u001a\u0004\bE\u0010F*\u0004\bC\u0010DR\u001e\u0010G\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bH\u0010 R\u0012\u0010I\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010 R\u0014\u0010K\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bL\u0010 R\u0014\u0010M\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bN\u0010 R\u0014\u0010O\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bP\u0010 R\u0014\u0010Q\u001a\b\u0012\u0004\u0012\u00020S0RX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010T\u001a\u00020UX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u001c\u0010X\u001a\u00020YX\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\bZ\u0010[R\u0014\u0010\\\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b]\u0010\"R\u0014\u0010^\u001a\u00020_X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010aR\u001a\u0010b\u001a\u00020\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010\u0016\"\u0004\bd\u0010\u0018R\"\u0010e\u001a\u00020fX\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010k\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u000e\u0010l\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010m\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bn\u0010 \"\u0004\bo\u0010pR/\u0010t\u001a\u0004\u0018\u00010s2\b\u0010\u0012\u001a\u0004\u0018\u00010s8@@BX\u0080\u008e\u0002¢\u0006\u0012\n\u0004\by\u0010\u001a\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\u0014\u0010z\u001a\u00020{X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b|\u0010}R\u0016\u0010~\u001a\u00020\u007fX\u0080\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u000f\u0010\u0082\u0001\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0083\u0001\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\u000f\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0005\b\u0084\u0001\u0010 R/\u0010\u0087\u0001\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010r\u001a\u0005\b\u0088\u0001\u0010 \"\u0005\b\u0089\u0001\u0010pR1\u0010\u008b\u0001\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00058@@@X\u0080\u008e\u0002¢\u0006\u0017\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0005\b\u008c\u0001\u0010\"\"\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001f\u0010\u0091\u0001\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\u000f\n\u0006\b\u0093\u0001\u0010\u0086\u0001\u001a\u0005\b\u0092\u0001\u0010 R7\u0010\u0095\u0001\u001a\u00030\u0094\u00012\u0007\u0010\u0012\u001a\u00030\u0094\u00018@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0015\n\u0005\b\u0098\u0001\u0010\u001a\u001a\u0005\b\u0096\u0001\u0010h\"\u0005\b\u0097\u0001\u0010jR\u000f\u0010\u0099\u0001\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006È\u0001"}, m7105d2 = {"Landroidx/compose/foundation/pager/PagerState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "currentPage", "", "currentPageOffsetFraction", "", "(IF)V", "accumulator", "animatedScrollScope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "getAwaitLayoutModifier$foundation_release", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "getBeyondBoundsInfo$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "<set-?>", "", "canScrollBackward", "getCanScrollBackward", "()Z", "setCanScrollBackward", "(Z)V", "canScrollBackward$delegate", "Landroidx/compose/runtime/MutableState;", "canScrollForward", "getCanScrollForward", "setCanScrollForward", "canScrollForward$delegate", "getCurrentPage", "()I", "getCurrentPageOffsetFraction", "()F", "currentPrefetchHandle", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "firstVisiblePage", "getFirstVisiblePage$foundation_release", "firstVisiblePageOffset", "getFirstVisiblePageOffset$foundation_release", "indexToPrefetch", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "internalInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInternalInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "isScrollInProgress", "isScrollingForward", "setScrollingForward", "isScrollingForward$delegate", "layoutInfo", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "getLayoutInfo", "()Landroidx/compose/foundation/pager/PagerLayoutInfo;", "maxScrollOffset", "nearestRange", "Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release$delegate", "(Landroidx/compose/foundation/pager/PagerState;)Ljava/lang/Object;", "getNearestRange$foundation_release", "()Lkotlin/ranges/IntRange;", "numMeasurePasses", "getNumMeasurePasses$foundation_release", "pageCount", "getPageCount", "pageSize", "getPageSize$foundation_release", "pageSizeWithSpacing", "getPageSizeWithSpacing$foundation_release", "pageSpacing", "getPageSpacing$foundation_release", "pagerLayoutInfoState", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "pinnedPages", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedPages$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "placementScopeInvalidator", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "getPlacementScopeInvalidator-zYiylxw$foundation_release", "()Landroidx/compose/runtime/MutableState;", "positionThresholdFraction", "getPositionThresholdFraction$foundation_release", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchingEnabled", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "premeasureConstraints", "Landroidx/compose/ui/unit/Constraints;", "getPremeasureConstraints-msEJaDk$foundation_release", "()J", "setPremeasureConstraints-BRTryo0$foundation_release", "(J)V", "J", "previousPassDelta", "programmaticScrollTargetPage", "getProgrammaticScrollTargetPage", "setProgrammaticScrollTargetPage", "(I)V", "programmaticScrollTargetPage$delegate", "Landroidx/compose/runtime/MutableIntState;", "Landroidx/compose/ui/layout/Remeasurement;", "remeasurement", "getRemeasurement$foundation_release", "()Landroidx/compose/ui/layout/Remeasurement;", "setRemeasurement", "(Landroidx/compose/ui/layout/Remeasurement;)V", "remeasurement$delegate", "remeasurementModifier", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation_release", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "scrollPosition", "Landroidx/compose/foundation/pager/PagerScrollPosition;", "getScrollPosition$foundation_release", "()Landroidx/compose/foundation/pager/PagerScrollPosition;", "scrollableState", "settledPage", "getSettledPage", "settledPage$delegate", "Landroidx/compose/runtime/State;", "settledPageState", "getSettledPageState", "setSettledPageState", "settledPageState$delegate", "snapRemainingScrollOffset", "getSnapRemainingScrollOffset$foundation_release", "setSnapRemainingScrollOffset$foundation_release", "(F)V", "snapRemainingScrollOffset$delegate", "Landroidx/compose/runtime/MutableFloatState;", "targetPage", "getTargetPage", "targetPage$delegate", "Landroidx/compose/ui/geometry/Offset;", "upDownDifference", "getUpDownDifference-F1C5BW0$foundation_release", "setUpDownDifference-k-4lQ0M$foundation_release", "upDownDifference$delegate", "wasPrefetchingForward", "animateScrollToPage", "", Const.PAGE_KEY, "pageOffsetFraction", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(IFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyMeasureResult", "result", "visibleItemsStayedTheSame", "applyMeasureResult$foundation_release", "awaitScrollDependencies", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelPrefetchIfVisibleItemsChanged", "info", "dispatchRawDelta", "delta", "getOffsetFractionForPage", "isGestureActionMatchesScroll", "scrollDelta", "isNotGestureAction", "matchScrollPositionWithKey", "itemProvider", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "matchScrollPositionWithKey$foundation_release", "notifyPrefetch", "performScroll", "scroll", "scrollPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollToPage", "(IFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapToItem", "offsetFraction", "snapToItem$foundation_release", "tryRunPrefetch", "coerceInPageRange", "updateCurrentPage", "updateTargetPage", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@Stable
@ExperimentalFoundationApi
@SourceDebugExtension({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n+ 5 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 8 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,787:1\n81#2:788\n107#2,2:789\n81#2:794\n107#2,2:795\n81#2:815\n81#2:816\n81#2:817\n107#2,2:818\n81#2:820\n81#2:821\n107#2,2:822\n81#2:824\n107#2,2:825\n76#3:791\n109#3,2:792\n772#4,4:797\n772#4,4:801\n772#4,4:805\n772#4,4:827\n772#4,4:832\n75#5:809\n108#5,2:810\n75#5:812\n108#5,2:813\n1#6:831\n495#7,4:836\n500#7:845\n495#7,4:846\n500#7:855\n129#8,5:840\n129#8,5:850\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState\n*L\n154#1:788\n154#1:789,2\n159#1:794\n159#1:795,2\n329#1:815\n346#1:816\n400#1:817\n400#1:818,2\n422#1:820\n586#1:821\n586#1:822,2\n588#1:824\n588#1:825,2\n155#1:791\n155#1:792,2\n192#1:797,4\n212#1:801,4\n220#1:805,4\n598#1:827,4\n613#1:832,4\n317#1:809\n317#1:810,2\n319#1:812\n319#1:813,2\n617#1:836,4\n617#1:845\n715#1:846,4\n715#1:855\n617#1:840,5\n715#1:850,5\n*E\n"})
/* loaded from: classes2.dex */
public abstract class PagerState implements ScrollableState {
    public static final int $stable = 0;
    private float accumulator;

    @NotNull
    private final LazyLayoutAnimateScrollScope animatedScrollScope;

    @NotNull
    private final AwaitFirstLayoutModifier awaitLayoutModifier;

    @NotNull
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;

    /* renamed from: canScrollBackward$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState canScrollBackward;

    /* renamed from: canScrollForward$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState canScrollForward;

    @Nullable
    private LazyLayoutPrefetchState.PrefetchHandle currentPrefetchHandle;

    @NotNull
    private Density density;
    private int firstVisiblePage;
    private int firstVisiblePageOffset;
    private int indexToPrefetch;

    @NotNull
    private final MutableInteractionSource internalInteractionSource;

    /* renamed from: isScrollingForward$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isScrollingForward;
    private int maxScrollOffset;
    private int numMeasurePasses;

    @NotNull
    private MutableState<PagerMeasureResult> pagerLayoutInfoState;

    @NotNull
    private final LazyLayoutPinnedItemList pinnedPages;

    @NotNull
    private final MutableState<Unit> placementScopeInvalidator;

    @NotNull
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;
    private long premeasureConstraints;
    private float previousPassDelta;

    /* renamed from: programmaticScrollTargetPage$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableIntState programmaticScrollTargetPage;

    /* renamed from: remeasurement$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState remeasurement;

    @NotNull
    private final RemeasurementModifier remeasurementModifier;

    @NotNull
    private final PagerScrollPosition scrollPosition;

    @NotNull
    private final ScrollableState scrollableState;

    /* renamed from: settledPage$delegate, reason: from kotlin metadata */
    @NotNull
    private final State settledPage;

    /* renamed from: settledPageState$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableIntState settledPageState;

    /* renamed from: snapRemainingScrollOffset$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableFloatState snapRemainingScrollOffset;

    /* renamed from: targetPage$delegate, reason: from kotlin metadata */
    @NotNull
    private final State targetPage;

    /* renamed from: upDownDifference$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState upDownDifference;
    private boolean wasPrefetchingForward;

    /* compiled from: PagerState.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.pager.PagerState", m7120f = "PagerState.kt", m7121i = {0, 0, 0, 0}, m7122l = {508, 517}, m7123m = "animateScrollToPage", m7124n = {"this", "animationSpec", Const.PAGE_KEY, "pageOffsetFraction"}, m7125s = {"L$0", "L$1", "I$0", "F$0"})
    /* renamed from: androidx.compose.foundation.pager.PagerState$animateScrollToPage$1 */
    /* loaded from: classes3.dex */
    public static final class C07691 extends ContinuationImpl {
        public float F$0;
        public int I$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C07691(Continuation<? super C07691> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PagerState.this.animateScrollToPage(0, 0.0f, null, this);
        }
    }

    /* compiled from: PagerState.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.pager.PagerState", m7120f = "PagerState.kt", m7121i = {0, 0, 0, 1}, m7122l = {570, 575}, m7123m = "scroll$suspendImpl", m7124n = {"$this", "scrollPriority", "block", "$this"}, m7125s = {"L$0", "L$1", "L$2", "L$0"})
    /* renamed from: androidx.compose.foundation.pager.PagerState$scroll$1 */
    /* loaded from: classes3.dex */
    public static final class C07711 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C07711(Continuation<? super C07711> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PagerState.scroll$suspendImpl(PagerState.this, null, null, this);
        }
    }

    public PagerState() {
        this(0, 0.0f, 3, null);
    }

    public abstract int getPageCount();

    @Override // androidx.compose.foundation.gestures.ScrollableState
    @Nullable
    public Object scroll(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        return scroll$suspendImpl(this, mutatePriority, function2, continuation);
    }

    public PagerState(int i, float f) {
        double d = f;
        if (-0.5d <= d && d <= 0.5d) {
            this.upDownDifference = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m11088boximpl(Offset.INSTANCE.m11115getZeroF1C5BW0()), null, 2, null);
            this.snapRemainingScrollOffset = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
            this.animatedScrollScope = PagerLazyAnimateScrollScopeKt.PagerLazyAnimateScrollScope(this);
            Boolean bool = Boolean.FALSE;
            this.isScrollingForward = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
            PagerScrollPosition pagerScrollPosition = new PagerScrollPosition(i, f, this);
            this.scrollPosition = pagerScrollPosition;
            this.firstVisiblePage = i;
            this.maxScrollOffset = Integer.MAX_VALUE;
            this.scrollableState = ScrollableStateKt.ScrollableState(new Function1<Float, Float>() { // from class: androidx.compose.foundation.pager.PagerState$scrollableState$1
                {
                    super(1);
                }

                @NotNull
                public final Float invoke(float f2) {
                    return Float.valueOf(this.this$0.performScroll(f2));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                    return invoke(f2.floatValue());
                }
            });
            this.prefetchingEnabled = true;
            this.indexToPrefetch = -1;
            this.pagerLayoutInfoState = SnapshotStateKt.mutableStateOf(PagerStateKt.getEmptyLayoutInfo(), SnapshotStateKt.neverEqualPolicy());
            this.density = PagerStateKt.UnitDensity;
            this.internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
            this.programmaticScrollTargetPage = SnapshotIntStateKt.mutableIntStateOf(-1);
            this.settledPageState = SnapshotIntStateKt.mutableIntStateOf(i);
            this.settledPage = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<Integer>() { // from class: androidx.compose.foundation.pager.PagerState$settledPage$2
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Integer invoke() {
                    int currentPage;
                    if (this.this$0.isScrollInProgress()) {
                        currentPage = this.this$0.getSettledPageState();
                    } else {
                        currentPage = this.this$0.getCurrentPage();
                    }
                    return Integer.valueOf(currentPage);
                }
            });
            this.targetPage = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<Integer>() { // from class: androidx.compose.foundation.pager.PagerState$targetPage$2
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Integer invoke() {
                    int iRoundToInt;
                    if (this.this$0.isScrollInProgress()) {
                        if (this.this$0.getProgrammaticScrollTargetPage() != -1) {
                            iRoundToInt = this.this$0.getProgrammaticScrollTargetPage();
                        } else if (this.this$0.getSnapRemainingScrollOffset$foundation_release() != 0.0f) {
                            iRoundToInt = MathKt__MathJVMKt.roundToInt(this.this$0.getSnapRemainingScrollOffset$foundation_release() / this.this$0.getPageSizeWithSpacing$foundation_release()) + this.this$0.getCurrentPage();
                        } else if (Math.abs(this.this$0.getCurrentPageOffsetFraction()) >= Math.abs(this.this$0.getPositionThresholdFraction$foundation_release())) {
                            if (this.this$0.isScrollingForward()) {
                                iRoundToInt = this.this$0.getFirstVisiblePage() + 1;
                            } else {
                                iRoundToInt = this.this$0.getFirstVisiblePage();
                            }
                        } else {
                            iRoundToInt = this.this$0.getCurrentPage();
                        }
                    } else {
                        iRoundToInt = this.this$0.getCurrentPage();
                    }
                    return Integer.valueOf(this.this$0.coerceInPageRange(iRoundToInt));
                }
            });
            this.prefetchState = new LazyLayoutPrefetchState();
            this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
            this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
            this.remeasurement = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.pager.PagerState$remeasurementModifier$1
                @Override // androidx.compose.p003ui.layout.RemeasurementModifier
                public void onRemeasurementAvailable(@NotNull Remeasurement remeasurement) {
                    this.this$0.setRemeasurement(remeasurement);
                }
            };
            this.premeasureConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
            this.pinnedPages = new LazyLayoutPinnedItemList();
            pagerScrollPosition.getNearestRangeState();
            this.placementScopeInvalidator = ObservableScopeInvalidator.m8294constructorimpl$default(null, 1, null);
            this.canScrollForward = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
            this.canScrollBackward = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
            return;
        }
        throw new IllegalArgumentException(("initialPageOffsetFraction " + f + " is not within the range -0.5 to 0.5").toString());
    }

    public /* synthetic */ PagerState(int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0f : f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getUpDownDifference-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m8360getUpDownDifferenceF1C5BW0$foundation_release() {
        return ((Offset) this.upDownDifference.getValue()).getPackedValue();
    }

    /* renamed from: setUpDownDifference-k-4lQ0M$foundation_release, reason: not valid java name */
    public final void m8362setUpDownDifferencek4lQ0M$foundation_release(long j) {
        this.upDownDifference.setValue(Offset.m11088boximpl(j));
    }

    public final float getSnapRemainingScrollOffset$foundation_release() {
        return this.snapRemainingScrollOffset.getFloatValue();
    }

    public final void setSnapRemainingScrollOffset$foundation_release(float f) {
        this.snapRemainingScrollOffset.setFloatValue(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isScrollingForward() {
        return ((Boolean) this.isScrollingForward.getValue()).booleanValue();
    }

    private final void setScrollingForward(boolean z) {
        this.isScrollingForward.setValue(Boolean.valueOf(z));
    }

    @NotNull
    /* renamed from: getScrollPosition$foundation_release, reason: from getter */
    public final PagerScrollPosition getScrollPosition() {
        return this.scrollPosition;
    }

    /* renamed from: getFirstVisiblePage$foundation_release, reason: from getter */
    public final int getFirstVisiblePage() {
        return this.firstVisiblePage;
    }

    /* renamed from: getFirstVisiblePageOffset$foundation_release, reason: from getter */
    public final int getFirstVisiblePageOffset() {
        return this.firstVisiblePageOffset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float performScroll(float delta) {
        float fCurrentScrollOffset = this.scrollPosition.currentScrollOffset();
        float f = fCurrentScrollOffset + delta + this.accumulator;
        float fCoerceIn = RangesKt___RangesKt.coerceIn(f, 0.0f, this.maxScrollOffset);
        boolean z = !(f == fCoerceIn);
        float f2 = fCoerceIn - fCurrentScrollOffset;
        this.previousPassDelta = f2;
        if (Math.abs(f2) != 0.0f) {
            setScrollingForward(f2 > 0.0f);
        }
        int iRoundToInt = MathKt__MathJVMKt.roundToInt(f2);
        PagerMeasureResult value = this.pagerLayoutInfoState.getValue();
        if (value.tryToApplyScrollWithoutRemeasure(-iRoundToInt)) {
            applyMeasureResult$foundation_release(value, true);
            ObservableScopeInvalidator.m8298invalidateScopeimpl(this.placementScopeInvalidator);
        } else {
            this.scrollPosition.applyScrollDelta(iRoundToInt);
            Remeasurement remeasurement$foundation_release = getRemeasurement$foundation_release();
            if (remeasurement$foundation_release != null) {
                remeasurement$foundation_release.forceRemeasure();
            }
        }
        this.accumulator = f2 - iRoundToInt;
        return z ? f2 : delta;
    }

    /* renamed from: getNumMeasurePasses$foundation_release, reason: from getter */
    public final int getNumMeasurePasses() {
        return this.numMeasurePasses;
    }

    /* renamed from: getPrefetchingEnabled$foundation_release, reason: from getter */
    public final boolean getPrefetchingEnabled() {
        return this.prefetchingEnabled;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z) {
        this.prefetchingEnabled = z;
    }

    @NotNull
    public final PagerLayoutInfo getLayoutInfo() {
        return this.pagerLayoutInfoState.getValue();
    }

    public final int getPageSpacing$foundation_release() {
        return this.pagerLayoutInfoState.getValue().getPageSpacing();
    }

    public final int getPageSize$foundation_release() {
        return this.pagerLayoutInfoState.getValue().getPageSize();
    }

    @NotNull
    /* renamed from: getDensity$foundation_release, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    public final void setDensity$foundation_release(@NotNull Density density) {
        this.density = density;
    }

    public final int getPageSizeWithSpacing$foundation_release() {
        return getPageSize$foundation_release() + getPageSpacing$foundation_release();
    }

    public final float getPositionThresholdFraction$foundation_release() {
        return Math.min(this.density.mo7874toPx0680j_4(PagerStateKt.getDefaultPositionThreshold()), getPageSize$foundation_release() / 2.0f) / getPageSize$foundation_release();
    }

    @NotNull
    /* renamed from: getInternalInteractionSource$foundation_release, reason: from getter */
    public final MutableInteractionSource getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    @NotNull
    public final InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    public final int getCurrentPage() {
        return this.scrollPosition.getCurrentPage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getProgrammaticScrollTargetPage() {
        return this.programmaticScrollTargetPage.getIntValue();
    }

    private final void setProgrammaticScrollTargetPage(int i) {
        this.programmaticScrollTargetPage.setIntValue(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSettledPageState() {
        return this.settledPageState.getIntValue();
    }

    private final void setSettledPageState(int i) {
        this.settledPageState.setIntValue(i);
    }

    public final int getSettledPage() {
        return ((Number) this.settledPage.getValue()).intValue();
    }

    public final int getTargetPage() {
        return ((Number) this.targetPage.getValue()).intValue();
    }

    public final float getCurrentPageOffsetFraction() {
        return this.scrollPosition.getCurrentPageOffsetFraction();
    }

    @NotNull
    /* renamed from: getPrefetchState$foundation_release, reason: from getter */
    public final LazyLayoutPrefetchState getPrefetchState() {
        return this.prefetchState;
    }

    @NotNull
    /* renamed from: getBeyondBoundsInfo$foundation_release, reason: from getter */
    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo() {
        return this.beyondBoundsInfo;
    }

    @NotNull
    /* renamed from: getAwaitLayoutModifier$foundation_release, reason: from getter */
    public final AwaitFirstLayoutModifier getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRemeasurement(Remeasurement remeasurement) {
        this.remeasurement.setValue(remeasurement);
    }

    @Nullable
    public final Remeasurement getRemeasurement$foundation_release() {
        return (Remeasurement) this.remeasurement.getValue();
    }

    @NotNull
    /* renamed from: getRemeasurementModifier$foundation_release, reason: from getter */
    public final RemeasurementModifier getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    /* renamed from: getPremeasureConstraints-msEJaDk$foundation_release, reason: not valid java name and from getter */
    public final long getPremeasureConstraints() {
        return this.premeasureConstraints;
    }

    /* renamed from: setPremeasureConstraints-BRTryo0$foundation_release, reason: not valid java name */
    public final void m8361setPremeasureConstraintsBRTryo0$foundation_release(long j) {
        this.premeasureConstraints = j;
    }

    @NotNull
    /* renamed from: getPinnedPages$foundation_release, reason: from getter */
    public final LazyLayoutPinnedItemList getPinnedPages() {
        return this.pinnedPages;
    }

    @NotNull
    public final IntRange getNearestRange$foundation_release() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    @NotNull
    /* renamed from: getPlacementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final MutableState<Unit> m8358getPlacementScopeInvalidatorzYiylxw$foundation_release() {
        return this.placementScopeInvalidator;
    }

    /* compiled from: PagerState.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.pager.PagerState$scrollToPage$2", m7120f = "PagerState.kt", m7121i = {}, m7122l = {438}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState$scrollToPage$2\n+ 2 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n*L\n1#1,787:1\n772#2,4:788\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState$scrollToPage$2\n*L\n437#1:788,4\n*E\n"})
    /* renamed from: androidx.compose.foundation.pager.PagerState$scrollToPage$2 */
    public static final class C07722 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $page;
        public final /* synthetic */ float $pageOffsetFraction;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07722(float f, int i, Continuation<? super C07722> continuation) {
            super(2, continuation);
            this.$pageOffsetFraction = f;
            this.$page = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PagerState.this.new C07722(this.$pageOffsetFraction, this.$page, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ScrollScope scrollScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C07722) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PagerState pagerState = PagerState.this;
                this.label = 1;
                if (pagerState.awaitScrollDependencies(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            float f = this.$pageOffsetFraction;
            double d = f;
            if (!(-0.5d <= d && d <= 0.5d)) {
                throw new IllegalArgumentException(("pageOffsetFraction " + f + " is not within the range -0.5 to 0.5").toString());
            }
            PagerState.this.snapToItem$foundation_release(PagerState.this.coerceInPageRange(this.$page), this.$pageOffsetFraction);
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Object scrollToPage$default(PagerState pagerState, int i, float f, Continuation continuation, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollToPage");
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        return pagerState.scrollToPage(i, f, continuation);
    }

    @Nullable
    public final Object scrollToPage(int i, float f, @NotNull Continuation<? super Unit> continuation) {
        Object objScroll$default = ScrollableState.scroll$default(this, null, new C07722(f, i, null), continuation, 1, null);
        return objScroll$default == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objScroll$default : Unit.INSTANCE;
    }

    public static /* synthetic */ void updateCurrentPage$default(PagerState pagerState, ScrollScope scrollScope, int i, float f, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateCurrentPage");
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        pagerState.updateCurrentPage(scrollScope, i, f);
    }

    public final void updateCurrentPage(@NotNull ScrollScope scrollScope, int i, float f) {
        this.animatedScrollScope.snapToItem(scrollScope, i, (int) (f * getPageSizeWithSpacing$foundation_release()));
    }

    public final void updateTargetPage(@NotNull ScrollScope scrollScope, int i) {
        setProgrammaticScrollTargetPage(coerceInPageRange(i));
    }

    public final void snapToItem$foundation_release(int page, float offsetFraction) {
        this.scrollPosition.requestPosition(page, offsetFraction);
        Remeasurement remeasurement$foundation_release = getRemeasurement$foundation_release();
        if (remeasurement$foundation_release != null) {
            remeasurement$foundation_release.forceRemeasure();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object animateScrollToPage(int i, float f, @NotNull AnimationSpec<Float> animationSpec, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C07691 c07691;
        PagerState pagerState;
        AnimationSpec<Float> animationSpec2;
        if (continuation instanceof C07691) {
            c07691 = (C07691) continuation;
            int i2 = c07691.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c07691.label = i2 - Integer.MIN_VALUE;
            } else {
                c07691 = new C07691(continuation);
            }
        }
        Object obj = c07691.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c07691.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if ((i == getCurrentPage() && getCurrentPageOffsetFraction() == f) || getPageCount() == 0) {
                return Unit.INSTANCE;
            }
            c07691.L$0 = this;
            c07691.L$1 = animationSpec;
            c07691.I$0 = i;
            c07691.F$0 = f;
            c07691.label = 1;
            if (awaitScrollDependencies(c07691) == coroutine_suspended) {
                return coroutine_suspended;
            }
            pagerState = this;
            animationSpec2 = animationSpec;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            f = c07691.F$0;
            i = c07691.I$0;
            AnimationSpec<Float> animationSpec3 = (AnimationSpec) c07691.L$1;
            PagerState pagerState2 = (PagerState) c07691.L$0;
            ResultKt.throwOnFailure(obj);
            animationSpec2 = animationSpec3;
            pagerState = pagerState2;
        }
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            throw new IllegalArgumentException(("pageOffsetFraction " + f + " is not within the range -0.5 to 0.5").toString());
        }
        int iCoerceInPageRange = pagerState.coerceInPageRange(i);
        int iRoundToInt = MathKt__MathJVMKt.roundToInt(f * pagerState.getPageSizeWithSpacing$foundation_release());
        LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope = pagerState.animatedScrollScope;
        PagerState$animateScrollToPage$3$1 pagerState$animateScrollToPage$3$1 = new PagerState$animateScrollToPage$3$1(pagerState, iCoerceInPageRange, lazyLayoutAnimateScrollScope, iRoundToInt, animationSpec2, null);
        c07691.L$0 = null;
        c07691.L$1 = null;
        c07691.label = 2;
        if (lazyLayoutAnimateScrollScope.scroll(pagerState$animateScrollToPage$3$1, c07691) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateScrollToPage$default(PagerState pagerState, int i, float f, AnimationSpec animationSpec, Continuation continuation, int i2, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateScrollToPage");
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        if ((i2 & 4) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return pagerState.animateScrollToPage(i, f, animationSpec, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitScrollDependencies(Continuation<? super Unit> continuation) throws Throwable {
        Object objWaitForFirstLayout = this.awaitLayoutModifier.waitForFirstLayout(continuation);
        return objWaitForFirstLayout == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWaitForFirstLayout : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object scroll$suspendImpl(PagerState pagerState, MutatePriority mutatePriority, Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) throws Throwable {
        C07711 c07711;
        if (continuation instanceof C07711) {
            c07711 = (C07711) continuation;
            int i = c07711.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c07711.label = i - Integer.MIN_VALUE;
            } else {
                c07711 = pagerState.new C07711(continuation);
            }
        }
        Object obj = c07711.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c07711.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c07711.L$0 = pagerState;
            c07711.L$1 = mutatePriority;
            c07711.L$2 = function2;
            c07711.label = 1;
            if (pagerState.awaitScrollDependencies(c07711) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pagerState = (PagerState) c07711.L$0;
                ResultKt.throwOnFailure(obj);
                pagerState.setProgrammaticScrollTargetPage(-1);
                return Unit.INSTANCE;
            }
            function2 = (Function2) c07711.L$2;
            mutatePriority = (MutatePriority) c07711.L$1;
            pagerState = (PagerState) c07711.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (!pagerState.isScrollInProgress()) {
            pagerState.setSettledPageState(pagerState.getCurrentPage());
        }
        ScrollableState scrollableState = pagerState.scrollableState;
        c07711.L$0 = pagerState;
        c07711.L$1 = null;
        c07711.L$2 = null;
        c07711.label = 2;
        if (scrollableState.scroll(mutatePriority, function2, c07711) == coroutine_suspended) {
            return coroutine_suspended;
        }
        pagerState.setProgrammaticScrollTargetPage(-1);
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float delta) {
        return this.scrollableState.dispatchRawDelta(delta);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    private final void setCanScrollForward(boolean z) {
        this.canScrollForward.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    private final void setCanScrollBackward(boolean z) {
        this.canScrollBackward.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    public static /* synthetic */ void applyMeasureResult$foundation_release$default(PagerState pagerState, PagerMeasureResult pagerMeasureResult, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyMeasureResult");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        pagerState.applyMeasureResult$foundation_release(pagerMeasureResult, z);
    }

    public final void applyMeasureResult$foundation_release(@NotNull PagerMeasureResult result, boolean visibleItemsStayedTheSame) {
        if (visibleItemsStayedTheSame) {
            this.scrollPosition.updateCurrentPageOffsetFraction(result.getCurrentPageOffsetFraction());
        } else {
            this.scrollPosition.updateFromMeasureResult(result);
            cancelPrefetchIfVisibleItemsChanged(result);
        }
        this.pagerLayoutInfoState.setValue(result);
        setCanScrollForward(result.getCanScrollForward());
        setCanScrollBackward(result.getCanScrollBackward());
        this.numMeasurePasses++;
        MeasuredPage firstVisiblePage = result.getFirstVisiblePage();
        if (firstVisiblePage != null) {
            this.firstVisiblePage = firstVisiblePage.getIndex();
        }
        this.firstVisiblePageOffset = result.getFirstVisiblePageScrollOffset();
        tryRunPrefetch(result);
        this.maxScrollOffset = PagerStateKt.calculateNewMaxScrollOffset(result, getPageCount());
    }

    private final void tryRunPrefetch(PagerMeasureResult result) {
        Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
        try {
            Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
            try {
                if (Math.abs(this.previousPassDelta) > 0.5f && this.prefetchingEnabled && isGestureActionMatchesScroll(this.previousPassDelta)) {
                    notifyPrefetch(this.previousPassDelta, result);
                }
                Unit unit = Unit.INSTANCE;
                snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
            } catch (Throwable th) {
                snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                throw th;
            }
        } finally {
            snapshotCreateNonObservableSnapshot.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int coerceInPageRange(int i) {
        if (getPageCount() > 0) {
            return RangesKt___RangesKt.coerceIn(i, 0, getPageCount() - 1);
        }
        return 0;
    }

    private final boolean isGestureActionMatchesScroll(float scrollDelta) {
        if (getLayoutInfo().getOrientation() != Orientation.Vertical ? Math.signum(scrollDelta) != Math.signum(-Offset.m11099getXimpl(m8360getUpDownDifferenceF1C5BW0$foundation_release())) : Math.signum(scrollDelta) != Math.signum(-Offset.m11100getYimpl(m8360getUpDownDifferenceF1C5BW0$foundation_release()))) {
            if (!isNotGestureAction()) {
                return false;
            }
        }
        return true;
    }

    private final boolean isNotGestureAction() {
        return ((int) Offset.m11099getXimpl(m8360getUpDownDifferenceF1C5BW0$foundation_release())) == 0 && ((int) Offset.m11100getYimpl(m8360getUpDownDifferenceF1C5BW0$foundation_release())) == 0;
    }

    private final void notifyPrefetch(float delta, PagerLayoutInfo info) {
        int index;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        if (this.prefetchingEnabled && (!info.getVisiblePagesInfo().isEmpty())) {
            boolean z = delta > 0.0f;
            if (z) {
                index = ((PageInfo) CollectionsKt___CollectionsKt.last((List) info.getVisiblePagesInfo())).getIndex() + info.getBeyondBoundsPageCount() + 1;
            } else {
                index = (((PageInfo) CollectionsKt___CollectionsKt.first((List) info.getVisiblePagesInfo())).getIndex() - info.getBeyondBoundsPageCount()) - 1;
            }
            if (index == this.indexToPrefetch || index < 0 || index >= getPageCount()) {
                return;
            }
            if (this.wasPrefetchingForward != z && (prefetchHandle = this.currentPrefetchHandle) != null) {
                prefetchHandle.cancel();
            }
            this.wasPrefetchingForward = z;
            this.indexToPrefetch = index;
            this.currentPrefetchHandle = this.prefetchState.m8288schedulePrefetch0kLqBqw(index, this.premeasureConstraints);
        }
    }

    private final void cancelPrefetchIfVisibleItemsChanged(PagerLayoutInfo info) {
        int index;
        if (this.indexToPrefetch == -1 || !(!info.getVisiblePagesInfo().isEmpty())) {
            return;
        }
        if (this.wasPrefetchingForward) {
            index = ((PageInfo) CollectionsKt___CollectionsKt.last((List) info.getVisiblePagesInfo())).getIndex() + info.getBeyondBoundsPageCount() + 1;
        } else {
            index = (((PageInfo) CollectionsKt___CollectionsKt.first((List) info.getVisiblePagesInfo())).getIndex() - info.getBeyondBoundsPageCount()) - 1;
        }
        if (this.indexToPrefetch != index) {
            this.indexToPrefetch = -1;
            LazyLayoutPrefetchState.PrefetchHandle prefetchHandle = this.currentPrefetchHandle;
            if (prefetchHandle != null) {
                prefetchHandle.cancel();
            }
            this.currentPrefetchHandle = null;
        }
    }

    public final float getOffsetFractionForPage(int page) {
        if (page < 0 || page > getPageCount()) {
            throw new IllegalArgumentException(("page " + page + " is not within the range 0 to " + getPageCount()).toString());
        }
        return (getCurrentPage() - page) + getCurrentPageOffsetFraction();
    }

    public static /* synthetic */ int matchScrollPositionWithKey$foundation_release$default(PagerState pagerState, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: matchScrollPositionWithKey");
        }
        if ((i2 & 2) != 0) {
            Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
            try {
                Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                try {
                    int currentPage = pagerState.scrollPosition.getCurrentPage();
                    snapshotCreateNonObservableSnapshot.dispose();
                    i = currentPage;
                } finally {
                    snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                }
            } catch (Throwable th) {
                snapshotCreateNonObservableSnapshot.dispose();
                throw th;
            }
        }
        return pagerState.matchScrollPositionWithKey$foundation_release(pagerLazyLayoutItemProvider, i);
    }

    public final int matchScrollPositionWithKey$foundation_release(@NotNull PagerLazyLayoutItemProvider itemProvider, int currentPage) {
        return this.scrollPosition.matchPageWithKey(itemProvider, currentPage);
    }
}
