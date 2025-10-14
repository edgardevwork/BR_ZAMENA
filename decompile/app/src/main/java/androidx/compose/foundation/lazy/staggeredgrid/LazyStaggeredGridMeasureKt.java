package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.exifinterface.media.ExifInterface;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyStaggeredGridMeasure.kt */
@Metadata(m7104d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0082\b\u001a5\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H\n0\u000e¢\u0006\u0002\b\u000fH\u0083\b¢\u0006\u0002\u0010\u0010\u001aR\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u000e2!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u001a\u001a\u00020\u0001H\u0083\b\u001a;\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u00142\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010\"\u001a\u001d\u0010#\u001a\u00020\b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001e0\u001dH\u0002¢\u0006\u0002\u0010$\u001a\u001c\u0010%\u001a\u00020\u0005*\u00020\u00142\u0006\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020\u0003H\u0002\u001a7\u0010(\u001a\u00020\u0005\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00122\b\b\u0002\u0010)\u001a\u00020\u00012\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00050\u000eH\u0082\b\u001a\u001c\u0010+\u001a\u00020\u0003*\u00020\u00142\u0006\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0003H\u0002\u001a+\u0010.\u001a\u00020\u0005*\u00020/2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u000eH\u0082\bø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a\f\u00102\u001a\u00020\u0003*\u00020 H\u0002\u001a2\u00103\u001a\u00020\u0003\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u001d2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00030\u000eH\u0082\b¢\u0006\u0002\u00104\u001a\u0016\u00105\u001a\u00020\u0003*\u00020 2\b\b\u0002\u00106\u001a\u00020\u0003H\u0000\u001a\u001e\u00107\u001a\u00020\u0003*\u00020 2\u0006\u00108\u001a\u00020/H\u0002ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a,\u0010;\u001a\u00020<*\u00020\u00142\u0006\u0010=\u001a\u00020\u00032\u0006\u0010>\u001a\u00020 2\u0006\u0010?\u001a\u00020 2\u0006\u0010@\u001a\u00020\u0001H\u0003\u001a\u0084\u0001\u0010A\u001a\u00020<*\u00020\f2\u0006\u0010B\u001a\u00020C2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\u00012\u0006\u0010L\u001a\u00020\u00012\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\u00032\u0006\u0010P\u001a\u00020\u00032\u0006\u0010Q\u001a\u00020\u00032\u0006\u0010R\u001a\u00020\u00032\u0006\u0010S\u001a\u00020TH\u0001ø\u0001\u0000¢\u0006\u0004\bU\u0010V\u001a\u0014\u0010W\u001a\u00020\u0005*\u00020 2\u0006\u0010X\u001a\u00020\u0003H\u0002\u001a!\u0010Y\u001a\u00020 *\u00020 2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000eH\u0082\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Z"}, m7105d2 = {"DebugLoggingEnabled", "", "Unset", "", "debugLog", "", ThrowableDeserializer.PROP_NAME_MESSAGE, "Lkotlin/Function0;", "", "withDebugLogging", ExifInterface.GPS_DIRECTION_TRUE, PomReader.SCOPE, "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "calculateExtraItems", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "position", "filter", "Lkotlin/ParameterName;", "name", "itemIndex", "beforeVisibleBounds", "calculateVisibleItems", "measuredItems", "", "Lkotlin/collections/ArrayDeque;", "itemScrollOffsets", "", "mainAxisLayoutSize", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[Lkotlin/collections/ArrayDeque;[II)Ljava/util/List;", "debugRender", "([Lkotlin/collections/ArrayDeque;)Ljava/lang/String;", "ensureIndicesInRange", "indices", "itemCount", "fastForEach", "reverse", "action", "findPreviousItemIndex", "item", "lane", "forEach", "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "forEach-nIS5qE8", "(JLkotlin/jvm/functions/Function1;)V", "indexOfMaxValue", "indexOfMinBy", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)I", "indexOfMinValue", "minBound", "maxInRange", "indexRange", "maxInRange-jy6DScQ", "([IJ)I", "measure", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "initialScrollDelta", "initialItemIndices", "initialItemOffsets", "canRestartMeasure", "measureStaggeredGrid", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "pinnedItems", "itemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "resolvedSlots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "isVertical", "reverseLayout", "contentOffset", "Landroidx/compose/ui/unit/IntOffset;", "mainAxisAvailableSize", "mainAxisSpacing", "beforeContentPadding", "afterContentPadding", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "measureStaggeredGrid-sdzDtKU", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;JZZJIIIILkotlinx/coroutines/CoroutineScope;)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "offsetBy", "delta", "transform", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 4 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n+ 5 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1225:1\n51#1,9:1236\n73#1,4:1245\n957#1:1262\n958#1,3:1267\n73#1,4:1270\n73#1,4:1274\n73#1,4:1278\n957#1:1289\n958#1,3:1294\n73#1,4:1305\n73#1,4:1309\n957#1:1330\n958#1,3:1335\n73#1,4:1340\n73#1,4:1346\n73#1,4:1350\n957#1:1371\n958#1,3:1376\n73#1,4:1379\n73#1,4:1383\n1017#1,4:1387\n73#1,4:1391\n73#1,4:1395\n926#1,3:1399\n944#1:1402\n929#1:1407\n930#1,9:1410\n945#1:1426\n940#1:1427\n926#1,3:1428\n944#1:1431\n929#1:1436\n930#1,9:1439\n945#1:1455\n940#1:1456\n73#1,4:1457\n61#1:1465\n990#1,11:1469\n957#1:1480\n958#1,3:1485\n944#1:1488\n945#1:1501\n957#1:1530\n958#1,3:1535\n495#2,4:1226\n500#2:1235\n129#3,5:1230\n239#4:1249\n236#4:1250\n236#4:1256\n239#4:1282\n236#4:1283\n236#4:1299\n239#4:1317\n236#4:1318\n236#4:1324\n239#4:1358\n236#4:1359\n236#4:1365\n953#5:1251\n952#5:1252\n951#5:1254\n953#5:1257\n952#5:1258\n951#5:1260\n951#5:1263\n952#5:1265\n953#5:1284\n952#5:1285\n951#5:1287\n951#5:1290\n952#5:1292\n951#5:1297\n953#5:1300\n952#5:1301\n951#5:1303\n953#5:1319\n952#5:1320\n951#5:1322\n953#5:1325\n952#5:1326\n951#5:1328\n951#5:1331\n952#5:1333\n951#5:1338\n953#5:1360\n952#5:1361\n951#5:1363\n953#5:1366\n952#5:1367\n951#5:1369\n951#5:1372\n952#5:1374\n951#5:1481\n952#5:1483\n951#5:1526\n952#5:1528\n951#5:1531\n952#5:1533\n62#6:1253\n55#6:1255\n62#6:1259\n55#6:1261\n55#6:1264\n62#6:1266\n62#6:1286\n55#6:1288\n55#6:1291\n62#6:1293\n55#6:1298\n62#6:1302\n55#6:1304\n62#6:1321\n55#6:1323\n62#6:1327\n55#6:1329\n55#6:1332\n62#6:1334\n55#6:1339\n62#6:1362\n55#6:1364\n62#6:1368\n55#6:1370\n55#6:1373\n62#6:1375\n55#6:1482\n62#6:1484\n55#6:1527\n62#6:1529\n55#6:1532\n62#6:1534\n12774#7,2:1313\n12541#7,2:1315\n12774#7,2:1344\n12583#7,2:1354\n12774#7,2:1356\n12583#7,2:1408\n12583#7,2:1437\n12774#7,2:1461\n12583#7,2:1463\n12744#7,2:1467\n51#8,4:1403\n56#8:1419\n33#8,6:1420\n51#8,4:1432\n56#8:1448\n33#8,6:1449\n51#8,6:1489\n33#8,6:1495\n51#8,6:1502\n33#8,6:1508\n51#8,6:1514\n33#8,6:1520\n1#9:1466\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt\n*L\n249#1:1236,9\n312#1:1245,4\n357#1:1262\n357#1:1267,3\n369#1:1270,4\n411#1:1274,4\n450#1:1278,4\n478#1:1289\n478#1:1294,3\n502#1:1305,4\n505#1:1309,4\n538#1:1330\n538#1:1335,3\n559#1:1340,4\n582#1:1346,4\n585#1:1350,4\n657#1:1371\n657#1:1376,3\n695#1:1379,4\n698#1:1383,4\n715#1:1387,4\n719#1:1391,4\n741#1:1395,4\n771#1:1399,3\n771#1:1402\n771#1:1407\n771#1:1410,9\n771#1:1426\n771#1:1427\n801#1:1428,3\n801#1:1431\n801#1:1436\n801#1:1439,9\n801#1:1455\n801#1:1456\n832#1:1457,4\n249#1:1465\n890#1:1469,11\n913#1:1480\n913#1:1485,3\n928#1:1488\n928#1:1501\n970#1:1530\n970#1:1535,3\n114#1:1226,4\n114#1:1235\n114#1:1230,5\n349#1:1249\n349#1:1250\n356#1:1256\n476#1:1282\n476#1:1283\n495#1:1299\n529#1:1317\n529#1:1318\n533#1:1324\n649#1:1358\n649#1:1359\n656#1:1365\n349#1:1251\n349#1:1252\n349#1:1254\n356#1:1257\n356#1:1258\n356#1:1260\n357#1:1263\n357#1:1265\n476#1:1284\n476#1:1285\n476#1:1287\n478#1:1290\n478#1:1292\n486#1:1297\n495#1:1300\n495#1:1301\n495#1:1303\n529#1:1319\n529#1:1320\n529#1:1322\n533#1:1325\n533#1:1326\n533#1:1328\n538#1:1331\n538#1:1333\n550#1:1338\n649#1:1360\n649#1:1361\n649#1:1363\n656#1:1366\n656#1:1367\n656#1:1369\n657#1:1372\n657#1:1374\n913#1:1481\n913#1:1483\n957#1:1526\n957#1:1528\n970#1:1531\n970#1:1533\n349#1:1253\n349#1:1255\n356#1:1259\n356#1:1261\n357#1:1264\n357#1:1266\n476#1:1286\n476#1:1288\n478#1:1291\n478#1:1293\n486#1:1298\n495#1:1302\n495#1:1304\n529#1:1321\n529#1:1323\n533#1:1327\n533#1:1329\n538#1:1332\n538#1:1334\n550#1:1339\n649#1:1362\n649#1:1364\n656#1:1368\n656#1:1370\n657#1:1373\n657#1:1375\n913#1:1482\n913#1:1484\n957#1:1527\n957#1:1529\n970#1:1532\n970#1:1534\n514#1:1313,2\n517#1:1315,2\n578#1:1344,2\n592#1:1354,2\n600#1:1356,2\n784#1:1408,2\n817#1:1437,2\n850#1:1461,2\n851#1:1463,2\n888#1:1467,2\n771#1:1403,4\n771#1:1419\n771#1:1420,6\n801#1:1432,4\n801#1:1448\n801#1:1449,6\n928#1:1489,6\n928#1:1495,6\n944#1:1502,6\n944#1:1508,6\n944#1:1514,6\n944#1:1520,6\n*E\n"})
/* loaded from: classes2.dex */
public final class LazyStaggeredGridMeasureKt {
    private static final boolean DebugLoggingEnabled = false;
    private static final int Unset = Integer.MIN_VALUE;

    private static final void debugLog(Function0<String> function0) {
    }

    @ExperimentalFoundationApi
    private static final <T> T withDebugLogging(LazyLayoutMeasureScope lazyLayoutMeasureScope, Function1<? super LazyLayoutMeasureScope, ? extends T> function1) {
        return function1.invoke(lazyLayoutMeasureScope);
    }

    private static final String debugRender(ArrayDeque<LazyStaggeredGridMeasuredItem>[] arrayDequeArr) {
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ExperimentalFoundationApi
    @NotNull
    /* renamed from: measureStaggeredGrid-sdzDtKU, reason: not valid java name */
    public static final LazyStaggeredGridMeasureResult m8324measureStaggeredGridsdzDtKU(@NotNull LazyLayoutMeasureScope lazyLayoutMeasureScope, @NotNull LazyStaggeredGridState lazyStaggeredGridState, @NotNull List<Integer> list, @NotNull LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, @NotNull LazyStaggeredGridSlots lazyStaggeredGridSlots, long j, boolean z, boolean z2, long j2, int i, int i2, int i3, int i4, @NotNull CoroutineScope coroutineScope) {
        T t;
        int iM8323maxInRangejy6DScQ;
        T t2;
        int i5;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = new LazyStaggeredGridMeasureContext(lazyStaggeredGridState, list, lazyStaggeredGridItemProvider, lazyStaggeredGridSlots, j, z, lazyLayoutMeasureScope, i, j2, i3, i4, z2, i2, coroutineScope, null);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
        try {
            Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
            try {
                int[] iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyStaggeredGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyStaggeredGridItemProvider, lazyStaggeredGridState.getScrollPosition().getIndices());
                int[] scrollOffsets = lazyStaggeredGridState.getScrollPosition().getScrollOffsets();
                if (iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release.length == lazyStaggeredGridMeasureContext.getLaneCount()) {
                    t = iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release;
                } else {
                    lazyStaggeredGridMeasureContext.getLaneInfo().reset();
                    int laneCount = lazyStaggeredGridMeasureContext.getLaneCount();
                    int[] iArr = new int[laneCount];
                    int i6 = 0;
                    while (i6 < laneCount) {
                        if (i6 >= iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release.length || (iM8323maxInRangejy6DScQ = iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release[i6]) == -1) {
                            iM8323maxInRangejy6DScQ = i6 == 0 ? 0 : m8323maxInRangejy6DScQ(iArr, SpanRange.m8333constructorimpl(0, i6)) + 1;
                        }
                        iArr[i6] = iM8323maxInRangejy6DScQ;
                        lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[i6], i6);
                        i6++;
                    }
                    t = iArr;
                }
                objectRef.element = t;
                if (scrollOffsets.length == lazyStaggeredGridMeasureContext.getLaneCount()) {
                    t2 = scrollOffsets;
                } else {
                    int laneCount2 = lazyStaggeredGridMeasureContext.getLaneCount();
                    int[] iArr2 = new int[laneCount2];
                    int i7 = 0;
                    while (i7 < laneCount2) {
                        if (i7 < scrollOffsets.length) {
                            i5 = scrollOffsets[i7];
                        } else {
                            i5 = i7 == 0 ? 0 : iArr2[i7 - 1];
                        }
                        iArr2[i7] = i5;
                        i7++;
                    }
                    t2 = iArr2;
                }
                objectRef2.element = t2;
                Unit unit = Unit.INSTANCE;
                snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                snapshotCreateNonObservableSnapshot.dispose();
                return measure(lazyStaggeredGridMeasureContext, MathKt__MathJVMKt.roundToInt(lazyStaggeredGridState.getScrollToBeConsumed()), (int[]) objectRef.element, (int[]) objectRef2.element, true);
            } catch (Throwable th) {
                snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                throw th;
            }
        } catch (Throwable th2) {
            snapshotCreateNonObservableSnapshot.dispose();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x02f8, code lost:
    
        r2 = indexOfMinValue$default(r8, 0, 1, null);
        r3 = indexOfMaxValue(r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0303, code lost:
    
        if (r2 == r3) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0309, code lost:
    
        if (r8[r2] != r8[r3]) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x030b, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x030d, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x030e, code lost:
    
        r3 = r29[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0311, code lost:
    
        if (r3 != (-1)) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0313, code lost:
    
        r9 = r39;
        r3 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0317, code lost:
    
        r9 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0319, code lost:
    
        r3 = findPreviousItemIndex(r9, r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x031d, code lost:
    
        if (r3 >= 0) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x031f, code lost:
    
        r13 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0321, code lost:
    
        if (r0 != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0327, code lost:
    
        if (measure$lambda$38$misalignedStart(r13, r9, r8, r2) == false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x032a, code lost:
    
        r5 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x032d, code lost:
    
        if (r43 == false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x032f, code lost:
    
        r39.getLaneInfo().reset();
        r0 = r13.length;
        r1 = new int[r0];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x033a, code lost:
    
        if (r3 >= r0) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x033c, code lost:
    
        r1[r3] = -1;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0342, code lost:
    
        r0 = r8.length;
        r3 = new int[r0];
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0346, code lost:
    
        if (r4 >= r0) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0348, code lost:
    
        r3[r4] = r8[r2];
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0356, code lost:
    
        return measure(r9, r28, r1, r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0357, code lost:
    
        r24 = r10;
        r25 = r11;
        r41 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0362, code lost:
    
        r5 = r28;
        r13 = r29;
        r24 = r10;
        r25 = r11;
        r10 = r9.m8320getSpanRangelOCCd4c(r39.getItemProvider(), r3, r2);
        r2 = r39.getLaneInfo();
        r41 = r14;
        r28 = r15;
        r4 = (int) (r10 & 4294967295L);
        r29 = r0;
        r15 = r1;
        r0 = (int) (r10 >> 32);
        r1 = r4 - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x038d, code lost:
    
        if (r1 == 1) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x038f, code lost:
    
        r14 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0391, code lost:
    
        r14 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0392, code lost:
    
        r2.setLane(r3, r14);
        r2 = r39.getMeasuredItemProvider().m8328getAndMeasurejy6DScQ(r3, r10);
        r10 = m8323maxInRangejy6DScQ(r8, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x03a2, code lost:
    
        if (r1 == 1) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03a4, code lost:
    
        r1 = r39.getLaneInfo().getGaps(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03ad, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03ae, code lost:
    
        if (r0 >= r4) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03b2, code lost:
    
        if (r8[r0] == r10) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03b4, code lost:
    
        r29 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03b6, code lost:
    
        r7[r0].addFirst(r2);
        r13[r0] = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03bd, code lost:
    
        if (r1 != null) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03bf, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03c1, code lost:
    
        r11 = r1[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03c3, code lost:
    
        r8[r0] = (r2.getSizeWithSpacings() + r10) + r11;
        r0 = r0 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:330:0x06d6  */
    @ExperimentalFoundationApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final LazyStaggeredGridMeasureResult measure(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i, int[] iArr, int[] iArr2, boolean z) {
        boolean z2;
        int i2;
        int iIndexOf;
        int i3;
        int i4;
        int[] iArr3;
        final LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext2;
        int[] iArr4;
        int i5;
        int i6;
        int i7;
        int[] iArr5;
        int i8;
        int i9;
        List list;
        int i10;
        int[] iArr6;
        int[] iArr7;
        int i11;
        int i12;
        int i13;
        boolean z3;
        int i14;
        int iM13636constrainWidthK40F9xA;
        int iM13621getMaxHeightimpl;
        int[] iArr8;
        int[] iArr9;
        List listEmptyList;
        boolean z4;
        boolean z5;
        boolean z6;
        int[] iArr10;
        List<Integer> list2;
        int i15;
        boolean z7;
        int[] iArr11;
        int i16;
        boolean z8;
        int i17;
        int[] gaps;
        boolean z9;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext3 = lazyStaggeredGridMeasureContext;
        int i18 = i;
        LazyLayoutMeasureScope measureScope = lazyStaggeredGridMeasureContext.getMeasureScope();
        int itemCount = lazyStaggeredGridMeasureContext.getItemProvider().getItemCount();
        if (itemCount <= 0 || lazyStaggeredGridMeasureContext.getLaneCount() == 0) {
            return new LazyStaggeredGridMeasureResult(iArr, iArr2, 0.0f, MeasureScope.layout$default(measureScope, Constraints.m13624getMinWidthimpl(lazyStaggeredGridMeasureContext.getConstraints()), Constraints.m13623getMinHeightimpl(lazyStaggeredGridMeasureContext.getConstraints()), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }, 4, null), false, lazyStaggeredGridMeasureContext.getIsVertical(), false, itemCount, CollectionsKt__CollectionsKt.emptyList(), IntSizeKt.IntSize(Constraints.m13624getMinWidthimpl(lazyStaggeredGridMeasureContext.getConstraints()), Constraints.m13623getMinHeightimpl(lazyStaggeredGridMeasureContext.getConstraints())), -lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisAvailableSize() + lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisSpacing(), null);
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        String str = "copyOf(this, size)";
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, size)");
        int[] iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf2, "copyOf(this, size)");
        ensureIndicesInRange(lazyStaggeredGridMeasureContext3, iArrCopyOf, itemCount);
        offsetBy(iArrCopyOf2, -i18);
        int laneCount = lazyStaggeredGridMeasureContext.getLaneCount();
        ArrayDeque[] arrayDequeArr = new ArrayDeque[laneCount];
        for (int i19 = 0; i19 < laneCount; i19++) {
            arrayDequeArr[i19] = new ArrayDeque(16);
        }
        offsetBy(iArrCopyOf2, -lazyStaggeredGridMeasureContext.getBeforeContentPadding());
        boolean z10 = false;
        while (true) {
            if (!measure$lambda$38$hasSpaceBeforeFirst(iArrCopyOf, iArrCopyOf2, lazyStaggeredGridMeasureContext3)) {
                z2 = z10;
                i2 = itemCount;
                iIndexOf = -1;
                break;
            }
            iIndexOf = indexOfMaxValue(iArrCopyOf);
            int i20 = iArrCopyOf[iIndexOf];
            int length = iArrCopyOf2.length;
            for (int i21 = 0; i21 < length; i21++) {
                if (iArrCopyOf[i21] != iArrCopyOf[iIndexOf]) {
                    int i22 = iArrCopyOf2[i21];
                    int i23 = iArrCopyOf2[iIndexOf];
                    if (i22 < i23) {
                        iArrCopyOf2[i21] = i23;
                    }
                }
            }
            int iFindPreviousItemIndex = findPreviousItemIndex(lazyStaggeredGridMeasureContext3, i20, iIndexOf);
            if (iFindPreviousItemIndex < 0) {
                z2 = z10;
                i2 = itemCount;
                break;
            }
            long jM8320getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext3.m8320getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iFindPreviousItemIndex, iIndexOf);
            int i24 = (int) (4294967295L & jM8320getSpanRangelOCCd4c);
            int i25 = itemCount;
            int i26 = (int) (jM8320getSpanRangelOCCd4c >> 32);
            int i27 = i24 - i26;
            boolean z11 = z10;
            lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iFindPreviousItemIndex, i27 != 1 ? -2 : i26);
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM8328getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m8328getAndMeasurejy6DScQ(iFindPreviousItemIndex, jM8320getSpanRangelOCCd4c);
            int iM8323maxInRangejy6DScQ = m8323maxInRangejy6DScQ(iArrCopyOf2, jM8320getSpanRangelOCCd4c);
            int[] gaps2 = i27 != 1 ? lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(iFindPreviousItemIndex) : null;
            boolean z12 = z11;
            while (i26 < i24) {
                iArrCopyOf[i26] = iFindPreviousItemIndex;
                int sizeWithSpacings = iM8323maxInRangejy6DScQ + lazyStaggeredGridMeasuredItemM8328getAndMeasurejy6DScQ.getSizeWithSpacings() + (gaps2 == null ? 0 : gaps2[i26]);
                iArrCopyOf2[i26] = sizeWithSpacings;
                if (lazyStaggeredGridMeasureContext.getMainAxisAvailableSize() + sizeWithSpacings <= 0) {
                    z12 = true;
                }
                i26++;
            }
            z10 = z12;
            itemCount = i25;
        }
        int i28 = -lazyStaggeredGridMeasureContext.getBeforeContentPadding();
        int i29 = iArrCopyOf2[0];
        if (i29 < i28) {
            i18 += i29;
            offsetBy(iArrCopyOf2, i28 - i29);
        }
        offsetBy(iArrCopyOf2, lazyStaggeredGridMeasureContext.getBeforeContentPadding());
        int i30 = -1;
        if (iIndexOf == -1) {
            iIndexOf = ArraysKt___ArraysKt.indexOf(iArrCopyOf, 0);
        }
        if (iIndexOf != -1 && measure$lambda$38$misalignedStart(iArrCopyOf, lazyStaggeredGridMeasureContext3, iArrCopyOf2, iIndexOf) && z) {
            lazyStaggeredGridMeasureContext.getLaneInfo().reset();
            int length2 = iArrCopyOf.length;
            int[] iArr12 = new int[length2];
            int i31 = 0;
            while (i31 < length2) {
                iArr12[i31] = i30;
                i31++;
                i30 = -1;
            }
            int length3 = iArrCopyOf2.length;
            int[] iArr13 = new int[length3];
            for (int i32 = 0; i32 < length3; i32++) {
                iArr13[i32] = iArrCopyOf2[iIndexOf];
            }
            return measure(lazyStaggeredGridMeasureContext3, i18, iArr12, iArr13, false);
        }
        int[] iArrCopyOf3 = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf3, "copyOf(this, size)");
        int length4 = iArrCopyOf2.length;
        int[] iArr14 = new int[length4];
        for (int i33 = 0; i33 < length4; i33++) {
            iArr14[i33] = -iArrCopyOf2[i33];
        }
        int mainAxisSpacing = i28 + lazyStaggeredGridMeasureContext.getMainAxisSpacing();
        int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(lazyStaggeredGridMeasureContext.getMainAxisAvailableSize() + lazyStaggeredGridMeasureContext.getAfterContentPadding(), 0);
        int i34 = i28;
        boolean z13 = z2;
        int iIndexOfMinValue$default = indexOfMinValue$default(iArrCopyOf3, 0, 1, null);
        int laneCount2 = 0;
        int i35 = -1;
        while (iIndexOfMinValue$default != i35 && laneCount2 < lazyStaggeredGridMeasureContext.getLaneCount()) {
            int i36 = iArrCopyOf3[iIndexOfMinValue$default];
            int iIndexOfMinValue = indexOfMinValue(iArrCopyOf3, i36);
            laneCount2++;
            if (i36 >= 0) {
                long jM8320getSpanRangelOCCd4c2 = lazyStaggeredGridMeasureContext3.m8320getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), i36, iIndexOfMinValue$default);
                LazyLayoutMeasureScope lazyLayoutMeasureScope = measureScope;
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM8328getAndMeasurejy6DScQ2 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m8328getAndMeasurejy6DScQ(i36, jM8320getSpanRangelOCCd4c2);
                String str2 = str;
                int i37 = i18;
                int i38 = (int) (jM8320getSpanRangelOCCd4c2 & 4294967295L);
                int[] iArr15 = iArrCopyOf;
                int[] iArr16 = iArrCopyOf2;
                int i39 = (int) (jM8320getSpanRangelOCCd4c2 >> 32);
                int i40 = i38 - i39;
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(i36, i40 != 1 ? -2 : i39);
                int iM8323maxInRangejy6DScQ2 = m8323maxInRangejy6DScQ(iArr14, jM8320getSpanRangelOCCd4c2);
                for (int i41 = i39; i41 < i38; i41++) {
                    iArr14[i41] = lazyStaggeredGridMeasuredItemM8328getAndMeasurejy6DScQ2.getSizeWithSpacings() + iM8323maxInRangejy6DScQ2;
                    iArrCopyOf3[i41] = i36;
                    arrayDequeArr[i41].addLast(lazyStaggeredGridMeasuredItemM8328getAndMeasurejy6DScQ2);
                }
                if (iM8323maxInRangejy6DScQ2 >= mainAxisSpacing || iArr14[i39] > mainAxisSpacing) {
                    z9 = z13;
                } else {
                    lazyStaggeredGridMeasuredItemM8328getAndMeasurejy6DScQ2.setVisible(false);
                    z9 = true;
                }
                laneCount2 = i40 != 1 ? lazyStaggeredGridMeasureContext.getLaneCount() : laneCount2;
                z13 = z9;
                iIndexOfMinValue$default = iIndexOfMinValue;
                measureScope = lazyLayoutMeasureScope;
                str = str2;
                i18 = i37;
                iArrCopyOf = iArr15;
                iArrCopyOf2 = iArr16;
                i35 = -1;
                lazyStaggeredGridMeasureContext3 = lazyStaggeredGridMeasureContext;
            } else {
                i35 = -1;
                lazyStaggeredGridMeasureContext3 = lazyStaggeredGridMeasureContext;
                iIndexOfMinValue$default = iIndexOfMinValue;
            }
        }
        int i42 = i18;
        LazyLayoutMeasureScope lazyLayoutMeasureScope2 = measureScope;
        String str3 = str;
        int[] iArr17 = iArrCopyOf;
        int[] iArr18 = iArrCopyOf2;
        loop9: while (true) {
            int i43 = 0;
            while (true) {
                if (i43 >= length4) {
                    for (int i44 = 0; i44 < laneCount; i44++) {
                        if (!arrayDequeArr[i44].isEmpty()) {
                            i3 = i2;
                            i4 = 1;
                            break loop9;
                        }
                    }
                } else {
                    int i45 = iArr14[i43];
                    if (i45 < iCoerceAtLeast || i45 <= 0) {
                        break;
                    }
                    i43++;
                }
            }
            i4 = 1;
            int iIndexOfMinValue$default2 = indexOfMinValue$default(iArr14, 0, 1, null);
            int iMaxOrThrow = ArraysKt___ArraysKt.maxOrThrow(iArrCopyOf3) + 1;
            i3 = i2;
            if (iMaxOrThrow >= i3) {
                break;
            }
            int[] iArr19 = iArrCopyOf3;
            int i46 = length4;
            int i47 = iCoerceAtLeast;
            i2 = i3;
            String str4 = str3;
            int i48 = i42;
            int[] iArr20 = iArr17;
            int[] iArr21 = iArr18;
            int i49 = i34;
            int[] iArr22 = iArr14;
            long jM8320getSpanRangelOCCd4c3 = lazyStaggeredGridMeasureContext.m8320getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iMaxOrThrow, iIndexOfMinValue$default2);
            int i50 = (int) (jM8320getSpanRangelOCCd4c3 & 4294967295L);
            int i51 = (int) (jM8320getSpanRangelOCCd4c3 >> 32);
            int i52 = i50 - i51;
            lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iMaxOrThrow, i52 != 1 ? -2 : i51);
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM8328getAndMeasurejy6DScQ3 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m8328getAndMeasurejy6DScQ(iMaxOrThrow, jM8320getSpanRangelOCCd4c3);
            int iM8323maxInRangejy6DScQ3 = m8323maxInRangejy6DScQ(iArr22, jM8320getSpanRangelOCCd4c3);
            if (i52 != 1) {
                gaps = lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(iMaxOrThrow);
                if (gaps == null) {
                    gaps = new int[lazyStaggeredGridMeasureContext.getLaneCount()];
                }
            } else {
                gaps = null;
            }
            int i53 = i51;
            while (i53 < i50) {
                if (gaps != null) {
                    gaps[i53] = iM8323maxInRangejy6DScQ3 - iArr22[i53];
                }
                iArr19[i53] = iMaxOrThrow;
                iArr22[i53] = iM8323maxInRangejy6DScQ3 + lazyStaggeredGridMeasuredItemM8328getAndMeasurejy6DScQ3.getSizeWithSpacings();
                arrayDequeArr[i53].addLast(lazyStaggeredGridMeasuredItemM8328getAndMeasurejy6DScQ3);
                i53++;
                iArr20 = iArr20;
            }
            int[] iArr23 = iArr20;
            lazyStaggeredGridMeasureContext.getLaneInfo().setGaps(iMaxOrThrow, gaps);
            if (iM8323maxInRangejy6DScQ3 < mainAxisSpacing && iArr22[i51] <= mainAxisSpacing) {
                lazyStaggeredGridMeasuredItemM8328getAndMeasurejy6DScQ3.setVisible(false);
            }
            str3 = str4;
            iCoerceAtLeast = i47;
            iArr18 = iArr21;
            i34 = i49;
            iArr17 = iArr23;
            iArrCopyOf3 = iArr19;
            i42 = i48;
            iArr14 = iArr22;
            length4 = i46;
        }
        int i54 = 0;
        while (i54 < laneCount) {
            ArrayDeque arrayDeque = arrayDequeArr[i54];
            while (arrayDeque.size() > i4 && !((LazyStaggeredGridMeasuredItem) arrayDeque.first()).getIsVisible()) {
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = (LazyStaggeredGridMeasuredItem) arrayDeque.removeFirst();
                int[] gaps3 = lazyStaggeredGridMeasuredItem.getSpan() != i4 ? lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(lazyStaggeredGridMeasuredItem.getIndex()) : null;
                iArr18[i54] = iArr18[i54] - (lazyStaggeredGridMeasuredItem.getSizeWithSpacings() + (gaps3 == null ? 0 : gaps3[i54]));
                i4 = 1;
            }
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = (LazyStaggeredGridMeasuredItem) arrayDeque.firstOrNull();
            iArr17[i54] = lazyStaggeredGridMeasuredItem2 != null ? lazyStaggeredGridMeasuredItem2.getIndex() : -1;
            i54++;
            i4 = 1;
        }
        int length5 = iArrCopyOf3.length;
        int i55 = 0;
        while (true) {
            if (i55 >= length5) {
                break;
            }
            if (iArrCopyOf3[i55] == i3 - 1) {
                offsetBy(iArr14, -lazyStaggeredGridMeasureContext.getMainAxisSpacing());
                break;
            }
            i55++;
        }
        int i56 = 0;
        while (true) {
            if (i56 < length4) {
                if (iArr14[i56] >= lazyStaggeredGridMeasureContext.getMainAxisAvailableSize()) {
                    lazyStaggeredGridMeasureContext2 = lazyStaggeredGridMeasureContext;
                    iArr4 = iArrCopyOf3;
                    i5 = length4;
                    i6 = iCoerceAtLeast;
                    i9 = i42;
                    iArr5 = iArr17;
                    iArr3 = iArr18;
                    list = null;
                    i8 = i3;
                    break;
                }
                i56++;
            } else {
                int mainAxisAvailableSize = lazyStaggeredGridMeasureContext.getMainAxisAvailableSize() - iArr14[indexOfMaxValue(iArr14)];
                iArr3 = iArr18;
                offsetBy(iArr3, -mainAxisAvailableSize);
                offsetBy(iArr14, mainAxisAvailableSize);
                boolean z14 = false;
                loop25: while (true) {
                    int length6 = iArr3.length;
                    int i57 = 0;
                    while (true) {
                        if (i57 >= length6) {
                            lazyStaggeredGridMeasureContext2 = lazyStaggeredGridMeasureContext;
                            iArr4 = iArrCopyOf3;
                            i5 = length4;
                            i6 = iCoerceAtLeast;
                            i7 = i42;
                            iArr5 = iArr17;
                            break loop25;
                        }
                        if (iArr3[i57] < lazyStaggeredGridMeasureContext.getBeforeContentPadding()) {
                            break;
                        }
                        i57++;
                        i3 = i3;
                        i42 = i42;
                    }
                    iCoerceAtLeast = i12;
                    mainAxisAvailableSize = i14;
                    iArrCopyOf3 = iArr7;
                    length4 = i11;
                    i3 = i13;
                    z14 = z3;
                    i42 = i10;
                    iArr17 = iArr6;
                }
                i8 = i3;
                int i58 = mainAxisAvailableSize;
                if (z14 && z) {
                    lazyStaggeredGridMeasureContext.getLaneInfo().reset();
                    return measure(lazyStaggeredGridMeasureContext2, i7, iArr5, iArr3, false);
                }
                i9 = i7 + i58;
                list = null;
                int i59 = iArr3[indexOfMinValue$default(iArr3, 0, 1, null)];
                if (i59 < 0) {
                    i9 += i59;
                    offsetBy(iArr14, i59);
                    offsetBy(iArr3, -i59);
                }
            }
        }
        float scrollToBeConsumed = (MathKt__MathJVMKt.getSign(MathKt__MathJVMKt.roundToInt(lazyStaggeredGridMeasureContext.getState().getScrollToBeConsumed())) != MathKt__MathJVMKt.getSign(i9) || Math.abs(MathKt__MathJVMKt.roundToInt(lazyStaggeredGridMeasureContext.getState().getScrollToBeConsumed())) < Math.abs(i9)) ? lazyStaggeredGridMeasureContext.getState().getScrollToBeConsumed() : i9;
        int[] iArrCopyOf4 = Arrays.copyOf(iArr3, iArr3.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf4, str3);
        int length7 = iArrCopyOf4.length;
        for (int i60 = 0; i60 < length7; i60++) {
            iArrCopyOf4[i60] = -iArrCopyOf4[i60];
        }
        if (lazyStaggeredGridMeasureContext.getBeforeContentPadding() > lazyStaggeredGridMeasureContext.getMainAxisSpacing()) {
            for (int i61 = 0; i61 < laneCount; i61++) {
                ArrayDeque arrayDeque2 = arrayDequeArr[i61];
                int size = arrayDeque2.size();
                int i62 = 0;
                while (i62 < size) {
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem3 = (LazyStaggeredGridMeasuredItem) arrayDeque2.get(i62);
                    int[] gaps4 = lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(lazyStaggeredGridMeasuredItem3.getIndex());
                    int sizeWithSpacings2 = lazyStaggeredGridMeasuredItem3.getSizeWithSpacings() + (gaps4 == null ? 0 : gaps4[i61]);
                    if (i62 == CollectionsKt__CollectionsKt.getLastIndex(arrayDeque2) || (i17 = iArr3[i61]) == 0 || i17 < sizeWithSpacings2) {
                        break;
                    }
                    iArr3[i61] = i17 - sizeWithSpacings2;
                    i62++;
                    iArr5[i61] = ((LazyStaggeredGridMeasuredItem) arrayDeque2.get(i62)).getIndex();
                }
            }
        }
        int beforeContentPadding = lazyStaggeredGridMeasureContext.getBeforeContentPadding() + lazyStaggeredGridMeasureContext.getAfterContentPadding();
        if (lazyStaggeredGridMeasureContext.getIsVertical()) {
            iM13636constrainWidthK40F9xA = Constraints.m13622getMaxWidthimpl(lazyStaggeredGridMeasureContext.getConstraints());
        } else {
            iM13636constrainWidthK40F9xA = ConstraintsKt.m13636constrainWidthK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), ArraysKt___ArraysKt.maxOrThrow(iArr14) + beforeContentPadding);
        }
        int i63 = iM13636constrainWidthK40F9xA;
        if (lazyStaggeredGridMeasureContext.getIsVertical()) {
            iM13621getMaxHeightimpl = ConstraintsKt.m13635constrainHeightK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), ArraysKt___ArraysKt.maxOrThrow(iArr14) + beforeContentPadding);
        } else {
            iM13621getMaxHeightimpl = Constraints.m13621getMaxHeightimpl(lazyStaggeredGridMeasureContext.getConstraints());
        }
        int i64 = iM13621getMaxHeightimpl;
        int iMin = (Math.min(lazyStaggeredGridMeasureContext.getIsVertical() ? i64 : i63, lazyStaggeredGridMeasureContext.getMainAxisAvailableSize()) - lazyStaggeredGridMeasureContext.getBeforeContentPadding()) + lazyStaggeredGridMeasureContext.getAfterContentPadding();
        int i65 = iArrCopyOf4[0];
        List<Integer> pinnedItems = lazyStaggeredGridMeasureContext.getPinnedItems();
        int size2 = pinnedItems.size() - 1;
        if (size2 >= 0) {
            int i66 = size2;
            int sizeWithSpacings3 = i65;
            listEmptyList = list;
            while (true) {
                int i67 = i66 - 1;
                int iIntValue = pinnedItems.get(i66).intValue();
                int lane = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(iIntValue);
                List<Integer> list3 = pinnedItems;
                if (lane != -2 && lane != -1) {
                    if (iArr5[lane] <= iIntValue) {
                        z8 = false;
                        break;
                    }
                    z8 = true;
                } else {
                    int length8 = iArr5.length;
                    int i68 = 0;
                    while (i68 < length8) {
                        int i69 = length8;
                        if (!(iArr5[i68] > iIntValue)) {
                            z8 = false;
                            break;
                        }
                        i68++;
                        length8 = i69;
                    }
                    z8 = true;
                }
                if (z8) {
                    iArr8 = iArr14;
                    iArr9 = iArr5;
                    long jM8320getSpanRangelOCCd4c4 = lazyStaggeredGridMeasureContext2.m8320getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iIntValue, 0);
                    if (listEmptyList == null) {
                        listEmptyList = new ArrayList();
                    }
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM8328getAndMeasurejy6DScQ4 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m8328getAndMeasurejy6DScQ(iIntValue, jM8320getSpanRangelOCCd4c4);
                    sizeWithSpacings3 -= lazyStaggeredGridMeasuredItemM8328getAndMeasurejy6DScQ4.getSizeWithSpacings();
                    lazyStaggeredGridMeasuredItemM8328getAndMeasurejy6DScQ4.position(sizeWithSpacings3, 0, iMin);
                    listEmptyList.add(lazyStaggeredGridMeasuredItemM8328getAndMeasurejy6DScQ4);
                } else {
                    iArr8 = iArr14;
                    iArr9 = iArr5;
                }
                if (i67 < 0) {
                    break;
                }
                pinnedItems = list3;
                i66 = i67;
                iArr14 = iArr8;
                iArr5 = iArr9;
            }
        } else {
            iArr8 = iArr14;
            iArr9 = iArr5;
            listEmptyList = null;
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        List<LazyStaggeredGridMeasuredItem> listCalculateVisibleItems = calculateVisibleItems(lazyStaggeredGridMeasureContext2, arrayDequeArr, iArrCopyOf4, iMin);
        int sizeWithSpacings4 = iArrCopyOf4[0];
        List<Integer> pinnedItems2 = lazyStaggeredGridMeasureContext.getPinnedItems();
        int size3 = pinnedItems2.size();
        int i70 = 0;
        List listEmptyList2 = null;
        while (i70 < size3) {
            int iIntValue2 = pinnedItems2.get(i70).intValue();
            int i71 = i8;
            if (iIntValue2 >= i71) {
                list2 = pinnedItems2;
                i15 = size3;
                iArr10 = iArr4;
                z7 = false;
                break;
            }
            int lane2 = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(iIntValue2);
            if (lane2 != -2 && lane2 != -1) {
                if (iArr4[lane2] < iIntValue2) {
                    list2 = pinnedItems2;
                    i15 = size3;
                    iArr10 = iArr4;
                }
                list2 = pinnedItems2;
                i15 = size3;
                iArr10 = iArr4;
                z7 = false;
                break;
            }
            iArr10 = iArr4;
            int length9 = iArr10.length;
            list2 = pinnedItems2;
            int i72 = 0;
            while (i72 < length9) {
                i15 = size3;
                if (!(iArr10[i72] < iIntValue2)) {
                    z7 = false;
                    break;
                }
                i72++;
                size3 = i15;
            }
            i15 = size3;
            z7 = true;
            if (z7) {
                i16 = i71;
                long jM8320getSpanRangelOCCd4c5 = lazyStaggeredGridMeasureContext2.m8320getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iIntValue2, 0);
                if (listEmptyList2 == null) {
                    listEmptyList2 = new ArrayList();
                }
                iArr11 = iArr3;
                List list4 = listEmptyList2;
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM8328getAndMeasurejy6DScQ5 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m8328getAndMeasurejy6DScQ(iIntValue2, jM8320getSpanRangelOCCd4c5);
                lazyStaggeredGridMeasuredItemM8328getAndMeasurejy6DScQ5.position(sizeWithSpacings4, 0, iMin);
                sizeWithSpacings4 += lazyStaggeredGridMeasuredItemM8328getAndMeasurejy6DScQ5.getSizeWithSpacings();
                list4.add(lazyStaggeredGridMeasuredItemM8328getAndMeasurejy6DScQ5);
                listEmptyList2 = list4;
            } else {
                iArr11 = iArr3;
                i16 = i71;
            }
            i70++;
            pinnedItems2 = list2;
            size3 = i15;
            iArr3 = iArr11;
            i8 = i16;
            iArr4 = iArr10;
        }
        int[] iArr24 = iArr4;
        int i73 = i8;
        int[] iArr25 = iArr3;
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
        }
        final ArrayList arrayList = new ArrayList();
        arrayList.addAll(listEmptyList);
        arrayList.addAll(listCalculateVisibleItems);
        arrayList.addAll(listEmptyList2);
        lazyStaggeredGridMeasureContext.getState().getPlacementAnimator().onMeasured((int) scrollToBeConsumed, i63, i64, arrayList, lazyStaggeredGridMeasureContext.getMeasuredItemProvider(), lazyStaggeredGridMeasureContext.getIsVertical(), lazyStaggeredGridMeasureContext.getLaneCount(), lazyStaggeredGridMeasureContext.getCoroutineScope());
        int i74 = i5;
        int i75 = 0;
        while (true) {
            if (i75 >= i74) {
                z4 = false;
                break;
            }
            if (iArr8[i75] > lazyStaggeredGridMeasureContext.getMainAxisAvailableSize()) {
                z4 = true;
                break;
            }
            i75++;
        }
        if (!z4) {
            int length10 = iArr24.length;
            int i76 = 0;
            while (true) {
                if (i76 >= length10) {
                    z6 = true;
                    break;
                }
                if (!(iArr24[i76] < i73 + (-1))) {
                    z6 = false;
                    break;
                }
                i76++;
            }
            z5 = z6;
        }
        return new LazyStaggeredGridMeasureResult(iArr9, iArr25, scrollToBeConsumed, MeasureScope.layout$default(lazyLayoutMeasureScope2, i63, i64, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$29
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                List<LazyStaggeredGridMeasuredItem> list5 = arrayList;
                LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext4 = lazyStaggeredGridMeasureContext2;
                int size4 = list5.size();
                for (int i77 = 0; i77 < size4; i77++) {
                    list5.get(i77).place(placementScope, lazyStaggeredGridMeasureContext4);
                }
                ObservableScopeInvalidator.m8291attachToScopeimpl(lazyStaggeredGridMeasureContext2.getState().m8331getPlacementScopeInvalidatorzYiylxw$foundation_release());
            }
        }, 4, null), z5, lazyStaggeredGridMeasureContext.getIsVertical(), z13, i73, listCalculateVisibleItems, IntSizeKt.IntSize(i63, i64), i34, i6, lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisSpacing(), null);
    }

    private static final boolean measure$lambda$38$hasSpaceBeforeFirst(int[] iArr, int[] iArr2, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (iArr2[i] < Math.max(-lazyStaggeredGridMeasureContext.getMainAxisSpacing(), 0) && i2 > 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean measure$lambda$38$misalignedStart(int[] iArr, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr2, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i2], i2) == -1 && iArr2[i2] != iArr2[i]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i3], i3) != -1 && iArr2[i3] >= iArr2[i]) {
                return true;
            }
        }
        int lane = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(0);
        return (lane == 0 || lane == -1 || lane == -2) ? false : true;
    }

    private static final List<LazyStaggeredGridMeasuredItem> calculateVisibleItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, ArrayDeque<LazyStaggeredGridMeasuredItem>[] arrayDequeArr, int[] iArr, int i) {
        int size = 0;
        for (ArrayDeque<LazyStaggeredGridMeasuredItem> arrayDeque : arrayDequeArr) {
            size += arrayDeque.size();
        }
        ArrayList arrayList = new ArrayList(size);
        while (true) {
            for (ArrayDeque<LazyStaggeredGridMeasuredItem> arrayDeque2 : arrayDequeArr) {
                if (!arrayDeque2.isEmpty()) {
                    int length = arrayDequeArr.length;
                    int i2 = -1;
                    int i3 = Integer.MAX_VALUE;
                    for (int i4 = 0; i4 < length; i4++) {
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemFirstOrNull = arrayDequeArr[i4].firstOrNull();
                        int index = lazyStaggeredGridMeasuredItemFirstOrNull != null ? lazyStaggeredGridMeasuredItemFirstOrNull.getIndex() : Integer.MAX_VALUE;
                        if (i3 > index) {
                            i2 = i4;
                            i3 = index;
                        }
                    }
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemRemoveFirst = arrayDequeArr[i2].removeFirst();
                    if (lazyStaggeredGridMeasuredItemRemoveFirst.getLane() == i2) {
                        long jM8333constructorimpl = SpanRange.m8333constructorimpl(lazyStaggeredGridMeasuredItemRemoveFirst.getLane(), lazyStaggeredGridMeasuredItemRemoveFirst.getSpan());
                        int iM8323maxInRangejy6DScQ = m8323maxInRangejy6DScQ(iArr, jM8333constructorimpl);
                        int i5 = lazyStaggeredGridMeasureContext.getResolvedSlots().getPositions()[i2];
                        if (lazyStaggeredGridMeasuredItemRemoveFirst.getPlaceablesCount() != 0) {
                            lazyStaggeredGridMeasuredItemRemoveFirst.position(iM8323maxInRangejy6DScQ, i5, i);
                            arrayList.add(lazyStaggeredGridMeasuredItemRemoveFirst);
                            int i6 = (int) (jM8333constructorimpl & 4294967295L);
                            for (int i7 = (int) (jM8333constructorimpl >> 32); i7 < i6; i7++) {
                                iArr[i7] = lazyStaggeredGridMeasuredItemRemoveFirst.getSizeWithSpacings() + iM8323maxInRangejy6DScQ;
                            }
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    @ExperimentalFoundationApi
    private static final List<LazyStaggeredGridMeasuredItem> calculateExtraItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, Function1<? super LazyStaggeredGridMeasuredItem, Unit> function1, Function1<? super Integer, Boolean> function12, boolean z) {
        List<Integer> pinnedItems = lazyStaggeredGridMeasureContext.getPinnedItems();
        ArrayList arrayList = null;
        if (z) {
            int size = pinnedItems.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    int iIntValue = pinnedItems.get(size).intValue();
                    if (function12.invoke(Integer.valueOf(iIntValue)).booleanValue()) {
                        long jM8320getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext.m8320getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iIntValue, 0);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM8328getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m8328getAndMeasurejy6DScQ(iIntValue, jM8320getSpanRangelOCCd4c);
                        function1.invoke(lazyStaggeredGridMeasuredItemM8328getAndMeasurejy6DScQ);
                        arrayList.add(lazyStaggeredGridMeasuredItemM8328getAndMeasurejy6DScQ);
                    }
                    if (i < 0) {
                        break;
                    }
                    size = i;
                }
            }
        } else {
            int size2 = pinnedItems.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int iIntValue2 = pinnedItems.get(i2).intValue();
                if (function12.invoke(Integer.valueOf(iIntValue2)).booleanValue()) {
                    long jM8320getSpanRangelOCCd4c2 = lazyStaggeredGridMeasureContext.m8320getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iIntValue2, 0);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM8328getAndMeasurejy6DScQ2 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m8328getAndMeasurejy6DScQ(iIntValue2, jM8320getSpanRangelOCCd4c2);
                    function1.invoke(lazyStaggeredGridMeasuredItemM8328getAndMeasurejy6DScQ2);
                    arrayList.add(lazyStaggeredGridMeasuredItemM8328getAndMeasurejy6DScQ2);
                }
            }
        }
        return arrayList == null ? CollectionsKt__CollectionsKt.emptyList() : arrayList;
    }

    /* renamed from: forEach-nIS5qE8, reason: not valid java name */
    private static final void m8322forEachnIS5qE8(long j, Function1<? super Integer, Unit> function1) {
        int i = (int) (j & 4294967295L);
        for (int i2 = (int) (j >> 32); i2 < i; i2++) {
            function1.invoke(Integer.valueOf(i2));
        }
    }

    private static final void offsetBy(int[] iArr, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = iArr[i2] + i;
        }
    }

    /* renamed from: maxInRange-jy6DScQ, reason: not valid java name */
    private static final int m8323maxInRangejy6DScQ(int[] iArr, long j) {
        int i = (int) (j & 4294967295L);
        int iMax = Integer.MIN_VALUE;
        for (int i2 = (int) (j >> 32); i2 < i; i2++) {
            iMax = Math.max(iMax, iArr[i2]);
        }
        return iMax;
    }

    public static /* synthetic */ int indexOfMinValue$default(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = Integer.MIN_VALUE;
        }
        return indexOfMinValue(iArr, i);
    }

    public static final int indexOfMinValue(@NotNull int[] iArr, int i) {
        int length = iArr.length;
        int i2 = -1;
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = i + 1;
            int i6 = iArr[i4];
            if (i5 <= i6 && i6 < i3) {
                i2 = i4;
                i3 = i6;
            }
        }
        return i2;
    }

    private static final <T> int indexOfMinBy(T[] tArr, Function1<? super T, Integer> function1) {
        int length = tArr.length;
        int i = -1;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int iIntValue = function1.invoke(tArr[i3]).intValue();
            if (i2 > iIntValue) {
                i = i3;
                i2 = iIntValue;
            }
        }
        return i;
    }

    private static final int indexOfMaxValue(int[] iArr) {
        int length = iArr.length;
        int i = -1;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (i2 < i4) {
                i = i3;
                i2 = i4;
            }
        }
        return i;
    }

    private static final int[] transform(int[] iArr, Function1<? super Integer, Integer> function1) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = function1.invoke(Integer.valueOf(iArr[i])).intValue();
        }
        return iArr;
    }

    private static final void ensureIndicesInRange(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr, int i) {
        int length = iArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            while (true) {
                if (iArr[length] < i && lazyStaggeredGridMeasureContext.getLaneInfo().assignedToLane(iArr[length], length)) {
                    break;
                } else {
                    iArr[length] = findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[length], length);
                }
            }
            if (iArr[length] >= 0 && !lazyStaggeredGridMeasureContext.isFullSpan(lazyStaggeredGridMeasureContext.getItemProvider(), iArr[length])) {
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[length], length);
            }
            if (i2 < 0) {
                return;
            } else {
                length = i2;
            }
        }
    }

    private static final int findPreviousItemIndex(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i, int i2) {
        return lazyStaggeredGridMeasureContext.getLaneInfo().findPreviousItemIndex(i, i2);
    }

    private static final <T> void fastForEach(List<? extends T> list, boolean z, Function1<? super T, Unit> function1) {
        if (z) {
            int size = list.size() - 1;
            if (size < 0) {
                return;
            }
            while (true) {
                int i = size - 1;
                function1.invoke(list.get(size));
                if (i < 0) {
                    return;
                } else {
                    size = i;
                }
            }
        } else {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                function1.invoke(list.get(i2));
            }
        }
    }

    public static /* synthetic */ void fastForEach$default(List list, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if (z) {
            int size = list.size() - 1;
            if (size < 0) {
                return;
            }
            while (true) {
                int i2 = size - 1;
                function1.invoke(list.get(size));
                if (i2 < 0) {
                    return;
                } else {
                    size = i2;
                }
            }
        } else {
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                function1.invoke(list.get(i3));
            }
        }
    }
}
