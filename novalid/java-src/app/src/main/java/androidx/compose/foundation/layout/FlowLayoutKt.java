package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.CrossAxisAlignment;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.collection.MutableVector;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.apache.ivy.osgi.p063p2.P2CompositeParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FlowLayout.kt */
@Metadata(m7104d1 = {"\u0000\u0090\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aT\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\u000e¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0087\b¢\u0006\u0002\u0010\u0012\u001aT\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\f2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\u000e¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0087\b¢\u0006\u0002\u0010\u0016\u001a%\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\u001a\u001a\u0080\u0001\u0010\u001b\u001a\u00020\f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2#\u0010\u001f\u001a\u001f\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0 ¢\u0006\u0002\b\u00112#\u0010!\u001a\u001f\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0 ¢\u0006\u0002\b\u00112\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\fH\u0002\u001aF\u0010\u001b\u001a\u00020\f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\fH\u0002\u001aS\u0010(\u001a\u00020\f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2#\u0010\u001f\u001a\u001f\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0 ¢\u0006\u0002\b\u00112\u0006\u0010)\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\fH\u0002\u001a\u0080\u0001\u0010*\u001a\u00020\f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2#\u0010\u001f\u001a\u001f\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0 ¢\u0006\u0002\b\u00112#\u0010!\u001a\u001f\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0 ¢\u0006\u0002\b\u00112\u0006\u0010)\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\fH\u0002\u001a%\u0010+\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\fH\u0001¢\u0006\u0002\u0010,\u001a6\u0010-\u001a\u00020.*\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u0010\u0019\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001a\u001c\u00108\u001a\u00020\f*\u0002092\u0006\u00102\u001a\u0002032\u0006\u0010\u001f\u001a\u00020\fH\u0000\u001a\u0014\u0010!\u001a\u00020\f*\u00020:2\u0006\u00102\u001a\u000203H\u0000\u001a\u001c\u0010;\u001a\u00020\f*\u0002092\u0006\u00102\u001a\u0002032\u0006\u0010!\u001a\u00020\fH\u0000\u001a\u0014\u0010\u001f\u001a\u00020\f*\u00020:2\u0006\u00102\u001a\u000203H\u0000\u001a<\u0010<\u001a\u00020\f*\u0002092\u0006\u00104\u001a\u0002052\u0006\u00102\u001a\u0002032\u0014\u0010=\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010:\u0012\u0004\u0012\u00020\u00040\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b>\u0010?\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006@"}, m7105d2 = {"CROSS_AXIS_ALIGNMENT_START", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "CROSS_AXIS_ALIGNMENT_TOP", "FlowColumn", "", "modifier", "Landroidx/compose/ui/Modifier;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "maxItemsInEachColumn", "", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/FlowColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "FlowRow", "maxItemsInEachRow", "Landroidx/compose/foundation/layout/FlowRowScope;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "columnMeasurementHelper", "Landroidx/compose/ui/layout/MeasurePolicy;", "maxItemsInMainAxis", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "intrinsicCrossAxisSize", P2CompositeParser.ChildrenHandler.CHILDREN, "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "mainAxisSize", "Lkotlin/Function3;", "crossAxisSize", "mainAxisAvailable", "mainAxisSpacing", "crossAxisSpacing", "mainAxisSizes", "", "crossAxisSizes", "maxIntrinsicMainAxisSize", "crossAxisAvailable", "minIntrinsicMainAxisSize", "rowMeasurementHelper", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "breakDownItems", "Landroidx/compose/foundation/layout/FlowResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measureHelper", "Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;", "orientation", "Landroidx/compose/foundation/layout/LayoutOrientation;", "constraints", "Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "breakDownItems-w1Onq5I", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;Landroidx/compose/foundation/layout/LayoutOrientation;JI)Landroidx/compose/foundation/layout/FlowResult;", "crossAxisMin", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/Placeable;", "mainAxisMin", "measureAndCache", "storePlaceable", "measureAndCache-6m2dt9o", "(Landroidx/compose/ui/layout/Measurable;JLandroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function1;)I", "foundation-layout_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 9 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n1#1,757:1\n79#2,11:758\n92#2:789\n79#2,11:790\n92#2:821\n456#3,8:769\n464#3,6:783\n456#3,8:801\n464#3,6:815\n67#3,3:822\n66#3:825\n67#3,3:832\n66#3:835\n3737#4,6:777\n3737#4,6:809\n1116#5,6:826\n1116#5,6:836\n69#6,6:842\n69#6,6:849\n1#7:848\n1208#8:855\n1187#8,2:856\n322#9:858\n321#9:859\n324#9:860\n323#9:861\n321#9:862\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n*L\n72#1:758,11\n72#1:789\n122#1:790,11\n122#1:821\n72#1:769,8\n72#1:783,6\n122#1:801,8\n122#1:815,6\n158#1:822,3\n158#1:825\n179#1:832,3\n179#1:835\n72#1:777,6\n122#1:809,6\n158#1:826,6\n179#1:836,6\n447#1:842,6\n568#1:849,6\n608#1:855\n608#1:856,2\n609#1:858\n610#1:859\n611#1:860\n688#1:861\n689#1:862\n*E\n"})
/* loaded from: classes.dex */
public final class FlowLayoutKt {

    @NotNull
    private static final CrossAxisAlignment CROSS_AXIS_ALIGNMENT_START;

    @NotNull
    private static final CrossAxisAlignment CROSS_AXIS_ALIGNMENT_TOP;

    @Composable
    @ExperimentalLayoutApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void FlowRow(@Nullable Modifier modifier, @Nullable Arrangement.Horizontal horizontal, @Nullable Arrangement.Vertical vertical, int i, @NotNull Function3<? super FlowRowScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1098475987);
        if ((i3 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if ((i3 & 2) != 0) {
            horizontal = Arrangement.INSTANCE.getStart();
        }
        if ((i3 & 4) != 0) {
            vertical = Arrangement.INSTANCE.getTop();
        }
        if ((i3 & 8) != 0) {
            i = Integer.MAX_VALUE;
        }
        MeasurePolicy measurePolicyRowMeasurementHelper = rowMeasurementHelper(horizontal, vertical, i, composer, (i2 >> 3) & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer);
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurementHelper, companion.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        function3.invoke(FlowRowScopeInstance.INSTANCE, composer, Integer.valueOf(((i2 >> 9) & 112) | 6));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    @ExperimentalLayoutApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void FlowColumn(@Nullable Modifier modifier, @Nullable Arrangement.Vertical vertical, @Nullable Arrangement.Horizontal horizontal, int i, @NotNull Function3<? super FlowColumnScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-310290901);
        if ((i3 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if ((i3 & 2) != 0) {
            vertical = Arrangement.INSTANCE.getTop();
        }
        if ((i3 & 4) != 0) {
            horizontal = Arrangement.INSTANCE.getStart();
        }
        if ((i3 & 8) != 0) {
            i = Integer.MAX_VALUE;
        }
        MeasurePolicy measurePolicyColumnMeasurementHelper = columnMeasurementHelper(vertical, horizontal, i, composer, (i2 >> 3) & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer);
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurementHelper, companion.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        function3.invoke(FlowColumnScopeInstance.INSTANCE, composer, Integer.valueOf(((i2 >> 9) & 112) | 6));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    @PublishedApi
    @NotNull
    public static final MeasurePolicy rowMeasurementHelper(@NotNull Arrangement.Horizontal horizontal, @NotNull Arrangement.Vertical vertical, int i, @Nullable Composer composer, int i2) {
        composer.startReplaceableGroup(1479255111);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1479255111, i2, -1, "androidx.compose.foundation.layout.rowMeasurementHelper (FlowLayout.kt:156)");
        }
        Integer numValueOf = Integer.valueOf(i);
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(numValueOf) | composer.changed(horizontal) | composer.changed(vertical);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new FlowMeasurePolicy(LayoutOrientation.Horizontal, horizontal, vertical, horizontal.getSpacing(), SizeMode.Wrap, CROSS_AXIS_ALIGNMENT_TOP, vertical.getSpacing(), i, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        FlowMeasurePolicy flowMeasurePolicy = (FlowMeasurePolicy) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return flowMeasurePolicy;
    }

    @Composable
    @PublishedApi
    @NotNull
    public static final MeasurePolicy columnMeasurementHelper(@NotNull Arrangement.Vertical vertical, @NotNull Arrangement.Horizontal horizontal, int i, @Nullable Composer composer, int i2) {
        composer.startReplaceableGroup(-2013098357);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2013098357, i2, -1, "androidx.compose.foundation.layout.columnMeasurementHelper (FlowLayout.kt:177)");
        }
        Integer numValueOf = Integer.valueOf(i);
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(numValueOf) | composer.changed(vertical) | composer.changed(horizontal);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new FlowMeasurePolicy(LayoutOrientation.Vertical, horizontal, vertical, vertical.getSpacing(), SizeMode.Wrap, CROSS_AXIS_ALIGNMENT_START, horizontal.getSpacing(), i, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        FlowMeasurePolicy flowMeasurePolicy = (FlowMeasurePolicy) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return flowMeasurePolicy;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function3, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function32, int i, int i2, int i3, int i4) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr[i5] = 0;
        }
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        for (int i6 = 0; i6 < size2; i6++) {
            iArr2[i6] = 0;
        }
        int size3 = list.size();
        for (int i7 = 0; i7 < size3; i7++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i7);
            int iIntValue = function3.invoke(intrinsicMeasurable, Integer.valueOf(i7), Integer.valueOf(i)).intValue();
            iArr[i7] = iIntValue;
            iArr2[i7] = function32.invoke(intrinsicMeasurable, Integer.valueOf(i7), Integer.valueOf(iIntValue)).intValue();
        }
        int iSum = ArraysKt___ArraysKt.sum(iArr);
        if (size2 != 0) {
            int iIntrinsicCrossAxisSize = iArr2[0];
            ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(iArr2)).iterator();
            while (it.hasNext()) {
                int i8 = iArr2[it.nextInt()];
                if (iIntrinsicCrossAxisSize < i8) {
                    iIntrinsicCrossAxisSize = i8;
                }
            }
            if (size != 0) {
                int i9 = iArr[0];
                ?? it2 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(iArr)).iterator();
                while (it2.hasNext()) {
                    int i10 = iArr[it2.nextInt()];
                    if (i9 < i10) {
                        i9 = i10;
                    }
                }
                int i11 = iSum;
                while (i9 < i11 && iIntrinsicCrossAxisSize != i) {
                    int i12 = (i9 + i11) / 2;
                    iIntrinsicCrossAxisSize = intrinsicCrossAxisSize(list, iArr, iArr2, i12, i2, i3, i4);
                    if (iIntrinsicCrossAxisSize == i) {
                        return i12;
                    }
                    if (iIntrinsicCrossAxisSize > i) {
                        i9 = i12 + 1;
                    } else {
                        i11 = i12 - 1;
                    }
                    iSum = i12;
                }
                return iSum;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    /* compiled from: FlowLayout.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", FirebaseAnalytics.Param.INDEX, "<anonymous parameter 1>", "invoke", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;II)Ljava/lang/Integer;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.layout.FlowLayoutKt$intrinsicCrossAxisSize$1 */
    public static final class C05371 extends Lambda implements Function3<IntrinsicMeasurable, Integer, Integer, Integer> {
        public final /* synthetic */ int[] $mainAxisSizes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05371(int[] iArr) {
            super(3);
            iArr = iArr;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
            return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
        }

        @NotNull
        public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i, int i2) {
            return Integer.valueOf(iArr[i]);
        }
    }

    /* compiled from: FlowLayout.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", FirebaseAnalytics.Param.INDEX, "<anonymous parameter 1>", "invoke", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;II)Ljava/lang/Integer;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.layout.FlowLayoutKt$intrinsicCrossAxisSize$2 */
    public static final class C05382 extends Lambda implements Function3<IntrinsicMeasurable, Integer, Integer, Integer> {
        public final /* synthetic */ int[] $crossAxisSizes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05382(int[] iArr) {
            super(3);
            iArr = iArr;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
            return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
        }

        @NotNull
        public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i, int i2) {
            return Integer.valueOf(iArr[i]);
        }
    }

    private static final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, int[] iArr, int[] iArr2, int i, int i2, int i3, int i4) {
        return intrinsicCrossAxisSize(list, new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt.intrinsicCrossAxisSize.1
            public final /* synthetic */ int[] $mainAxisSizes;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05371(int[] iArr3) {
                super(3);
                iArr = iArr3;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i5, int i22) {
                return Integer.valueOf(iArr[i5]);
            }
        }, new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt.intrinsicCrossAxisSize.2
            public final /* synthetic */ int[] $crossAxisSizes;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05382(int[] iArr22) {
                super(3);
                iArr = iArr22;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i5, int i22) {
                return Integer.valueOf(iArr[i5]);
            }
        }, i, i2, i3, i4);
    }

    public static final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function3, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function32, int i, int i2, int i3, int i4) {
        if (list.isEmpty()) {
            return 0;
        }
        Object orNull = CollectionsKt___CollectionsKt.getOrNull(list, 0);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) orNull;
        int iIntValue = intrinsicMeasurable != null ? function32.invoke(intrinsicMeasurable, 0, Integer.valueOf(i)).intValue() : 0;
        int iIntValue2 = intrinsicMeasurable != null ? function3.invoke(intrinsicMeasurable, 0, Integer.valueOf(iIntValue)).intValue() : 0;
        int size = list.size();
        int i5 = i;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i6 < size) {
            list.get(i6);
            Intrinsics.checkNotNull(orNull);
            i5 -= iIntValue2;
            int iMax = Math.max(i8, iIntValue);
            i6++;
            Object orNull2 = CollectionsKt___CollectionsKt.getOrNull(list, i6);
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) orNull2;
            int iIntValue3 = intrinsicMeasurable2 != null ? function32.invoke(intrinsicMeasurable2, Integer.valueOf(i6), Integer.valueOf(i)).intValue() : 0;
            int iIntValue4 = intrinsicMeasurable2 != null ? function3.invoke(intrinsicMeasurable2, Integer.valueOf(i6), Integer.valueOf(iIntValue3)).intValue() + i2 : 0;
            if (i5 >= 0 && i6 != list.size()) {
                if (i6 - i9 == i4 || i5 - iIntValue4 < 0) {
                }
                int i10 = iIntValue3;
                i8 = iMax;
                orNull = orNull2;
                iIntValue2 = iIntValue4;
                iIntValue = i10;
            }
            i7 += iMax + i3;
            iIntValue4 -= i2;
            i5 = i;
            iMax = 0;
            i9 = i6;
            int i102 = iIntValue3;
            i8 = iMax;
            orNull = orNull2;
            iIntValue2 = iIntValue4;
            iIntValue = i102;
        }
        return i7 - i3;
    }

    public static final int mainAxisMin(@NotNull Measurable measurable, @NotNull LayoutOrientation layoutOrientation, int i) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return measurable.minIntrinsicWidth(i);
        }
        return measurable.minIntrinsicHeight(i);
    }

    public static final int crossAxisMin(@NotNull Measurable measurable, @NotNull LayoutOrientation layoutOrientation, int i) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return measurable.minIntrinsicHeight(i);
        }
        return measurable.minIntrinsicWidth(i);
    }

    public static final int mainAxisSize(@NotNull Placeable placeable, @NotNull LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? placeable.getWidth() : placeable.getHeight();
    }

    public static final int crossAxisSize(@NotNull Placeable placeable, @NotNull LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? placeable.getHeight() : placeable.getWidth();
    }

    static {
        CrossAxisAlignment.Companion companion = CrossAxisAlignment.INSTANCE;
        Alignment.Companion companion2 = Alignment.INSTANCE;
        CROSS_AXIS_ALIGNMENT_TOP = companion.vertical$foundation_layout_release(companion2.getTop());
        CROSS_AXIS_ALIGNMENT_START = companion.horizontal$foundation_layout_release(companion2.getStart());
    }

    /* renamed from: measureAndCache-6m2dt9o */
    private static final int m8068measureAndCache6m2dt9o(Measurable measurable, long j, LayoutOrientation layoutOrientation, Function1<? super Placeable, Unit> function1) {
        if (RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(measurable)) == 0.0f) {
            Placeable placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(OrientationIndependentConstraints.m8105toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m8094copyyUG9Ft0$default(j, 0, 0, 0, 0, 14, null), layoutOrientation));
            function1.invoke(placeableMo12610measureBRTryo0);
            return mainAxisSize(placeableMo12610measureBRTryo0, layoutOrientation);
        }
        return mainAxisMin(measurable, layoutOrientation, Integer.MAX_VALUE);
    }

    public static final int maxIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function3, int i, int i2, int i3) {
        int size = list.size();
        int i4 = 0;
        int iMax = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < size) {
            int iIntValue = function3.invoke(list.get(i4), Integer.valueOf(i4), Integer.valueOf(i)).intValue() + i2;
            int i7 = i4 + 1;
            if (i7 - i5 == i3 || i7 == list.size()) {
                iMax = Math.max(iMax, (i6 + iIntValue) - i2);
                i6 = 0;
                i5 = i4;
            } else {
                i6 += iIntValue;
            }
            i4 = i7;
        }
        return iMax;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    @NotNull
    /* renamed from: breakDownItems-w1Onq5I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final FlowResult m8067breakDownItemsw1Onq5I(@NotNull MeasureScope measureScope, @NotNull RowColumnMeasurementHelper rowColumnMeasurementHelper, @NotNull LayoutOrientation layoutOrientation, long j, int i) {
        MutableVector mutableVector = new MutableVector(new RowColumnMeasureHelperResult[16], 0);
        int iM13622getMaxWidthimpl = Constraints.m13622getMaxWidthimpl(j);
        int iM13624getMinWidthimpl = Constraints.m13624getMinWidthimpl(j);
        int iM13621getMaxHeightimpl = Constraints.m13621getMaxHeightimpl(j);
        List<Measurable> measurables = rowColumnMeasurementHelper.getMeasurables();
        final Placeable[] placeables = rowColumnMeasurementHelper.getPlaceables();
        int iCeil = (int) Math.ceil(measureScope.mo7874toPx0680j_4(rowColumnMeasurementHelper.getArrangementSpacing()));
        long jM8090constructorimpl = OrientationIndependentConstraints.m8090constructorimpl(iM13624getMinWidthimpl, iM13622getMaxWidthimpl, 0, iM13621getMaxHeightimpl);
        Measurable measurable = (Measurable) CollectionsKt___CollectionsKt.getOrNull(measurables, 0);
        Integer numValueOf = measurable != null ? Integer.valueOf(m8068measureAndCache6m2dt9o(measurable, jM8090constructorimpl, layoutOrientation, new Function1<Placeable, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$nextSize$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable placeable) {
                invoke2(placeable);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Placeable placeable) {
                placeables[0] = placeable;
            }
        })) : null;
        Integer[] numArr = new Integer[measurables.size()];
        int size = measurables.size();
        int i2 = iM13622getMaxWidthimpl;
        final int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i3 < size) {
            Intrinsics.checkNotNull(numValueOf);
            int iIntValue = numValueOf.intValue();
            int i7 = i4 + iIntValue;
            i2 -= iIntValue;
            int i8 = i3 + 1;
            Measurable measurable2 = (Measurable) CollectionsKt___CollectionsKt.getOrNull(measurables, i8);
            int i9 = size;
            Integer numValueOf2 = measurable2 != null ? Integer.valueOf(m8068measureAndCache6m2dt9o(measurable2, jM8090constructorimpl, layoutOrientation, new Function1<Placeable, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable placeable) {
                    invoke2(placeable);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable Placeable placeable) {
                    placeables[i3 + 1] = placeable;
                }
            }) + iCeil) : null;
            if (i8 >= measurables.size() || i8 - i5 >= i) {
                iM13624getMinWidthimpl = Math.min(Math.max(iM13624getMinWidthimpl, i7), iM13622getMaxWidthimpl);
                numArr[i6] = Integer.valueOf(i8);
                i6++;
                numValueOf2 = numValueOf2 != null ? Integer.valueOf(numValueOf2.intValue() - iCeil) : null;
                i2 = iM13622getMaxWidthimpl;
                i5 = i8;
                i7 = 0;
            } else {
                if (i2 - (numValueOf2 != null ? numValueOf2.intValue() : 0) < 0) {
                }
            }
            i3 = i8;
            size = i9;
            numValueOf = numValueOf2;
            i4 = i7;
        }
        long jM8105toBoxConstraintsOenEA2s = OrientationIndependentConstraints.m8105toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m8094copyyUG9Ft0$default(jM8090constructorimpl, iM13624getMinWidthimpl, 0, 0, 0, 14, null), layoutOrientation);
        int crossAxisSize = 0;
        int iIntValue2 = 0;
        Integer num = (Integer) ArraysKt___ArraysKt.getOrNull(numArr, 0);
        int iMax = iM13624getMinWidthimpl;
        int i10 = 0;
        while (num != null) {
            Integer[] numArr2 = numArr;
            RowColumnMeasureHelperResult rowColumnMeasureHelperResultM8152measureWithoutPlacing_EkL_Y = rowColumnMeasurementHelper.m8152measureWithoutPlacing_EkL_Y(measureScope, jM8105toBoxConstraintsOenEA2s, iIntValue2, num.intValue());
            crossAxisSize += rowColumnMeasureHelperResultM8152measureWithoutPlacing_EkL_Y.getCrossAxisSize();
            iMax = Math.max(iMax, rowColumnMeasureHelperResultM8152measureWithoutPlacing_EkL_Y.getMainAxisSize());
            mutableVector.add(rowColumnMeasureHelperResultM8152measureWithoutPlacing_EkL_Y);
            iIntValue2 = num.intValue();
            i10++;
            num = (Integer) ArraysKt___ArraysKt.getOrNull(numArr2, i10);
            numArr = numArr2;
        }
        return new FlowResult(Math.max(iMax, Constraints.m13624getMinWidthimpl(j)), Math.max(crossAxisSize, Constraints.m13623getMinHeightimpl(j)), mutableVector);
    }
}
